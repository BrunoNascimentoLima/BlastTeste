/*
 * An XML document type.
 * Localname: SeqFeatData
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqFeatDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one SeqFeatData(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqFeatDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument
{
    
    public SeqFeatDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQFEATDATA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqFeatData");
    
    
    /**
     * Gets the "SeqFeatData" element
     */
    public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData getSeqFeatData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData target = null;
            target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData)get_store().find_element_user(SEQFEATDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SeqFeatData" element
     */
    public void setSeqFeatData(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData seqFeatData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData target = null;
            target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData)get_store().find_element_user(SEQFEATDATA$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData)get_store().add_element_user(SEQFEATDATA$0);
            }
            target.set(seqFeatData);
        }
    }
    
    /**
     * Appends and returns a new empty "SeqFeatData" element
     */
    public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData addNewSeqFeatData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData target = null;
            target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData)get_store().add_element_user(SEQFEATDATA$0);
            return target;
        }
    }
    /**
     * An XML SeqFeatData(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqFeatDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData
    {
        
        public SeqFeatDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GENE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gene");
        private static final javax.xml.namespace.QName ORG$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "org");
        private static final javax.xml.namespace.QName CDREGION$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "cdregion");
        private static final javax.xml.namespace.QName PROT$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "prot");
        private static final javax.xml.namespace.QName RNA$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "rna");
        private static final javax.xml.namespace.QName PUB$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pub");
        private static final javax.xml.namespace.QName SEQ$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq");
        private static final javax.xml.namespace.QName IMP$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "imp");
        private static final javax.xml.namespace.QName REGION$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "region");
        private static final javax.xml.namespace.QName COMMENT$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "comment");
        private static final javax.xml.namespace.QName BOND$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bond");
        private static final javax.xml.namespace.QName SITE$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "site");
        private static final javax.xml.namespace.QName RSITE$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "rsite");
        private static final javax.xml.namespace.QName USER$26 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "user");
        private static final javax.xml.namespace.QName TXINIT$28 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "txinit");
        private static final javax.xml.namespace.QName NUM$30 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "num");
        private static final javax.xml.namespace.QName PSECSTR$32 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "psec-str");
        private static final javax.xml.namespace.QName NONSTDRESIDUE$34 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "non-std-residue");
        private static final javax.xml.namespace.QName HET$36 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "het");
        private static final javax.xml.namespace.QName BIOSRC$38 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "biosrc");
        private static final javax.xml.namespace.QName CLONE$40 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "clone");
        private static final javax.xml.namespace.QName VARIATION$42 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "variation");
        
        
        /**
         * Gets the "gene" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene getGene()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene)get_store().find_element_user(GENE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "gene" element
         */
        public boolean isSetGene()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENE$0) != 0;
            }
        }
        
        /**
         * Sets the "gene" element
         */
        public void setGene(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene gene)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene)get_store().find_element_user(GENE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene)get_store().add_element_user(GENE$0);
                }
                target.set(gene);
            }
        }
        
        /**
         * Appends and returns a new empty "gene" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene addNewGene()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene)get_store().add_element_user(GENE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "gene" element
         */
        public void unsetGene()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENE$0, 0);
            }
        }
        
        /**
         * Gets the "org" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org getOrg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org)get_store().find_element_user(ORG$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "org" element
         */
        public boolean isSetOrg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORG$2) != 0;
            }
        }
        
        /**
         * Sets the "org" element
         */
        public void setOrg(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org org)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org)get_store().find_element_user(ORG$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org)get_store().add_element_user(ORG$2);
                }
                target.set(org);
            }
        }
        
        /**
         * Appends and returns a new empty "org" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org addNewOrg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org)get_store().add_element_user(ORG$2);
                return target;
            }
        }
        
        /**
         * Unsets the "org" element
         */
        public void unsetOrg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORG$2, 0);
            }
        }
        
        /**
         * Gets the "cdregion" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion getCdregion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion)get_store().find_element_user(CDREGION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "cdregion" element
         */
        public boolean isSetCdregion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CDREGION$4) != 0;
            }
        }
        
        /**
         * Sets the "cdregion" element
         */
        public void setCdregion(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion cdregion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion)get_store().find_element_user(CDREGION$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion)get_store().add_element_user(CDREGION$4);
                }
                target.set(cdregion);
            }
        }
        
        /**
         * Appends and returns a new empty "cdregion" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion addNewCdregion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion)get_store().add_element_user(CDREGION$4);
                return target;
            }
        }
        
        /**
         * Unsets the "cdregion" element
         */
        public void unsetCdregion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CDREGION$4, 0);
            }
        }
        
        /**
         * Gets the "prot" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot getProt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot)get_store().find_element_user(PROT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "prot" element
         */
        public boolean isSetProt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROT$6) != 0;
            }
        }
        
        /**
         * Sets the "prot" element
         */
        public void setProt(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot prot)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot)get_store().find_element_user(PROT$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot)get_store().add_element_user(PROT$6);
                }
                target.set(prot);
            }
        }
        
        /**
         * Appends and returns a new empty "prot" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot addNewProt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot)get_store().add_element_user(PROT$6);
                return target;
            }
        }
        
        /**
         * Unsets the "prot" element
         */
        public void unsetProt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROT$6, 0);
            }
        }
        
        /**
         * Gets the "rna" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna getRna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna)get_store().find_element_user(RNA$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "rna" element
         */
        public boolean isSetRna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RNA$8) != 0;
            }
        }
        
        /**
         * Sets the "rna" element
         */
        public void setRna(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna rna)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna)get_store().find_element_user(RNA$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna)get_store().add_element_user(RNA$8);
                }
                target.set(rna);
            }
        }
        
        /**
         * Appends and returns a new empty "rna" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna addNewRna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna)get_store().add_element_user(RNA$8);
                return target;
            }
        }
        
        /**
         * Unsets the "rna" element
         */
        public void unsetRna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RNA$8, 0);
            }
        }
        
        /**
         * Gets the "pub" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub getPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub)get_store().find_element_user(PUB$10, 0);
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
                return get_store().count_elements(PUB$10) != 0;
            }
        }
        
        /**
         * Sets the "pub" element
         */
        public void setPub(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub pub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub)get_store().find_element_user(PUB$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub)get_store().add_element_user(PUB$10);
                }
                target.set(pub);
            }
        }
        
        /**
         * Appends and returns a new empty "pub" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub addNewPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub)get_store().add_element_user(PUB$10);
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
                get_store().remove_element(PUB$10, 0);
            }
        }
        
        /**
         * Gets the "seq" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq getSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq)get_store().find_element_user(SEQ$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seq" element
         */
        public boolean isSetSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQ$12) != 0;
            }
        }
        
        /**
         * Sets the "seq" element
         */
        public void setSeq(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq seq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq)get_store().find_element_user(SEQ$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq)get_store().add_element_user(SEQ$12);
                }
                target.set(seq);
            }
        }
        
        /**
         * Appends and returns a new empty "seq" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq addNewSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq)get_store().add_element_user(SEQ$12);
                return target;
            }
        }
        
        /**
         * Unsets the "seq" element
         */
        public void unsetSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQ$12, 0);
            }
        }
        
        /**
         * Gets the "imp" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp getImp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp)get_store().find_element_user(IMP$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "imp" element
         */
        public boolean isSetImp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMP$14) != 0;
            }
        }
        
        /**
         * Sets the "imp" element
         */
        public void setImp(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp imp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp)get_store().find_element_user(IMP$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp)get_store().add_element_user(IMP$14);
                }
                target.set(imp);
            }
        }
        
        /**
         * Appends and returns a new empty "imp" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp addNewImp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp)get_store().add_element_user(IMP$14);
                return target;
            }
        }
        
        /**
         * Unsets the "imp" element
         */
        public void unsetImp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMP$14, 0);
            }
        }
        
        /**
         * Gets the "region" element
         */
        public java.lang.String getRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "region" element
         */
        public org.apache.xmlbeans.XmlString xgetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "region" element
         */
        public boolean isSetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REGION$16) != 0;
            }
        }
        
        /**
         * Sets the "region" element
         */
        public void setRegion(java.lang.String region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGION$16);
                }
                target.setStringValue(region);
            }
        }
        
        /**
         * Sets (as xml) the "region" element
         */
        public void xsetRegion(org.apache.xmlbeans.XmlString region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGION$16);
                }
                target.set(region);
            }
        }
        
        /**
         * Unsets the "region" element
         */
        public void unsetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REGION$16, 0);
            }
        }
        
        /**
         * Gets the "comment" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment getComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment)get_store().find_element_user(COMMENT$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "comment" element
         */
        public boolean isSetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMENT$18) != 0;
            }
        }
        
        /**
         * Sets the "comment" element
         */
        public void setComment(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment comment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment)get_store().find_element_user(COMMENT$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment)get_store().add_element_user(COMMENT$18);
                }
                target.set(comment);
            }
        }
        
        /**
         * Appends and returns a new empty "comment" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment addNewComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment)get_store().add_element_user(COMMENT$18);
                return target;
            }
        }
        
        /**
         * Unsets the "comment" element
         */
        public void unsetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMENT$18, 0);
            }
        }
        
        /**
         * Gets the "bond" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond getBond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond)get_store().find_element_user(BOND$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "bond" element
         */
        public boolean isSetBond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BOND$20) != 0;
            }
        }
        
        /**
         * Sets the "bond" element
         */
        public void setBond(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond bond)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond)get_store().find_element_user(BOND$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond)get_store().add_element_user(BOND$20);
                }
                target.set(bond);
            }
        }
        
        /**
         * Appends and returns a new empty "bond" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond addNewBond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond)get_store().add_element_user(BOND$20);
                return target;
            }
        }
        
        /**
         * Unsets the "bond" element
         */
        public void unsetBond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BOND$20, 0);
            }
        }
        
        /**
         * Gets the "site" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site getSite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site)get_store().find_element_user(SITE$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "site" element
         */
        public boolean isSetSite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SITE$22) != 0;
            }
        }
        
        /**
         * Sets the "site" element
         */
        public void setSite(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site site)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site)get_store().find_element_user(SITE$22, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site)get_store().add_element_user(SITE$22);
                }
                target.set(site);
            }
        }
        
        /**
         * Appends and returns a new empty "site" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site addNewSite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site)get_store().add_element_user(SITE$22);
                return target;
            }
        }
        
        /**
         * Unsets the "site" element
         */
        public void unsetSite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SITE$22, 0);
            }
        }
        
        /**
         * Gets the "rsite" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite getRsite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite)get_store().find_element_user(RSITE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "rsite" element
         */
        public boolean isSetRsite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RSITE$24) != 0;
            }
        }
        
        /**
         * Sets the "rsite" element
         */
        public void setRsite(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite rsite)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite)get_store().find_element_user(RSITE$24, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite)get_store().add_element_user(RSITE$24);
                }
                target.set(rsite);
            }
        }
        
        /**
         * Appends and returns a new empty "rsite" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite addNewRsite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite)get_store().add_element_user(RSITE$24);
                return target;
            }
        }
        
        /**
         * Unsets the "rsite" element
         */
        public void unsetRsite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RSITE$24, 0);
            }
        }
        
        /**
         * Gets the "user" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User getUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User)get_store().find_element_user(USER$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "user" element
         */
        public boolean isSetUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USER$26) != 0;
            }
        }
        
        /**
         * Sets the "user" element
         */
        public void setUser(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User user)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User)get_store().find_element_user(USER$26, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User)get_store().add_element_user(USER$26);
                }
                target.set(user);
            }
        }
        
        /**
         * Appends and returns a new empty "user" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User addNewUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User)get_store().add_element_user(USER$26);
                return target;
            }
        }
        
        /**
         * Unsets the "user" element
         */
        public void unsetUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USER$26, 0);
            }
        }
        
        /**
         * Gets the "txinit" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit getTxinit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit)get_store().find_element_user(TXINIT$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "txinit" element
         */
        public boolean isSetTxinit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TXINIT$28) != 0;
            }
        }
        
        /**
         * Sets the "txinit" element
         */
        public void setTxinit(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit txinit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit)get_store().find_element_user(TXINIT$28, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit)get_store().add_element_user(TXINIT$28);
                }
                target.set(txinit);
            }
        }
        
        /**
         * Appends and returns a new empty "txinit" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit addNewTxinit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit)get_store().add_element_user(TXINIT$28);
                return target;
            }
        }
        
        /**
         * Unsets the "txinit" element
         */
        public void unsetTxinit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TXINIT$28, 0);
            }
        }
        
        /**
         * Gets the "num" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num getNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num)get_store().find_element_user(NUM$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "num" element
         */
        public boolean isSetNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUM$30) != 0;
            }
        }
        
        /**
         * Sets the "num" element
         */
        public void setNum(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num num)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num)get_store().find_element_user(NUM$30, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num)get_store().add_element_user(NUM$30);
                }
                target.set(num);
            }
        }
        
        /**
         * Appends and returns a new empty "num" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num addNewNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num)get_store().add_element_user(NUM$30);
                return target;
            }
        }
        
        /**
         * Unsets the "num" element
         */
        public void unsetNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUM$30, 0);
            }
        }
        
        /**
         * Gets the "psec-str" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr getPsecStr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr)get_store().find_element_user(PSECSTR$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "psec-str" element
         */
        public boolean isSetPsecStr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PSECSTR$32) != 0;
            }
        }
        
        /**
         * Sets the "psec-str" element
         */
        public void setPsecStr(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr psecStr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr)get_store().find_element_user(PSECSTR$32, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr)get_store().add_element_user(PSECSTR$32);
                }
                target.set(psecStr);
            }
        }
        
        /**
         * Appends and returns a new empty "psec-str" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr addNewPsecStr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr)get_store().add_element_user(PSECSTR$32);
                return target;
            }
        }
        
        /**
         * Unsets the "psec-str" element
         */
        public void unsetPsecStr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PSECSTR$32, 0);
            }
        }
        
        /**
         * Gets the "non-std-residue" element
         */
        public java.lang.String getNonStdResidue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NONSTDRESIDUE$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "non-std-residue" element
         */
        public org.apache.xmlbeans.XmlString xgetNonStdResidue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NONSTDRESIDUE$34, 0);
                return target;
            }
        }
        
        /**
         * True if has "non-std-residue" element
         */
        public boolean isSetNonStdResidue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NONSTDRESIDUE$34) != 0;
            }
        }
        
        /**
         * Sets the "non-std-residue" element
         */
        public void setNonStdResidue(java.lang.String nonStdResidue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NONSTDRESIDUE$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NONSTDRESIDUE$34);
                }
                target.setStringValue(nonStdResidue);
            }
        }
        
        /**
         * Sets (as xml) the "non-std-residue" element
         */
        public void xsetNonStdResidue(org.apache.xmlbeans.XmlString nonStdResidue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NONSTDRESIDUE$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NONSTDRESIDUE$34);
                }
                target.set(nonStdResidue);
            }
        }
        
        /**
         * Unsets the "non-std-residue" element
         */
        public void unsetNonStdResidue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NONSTDRESIDUE$34, 0);
            }
        }
        
        /**
         * Gets the "het" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het getHet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het)get_store().find_element_user(HET$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "het" element
         */
        public boolean isSetHet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HET$36) != 0;
            }
        }
        
        /**
         * Sets the "het" element
         */
        public void setHet(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het het)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het)get_store().find_element_user(HET$36, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het)get_store().add_element_user(HET$36);
                }
                target.set(het);
            }
        }
        
        /**
         * Appends and returns a new empty "het" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het addNewHet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het)get_store().add_element_user(HET$36);
                return target;
            }
        }
        
        /**
         * Unsets the "het" element
         */
        public void unsetHet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HET$36, 0);
            }
        }
        
        /**
         * Gets the "biosrc" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc getBiosrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc)get_store().find_element_user(BIOSRC$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "biosrc" element
         */
        public boolean isSetBiosrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIOSRC$38) != 0;
            }
        }
        
        /**
         * Sets the "biosrc" element
         */
        public void setBiosrc(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc biosrc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc)get_store().find_element_user(BIOSRC$38, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc)get_store().add_element_user(BIOSRC$38);
                }
                target.set(biosrc);
            }
        }
        
        /**
         * Appends and returns a new empty "biosrc" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc addNewBiosrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc)get_store().add_element_user(BIOSRC$38);
                return target;
            }
        }
        
        /**
         * Unsets the "biosrc" element
         */
        public void unsetBiosrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIOSRC$38, 0);
            }
        }
        
        /**
         * Gets the "clone" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone getClone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone)get_store().find_element_user(CLONE$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "clone" element
         */
        public boolean isSetClone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLONE$40) != 0;
            }
        }
        
        /**
         * Sets the "clone" element
         */
        public void setClone(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone clone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone)get_store().find_element_user(CLONE$40, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone)get_store().add_element_user(CLONE$40);
                }
                target.set(clone);
            }
        }
        
        /**
         * Appends and returns a new empty "clone" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone addNewClone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone)get_store().add_element_user(CLONE$40);
                return target;
            }
        }
        
        /**
         * Unsets the "clone" element
         */
        public void unsetClone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLONE$40, 0);
            }
        }
        
        /**
         * Gets the "variation" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation getVariation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation)get_store().find_element_user(VARIATION$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "variation" element
         */
        public boolean isSetVariation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VARIATION$42) != 0;
            }
        }
        
        /**
         * Sets the "variation" element
         */
        public void setVariation(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation variation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation)get_store().find_element_user(VARIATION$42, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation)get_store().add_element_user(VARIATION$42);
                }
                target.set(variation);
            }
        }
        
        /**
         * Appends and returns a new empty "variation" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation addNewVariation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation)get_store().add_element_user(VARIATION$42);
                return target;
            }
        }
        
        /**
         * Unsets the "variation" element
         */
        public void unsetVariation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VARIATION$42, 0);
            }
        }
        /**
         * An XML gene(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GeneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene
        {
            
            public GeneImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GENEREF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Gene-ref");
            
            
            /**
             * Gets the "Gene-ref" element
             */
            public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef getGeneRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef)get_store().find_element_user(GENEREF$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Gene-ref" element
             */
            public void setGeneRef(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef geneRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef)get_store().find_element_user(GENEREF$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef)get_store().add_element_user(GENEREF$0);
                    }
                    target.set(geneRef);
                }
            }
            
            /**
             * Appends and returns a new empty "Gene-ref" element
             */
            public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef addNewGeneRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef)get_store().add_element_user(GENEREF$0);
                    return target;
                }
            }
        }
        /**
         * An XML org(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class OrgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org
        {
            
            public OrgImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ORGREF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Org-ref");
            
            
            /**
             * Gets the "Org-ref" element
             */
            public gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef getOrgRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef)get_store().find_element_user(ORGREF$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Org-ref" element
             */
            public void setOrgRef(gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef orgRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef)get_store().find_element_user(ORGREF$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef)get_store().add_element_user(ORGREF$0);
                    }
                    target.set(orgRef);
                }
            }
            
            /**
             * Appends and returns a new empty "Org-ref" element
             */
            public gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef addNewOrgRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef)get_store().add_element_user(ORGREF$0);
                    return target;
                }
            }
        }
        /**
         * An XML cdregion(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CdregionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion
        {
            
            public CdregionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CDREGION$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cdregion");
            
            
            /**
             * Gets the "Cdregion" element
             */
            public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion getCdregion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion target = null;
                    target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion)get_store().find_element_user(CDREGION$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Cdregion" element
             */
            public void setCdregion(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion cdregion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion target = null;
                    target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion)get_store().find_element_user(CDREGION$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion)get_store().add_element_user(CDREGION$0);
                    }
                    target.set(cdregion);
                }
            }
            
            /**
             * Appends and returns a new empty "Cdregion" element
             */
            public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion addNewCdregion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion target = null;
                    target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion)get_store().add_element_user(CDREGION$0);
                    return target;
                }
            }
        }
        /**
         * An XML prot(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot
        {
            
            public ProtImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PROTREF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Prot-ref");
            
            
            /**
             * Gets the "Prot-ref" element
             */
            public gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef getProtRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef target = null;
                    target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef)get_store().find_element_user(PROTREF$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Prot-ref" element
             */
            public void setProtRef(gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef protRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef target = null;
                    target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef)get_store().find_element_user(PROTREF$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef)get_store().add_element_user(PROTREF$0);
                    }
                    target.set(protRef);
                }
            }
            
            /**
             * Appends and returns a new empty "Prot-ref" element
             */
            public gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef addNewProtRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef target = null;
                    target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef)get_store().add_element_user(PROTREF$0);
                    return target;
                }
            }
        }
        /**
         * An XML rna(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RnaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna
        {
            
            public RnaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RNAREF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "RNA-ref");
            
            
            /**
             * Gets the "RNA-ref" element
             */
            public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef getRNARef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef target = null;
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef)get_store().find_element_user(RNAREF$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "RNA-ref" element
             */
            public void setRNARef(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef rnaRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef target = null;
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef)get_store().find_element_user(RNAREF$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef)get_store().add_element_user(RNAREF$0);
                    }
                    target.set(rnaRef);
                }
            }
            
            /**
             * Appends and returns a new empty "RNA-ref" element
             */
            public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef addNewRNARef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef target = null;
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef)get_store().add_element_user(RNAREF$0);
                    return target;
                }
            }
        }
        /**
         * An XML pub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PubImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub
        {
            
            public PubImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBDESC$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Pubdesc");
            
            
            /**
             * Gets the "Pubdesc" element
             */
            public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc getPubdesc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc)get_store().find_element_user(PUBDESC$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Pubdesc" element
             */
            public void setPubdesc(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc pubdesc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc)get_store().find_element_user(PUBDESC$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc)get_store().add_element_user(PUBDESC$0);
                    }
                    target.set(pubdesc);
                }
            }
            
            /**
             * Appends and returns a new empty "Pubdesc" element
             */
            public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc addNewPubdesc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc)get_store().add_element_user(PUBDESC$0);
                    return target;
                }
            }
        }
        /**
         * An XML seq(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq
        {
            
            public SeqImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML imp(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ImpImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp
        {
            
            public ImpImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName IMPFEAT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Imp-feat");
            
            
            /**
             * Gets the "Imp-feat" element
             */
            public gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat getImpFeat()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat target = null;
                    target = (gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat)get_store().find_element_user(IMPFEAT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Imp-feat" element
             */
            public void setImpFeat(gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat impFeat)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat target = null;
                    target = (gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat)get_store().find_element_user(IMPFEAT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat)get_store().add_element_user(IMPFEAT$0);
                    }
                    target.set(impFeat);
                }
            }
            
            /**
             * Appends and returns a new empty "Imp-feat" element
             */
            public gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat addNewImpFeat()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat target = null;
                    target = (gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat)get_store().add_element_user(IMPFEAT$0);
                    return target;
                }
            }
        }
        /**
         * An XML comment(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CommentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment
        {
            
            public CommentImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML bond(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BondImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond
        {
            
            public BondImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqFeatDataDocument$SeqFeatData$Bond$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value
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
         * An XML site(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SiteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site
        {
            
            public SiteImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqFeatDataDocument$SeqFeatData$Site$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value
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
         * An XML rsite(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RsiteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite
        {
            
            public RsiteImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RSITEREF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Rsite-ref");
            
            
            /**
             * Gets the "Rsite-ref" element
             */
            public gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef getRsiteRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef target = null;
                    target = (gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef)get_store().find_element_user(RSITEREF$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Rsite-ref" element
             */
            public void setRsiteRef(gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef rsiteRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef target = null;
                    target = (gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef)get_store().find_element_user(RSITEREF$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef)get_store().add_element_user(RSITEREF$0);
                    }
                    target.set(rsiteRef);
                }
            }
            
            /**
             * Appends and returns a new empty "Rsite-ref" element
             */
            public gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef addNewRsiteRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef target = null;
                    target = (gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef)get_store().add_element_user(RSITEREF$0);
                    return target;
                }
            }
        }
        /**
         * An XML user(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class UserImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User
        {
            
            public UserImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML txinit(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TxinitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit
        {
            
            public TxinitImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TXINIT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Txinit");
            
            
            /**
             * Gets the "Txinit" element
             */
            public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit getTxinit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxinitDocument.Txinit target = null;
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit)get_store().find_element_user(TXINIT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Txinit" element
             */
            public void setTxinit(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit txinit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxinitDocument.Txinit target = null;
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit)get_store().find_element_user(TXINIT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit)get_store().add_element_user(TXINIT$0);
                    }
                    target.set(txinit);
                }
            }
            
            /**
             * Appends and returns a new empty "Txinit" element
             */
            public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit addNewTxinit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxinitDocument.Txinit target = null;
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit)get_store().add_element_user(TXINIT$0);
                    return target;
                }
            }
        }
        /**
         * An XML num(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NumImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num
        {
            
            public NumImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NUMBERING$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Numbering");
            
            
            /**
             * Gets the "Numbering" element
             */
            public gov.nih.nlm.ncbi.www.NumberingDocument.Numbering getNumbering()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumberingDocument.Numbering target = null;
                    target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering)get_store().find_element_user(NUMBERING$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Numbering" element
             */
            public void setNumbering(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering numbering)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumberingDocument.Numbering target = null;
                    target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering)get_store().find_element_user(NUMBERING$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering)get_store().add_element_user(NUMBERING$0);
                    }
                    target.set(numbering);
                }
            }
            
            /**
             * Appends and returns a new empty "Numbering" element
             */
            public gov.nih.nlm.ncbi.www.NumberingDocument.Numbering addNewNumbering()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumberingDocument.Numbering target = null;
                    target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering)get_store().add_element_user(NUMBERING$0);
                    return target;
                }
            }
        }
        /**
         * An XML psec-str(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PsecStrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr
        {
            
            public PsecStrImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqFeatDataDocument$SeqFeatData$PsecStr$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value
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
         * An XML het(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class HetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het
        {
            
            public HetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName HETEROGEN$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Heterogen");
            
            
            /**
             * Gets the "Heterogen" element
             */
            public java.lang.String getHeterogen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HETEROGEN$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Heterogen" element
             */
            public org.apache.xmlbeans.XmlString xgetHeterogen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HETEROGEN$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Heterogen" element
             */
            public void setHeterogen(java.lang.String heterogen)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HETEROGEN$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HETEROGEN$0);
                    }
                    target.setStringValue(heterogen);
                }
            }
            
            /**
             * Sets (as xml) the "Heterogen" element
             */
            public void xsetHeterogen(org.apache.xmlbeans.XmlString heterogen)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HETEROGEN$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HETEROGEN$0);
                    }
                    target.set(heterogen);
                }
            }
        }
        /**
         * An XML biosrc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BiosrcImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc
        {
            
            public BiosrcImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BIOSOURCE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "BioSource");
            
            
            /**
             * Gets the "BioSource" element
             */
            public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource getBioSource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource target = null;
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource)get_store().find_element_user(BIOSOURCE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "BioSource" element
             */
            public void setBioSource(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource bioSource)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource target = null;
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource)get_store().find_element_user(BIOSOURCE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource)get_store().add_element_user(BIOSOURCE$0);
                    }
                    target.set(bioSource);
                }
            }
            
            /**
             * Appends and returns a new empty "BioSource" element
             */
            public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource addNewBioSource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource target = null;
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource)get_store().add_element_user(BIOSOURCE$0);
                    return target;
                }
            }
        }
        /**
         * An XML clone(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CloneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone
        {
            
            public CloneImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CLONEREF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Clone-ref");
            
            
            /**
             * Gets the "Clone-ref" element
             */
            public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef getCloneRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef)get_store().find_element_user(CLONEREF$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Clone-ref" element
             */
            public void setCloneRef(gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef cloneRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef)get_store().find_element_user(CLONEREF$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef)get_store().add_element_user(CLONEREF$0);
                    }
                    target.set(cloneRef);
                }
            }
            
            /**
             * Appends and returns a new empty "Clone-ref" element
             */
            public gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef addNewCloneRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef target = null;
                    target = (gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef)get_store().add_element_user(CLONEREF$0);
                    return target;
                }
            }
        }
        /**
         * An XML variation(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class VariationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation
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
    }
}
