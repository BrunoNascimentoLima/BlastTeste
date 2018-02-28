/*
 * An XML document type.
 * Localname: PDB-seq-id
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PDBSeqIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PDB-seq-id(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PDBSeqIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PDBSeqIdDocument
{
    
    public PDBSeqIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML PDB-seq-id(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PDBSeqIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId
    {
        
        public PDBSeqIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MOL$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mol");
        private static final javax.xml.namespace.QName CHAIN$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "chain");
        private static final javax.xml.namespace.QName REL$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "rel");
        
        
        /**
         * Gets the "mol" element
         */
        public gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Mol getMol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Mol target = null;
                target = (gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Mol)get_store().find_element_user(MOL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "mol" element
         */
        public void setMol(gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Mol mol)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Mol target = null;
                target = (gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Mol)get_store().find_element_user(MOL$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Mol)get_store().add_element_user(MOL$0);
                }
                target.set(mol);
            }
        }
        
        /**
         * Appends and returns a new empty "mol" element
         */
        public gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Mol addNewMol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Mol target = null;
                target = (gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Mol)get_store().add_element_user(MOL$0);
                return target;
            }
        }
        
        /**
         * Gets the "chain" element
         */
        public java.math.BigInteger getChain()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHAIN$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "chain" element
         */
        public org.apache.xmlbeans.XmlInteger xgetChain()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CHAIN$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "chain" element
         */
        public void setChain(java.math.BigInteger chain)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHAIN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHAIN$2);
                }
                target.setBigIntegerValue(chain);
            }
        }
        
        /**
         * Sets (as xml) the "chain" element
         */
        public void xsetChain(org.apache.xmlbeans.XmlInteger chain)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CHAIN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CHAIN$2);
                }
                target.set(chain);
            }
        }
        
        /**
         * Gets the "rel" element
         */
        public gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Rel getRel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Rel target = null;
                target = (gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Rel)get_store().find_element_user(REL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "rel" element
         */
        public boolean isSetRel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REL$4) != 0;
            }
        }
        
        /**
         * Sets the "rel" element
         */
        public void setRel(gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Rel rel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Rel target = null;
                target = (gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Rel)get_store().find_element_user(REL$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Rel)get_store().add_element_user(REL$4);
                }
                target.set(rel);
            }
        }
        
        /**
         * Appends and returns a new empty "rel" element
         */
        public gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Rel addNewRel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Rel target = null;
                target = (gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Rel)get_store().add_element_user(REL$4);
                return target;
            }
        }
        
        /**
         * Unsets the "rel" element
         */
        public void unsetRel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REL$4, 0);
            }
        }
        /**
         * An XML mol(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MolImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Mol
        {
            
            public MolImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PDBMOLID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PDB-mol-id");
            
            
            /**
             * Gets the "PDB-mol-id" element
             */
            public java.lang.String getPDBMolId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PDBMOLID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "PDB-mol-id" element
             */
            public org.apache.xmlbeans.XmlString xgetPDBMolId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PDBMOLID$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "PDB-mol-id" element
             */
            public void setPDBMolId(java.lang.String pdbMolId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PDBMOLID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PDBMOLID$0);
                    }
                    target.setStringValue(pdbMolId);
                }
            }
            
            /**
             * Sets (as xml) the "PDB-mol-id" element
             */
            public void xsetPDBMolId(org.apache.xmlbeans.XmlString pdbMolId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PDBMOLID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PDBMOLID$0);
                    }
                    target.set(pdbMolId);
                }
            }
        }
        /**
         * An XML rel(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PDBSeqIdDocument.PDBSeqId.Rel
        {
            
            public RelImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Date");
            
            
            /**
             * Gets the "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date getDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Date" element
             */
            public void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    }
                    target.set(date);
                }
            }
            
            /**
             * Appends and returns a new empty "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    return target;
                }
            }
        }
    }
}
