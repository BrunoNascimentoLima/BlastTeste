/*
 * An XML document type.
 * Localname: Spliced-exon
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SplicedExonDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Spliced-exon(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SplicedExonDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SplicedExonDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("splicedexon44f5doctype");
    
    /**
     * Gets the "Spliced-exon" element
     */
    gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon getSplicedExon();
    
    /**
     * Sets the "Spliced-exon" element
     */
    void setSplicedExon(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon splicedExon);
    
    /**
     * Appends and returns a new empty "Spliced-exon" element
     */
    gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon addNewSplicedExon();
    
    /**
     * An XML Spliced-exon(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SplicedExon extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SplicedExon.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("splicedexon1342elemtype");
        
        /**
         * Gets the "product-start" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart getProductStart();
        
        /**
         * Sets the "product-start" element
         */
        void setProductStart(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart productStart);
        
        /**
         * Appends and returns a new empty "product-start" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart addNewProductStart();
        
        /**
         * Gets the "product-end" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd getProductEnd();
        
        /**
         * Sets the "product-end" element
         */
        void setProductEnd(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd productEnd);
        
        /**
         * Appends and returns a new empty "product-end" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd addNewProductEnd();
        
        /**
         * Gets the "genomic-start" element
         */
        java.math.BigInteger getGenomicStart();
        
        /**
         * Gets (as xml) the "genomic-start" element
         */
        org.apache.xmlbeans.XmlInteger xgetGenomicStart();
        
        /**
         * Sets the "genomic-start" element
         */
        void setGenomicStart(java.math.BigInteger genomicStart);
        
        /**
         * Sets (as xml) the "genomic-start" element
         */
        void xsetGenomicStart(org.apache.xmlbeans.XmlInteger genomicStart);
        
        /**
         * Gets the "genomic-end" element
         */
        java.math.BigInteger getGenomicEnd();
        
        /**
         * Gets (as xml) the "genomic-end" element
         */
        org.apache.xmlbeans.XmlInteger xgetGenomicEnd();
        
        /**
         * Sets the "genomic-end" element
         */
        void setGenomicEnd(java.math.BigInteger genomicEnd);
        
        /**
         * Sets (as xml) the "genomic-end" element
         */
        void xsetGenomicEnd(org.apache.xmlbeans.XmlInteger genomicEnd);
        
        /**
         * Gets the "product-id" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId getProductId();
        
        /**
         * True if has "product-id" element
         */
        boolean isSetProductId();
        
        /**
         * Sets the "product-id" element
         */
        void setProductId(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId productId);
        
        /**
         * Appends and returns a new empty "product-id" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId addNewProductId();
        
        /**
         * Unsets the "product-id" element
         */
        void unsetProductId();
        
        /**
         * Gets the "genomic-id" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId getGenomicId();
        
        /**
         * True if has "genomic-id" element
         */
        boolean isSetGenomicId();
        
        /**
         * Sets the "genomic-id" element
         */
        void setGenomicId(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId genomicId);
        
        /**
         * Appends and returns a new empty "genomic-id" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId addNewGenomicId();
        
        /**
         * Unsets the "genomic-id" element
         */
        void unsetGenomicId();
        
        /**
         * Gets the "product-strand" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand getProductStrand();
        
        /**
         * True if has "product-strand" element
         */
        boolean isSetProductStrand();
        
        /**
         * Sets the "product-strand" element
         */
        void setProductStrand(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand productStrand);
        
        /**
         * Appends and returns a new empty "product-strand" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand addNewProductStrand();
        
        /**
         * Unsets the "product-strand" element
         */
        void unsetProductStrand();
        
        /**
         * Gets the "genomic-strand" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand getGenomicStrand();
        
        /**
         * True if has "genomic-strand" element
         */
        boolean isSetGenomicStrand();
        
        /**
         * Sets the "genomic-strand" element
         */
        void setGenomicStrand(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand genomicStrand);
        
        /**
         * Appends and returns a new empty "genomic-strand" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand addNewGenomicStrand();
        
        /**
         * Unsets the "genomic-strand" element
         */
        void unsetGenomicStrand();
        
        /**
         * Gets the "parts" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts getParts();
        
        /**
         * True if has "parts" element
         */
        boolean isSetParts();
        
        /**
         * Sets the "parts" element
         */
        void setParts(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts parts);
        
        /**
         * Appends and returns a new empty "parts" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts addNewParts();
        
        /**
         * Unsets the "parts" element
         */
        void unsetParts();
        
        /**
         * Gets the "scores" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores getScores();
        
        /**
         * True if has "scores" element
         */
        boolean isSetScores();
        
        /**
         * Sets the "scores" element
         */
        void setScores(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores scores);
        
        /**
         * Appends and returns a new empty "scores" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores addNewScores();
        
        /**
         * Unsets the "scores" element
         */
        void unsetScores();
        
        /**
         * Gets the "acceptor-before-exon" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon getAcceptorBeforeExon();
        
        /**
         * True if has "acceptor-before-exon" element
         */
        boolean isSetAcceptorBeforeExon();
        
        /**
         * Sets the "acceptor-before-exon" element
         */
        void setAcceptorBeforeExon(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon acceptorBeforeExon);
        
        /**
         * Appends and returns a new empty "acceptor-before-exon" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon addNewAcceptorBeforeExon();
        
        /**
         * Unsets the "acceptor-before-exon" element
         */
        void unsetAcceptorBeforeExon();
        
        /**
         * Gets the "donor-after-exon" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon getDonorAfterExon();
        
        /**
         * True if has "donor-after-exon" element
         */
        boolean isSetDonorAfterExon();
        
        /**
         * Sets the "donor-after-exon" element
         */
        void setDonorAfterExon(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon donorAfterExon);
        
        /**
         * Appends and returns a new empty "donor-after-exon" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon addNewDonorAfterExon();
        
        /**
         * Unsets the "donor-after-exon" element
         */
        void unsetDonorAfterExon();
        
        /**
         * Gets the "partial" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial getPartial();
        
        /**
         * True if has "partial" element
         */
        boolean isSetPartial();
        
        /**
         * Sets the "partial" element
         */
        void setPartial(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial partial);
        
        /**
         * Appends and returns a new empty "partial" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial addNewPartial();
        
        /**
         * Unsets the "partial" element
         */
        void unsetPartial();
        
        /**
         * Gets the "ext" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext getExt();
        
        /**
         * True if has "ext" element
         */
        boolean isSetExt();
        
        /**
         * Sets the "ext" element
         */
        void setExt(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext ext);
        
        /**
         * Appends and returns a new empty "ext" element
         */
        gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext addNewExt();
        
        /**
         * Unsets the "ext" element
         */
        void unsetExt();
        
        /**
         * An XML product-start(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ProductStart extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductStart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("productstart4bb2elemtype");
            
            /**
             * Gets the "Product-pos" element
             */
            gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos getProductPos();
            
            /**
             * Sets the "Product-pos" element
             */
            void setProductPos(gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos productPos);
            
            /**
             * Appends and returns a new empty "Product-pos" element
             */
            gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos addNewProductPos();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML product-end(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ProductEnd extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductEnd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("productend316belemtype");
            
            /**
             * Gets the "Product-pos" element
             */
            gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos getProductPos();
            
            /**
             * Sets the "Product-pos" element
             */
            void setProductPos(gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos productPos);
            
            /**
             * Appends and returns a new empty "Product-pos" element
             */
            gov.nih.nlm.ncbi.www.ProductPosDocument.ProductPos addNewProductPos();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductEnd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML product-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ProductId extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("productid0857elemtype");
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML genomic-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GenomicId extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GenomicId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("genomicid111eelemtype");
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML product-strand(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface ProductStrand extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductStrand.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("productstrande682elemtype");
            
            /**
             * Gets the "Na-strand" element
             */
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand getNaStrand();
            
            /**
             * Sets the "Na-strand" element
             */
            void setNaStrand(gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand naStrand);
            
            /**
             * Appends and returns a new empty "Na-strand" element
             */
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand addNewNaStrand();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.ProductStrand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML genomic-strand(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface GenomicStrand extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GenomicStrand.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("genomicstrand33c9elemtype");
            
            /**
             * Gets the "Na-strand" element
             */
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand getNaStrand();
            
            /**
             * Sets the "Na-strand" element
             */
            void setNaStrand(gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand naStrand);
            
            /**
             * Appends and returns a new empty "Na-strand" element
             */
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand addNewNaStrand();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.GenomicStrand) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML parts(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Parts extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("parts4d8eelemtype");
            
            /**
             * Gets array of all "Spliced-exon-chunk" elements
             */
            gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk[] getSplicedExonChunkArray();
            
            /**
             * Gets ith "Spliced-exon-chunk" element
             */
            gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk getSplicedExonChunkArray(int i);
            
            /**
             * Returns number of "Spliced-exon-chunk" element
             */
            int sizeOfSplicedExonChunkArray();
            
            /**
             * Sets array of all "Spliced-exon-chunk" element
             */
            void setSplicedExonChunkArray(gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk[] splicedExonChunkArray);
            
            /**
             * Sets ith "Spliced-exon-chunk" element
             */
            void setSplicedExonChunkArray(int i, gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk splicedExonChunk);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Spliced-exon-chunk" element
             */
            gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk insertNewSplicedExonChunk(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Spliced-exon-chunk" element
             */
            gov.nih.nlm.ncbi.www.SplicedExonChunkDocument.SplicedExonChunk addNewSplicedExonChunk();
            
            /**
             * Removes the ith "Spliced-exon-chunk" element
             */
            void removeSplicedExonChunk(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Parts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML scores(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Scores extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Scores.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("scores87bfelemtype");
            
            /**
             * Gets the "Score-set" element
             */
            gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet getScoreSet();
            
            /**
             * Sets the "Score-set" element
             */
            void setScoreSet(gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet scoreSet);
            
            /**
             * Appends and returns a new empty "Score-set" element
             */
            gov.nih.nlm.ncbi.www.ScoreSetDocument.ScoreSet addNewScoreSet();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Scores) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML acceptor-before-exon(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface AcceptorBeforeExon extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AcceptorBeforeExon.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("acceptorbeforeexon48dcelemtype");
            
            /**
             * Gets the "Splice-site" element
             */
            gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite getSpliceSite();
            
            /**
             * Sets the "Splice-site" element
             */
            void setSpliceSite(gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite spliceSite);
            
            /**
             * Appends and returns a new empty "Splice-site" element
             */
            gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite addNewSpliceSite();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.AcceptorBeforeExon) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML donor-after-exon(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface DonorAfterExon extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DonorAfterExon.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("donorafterexon3948elemtype");
            
            /**
             * Gets the "Splice-site" element
             */
            gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite getSpliceSite();
            
            /**
             * Sets the "Splice-site" element
             */
            void setSpliceSite(gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite spliceSite);
            
            /**
             * Appends and returns a new empty "Splice-site" element
             */
            gov.nih.nlm.ncbi.www.SpliceSiteDocument.SpliceSite addNewSpliceSite();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.DonorAfterExon) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML partial(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Partial extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Partial.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("partialc6efelemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SplicedExonDocument$SplicedExon$Partial$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuea548attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.SplicedExonDocument$SplicedExon$Partial$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_TRUE
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
                    
                    static final int INT_TRUE = 1;
                    static final int INT_FALSE = 2;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("true", INT_TRUE),
                        new Enum("false", INT_FALSE),
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
                    public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Partial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ext(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ext extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("extf38felemtype");
            
            /**
             * Gets array of all "User-object" elements
             */
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] getUserObjectArray();
            
            /**
             * Gets ith "User-object" element
             */
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObjectArray(int i);
            
            /**
             * Returns number of "User-object" element
             */
            int sizeOfUserObjectArray();
            
            /**
             * Sets array of all "User-object" element
             */
            void setUserObjectArray(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject[] userObjectArray);
            
            /**
             * Sets ith "User-object" element
             */
            void setUserObjectArray(int i, gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "User-object" element
             */
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject insertNewUserObject(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "User-object" element
             */
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject addNewUserObject();
            
            /**
             * Removes the ith "User-object" element
             */
            void removeUserObject(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext newInstance() {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon.Ext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon newInstance() {
              return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SplicedExonDocument.SplicedExon) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SplicedExonDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SplicedExonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
