/*
 * An XML document type.
 * Localname: SeqFeatData
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqFeatDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one SeqFeatData(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqFeatDataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqFeatDataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqfeatdataef07doctype");
    
    /**
     * Gets the "SeqFeatData" element
     */
    gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData getSeqFeatData();
    
    /**
     * Sets the "SeqFeatData" element
     */
    void setSeqFeatData(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData seqFeatData);
    
    /**
     * Appends and returns a new empty "SeqFeatData" element
     */
    gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData addNewSeqFeatData();
    
    /**
     * An XML SeqFeatData(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqFeatData extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqFeatData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqfeatdata480eelemtype");
        
        /**
         * Gets the "gene" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene getGene();
        
        /**
         * True if has "gene" element
         */
        boolean isSetGene();
        
        /**
         * Sets the "gene" element
         */
        void setGene(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene gene);
        
        /**
         * Appends and returns a new empty "gene" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene addNewGene();
        
        /**
         * Unsets the "gene" element
         */
        void unsetGene();
        
        /**
         * Gets the "org" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org getOrg();
        
        /**
         * True if has "org" element
         */
        boolean isSetOrg();
        
        /**
         * Sets the "org" element
         */
        void setOrg(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org org);
        
        /**
         * Appends and returns a new empty "org" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org addNewOrg();
        
        /**
         * Unsets the "org" element
         */
        void unsetOrg();
        
        /**
         * Gets the "cdregion" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion getCdregion();
        
        /**
         * True if has "cdregion" element
         */
        boolean isSetCdregion();
        
        /**
         * Sets the "cdregion" element
         */
        void setCdregion(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion cdregion);
        
        /**
         * Appends and returns a new empty "cdregion" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion addNewCdregion();
        
        /**
         * Unsets the "cdregion" element
         */
        void unsetCdregion();
        
        /**
         * Gets the "prot" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot getProt();
        
        /**
         * True if has "prot" element
         */
        boolean isSetProt();
        
        /**
         * Sets the "prot" element
         */
        void setProt(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot prot);
        
        /**
         * Appends and returns a new empty "prot" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot addNewProt();
        
        /**
         * Unsets the "prot" element
         */
        void unsetProt();
        
        /**
         * Gets the "rna" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna getRna();
        
        /**
         * True if has "rna" element
         */
        boolean isSetRna();
        
        /**
         * Sets the "rna" element
         */
        void setRna(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna rna);
        
        /**
         * Appends and returns a new empty "rna" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna addNewRna();
        
        /**
         * Unsets the "rna" element
         */
        void unsetRna();
        
        /**
         * Gets the "pub" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub getPub();
        
        /**
         * True if has "pub" element
         */
        boolean isSetPub();
        
        /**
         * Sets the "pub" element
         */
        void setPub(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub pub);
        
        /**
         * Appends and returns a new empty "pub" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub addNewPub();
        
        /**
         * Unsets the "pub" element
         */
        void unsetPub();
        
        /**
         * Gets the "seq" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq getSeq();
        
        /**
         * True if has "seq" element
         */
        boolean isSetSeq();
        
        /**
         * Sets the "seq" element
         */
        void setSeq(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq seq);
        
        /**
         * Appends and returns a new empty "seq" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq addNewSeq();
        
        /**
         * Unsets the "seq" element
         */
        void unsetSeq();
        
        /**
         * Gets the "imp" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp getImp();
        
        /**
         * True if has "imp" element
         */
        boolean isSetImp();
        
        /**
         * Sets the "imp" element
         */
        void setImp(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp imp);
        
        /**
         * Appends and returns a new empty "imp" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp addNewImp();
        
        /**
         * Unsets the "imp" element
         */
        void unsetImp();
        
        /**
         * Gets the "region" element
         */
        java.lang.String getRegion();
        
        /**
         * Gets (as xml) the "region" element
         */
        org.apache.xmlbeans.XmlString xgetRegion();
        
        /**
         * True if has "region" element
         */
        boolean isSetRegion();
        
        /**
         * Sets the "region" element
         */
        void setRegion(java.lang.String region);
        
        /**
         * Sets (as xml) the "region" element
         */
        void xsetRegion(org.apache.xmlbeans.XmlString region);
        
        /**
         * Unsets the "region" element
         */
        void unsetRegion();
        
        /**
         * Gets the "comment" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment getComment();
        
        /**
         * True if has "comment" element
         */
        boolean isSetComment();
        
        /**
         * Sets the "comment" element
         */
        void setComment(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment comment);
        
        /**
         * Appends and returns a new empty "comment" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment addNewComment();
        
        /**
         * Unsets the "comment" element
         */
        void unsetComment();
        
        /**
         * Gets the "bond" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond getBond();
        
        /**
         * True if has "bond" element
         */
        boolean isSetBond();
        
        /**
         * Sets the "bond" element
         */
        void setBond(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond bond);
        
        /**
         * Appends and returns a new empty "bond" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond addNewBond();
        
        /**
         * Unsets the "bond" element
         */
        void unsetBond();
        
        /**
         * Gets the "site" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site getSite();
        
        /**
         * True if has "site" element
         */
        boolean isSetSite();
        
        /**
         * Sets the "site" element
         */
        void setSite(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site site);
        
        /**
         * Appends and returns a new empty "site" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site addNewSite();
        
        /**
         * Unsets the "site" element
         */
        void unsetSite();
        
        /**
         * Gets the "rsite" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite getRsite();
        
        /**
         * True if has "rsite" element
         */
        boolean isSetRsite();
        
        /**
         * Sets the "rsite" element
         */
        void setRsite(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite rsite);
        
        /**
         * Appends and returns a new empty "rsite" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite addNewRsite();
        
        /**
         * Unsets the "rsite" element
         */
        void unsetRsite();
        
        /**
         * Gets the "user" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User getUser();
        
        /**
         * True if has "user" element
         */
        boolean isSetUser();
        
        /**
         * Sets the "user" element
         */
        void setUser(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User user);
        
        /**
         * Appends and returns a new empty "user" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User addNewUser();
        
        /**
         * Unsets the "user" element
         */
        void unsetUser();
        
        /**
         * Gets the "txinit" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit getTxinit();
        
        /**
         * True if has "txinit" element
         */
        boolean isSetTxinit();
        
        /**
         * Sets the "txinit" element
         */
        void setTxinit(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit txinit);
        
        /**
         * Appends and returns a new empty "txinit" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit addNewTxinit();
        
        /**
         * Unsets the "txinit" element
         */
        void unsetTxinit();
        
        /**
         * Gets the "num" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num getNum();
        
        /**
         * True if has "num" element
         */
        boolean isSetNum();
        
        /**
         * Sets the "num" element
         */
        void setNum(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num num);
        
        /**
         * Appends and returns a new empty "num" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num addNewNum();
        
        /**
         * Unsets the "num" element
         */
        void unsetNum();
        
        /**
         * Gets the "psec-str" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr getPsecStr();
        
        /**
         * True if has "psec-str" element
         */
        boolean isSetPsecStr();
        
        /**
         * Sets the "psec-str" element
         */
        void setPsecStr(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr psecStr);
        
        /**
         * Appends and returns a new empty "psec-str" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr addNewPsecStr();
        
        /**
         * Unsets the "psec-str" element
         */
        void unsetPsecStr();
        
        /**
         * Gets the "non-std-residue" element
         */
        java.lang.String getNonStdResidue();
        
        /**
         * Gets (as xml) the "non-std-residue" element
         */
        org.apache.xmlbeans.XmlString xgetNonStdResidue();
        
        /**
         * True if has "non-std-residue" element
         */
        boolean isSetNonStdResidue();
        
        /**
         * Sets the "non-std-residue" element
         */
        void setNonStdResidue(java.lang.String nonStdResidue);
        
        /**
         * Sets (as xml) the "non-std-residue" element
         */
        void xsetNonStdResidue(org.apache.xmlbeans.XmlString nonStdResidue);
        
        /**
         * Unsets the "non-std-residue" element
         */
        void unsetNonStdResidue();
        
        /**
         * Gets the "het" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het getHet();
        
        /**
         * True if has "het" element
         */
        boolean isSetHet();
        
        /**
         * Sets the "het" element
         */
        void setHet(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het het);
        
        /**
         * Appends and returns a new empty "het" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het addNewHet();
        
        /**
         * Unsets the "het" element
         */
        void unsetHet();
        
        /**
         * Gets the "biosrc" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc getBiosrc();
        
        /**
         * True if has "biosrc" element
         */
        boolean isSetBiosrc();
        
        /**
         * Sets the "biosrc" element
         */
        void setBiosrc(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc biosrc);
        
        /**
         * Appends and returns a new empty "biosrc" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc addNewBiosrc();
        
        /**
         * Unsets the "biosrc" element
         */
        void unsetBiosrc();
        
        /**
         * Gets the "clone" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone getClone();
        
        /**
         * True if has "clone" element
         */
        boolean isSetClone();
        
        /**
         * Sets the "clone" element
         */
        void setClone(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone clone);
        
        /**
         * Appends and returns a new empty "clone" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone addNewClone();
        
        /**
         * Unsets the "clone" element
         */
        void unsetClone();
        
        /**
         * Gets the "variation" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation getVariation();
        
        /**
         * True if has "variation" element
         */
        boolean isSetVariation();
        
        /**
         * Sets the "variation" element
         */
        void setVariation(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation variation);
        
        /**
         * Appends and returns a new empty "variation" element
         */
        gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation addNewVariation();
        
        /**
         * Unsets the "variation" element
         */
        void unsetVariation();
        
        /**
         * An XML gene(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Gene extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Gene.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("gened8bfelemtype");
            
            /**
             * Gets the "Gene-ref" element
             */
            gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef getGeneRef();
            
            /**
             * Sets the "Gene-ref" element
             */
            void setGeneRef(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef geneRef);
            
            /**
             * Appends and returns a new empty "Gene-ref" element
             */
            gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef addNewGeneRef();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Gene) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML org(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Org extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Org.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("orgd75eelemtype");
            
            /**
             * Gets the "Org-ref" element
             */
            gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef getOrgRef();
            
            /**
             * Sets the "Org-ref" element
             */
            void setOrgRef(gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef orgRef);
            
            /**
             * Appends and returns a new empty "Org-ref" element
             */
            gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef addNewOrgRef();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Org) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML cdregion(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Cdregion extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cdregion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("cdregion983felemtype");
            
            /**
             * Gets the "Cdregion" element
             */
            gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion getCdregion();
            
            /**
             * Sets the "Cdregion" element
             */
            void setCdregion(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion cdregion);
            
            /**
             * Appends and returns a new empty "Cdregion" element
             */
            gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion addNewCdregion();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Cdregion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML prot(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Prot extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Prot.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("prot0311elemtype");
            
            /**
             * Gets the "Prot-ref" element
             */
            gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef getProtRef();
            
            /**
             * Sets the "Prot-ref" element
             */
            void setProtRef(gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef protRef);
            
            /**
             * Appends and returns a new empty "Prot-ref" element
             */
            gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef addNewProtRef();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Prot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML rna(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Rna extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Rna.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("rnaab1felemtype");
            
            /**
             * Gets the "RNA-ref" element
             */
            gov.nih.nlm.ncbi.www.RNARefDocument.RNARef getRNARef();
            
            /**
             * Sets the "RNA-ref" element
             */
            void setRNARef(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef rnaRef);
            
            /**
             * Appends and returns a new empty "RNA-ref" element
             */
            gov.nih.nlm.ncbi.www.RNARefDocument.RNARef addNewRNARef();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rna) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pub extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pub.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pubbc77elemtype");
            
            /**
             * Gets the "Pubdesc" element
             */
            gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc getPubdesc();
            
            /**
             * Sets the "Pubdesc" element
             */
            void setPubdesc(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc pubdesc);
            
            /**
             * Appends and returns a new empty "Pubdesc" element
             */
            gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc addNewPubdesc();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Seq extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Seq.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seq37d9elemtype");
            
            /**
             * Gets the "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLoc();
            
            /**
             * Sets the "Seq-loc" element
             */
            void setSeqLoc(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc);
            
            /**
             * Appends and returns a new empty "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Seq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML imp(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Imp extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Imp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("impe846elemtype");
            
            /**
             * Gets the "Imp-feat" element
             */
            gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat getImpFeat();
            
            /**
             * Sets the "Imp-feat" element
             */
            void setImpFeat(gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat impFeat);
            
            /**
             * Appends and returns a new empty "Imp-feat" element
             */
            gov.nih.nlm.ncbi.www.ImpFeatDocument.ImpFeat addNewImpFeat();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Imp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML comment(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Comment extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Comment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("commentf5d9elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Comment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML bond(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Bond extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bond.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bondd66delemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqFeatDataDocument$SeqFeatData$Bond$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuea474attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum DISULFIDE = Enum.forString("disulfide");
                static final Enum THIOLESTER = Enum.forString("thiolester");
                static final Enum XLINK = Enum.forString("xlink");
                static final Enum THIOETHER = Enum.forString("thioether");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_DISULFIDE = Enum.INT_DISULFIDE;
                static final int INT_THIOLESTER = Enum.INT_THIOLESTER;
                static final int INT_XLINK = Enum.INT_XLINK;
                static final int INT_THIOETHER = Enum.INT_THIOETHER;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqFeatDataDocument$SeqFeatData$Bond$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_DISULFIDE
                 * Enum.forString(s); // returns the enum value for a string
                 * Enum.forInt(i); // returns the enum value for an int
                 * </pre>
                 * Enumeration objects are immutable singleton objects that
                 * can be compared using == object equality. They have no
                 * public constructor. See the constants defined within this
                 * class for all the valid values.
                 */
                static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
                {
                    /**
                     * Returns the enum value for a string, or null if none.
                     */
                    public static Enum forString(java.lang.String s)
                        { return (Enum)table.forString(s); }
                    /**
                     * Returns the enum value corresponding to an int, or null if none.
                     */
                    public static Enum forInt(int i)
                        { return (Enum)table.forInt(i); }
                    
                    private Enum(java.lang.String s, int i)
                        { super(s, i); }
                    
                    static final int INT_DISULFIDE = 1;
                    static final int INT_THIOLESTER = 2;
                    static final int INT_XLINK = 3;
                    static final int INT_THIOETHER = 4;
                    static final int INT_OTHER = 5;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("disulfide", INT_DISULFIDE),
                        new Enum("thiolester", INT_THIOLESTER),
                        new Enum("xlink", INT_XLINK),
                        new Enum("thioether", INT_THIOETHER),
                        new Enum("other", INT_OTHER),
                      }
                    );
                    private static final long serialVersionUID = 1L;
                    private java.lang.Object readResolve() { return forInt(intValue()); } 
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Bond) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML site(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Site extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Site.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("site1ef1elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqFeatDataDocument$SeqFeatData$Site$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valueecf8attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum ACTIVE = Enum.forString("active");
                static final Enum BINDING = Enum.forString("binding");
                static final Enum CLEAVAGE = Enum.forString("cleavage");
                static final Enum INHIBIT = Enum.forString("inhibit");
                static final Enum MODIFIED = Enum.forString("modified");
                static final Enum GLYCOSYLATION = Enum.forString("glycosylation");
                static final Enum MYRISTOYLATION = Enum.forString("myristoylation");
                static final Enum MUTAGENIZED = Enum.forString("mutagenized");
                static final Enum METAL_BINDING = Enum.forString("metal-binding");
                static final Enum PHOSPHORYLATION = Enum.forString("phosphorylation");
                static final Enum ACETYLATION = Enum.forString("acetylation");
                static final Enum AMIDATION = Enum.forString("amidation");
                static final Enum METHYLATION = Enum.forString("methylation");
                static final Enum HYDROXYLATION = Enum.forString("hydroxylation");
                static final Enum SULFATATION = Enum.forString("sulfatation");
                static final Enum OXIDATIVE_DEAMINATION = Enum.forString("oxidative-deamination");
                static final Enum PYRROLIDONE_CARBOXYLIC_ACID = Enum.forString("pyrrolidone-carboxylic-acid");
                static final Enum GAMMA_CARBOXYGLUTAMIC_ACID = Enum.forString("gamma-carboxyglutamic-acid");
                static final Enum BLOCKED = Enum.forString("blocked");
                static final Enum LIPID_BINDING = Enum.forString("lipid-binding");
                static final Enum NP_BINDING = Enum.forString("np-binding");
                static final Enum DNA_BINDING = Enum.forString("dna-binding");
                static final Enum SIGNAL_PEPTIDE = Enum.forString("signal-peptide");
                static final Enum TRANSIT_PEPTIDE = Enum.forString("transit-peptide");
                static final Enum TRANSMEMBRANE_REGION = Enum.forString("transmembrane-region");
                static final Enum NITROSYLATION = Enum.forString("nitrosylation");
                static final Enum OTHER = Enum.forString("other");
                
                static final int INT_ACTIVE = Enum.INT_ACTIVE;
                static final int INT_BINDING = Enum.INT_BINDING;
                static final int INT_CLEAVAGE = Enum.INT_CLEAVAGE;
                static final int INT_INHIBIT = Enum.INT_INHIBIT;
                static final int INT_MODIFIED = Enum.INT_MODIFIED;
                static final int INT_GLYCOSYLATION = Enum.INT_GLYCOSYLATION;
                static final int INT_MYRISTOYLATION = Enum.INT_MYRISTOYLATION;
                static final int INT_MUTAGENIZED = Enum.INT_MUTAGENIZED;
                static final int INT_METAL_BINDING = Enum.INT_METAL_BINDING;
                static final int INT_PHOSPHORYLATION = Enum.INT_PHOSPHORYLATION;
                static final int INT_ACETYLATION = Enum.INT_ACETYLATION;
                static final int INT_AMIDATION = Enum.INT_AMIDATION;
                static final int INT_METHYLATION = Enum.INT_METHYLATION;
                static final int INT_HYDROXYLATION = Enum.INT_HYDROXYLATION;
                static final int INT_SULFATATION = Enum.INT_SULFATATION;
                static final int INT_OXIDATIVE_DEAMINATION = Enum.INT_OXIDATIVE_DEAMINATION;
                static final int INT_PYRROLIDONE_CARBOXYLIC_ACID = Enum.INT_PYRROLIDONE_CARBOXYLIC_ACID;
                static final int INT_GAMMA_CARBOXYGLUTAMIC_ACID = Enum.INT_GAMMA_CARBOXYGLUTAMIC_ACID;
                static final int INT_BLOCKED = Enum.INT_BLOCKED;
                static final int INT_LIPID_BINDING = Enum.INT_LIPID_BINDING;
                static final int INT_NP_BINDING = Enum.INT_NP_BINDING;
                static final int INT_DNA_BINDING = Enum.INT_DNA_BINDING;
                static final int INT_SIGNAL_PEPTIDE = Enum.INT_SIGNAL_PEPTIDE;
                static final int INT_TRANSIT_PEPTIDE = Enum.INT_TRANSIT_PEPTIDE;
                static final int INT_TRANSMEMBRANE_REGION = Enum.INT_TRANSMEMBRANE_REGION;
                static final int INT_NITROSYLATION = Enum.INT_NITROSYLATION;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqFeatDataDocument$SeqFeatData$Site$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_ACTIVE
                 * Enum.forString(s); // returns the enum value for a string
                 * Enum.forInt(i); // returns the enum value for an int
                 * </pre>
                 * Enumeration objects are immutable singleton objects that
                 * can be compared using == object equality. They have no
                 * public constructor. See the constants defined within this
                 * class for all the valid values.
                 */
                static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
                {
                    /**
                     * Returns the enum value for a string, or null if none.
                     */
                    public static Enum forString(java.lang.String s)
                        { return (Enum)table.forString(s); }
                    /**
                     * Returns the enum value corresponding to an int, or null if none.
                     */
                    public static Enum forInt(int i)
                        { return (Enum)table.forInt(i); }
                    
                    private Enum(java.lang.String s, int i)
                        { super(s, i); }
                    
                    static final int INT_ACTIVE = 1;
                    static final int INT_BINDING = 2;
                    static final int INT_CLEAVAGE = 3;
                    static final int INT_INHIBIT = 4;
                    static final int INT_MODIFIED = 5;
                    static final int INT_GLYCOSYLATION = 6;
                    static final int INT_MYRISTOYLATION = 7;
                    static final int INT_MUTAGENIZED = 8;
                    static final int INT_METAL_BINDING = 9;
                    static final int INT_PHOSPHORYLATION = 10;
                    static final int INT_ACETYLATION = 11;
                    static final int INT_AMIDATION = 12;
                    static final int INT_METHYLATION = 13;
                    static final int INT_HYDROXYLATION = 14;
                    static final int INT_SULFATATION = 15;
                    static final int INT_OXIDATIVE_DEAMINATION = 16;
                    static final int INT_PYRROLIDONE_CARBOXYLIC_ACID = 17;
                    static final int INT_GAMMA_CARBOXYGLUTAMIC_ACID = 18;
                    static final int INT_BLOCKED = 19;
                    static final int INT_LIPID_BINDING = 20;
                    static final int INT_NP_BINDING = 21;
                    static final int INT_DNA_BINDING = 22;
                    static final int INT_SIGNAL_PEPTIDE = 23;
                    static final int INT_TRANSIT_PEPTIDE = 24;
                    static final int INT_TRANSMEMBRANE_REGION = 25;
                    static final int INT_NITROSYLATION = 26;
                    static final int INT_OTHER = 27;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("active", INT_ACTIVE),
                        new Enum("binding", INT_BINDING),
                        new Enum("cleavage", INT_CLEAVAGE),
                        new Enum("inhibit", INT_INHIBIT),
                        new Enum("modified", INT_MODIFIED),
                        new Enum("glycosylation", INT_GLYCOSYLATION),
                        new Enum("myristoylation", INT_MYRISTOYLATION),
                        new Enum("mutagenized", INT_MUTAGENIZED),
                        new Enum("metal-binding", INT_METAL_BINDING),
                        new Enum("phosphorylation", INT_PHOSPHORYLATION),
                        new Enum("acetylation", INT_ACETYLATION),
                        new Enum("amidation", INT_AMIDATION),
                        new Enum("methylation", INT_METHYLATION),
                        new Enum("hydroxylation", INT_HYDROXYLATION),
                        new Enum("sulfatation", INT_SULFATATION),
                        new Enum("oxidative-deamination", INT_OXIDATIVE_DEAMINATION),
                        new Enum("pyrrolidone-carboxylic-acid", INT_PYRROLIDONE_CARBOXYLIC_ACID),
                        new Enum("gamma-carboxyglutamic-acid", INT_GAMMA_CARBOXYGLUTAMIC_ACID),
                        new Enum("blocked", INT_BLOCKED),
                        new Enum("lipid-binding", INT_LIPID_BINDING),
                        new Enum("np-binding", INT_NP_BINDING),
                        new Enum("dna-binding", INT_DNA_BINDING),
                        new Enum("signal-peptide", INT_SIGNAL_PEPTIDE),
                        new Enum("transit-peptide", INT_TRANSIT_PEPTIDE),
                        new Enum("transmembrane-region", INT_TRANSMEMBRANE_REGION),
                        new Enum("nitrosylation", INT_NITROSYLATION),
                        new Enum("other", INT_OTHER),
                      }
                    );
                    private static final long serialVersionUID = 1L;
                    private java.lang.Object readResolve() { return forInt(intValue()); } 
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Site) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML rsite(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Rsite extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Rsite.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("rsite8233elemtype");
            
            /**
             * Gets the "Rsite-ref" element
             */
            gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef getRsiteRef();
            
            /**
             * Sets the "Rsite-ref" element
             */
            void setRsiteRef(gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef rsiteRef);
            
            /**
             * Appends and returns a new empty "Rsite-ref" element
             */
            gov.nih.nlm.ncbi.www.RsiteRefDocument.RsiteRef addNewRsiteRef();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Rsite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML user(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface User extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(User.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("usercf75elemtype");
            
            /**
             * Gets the "User-object" element
             */
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObject();
            
            /**
             * Sets the "User-object" element
             */
            void setUserObject(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject);
            
            /**
             * Appends and returns a new empty "User-object" element
             */
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject addNewUserObject();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML txinit(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Txinit extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Txinit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("txinitc03eelemtype");
            
            /**
             * Gets the "Txinit" element
             */
            gov.nih.nlm.ncbi.www.TxinitDocument.Txinit getTxinit();
            
            /**
             * Sets the "Txinit" element
             */
            void setTxinit(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit txinit);
            
            /**
             * Appends and returns a new empty "Txinit" element
             */
            gov.nih.nlm.ncbi.www.TxinitDocument.Txinit addNewTxinit();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Txinit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML num(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Num extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Num.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("num8600elemtype");
            
            /**
             * Gets the "Numbering" element
             */
            gov.nih.nlm.ncbi.www.NumberingDocument.Numbering getNumbering();
            
            /**
             * Sets the "Numbering" element
             */
            void setNumbering(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering numbering);
            
            /**
             * Appends and returns a new empty "Numbering" element
             */
            gov.nih.nlm.ncbi.www.NumberingDocument.Numbering addNewNumbering();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Num) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML psec-str(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface PsecStr extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PsecStr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("psecstr21efelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqFeatDataDocument$SeqFeatData$PsecStr$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value9476attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum HELIX = Enum.forString("helix");
                static final Enum SHEET = Enum.forString("sheet");
                static final Enum TURN = Enum.forString("turn");
                
                static final int INT_HELIX = Enum.INT_HELIX;
                static final int INT_SHEET = Enum.INT_SHEET;
                static final int INT_TURN = Enum.INT_TURN;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SeqFeatDataDocument$SeqFeatData$PsecStr$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_HELIX
                 * Enum.forString(s); // returns the enum value for a string
                 * Enum.forInt(i); // returns the enum value for an int
                 * </pre>
                 * Enumeration objects are immutable singleton objects that
                 * can be compared using == object equality. They have no
                 * public constructor. See the constants defined within this
                 * class for all the valid values.
                 */
                static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
                {
                    /**
                     * Returns the enum value for a string, or null if none.
                     */
                    public static Enum forString(java.lang.String s)
                        { return (Enum)table.forString(s); }
                    /**
                     * Returns the enum value corresponding to an int, or null if none.
                     */
                    public static Enum forInt(int i)
                        { return (Enum)table.forInt(i); }
                    
                    private Enum(java.lang.String s, int i)
                        { super(s, i); }
                    
                    static final int INT_HELIX = 1;
                    static final int INT_SHEET = 2;
                    static final int INT_TURN = 3;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("helix", INT_HELIX),
                        new Enum("sheet", INT_SHEET),
                        new Enum("turn", INT_TURN),
                      }
                    );
                    private static final long serialVersionUID = 1L;
                    private java.lang.Object readResolve() { return forInt(intValue()); } 
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.PsecStr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML het(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Het extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Het.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("het8691elemtype");
            
            /**
             * Gets the "Heterogen" element
             */
            java.lang.String getHeterogen();
            
            /**
             * Gets (as xml) the "Heterogen" element
             */
            org.apache.xmlbeans.XmlString xgetHeterogen();
            
            /**
             * Sets the "Heterogen" element
             */
            void setHeterogen(java.lang.String heterogen);
            
            /**
             * Sets (as xml) the "Heterogen" element
             */
            void xsetHeterogen(org.apache.xmlbeans.XmlString heterogen);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Het) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML biosrc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Biosrc extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Biosrc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("biosrc7a86elemtype");
            
            /**
             * Gets the "BioSource" element
             */
            gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource getBioSource();
            
            /**
             * Sets the "BioSource" element
             */
            void setBioSource(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource bioSource);
            
            /**
             * Appends and returns a new empty "BioSource" element
             */
            gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource addNewBioSource();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Biosrc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML clone(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Clone extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Clone.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("cloneccd7elemtype");
            
            /**
             * Gets the "Clone-ref" element
             */
            gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef getCloneRef();
            
            /**
             * Sets the "Clone-ref" element
             */
            void setCloneRef(gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef cloneRef);
            
            /**
             * Appends and returns a new empty "Clone-ref" element
             */
            gov.nih.nlm.ncbi.www.CloneRefDocument.CloneRef addNewCloneRef();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Clone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML variation(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Variation extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Variation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("variation838delemtype");
            
            /**
             * Gets the "Variation-ref" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef getVariationRef();
            
            /**
             * Sets the "Variation-ref" element
             */
            void setVariationRef(gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef variationRef);
            
            /**
             * Appends and returns a new empty "Variation-ref" element
             */
            gov.nih.nlm.ncbi.www.VariationRefDocument.VariationRef addNewVariationRef();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData.Variation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqFeatDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqFeatDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
