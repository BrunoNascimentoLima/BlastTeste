/*
 * An XML document type.
 * Localname: Seq-id
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-id(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument
{
    
    public SeqIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-id");
    
    
    /**
     * Gets the "Seq-id" element
     */
    public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
            target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-id" element
     */
    public void setSeqId(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
            target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
            }
            target.set(seqId);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-id" element
     */
    public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
            target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
            return target;
        }
    }
    /**
     * An XML Seq-id(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId
    {
        
        public SeqIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCAL$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "local");
        private static final javax.xml.namespace.QName GIBBSQ$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gibbsq");
        private static final javax.xml.namespace.QName GIBBMT$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gibbmt");
        private static final javax.xml.namespace.QName GIIM$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "giim");
        private static final javax.xml.namespace.QName GENBANK$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "genbank");
        private static final javax.xml.namespace.QName EMBL$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "embl");
        private static final javax.xml.namespace.QName PIR$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pir");
        private static final javax.xml.namespace.QName SWISSPROT$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "swissprot");
        private static final javax.xml.namespace.QName PATENT$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "patent");
        private static final javax.xml.namespace.QName OTHER$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "other");
        private static final javax.xml.namespace.QName GENERAL$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "general");
        private static final javax.xml.namespace.QName GI$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gi");
        private static final javax.xml.namespace.QName DDBJ$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ddbj");
        private static final javax.xml.namespace.QName PRF$26 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "prf");
        private static final javax.xml.namespace.QName PDB$28 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pdb");
        private static final javax.xml.namespace.QName TPG$30 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "tpg");
        private static final javax.xml.namespace.QName TPE$32 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "tpe");
        private static final javax.xml.namespace.QName TPD$34 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "tpd");
        private static final javax.xml.namespace.QName GPIPE$36 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gpipe");
        private static final javax.xml.namespace.QName NAMEDANNOTTRACK$38 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "named-annot-track");
        
        
        /**
         * Gets the "local" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local getLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local)get_store().find_element_user(LOCAL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "local" element
         */
        public boolean isSetLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCAL$0) != 0;
            }
        }
        
        /**
         * Sets the "local" element
         */
        public void setLocal(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local local)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local)get_store().find_element_user(LOCAL$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local)get_store().add_element_user(LOCAL$0);
                }
                target.set(local);
            }
        }
        
        /**
         * Appends and returns a new empty "local" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local addNewLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local)get_store().add_element_user(LOCAL$0);
                return target;
            }
        }
        
        /**
         * Unsets the "local" element
         */
        public void unsetLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCAL$0, 0);
            }
        }
        
        /**
         * Gets the "gibbsq" element
         */
        public java.math.BigInteger getGibbsq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIBBSQ$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "gibbsq" element
         */
        public org.apache.xmlbeans.XmlInteger xgetGibbsq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GIBBSQ$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "gibbsq" element
         */
        public boolean isSetGibbsq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GIBBSQ$2) != 0;
            }
        }
        
        /**
         * Sets the "gibbsq" element
         */
        public void setGibbsq(java.math.BigInteger gibbsq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIBBSQ$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GIBBSQ$2);
                }
                target.setBigIntegerValue(gibbsq);
            }
        }
        
        /**
         * Sets (as xml) the "gibbsq" element
         */
        public void xsetGibbsq(org.apache.xmlbeans.XmlInteger gibbsq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GIBBSQ$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GIBBSQ$2);
                }
                target.set(gibbsq);
            }
        }
        
        /**
         * Unsets the "gibbsq" element
         */
        public void unsetGibbsq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GIBBSQ$2, 0);
            }
        }
        
        /**
         * Gets the "gibbmt" element
         */
        public java.math.BigInteger getGibbmt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIBBMT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "gibbmt" element
         */
        public org.apache.xmlbeans.XmlInteger xgetGibbmt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GIBBMT$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "gibbmt" element
         */
        public boolean isSetGibbmt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GIBBMT$4) != 0;
            }
        }
        
        /**
         * Sets the "gibbmt" element
         */
        public void setGibbmt(java.math.BigInteger gibbmt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIBBMT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GIBBMT$4);
                }
                target.setBigIntegerValue(gibbmt);
            }
        }
        
        /**
         * Sets (as xml) the "gibbmt" element
         */
        public void xsetGibbmt(org.apache.xmlbeans.XmlInteger gibbmt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GIBBMT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GIBBMT$4);
                }
                target.set(gibbmt);
            }
        }
        
        /**
         * Unsets the "gibbmt" element
         */
        public void unsetGibbmt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GIBBMT$4, 0);
            }
        }
        
        /**
         * Gets the "giim" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim getGiim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim)get_store().find_element_user(GIIM$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "giim" element
         */
        public boolean isSetGiim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GIIM$6) != 0;
            }
        }
        
        /**
         * Sets the "giim" element
         */
        public void setGiim(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim giim)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim)get_store().find_element_user(GIIM$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim)get_store().add_element_user(GIIM$6);
                }
                target.set(giim);
            }
        }
        
        /**
         * Appends and returns a new empty "giim" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim addNewGiim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim)get_store().add_element_user(GIIM$6);
                return target;
            }
        }
        
        /**
         * Unsets the "giim" element
         */
        public void unsetGiim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GIIM$6, 0);
            }
        }
        
        /**
         * Gets the "genbank" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank getGenbank()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank)get_store().find_element_user(GENBANK$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "genbank" element
         */
        public boolean isSetGenbank()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENBANK$8) != 0;
            }
        }
        
        /**
         * Sets the "genbank" element
         */
        public void setGenbank(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank genbank)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank)get_store().find_element_user(GENBANK$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank)get_store().add_element_user(GENBANK$8);
                }
                target.set(genbank);
            }
        }
        
        /**
         * Appends and returns a new empty "genbank" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank addNewGenbank()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank)get_store().add_element_user(GENBANK$8);
                return target;
            }
        }
        
        /**
         * Unsets the "genbank" element
         */
        public void unsetGenbank()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENBANK$8, 0);
            }
        }
        
        /**
         * Gets the "embl" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl getEmbl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl)get_store().find_element_user(EMBL$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "embl" element
         */
        public boolean isSetEmbl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMBL$10) != 0;
            }
        }
        
        /**
         * Sets the "embl" element
         */
        public void setEmbl(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl embl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl)get_store().find_element_user(EMBL$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl)get_store().add_element_user(EMBL$10);
                }
                target.set(embl);
            }
        }
        
        /**
         * Appends and returns a new empty "embl" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl addNewEmbl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl)get_store().add_element_user(EMBL$10);
                return target;
            }
        }
        
        /**
         * Unsets the "embl" element
         */
        public void unsetEmbl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMBL$10, 0);
            }
        }
        
        /**
         * Gets the "pir" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir getPir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir)get_store().find_element_user(PIR$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pir" element
         */
        public boolean isSetPir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PIR$12) != 0;
            }
        }
        
        /**
         * Sets the "pir" element
         */
        public void setPir(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir pir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir)get_store().find_element_user(PIR$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir)get_store().add_element_user(PIR$12);
                }
                target.set(pir);
            }
        }
        
        /**
         * Appends and returns a new empty "pir" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir addNewPir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir)get_store().add_element_user(PIR$12);
                return target;
            }
        }
        
        /**
         * Unsets the "pir" element
         */
        public void unsetPir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PIR$12, 0);
            }
        }
        
        /**
         * Gets the "swissprot" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot getSwissprot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot)get_store().find_element_user(SWISSPROT$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "swissprot" element
         */
        public boolean isSetSwissprot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SWISSPROT$14) != 0;
            }
        }
        
        /**
         * Sets the "swissprot" element
         */
        public void setSwissprot(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot swissprot)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot)get_store().find_element_user(SWISSPROT$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot)get_store().add_element_user(SWISSPROT$14);
                }
                target.set(swissprot);
            }
        }
        
        /**
         * Appends and returns a new empty "swissprot" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot addNewSwissprot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot)get_store().add_element_user(SWISSPROT$14);
                return target;
            }
        }
        
        /**
         * Unsets the "swissprot" element
         */
        public void unsetSwissprot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SWISSPROT$14, 0);
            }
        }
        
        /**
         * Gets the "patent" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent getPatent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent)get_store().find_element_user(PATENT$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "patent" element
         */
        public boolean isSetPatent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PATENT$16) != 0;
            }
        }
        
        /**
         * Sets the "patent" element
         */
        public void setPatent(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent patent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent)get_store().find_element_user(PATENT$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent)get_store().add_element_user(PATENT$16);
                }
                target.set(patent);
            }
        }
        
        /**
         * Appends and returns a new empty "patent" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent addNewPatent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent)get_store().add_element_user(PATENT$16);
                return target;
            }
        }
        
        /**
         * Unsets the "patent" element
         */
        public void unsetPatent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PATENT$16, 0);
            }
        }
        
        /**
         * Gets the "other" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other getOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other)get_store().find_element_user(OTHER$18, 0);
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
                return get_store().count_elements(OTHER$18) != 0;
            }
        }
        
        /**
         * Sets the "other" element
         */
        public void setOther(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other other)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other)get_store().find_element_user(OTHER$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other)get_store().add_element_user(OTHER$18);
                }
                target.set(other);
            }
        }
        
        /**
         * Appends and returns a new empty "other" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other addNewOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other)get_store().add_element_user(OTHER$18);
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
                get_store().remove_element(OTHER$18, 0);
            }
        }
        
        /**
         * Gets the "general" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General getGeneral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General)get_store().find_element_user(GENERAL$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "general" element
         */
        public boolean isSetGeneral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENERAL$20) != 0;
            }
        }
        
        /**
         * Sets the "general" element
         */
        public void setGeneral(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General general)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General)get_store().find_element_user(GENERAL$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General)get_store().add_element_user(GENERAL$20);
                }
                target.set(general);
            }
        }
        
        /**
         * Appends and returns a new empty "general" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General addNewGeneral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General)get_store().add_element_user(GENERAL$20);
                return target;
            }
        }
        
        /**
         * Unsets the "general" element
         */
        public void unsetGeneral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENERAL$20, 0);
            }
        }
        
        /**
         * Gets the "gi" element
         */
        public java.math.BigInteger getGi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GI$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "gi" element
         */
        public org.apache.xmlbeans.XmlInteger xgetGi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GI$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "gi" element
         */
        public boolean isSetGi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GI$22) != 0;
            }
        }
        
        /**
         * Sets the "gi" element
         */
        public void setGi(java.math.BigInteger gi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GI$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GI$22);
                }
                target.setBigIntegerValue(gi);
            }
        }
        
        /**
         * Sets (as xml) the "gi" element
         */
        public void xsetGi(org.apache.xmlbeans.XmlInteger gi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GI$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GI$22);
                }
                target.set(gi);
            }
        }
        
        /**
         * Unsets the "gi" element
         */
        public void unsetGi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GI$22, 0);
            }
        }
        
        /**
         * Gets the "ddbj" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj getDdbj()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj)get_store().find_element_user(DDBJ$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ddbj" element
         */
        public boolean isSetDdbj()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DDBJ$24) != 0;
            }
        }
        
        /**
         * Sets the "ddbj" element
         */
        public void setDdbj(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj ddbj)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj)get_store().find_element_user(DDBJ$24, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj)get_store().add_element_user(DDBJ$24);
                }
                target.set(ddbj);
            }
        }
        
        /**
         * Appends and returns a new empty "ddbj" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj addNewDdbj()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj)get_store().add_element_user(DDBJ$24);
                return target;
            }
        }
        
        /**
         * Unsets the "ddbj" element
         */
        public void unsetDdbj()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DDBJ$24, 0);
            }
        }
        
        /**
         * Gets the "prf" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf getPrf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf)get_store().find_element_user(PRF$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "prf" element
         */
        public boolean isSetPrf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRF$26) != 0;
            }
        }
        
        /**
         * Sets the "prf" element
         */
        public void setPrf(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf prf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf)get_store().find_element_user(PRF$26, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf)get_store().add_element_user(PRF$26);
                }
                target.set(prf);
            }
        }
        
        /**
         * Appends and returns a new empty "prf" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf addNewPrf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf)get_store().add_element_user(PRF$26);
                return target;
            }
        }
        
        /**
         * Unsets the "prf" element
         */
        public void unsetPrf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRF$26, 0);
            }
        }
        
        /**
         * Gets the "pdb" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb getPdb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb)get_store().find_element_user(PDB$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pdb" element
         */
        public boolean isSetPdb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PDB$28) != 0;
            }
        }
        
        /**
         * Sets the "pdb" element
         */
        public void setPdb(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb pdb)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb)get_store().find_element_user(PDB$28, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb)get_store().add_element_user(PDB$28);
                }
                target.set(pdb);
            }
        }
        
        /**
         * Appends and returns a new empty "pdb" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb addNewPdb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb)get_store().add_element_user(PDB$28);
                return target;
            }
        }
        
        /**
         * Unsets the "pdb" element
         */
        public void unsetPdb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PDB$28, 0);
            }
        }
        
        /**
         * Gets the "tpg" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg getTpg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg)get_store().find_element_user(TPG$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "tpg" element
         */
        public boolean isSetTpg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TPG$30) != 0;
            }
        }
        
        /**
         * Sets the "tpg" element
         */
        public void setTpg(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg tpg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg)get_store().find_element_user(TPG$30, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg)get_store().add_element_user(TPG$30);
                }
                target.set(tpg);
            }
        }
        
        /**
         * Appends and returns a new empty "tpg" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg addNewTpg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg)get_store().add_element_user(TPG$30);
                return target;
            }
        }
        
        /**
         * Unsets the "tpg" element
         */
        public void unsetTpg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TPG$30, 0);
            }
        }
        
        /**
         * Gets the "tpe" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe getTpe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe)get_store().find_element_user(TPE$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "tpe" element
         */
        public boolean isSetTpe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TPE$32) != 0;
            }
        }
        
        /**
         * Sets the "tpe" element
         */
        public void setTpe(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe tpe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe)get_store().find_element_user(TPE$32, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe)get_store().add_element_user(TPE$32);
                }
                target.set(tpe);
            }
        }
        
        /**
         * Appends and returns a new empty "tpe" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe addNewTpe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe)get_store().add_element_user(TPE$32);
                return target;
            }
        }
        
        /**
         * Unsets the "tpe" element
         */
        public void unsetTpe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TPE$32, 0);
            }
        }
        
        /**
         * Gets the "tpd" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd getTpd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd)get_store().find_element_user(TPD$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "tpd" element
         */
        public boolean isSetTpd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TPD$34) != 0;
            }
        }
        
        /**
         * Sets the "tpd" element
         */
        public void setTpd(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd tpd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd)get_store().find_element_user(TPD$34, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd)get_store().add_element_user(TPD$34);
                }
                target.set(tpd);
            }
        }
        
        /**
         * Appends and returns a new empty "tpd" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd addNewTpd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd)get_store().add_element_user(TPD$34);
                return target;
            }
        }
        
        /**
         * Unsets the "tpd" element
         */
        public void unsetTpd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TPD$34, 0);
            }
        }
        
        /**
         * Gets the "gpipe" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe getGpipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe)get_store().find_element_user(GPIPE$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "gpipe" element
         */
        public boolean isSetGpipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GPIPE$36) != 0;
            }
        }
        
        /**
         * Sets the "gpipe" element
         */
        public void setGpipe(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe gpipe)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe)get_store().find_element_user(GPIPE$36, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe)get_store().add_element_user(GPIPE$36);
                }
                target.set(gpipe);
            }
        }
        
        /**
         * Appends and returns a new empty "gpipe" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe addNewGpipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe)get_store().add_element_user(GPIPE$36);
                return target;
            }
        }
        
        /**
         * Unsets the "gpipe" element
         */
        public void unsetGpipe()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GPIPE$36, 0);
            }
        }
        
        /**
         * Gets the "named-annot-track" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack getNamedAnnotTrack()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack)get_store().find_element_user(NAMEDANNOTTRACK$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "named-annot-track" element
         */
        public boolean isSetNamedAnnotTrack()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAMEDANNOTTRACK$38) != 0;
            }
        }
        
        /**
         * Sets the "named-annot-track" element
         */
        public void setNamedAnnotTrack(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack namedAnnotTrack)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack)get_store().find_element_user(NAMEDANNOTTRACK$38, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack)get_store().add_element_user(NAMEDANNOTTRACK$38);
                }
                target.set(namedAnnotTrack);
            }
        }
        
        /**
         * Appends and returns a new empty "named-annot-track" element
         */
        public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack addNewNamedAnnotTrack()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack target = null;
                target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack)get_store().add_element_user(NAMEDANNOTTRACK$38);
                return target;
            }
        }
        
        /**
         * Unsets the "named-annot-track" element
         */
        public void unsetNamedAnnotTrack()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAMEDANNOTTRACK$38, 0);
            }
        }
        /**
         * An XML local(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LocalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Local
        {
            
            public LocalImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName OBJECTID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Object-id");
            
            
            /**
             * Gets the "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId getObjectId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().find_element_user(OBJECTID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Object-id" element
             */
            public void setObjectId(gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId objectId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().find_element_user(OBJECTID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().add_element_user(OBJECTID$0);
                    }
                    target.set(objectId);
                }
            }
            
            /**
             * Appends and returns a new empty "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId addNewObjectId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().add_element_user(OBJECTID$0);
                    return target;
                }
            }
        }
        /**
         * An XML giim(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GiimImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Giim
        {
            
            public GiimImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GIIMPORTID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Giimport-id");
            
            
            /**
             * Gets the "Giimport-id" element
             */
            public gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId getGiimportId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId target = null;
                    target = (gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId)get_store().find_element_user(GIIMPORTID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Giimport-id" element
             */
            public void setGiimportId(gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId giimportId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId target = null;
                    target = (gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId)get_store().find_element_user(GIIMPORTID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId)get_store().add_element_user(GIIMPORTID$0);
                    }
                    target.set(giimportId);
                }
            }
            
            /**
             * Appends and returns a new empty "Giimport-id" element
             */
            public gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId addNewGiimportId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId target = null;
                    target = (gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId)get_store().add_element_user(GIIMPORTID$0);
                    return target;
                }
            }
        }
        /**
         * An XML genbank(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GenbankImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Genbank
        {
            
            public GenbankImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TEXTSEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Textseq-id");
            
            
            /**
             * Gets the "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Textseq-id" element
             */
            public void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    }
                    target.set(textseqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML embl(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class EmblImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Embl
        {
            
            public EmblImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TEXTSEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Textseq-id");
            
            
            /**
             * Gets the "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Textseq-id" element
             */
            public void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    }
                    target.set(textseqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML pir(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PirImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pir
        {
            
            public PirImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TEXTSEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Textseq-id");
            
            
            /**
             * Gets the "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Textseq-id" element
             */
            public void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    }
                    target.set(textseqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML swissprot(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SwissprotImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Swissprot
        {
            
            public SwissprotImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TEXTSEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Textseq-id");
            
            
            /**
             * Gets the "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Textseq-id" element
             */
            public void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    }
                    target.set(textseqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML patent(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PatentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Patent
        {
            
            public PatentImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PATENTSEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Patent-seq-id");
            
            
            /**
             * Gets the "Patent-seq-id" element
             */
            public gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId getPatentSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId)get_store().find_element_user(PATENTSEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Patent-seq-id" element
             */
            public void setPatentSeqId(gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId patentSeqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId)get_store().find_element_user(PATENTSEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId)get_store().add_element_user(PATENTSEQID$0);
                    }
                    target.set(patentSeqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Patent-seq-id" element
             */
            public gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId addNewPatentSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.PatentSeqIdDocument.PatentSeqId)get_store().add_element_user(PATENTSEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML other(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class OtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Other
        {
            
            public OtherImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TEXTSEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Textseq-id");
            
            
            /**
             * Gets the "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Textseq-id" element
             */
            public void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    }
                    target.set(textseqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML general(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GeneralImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.General
        {
            
            public GeneralImpl(org.apache.xmlbeans.SchemaType sType)
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
        /**
         * An XML ddbj(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DdbjImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Ddbj
        {
            
            public DdbjImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TEXTSEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Textseq-id");
            
            
            /**
             * Gets the "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Textseq-id" element
             */
            public void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    }
                    target.set(textseqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML prf(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PrfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Prf
        {
            
            public PrfImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TEXTSEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Textseq-id");
            
            
            /**
             * Gets the "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Textseq-id" element
             */
            public void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    }
                    target.set(textseqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML pdb(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PdbImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Pdb
        {
            
            public PdbImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PDBSEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PDB-seq-id");
            
            
            /**
             * Gets the "PDB-seq-id" element
             */
            public gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId getPDBSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId)get_store().find_element_user(PDBSEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PDB-seq-id" element
             */
            public void setPDBSeqId(gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId pdbSeqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId)get_store().find_element_user(PDBSEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId)get_store().add_element_user(PDBSEQID$0);
                    }
                    target.set(pdbSeqId);
                }
            }
            
            /**
             * Appends and returns a new empty "PDB-seq-id" element
             */
            public gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId addNewPDBSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId)get_store().add_element_user(PDBSEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML tpg(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TpgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpg
        {
            
            public TpgImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TEXTSEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Textseq-id");
            
            
            /**
             * Gets the "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Textseq-id" element
             */
            public void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    }
                    target.set(textseqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML tpe(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TpeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpe
        {
            
            public TpeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TEXTSEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Textseq-id");
            
            
            /**
             * Gets the "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Textseq-id" element
             */
            public void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    }
                    target.set(textseqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML tpd(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TpdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Tpd
        {
            
            public TpdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TEXTSEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Textseq-id");
            
            
            /**
             * Gets the "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Textseq-id" element
             */
            public void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    }
                    target.set(textseqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML gpipe(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GpipeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.Gpipe
        {
            
            public GpipeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TEXTSEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Textseq-id");
            
            
            /**
             * Gets the "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Textseq-id" element
             */
            public void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    }
                    target.set(textseqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML named-annot-track(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NamedAnnotTrackImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId.NamedAnnotTrack
        {
            
            public NamedAnnotTrackImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TEXTSEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Textseq-id");
            
            
            /**
             * Gets the "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Textseq-id" element
             */
            public void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    }
                    target.set(textseqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Textseq-id" element
             */
            public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
                    return target;
                }
            }
        }
    }
}
