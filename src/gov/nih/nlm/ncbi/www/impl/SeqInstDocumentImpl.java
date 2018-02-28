/*
 * An XML document type.
 * Localname: Seq-inst
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqInstDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-inst(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqInstDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqInstDocument
{
    
    public SeqInstDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQINST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-inst");
    
    
    /**
     * Gets the "Seq-inst" element
     */
    public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst getSeqInst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst target = null;
            target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst)get_store().find_element_user(SEQINST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-inst" element
     */
    public void setSeqInst(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst seqInst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst target = null;
            target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst)get_store().find_element_user(SEQINST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst)get_store().add_element_user(SEQINST$0);
            }
            target.set(seqInst);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-inst" element
     */
    public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst addNewSeqInst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst target = null;
            target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst)get_store().add_element_user(SEQINST$0);
            return target;
        }
    }
    /**
     * An XML Seq-inst(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqInstImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst
    {
        
        public SeqInstImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPR$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "repr");
        private static final javax.xml.namespace.QName MOL$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mol");
        private static final javax.xml.namespace.QName LENGTH$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "length");
        private static final javax.xml.namespace.QName FUZZ$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "fuzz");
        private static final javax.xml.namespace.QName TOPOLOGY$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "topology");
        private static final javax.xml.namespace.QName STRAND$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "strand");
        private static final javax.xml.namespace.QName SEQDATA$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-data");
        private static final javax.xml.namespace.QName EXT$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ext");
        private static final javax.xml.namespace.QName HIST$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "hist");
        
        
        /**
         * Gets the "repr" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr getRepr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr)get_store().find_element_user(REPR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "repr" element
         */
        public void setRepr(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr repr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr)get_store().find_element_user(REPR$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr)get_store().add_element_user(REPR$0);
                }
                target.set(repr);
            }
        }
        
        /**
         * Appends and returns a new empty "repr" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr addNewRepr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr)get_store().add_element_user(REPR$0);
                return target;
            }
        }
        
        /**
         * Gets the "mol" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol getMol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol)get_store().find_element_user(MOL$2, 0);
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
        public void setMol(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol mol)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol)get_store().find_element_user(MOL$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol)get_store().add_element_user(MOL$2);
                }
                target.set(mol);
            }
        }
        
        /**
         * Appends and returns a new empty "mol" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol addNewMol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol)get_store().add_element_user(MOL$2);
                return target;
            }
        }
        
        /**
         * Gets the "length" element
         */
        public java.math.BigInteger getLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTH$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "length" element
         */
        public org.apache.xmlbeans.XmlInteger xgetLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LENGTH$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "length" element
         */
        public boolean isSetLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LENGTH$4) != 0;
            }
        }
        
        /**
         * Sets the "length" element
         */
        public void setLength(java.math.BigInteger length)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTH$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LENGTH$4);
                }
                target.setBigIntegerValue(length);
            }
        }
        
        /**
         * Sets (as xml) the "length" element
         */
        public void xsetLength(org.apache.xmlbeans.XmlInteger length)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LENGTH$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(LENGTH$4);
                }
                target.set(length);
            }
        }
        
        /**
         * Unsets the "length" element
         */
        public void unsetLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LENGTH$4, 0);
            }
        }
        
        /**
         * Gets the "fuzz" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz getFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz)get_store().find_element_user(FUZZ$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fuzz" element
         */
        public boolean isSetFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FUZZ$6) != 0;
            }
        }
        
        /**
         * Sets the "fuzz" element
         */
        public void setFuzz(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz fuzz)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz)get_store().find_element_user(FUZZ$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz)get_store().add_element_user(FUZZ$6);
                }
                target.set(fuzz);
            }
        }
        
        /**
         * Appends and returns a new empty "fuzz" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz addNewFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz)get_store().add_element_user(FUZZ$6);
                return target;
            }
        }
        
        /**
         * Unsets the "fuzz" element
         */
        public void unsetFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FUZZ$6, 0);
            }
        }
        
        /**
         * Gets the "topology" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology getTopology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology)get_store().find_element_user(TOPOLOGY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "topology" element
         */
        public boolean isSetTopology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TOPOLOGY$8) != 0;
            }
        }
        
        /**
         * Sets the "topology" element
         */
        public void setTopology(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology topology)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology)get_store().find_element_user(TOPOLOGY$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology)get_store().add_element_user(TOPOLOGY$8);
                }
                target.set(topology);
            }
        }
        
        /**
         * Appends and returns a new empty "topology" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology addNewTopology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology)get_store().add_element_user(TOPOLOGY$8);
                return target;
            }
        }
        
        /**
         * Unsets the "topology" element
         */
        public void unsetTopology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TOPOLOGY$8, 0);
            }
        }
        
        /**
         * Gets the "strand" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand getStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand)get_store().find_element_user(STRAND$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "strand" element
         */
        public boolean isSetStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRAND$10) != 0;
            }
        }
        
        /**
         * Sets the "strand" element
         */
        public void setStrand(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand strand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand)get_store().find_element_user(STRAND$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand)get_store().add_element_user(STRAND$10);
                }
                target.set(strand);
            }
        }
        
        /**
         * Appends and returns a new empty "strand" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand addNewStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand)get_store().add_element_user(STRAND$10);
                return target;
            }
        }
        
        /**
         * Unsets the "strand" element
         */
        public void unsetStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRAND$10, 0);
            }
        }
        
        /**
         * Gets the "seq-data" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData getSeqData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData)get_store().find_element_user(SEQDATA$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seq-data" element
         */
        public boolean isSetSeqData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQDATA$12) != 0;
            }
        }
        
        /**
         * Sets the "seq-data" element
         */
        public void setSeqData(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData seqData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData)get_store().find_element_user(SEQDATA$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData)get_store().add_element_user(SEQDATA$12);
                }
                target.set(seqData);
            }
        }
        
        /**
         * Appends and returns a new empty "seq-data" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData addNewSeqData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData)get_store().add_element_user(SEQDATA$12);
                return target;
            }
        }
        
        /**
         * Unsets the "seq-data" element
         */
        public void unsetSeqData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQDATA$12, 0);
            }
        }
        
        /**
         * Gets the "ext" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext getExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext)get_store().find_element_user(EXT$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ext" element
         */
        public boolean isSetExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXT$14) != 0;
            }
        }
        
        /**
         * Sets the "ext" element
         */
        public void setExt(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext ext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext)get_store().find_element_user(EXT$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext)get_store().add_element_user(EXT$14);
                }
                target.set(ext);
            }
        }
        
        /**
         * Appends and returns a new empty "ext" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext addNewExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext)get_store().add_element_user(EXT$14);
                return target;
            }
        }
        
        /**
         * Unsets the "ext" element
         */
        public void unsetExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXT$14, 0);
            }
        }
        
        /**
         * Gets the "hist" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist getHist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist)get_store().find_element_user(HIST$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "hist" element
         */
        public boolean isSetHist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HIST$16) != 0;
            }
        }
        
        /**
         * Sets the "hist" element
         */
        public void setHist(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist hist)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist)get_store().find_element_user(HIST$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist)get_store().add_element_user(HIST$16);
                }
                target.set(hist);
            }
        }
        
        /**
         * Appends and returns a new empty "hist" element
         */
        public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist addNewHist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist target = null;
                target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist)get_store().add_element_user(HIST$16);
                return target;
            }
        }
        
        /**
         * Unsets the "hist" element
         */
        public void unsetHist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HIST$16, 0);
            }
        }
        /**
         * An XML repr(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ReprImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr
        {
            
            public ReprImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqInstDocument$SeqInst$Repr$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Repr.Value
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
         * An XML mol(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MolImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol
        {
            
            public MolImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqInstDocument$SeqInst$Mol$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Mol.Value
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
         * An XML fuzz(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FuzzImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Fuzz
        {
            
            public FuzzImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INTFUZZ$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Int-fuzz");
            
            
            /**
             * Gets the "Int-fuzz" element
             */
            public gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz getIntFuzz()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz target = null;
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().find_element_user(INTFUZZ$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Int-fuzz" element
             */
            public void setIntFuzz(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz intFuzz)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz target = null;
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().find_element_user(INTFUZZ$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().add_element_user(INTFUZZ$0);
                    }
                    target.set(intFuzz);
                }
            }
            
            /**
             * Appends and returns a new empty "Int-fuzz" element
             */
            public gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz addNewIntFuzz()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz target = null;
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().add_element_user(INTFUZZ$0);
                    return target;
                }
            }
        }
        /**
         * An XML topology(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TopologyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology
        {
            
            public TopologyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VALUE$0);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value)get_default_attribute_value(VALUE$0);
                    }
                    return target;
                }
            }
            
            /**
             * True if has "value" attribute
             */
            public boolean isSetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALUE$0) != null;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            
            /**
             * Unsets the "value" attribute
             */
            public void unsetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALUE$0);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqInstDocument$SeqInst$Topology$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Topology.Value
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
         * An XML strand(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class StrandImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand
        {
            
            public StrandImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqInstDocument$SeqInst$Strand$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Strand.Value
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
         * An XML seq-data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.SeqData
        {
            
            public SeqDataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQDATA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-data");
            
            
            /**
             * Gets the "Seq-data" element
             */
            public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData getSeqData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData)get_store().find_element_user(SEQDATA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-data" element
             */
            public void setSeqData(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData seqData)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData)get_store().find_element_user(SEQDATA$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData)get_store().add_element_user(SEQDATA$0);
                    }
                    target.set(seqData);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-data" element
             */
            public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData addNewSeqData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData)get_store().add_element_user(SEQDATA$0);
                    return target;
                }
            }
        }
        /**
         * An XML ext(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Ext
        {
            
            public ExtImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQEXT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-ext");
            
            
            /**
             * Gets the "Seq-ext" element
             */
            public gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt getSeqExt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt)get_store().find_element_user(SEQEXT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-ext" element
             */
            public void setSeqExt(gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt seqExt)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt)get_store().find_element_user(SEQEXT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt)get_store().add_element_user(SEQEXT$0);
                    }
                    target.set(seqExt);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-ext" element
             */
            public gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt addNewSeqExt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt)get_store().add_element_user(SEQEXT$0);
                    return target;
                }
            }
        }
        /**
         * An XML hist(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class HistImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqInstDocument.SeqInst.Hist
        {
            
            public HistImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQHIST$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-hist");
            
            
            /**
             * Gets the "Seq-hist" element
             */
            public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist getSeqHist()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist)get_store().find_element_user(SEQHIST$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-hist" element
             */
            public void setSeqHist(gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist seqHist)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist)get_store().find_element_user(SEQHIST$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist)get_store().add_element_user(SEQHIST$0);
                    }
                    target.set(seqHist);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-hist" element
             */
            public gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist addNewSeqHist()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqHistDocument.SeqHist)get_store().add_element_user(SEQHIST$0);
                    return target;
                }
            }
        }
    }
}
