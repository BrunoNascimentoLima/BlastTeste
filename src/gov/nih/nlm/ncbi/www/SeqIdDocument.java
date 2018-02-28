/*
 * An XML document type.
 * Localname: Seq-id
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Seq-id(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqIdDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqIdDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqid82e7doctype");
    
    /**
     * Gets the "Seq-id" element
     */
    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqId();
    
    /**
     * Sets the "Seq-id" element
     */
    void setSeqId(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId);
    
    /**
     * Appends and returns a new empty "Seq-id" element
     */
    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId();
    
    /**
     * An XML Seq-id(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqId extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqid4602elemtype");
        
        /**
         * Gets the "local" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local getLocal();
        
        /**
         * True if has "local" element
         */
        boolean isSetLocal();
        
        /**
         * Sets the "local" element
         */
        void setLocal(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local local);
        
        /**
         * Appends and returns a new empty "local" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local addNewLocal();
        
        /**
         * Unsets the "local" element
         */
        void unsetLocal();
        
        /**
         * Gets the "gibbsq" element
         */
        java.math.BigInteger getGibbsq();
        
        /**
         * Gets (as xml) the "gibbsq" element
         */
        org.apache.xmlbeans.XmlInteger xgetGibbsq();
        
        /**
         * True if has "gibbsq" element
         */
        boolean isSetGibbsq();
        
        /**
         * Sets the "gibbsq" element
         */
        void setGibbsq(java.math.BigInteger gibbsq);
        
        /**
         * Sets (as xml) the "gibbsq" element
         */
        void xsetGibbsq(org.apache.xmlbeans.XmlInteger gibbsq);
        
        /**
         * Unsets the "gibbsq" element
         */
        void unsetGibbsq();
        
        /**
         * Gets the "gibbmt" element
         */
        java.math.BigInteger getGibbmt();
        
        /**
         * Gets (as xml) the "gibbmt" element
         */
        org.apache.xmlbeans.XmlInteger xgetGibbmt();
        
        /**
         * True if has "gibbmt" element
         */
        boolean isSetGibbmt();
        
        /**
         * Sets the "gibbmt" element
         */
        void setGibbmt(java.math.BigInteger gibbmt);
        
        /**
         * Sets (as xml) the "gibbmt" element
         */
        void xsetGibbmt(org.apache.xmlbeans.XmlInteger gibbmt);
        
        /**
         * Unsets the "gibbmt" element
         */
        void unsetGibbmt();
        
        /**
         * Gets the "giim" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim getGiim();
        
        /**
         * True if has "giim" element
         */
        boolean isSetGiim();
        
        /**
         * Sets the "giim" element
         */
        void setGiim(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim giim);
        
        /**
         * Appends and returns a new empty "giim" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim addNewGiim();
        
        /**
         * Unsets the "giim" element
         */
        void unsetGiim();
        
        /**
         * Gets the "genbank" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank getGenbank();
        
        /**
         * True if has "genbank" element
         */
        boolean isSetGenbank();
        
        /**
         * Sets the "genbank" element
         */
        void setGenbank(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank genbank);
        
        /**
         * Appends and returns a new empty "genbank" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank addNewGenbank();
        
        /**
         * Unsets the "genbank" element
         */
        void unsetGenbank();
        
        /**
         * Gets the "embl" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl getEmbl();
        
        /**
         * True if has "embl" element
         */
        boolean isSetEmbl();
        
        /**
         * Sets the "embl" element
         */
        void setEmbl(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl embl);
        
        /**
         * Appends and returns a new empty "embl" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl addNewEmbl();
        
        /**
         * Unsets the "embl" element
         */
        void unsetEmbl();
        
        /**
         * Gets the "pir" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir getPir();
        
        /**
         * True if has "pir" element
         */
        boolean isSetPir();
        
        /**
         * Sets the "pir" element
         */
        void setPir(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir pir);
        
        /**
         * Appends and returns a new empty "pir" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir addNewPir();
        
        /**
         * Unsets the "pir" element
         */
        void unsetPir();
        
        /**
         * Gets the "swissprot" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot getSwissprot();
        
        /**
         * True if has "swissprot" element
         */
        boolean isSetSwissprot();
        
        /**
         * Sets the "swissprot" element
         */
        void setSwissprot(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot swissprot);
        
        /**
         * Appends and returns a new empty "swissprot" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot addNewSwissprot();
        
        /**
         * Unsets the "swissprot" element
         */
        void unsetSwissprot();
        
        /**
         * Gets the "patent" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent getPatent();
        
        /**
         * True if has "patent" element
         */
        boolean isSetPatent();
        
        /**
         * Sets the "patent" element
         */
        void setPatent(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent patent);
        
        /**
         * Appends and returns a new empty "patent" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent addNewPatent();
        
        /**
         * Unsets the "patent" element
         */
        void unsetPatent();
        
        /**
         * Gets the "other" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other getOther();
        
        /**
         * True if has "other" element
         */
        boolean isSetOther();
        
        /**
         * Sets the "other" element
         */
        void setOther(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other other);
        
        /**
         * Appends and returns a new empty "other" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other addNewOther();
        
        /**
         * Unsets the "other" element
         */
        void unsetOther();
        
        /**
         * Gets the "general" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General getGeneral();
        
        /**
         * True if has "general" element
         */
        boolean isSetGeneral();
        
        /**
         * Sets the "general" element
         */
        void setGeneral(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General general);
        
        /**
         * Appends and returns a new empty "general" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General addNewGeneral();
        
        /**
         * Unsets the "general" element
         */
        void unsetGeneral();
        
        /**
         * Gets the "gi" element
         */
        java.math.BigInteger getGi();
        
        /**
         * Gets (as xml) the "gi" element
         */
        org.apache.xmlbeans.XmlInteger xgetGi();
        
        /**
         * True if has "gi" element
         */
        boolean isSetGi();
        
        /**
         * Sets the "gi" element
         */
        void setGi(java.math.BigInteger gi);
        
        /**
         * Sets (as xml) the "gi" element
         */
        void xsetGi(org.apache.xmlbeans.XmlInteger gi);
        
        /**
         * Unsets the "gi" element
         */
        void unsetGi();
        
        /**
         * Gets the "ddbj" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj getDdbj();
        
        /**
         * True if has "ddbj" element
         */
        boolean isSetDdbj();
        
        /**
         * Sets the "ddbj" element
         */
        void setDdbj(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj ddbj);
        
        /**
         * Appends and returns a new empty "ddbj" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj addNewDdbj();
        
        /**
         * Unsets the "ddbj" element
         */
        void unsetDdbj();
        
        /**
         * Gets the "prf" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf getPrf();
        
        /**
         * True if has "prf" element
         */
        boolean isSetPrf();
        
        /**
         * Sets the "prf" element
         */
        void setPrf(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf prf);
        
        /**
         * Appends and returns a new empty "prf" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf addNewPrf();
        
        /**
         * Unsets the "prf" element
         */
        void unsetPrf();
        
        /**
         * Gets the "pdb" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb getPdb();
        
        /**
         * True if has "pdb" element
         */
        boolean isSetPdb();
        
        /**
         * Sets the "pdb" element
         */
        void setPdb(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb pdb);
        
        /**
         * Appends and returns a new empty "pdb" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb addNewPdb();
        
        /**
         * Unsets the "pdb" element
         */
        void unsetPdb();
        
        /**
         * Gets the "tpg" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg getTpg();
        
        /**
         * True if has "tpg" element
         */
        boolean isSetTpg();
        
        /**
         * Sets the "tpg" element
         */
        void setTpg(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg tpg);
        
        /**
         * Appends and returns a new empty "tpg" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg addNewTpg();
        
        /**
         * Unsets the "tpg" element
         */
        void unsetTpg();
        
        /**
         * Gets the "tpe" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe getTpe();
        
        /**
         * True if has "tpe" element
         */
        boolean isSetTpe();
        
        /**
         * Sets the "tpe" element
         */
        void setTpe(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe tpe);
        
        /**
         * Appends and returns a new empty "tpe" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe addNewTpe();
        
        /**
         * Unsets the "tpe" element
         */
        void unsetTpe();
        
        /**
         * Gets the "tpd" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd getTpd();
        
        /**
         * True if has "tpd" element
         */
        boolean isSetTpd();
        
        /**
         * Sets the "tpd" element
         */
        void setTpd(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd tpd);
        
        /**
         * Appends and returns a new empty "tpd" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd addNewTpd();
        
        /**
         * Unsets the "tpd" element
         */
        void unsetTpd();
        
        /**
         * Gets the "gpipe" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe getGpipe();
        
        /**
         * True if has "gpipe" element
         */
        boolean isSetGpipe();
        
        /**
         * Sets the "gpipe" element
         */
        void setGpipe(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe gpipe);
        
        /**
         * Appends and returns a new empty "gpipe" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe addNewGpipe();
        
        /**
         * Unsets the "gpipe" element
         */
        void unsetGpipe();
        
        /**
         * Gets the "named-annot-track" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack getNamedAnnotTrack();
        
        /**
         * True if has "named-annot-track" element
         */
        boolean isSetNamedAnnotTrack();
        
        /**
         * Sets the "named-annot-track" element
         */
        void setNamedAnnotTrack(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack namedAnnotTrack);
        
        /**
         * Appends and returns a new empty "named-annot-track" element
         */
        gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack addNewNamedAnnotTrack();
        
        /**
         * Unsets the "named-annot-track" element
         */
        void unsetNamedAnnotTrack();
        
        /**
         * An XML local(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Local extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Local.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("local1b99elemtype");
            
            /**
             * Gets the "Object-id" element
             */
            gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId getObjectId();
            
            /**
             * Sets the "Object-id" element
             */
            void setObjectId(gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId objectId);
            
            /**
             * Appends and returns a new empty "Object-id" element
             */
            gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId addNewObjectId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML giim(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Giim extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Giim.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("giim40a4elemtype");
            
            /**
             * Gets the "Giimport-id" element
             */
            gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId getGiimportId();
            
            /**
             * Sets the "Giimport-id" element
             */
            void setGiimportId(gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId giimportId);
            
            /**
             * Appends and returns a new empty "Giimport-id" element
             */
            gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId addNewGiimportId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML genbank(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Genbank extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Genbank.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("genbank9dfaelemtype");
            
            /**
             * Gets the "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId();
            
            /**
             * Sets the "Textseq-id" element
             */
            void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId);
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML embl(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Embl extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Embl.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("emblc910elemtype");
            
            /**
             * Gets the "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId();
            
            /**
             * Sets the "Textseq-id" element
             */
            void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId);
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pir(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pir extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pir.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pir4747elemtype");
            
            /**
             * Gets the "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId();
            
            /**
             * Sets the "Textseq-id" element
             */
            void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId);
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML swissprot(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Swissprot extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Swissprot.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("swissprot7efaelemtype");
            
            /**
             * Gets the "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId();
            
            /**
             * Sets the "Textseq-id" element
             */
            void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId);
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML patent(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Patent extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Patent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("patent0706elemtype");
            
            /**
             * Gets the "Patent-seq-id" element
             */
            gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId getPatentSeqId();
            
            /**
             * Sets the "Patent-seq-id" element
             */
            void setPatentSeqId(gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId patentSeqId);
            
            /**
             * Appends and returns a new empty "Patent-seq-id" element
             */
            gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId addNewPatentSeqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML other(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Other extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Other.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("other227eelemtype");
            
            /**
             * Gets the "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId();
            
            /**
             * Sets the "Textseq-id" element
             */
            void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId);
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML general(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface General extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(General.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("generalb856elemtype");
            
            /**
             * Gets the "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag();
            
            /**
             * Sets the "Dbtag" element
             */
            void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag);
            
            /**
             * Appends and returns a new empty "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ddbj(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ddbj extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ddbj.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ddbj6c66elemtype");
            
            /**
             * Gets the "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId();
            
            /**
             * Sets the "Textseq-id" element
             */
            void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId);
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML prf(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Prf extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Prf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("prf2d12elemtype");
            
            /**
             * Gets the "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId();
            
            /**
             * Sets the "Textseq-id" element
             */
            void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId);
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pdb(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pdb extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pdb.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pdbb9dcelemtype");
            
            /**
             * Gets the "PDB-seq-id" element
             */
            gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId getPDBSeqId();
            
            /**
             * Sets the "PDB-seq-id" element
             */
            void setPDBSeqId(gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId pdbSeqId);
            
            /**
             * Appends and returns a new empty "PDB-seq-id" element
             */
            gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId addNewPDBSeqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML tpg(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Tpg extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Tpg.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("tpg7799elemtype");
            
            /**
             * Gets the "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId();
            
            /**
             * Sets the "Textseq-id" element
             */
            void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId);
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML tpe(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Tpe extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Tpe.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("tpe2b17elemtype");
            
            /**
             * Gets the "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId();
            
            /**
             * Sets the "Textseq-id" element
             */
            void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId);
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML tpd(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Tpd extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Tpd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("tpd04d6elemtype");
            
            /**
             * Gets the "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId();
            
            /**
             * Sets the "Textseq-id" element
             */
            void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId);
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML gpipe(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Gpipe extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Gpipe.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("gpipe3943elemtype");
            
            /**
             * Gets the "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId();
            
            /**
             * Sets the "Textseq-id" element
             */
            void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId);
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML named-annot-track(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface NamedAnnotTrack extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NamedAnnotTrack.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("namedannottrack671eelemtype");
            
            /**
             * Gets the "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId();
            
            /**
             * Sets the "Textseq-id" element
             */
            void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId);
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqIdDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIdDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqIdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
