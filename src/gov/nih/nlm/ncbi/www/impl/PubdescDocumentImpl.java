/*
 * An XML document type.
 * Localname: Pubdesc
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PubdescDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Pubdesc(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PubdescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubdescDocument
{
    
    public PubdescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Pubdesc(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PubdescImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc
    {
        
        public PubdescImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PUB$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pub");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName FIG$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "fig");
        private static final javax.xml.namespace.QName NUM$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "num");
        private static final javax.xml.namespace.QName NUMEXC$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "numexc");
        private static final javax.xml.namespace.QName POLYA$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "poly-a");
        private static final javax.xml.namespace.QName MAPLOC$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "maploc");
        private static final javax.xml.namespace.QName SEQRAW$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-raw");
        private static final javax.xml.namespace.QName ALIGNGROUP$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "align-group");
        private static final javax.xml.namespace.QName COMMENT$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "comment");
        private static final javax.xml.namespace.QName REFTYPE$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "reftype");
        
        
        /**
         * Gets the "pub" element
         */
        public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub getPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub)get_store().find_element_user(PUB$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "pub" element
         */
        public void setPub(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub pub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub)get_store().find_element_user(PUB$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub)get_store().add_element_user(PUB$0);
                }
                target.set(pub);
            }
        }
        
        /**
         * Appends and returns a new empty "pub" element
         */
        public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub addNewPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub)get_store().add_element_user(PUB$0);
                return target;
            }
        }
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "name" element
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$2) != 0;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" element
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$2, 0);
            }
        }
        
        /**
         * Gets the "fig" element
         */
        public java.lang.String getFig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIG$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fig" element
         */
        public org.apache.xmlbeans.XmlString xgetFig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIG$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "fig" element
         */
        public boolean isSetFig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIG$4) != 0;
            }
        }
        
        /**
         * Sets the "fig" element
         */
        public void setFig(java.lang.String fig)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIG$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIG$4);
                }
                target.setStringValue(fig);
            }
        }
        
        /**
         * Sets (as xml) the "fig" element
         */
        public void xsetFig(org.apache.xmlbeans.XmlString fig)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIG$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIG$4);
                }
                target.set(fig);
            }
        }
        
        /**
         * Unsets the "fig" element
         */
        public void unsetFig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIG$4, 0);
            }
        }
        
        /**
         * Gets the "num" element
         */
        public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num getNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num)get_store().find_element_user(NUM$6, 0);
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
                return get_store().count_elements(NUM$6) != 0;
            }
        }
        
        /**
         * Sets the "num" element
         */
        public void setNum(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num num)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num)get_store().find_element_user(NUM$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num)get_store().add_element_user(NUM$6);
                }
                target.set(num);
            }
        }
        
        /**
         * Appends and returns a new empty "num" element
         */
        public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num addNewNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num)get_store().add_element_user(NUM$6);
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
                get_store().remove_element(NUM$6, 0);
            }
        }
        
        /**
         * Gets the "numexc" element
         */
        public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc getNumexc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc)get_store().find_element_user(NUMEXC$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "numexc" element
         */
        public boolean isSetNumexc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMEXC$8) != 0;
            }
        }
        
        /**
         * Sets the "numexc" element
         */
        public void setNumexc(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc numexc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc)get_store().find_element_user(NUMEXC$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc)get_store().add_element_user(NUMEXC$8);
                }
                target.set(numexc);
            }
        }
        
        /**
         * Appends and returns a new empty "numexc" element
         */
        public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc addNewNumexc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc)get_store().add_element_user(NUMEXC$8);
                return target;
            }
        }
        
        /**
         * Unsets the "numexc" element
         */
        public void unsetNumexc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMEXC$8, 0);
            }
        }
        
        /**
         * Gets the "poly-a" element
         */
        public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA getPolyA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA)get_store().find_element_user(POLYA$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "poly-a" element
         */
        public boolean isSetPolyA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POLYA$10) != 0;
            }
        }
        
        /**
         * Sets the "poly-a" element
         */
        public void setPolyA(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA polyA)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA)get_store().find_element_user(POLYA$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA)get_store().add_element_user(POLYA$10);
                }
                target.set(polyA);
            }
        }
        
        /**
         * Appends and returns a new empty "poly-a" element
         */
        public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA addNewPolyA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA)get_store().add_element_user(POLYA$10);
                return target;
            }
        }
        
        /**
         * Unsets the "poly-a" element
         */
        public void unsetPolyA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POLYA$10, 0);
            }
        }
        
        /**
         * Gets the "maploc" element
         */
        public java.lang.String getMaploc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPLOC$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "maploc" element
         */
        public org.apache.xmlbeans.XmlString xgetMaploc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPLOC$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "maploc" element
         */
        public boolean isSetMaploc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAPLOC$12) != 0;
            }
        }
        
        /**
         * Sets the "maploc" element
         */
        public void setMaploc(java.lang.String maploc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPLOC$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAPLOC$12);
                }
                target.setStringValue(maploc);
            }
        }
        
        /**
         * Sets (as xml) the "maploc" element
         */
        public void xsetMaploc(org.apache.xmlbeans.XmlString maploc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPLOC$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAPLOC$12);
                }
                target.set(maploc);
            }
        }
        
        /**
         * Unsets the "maploc" element
         */
        public void unsetMaploc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAPLOC$12, 0);
            }
        }
        
        /**
         * Gets the "seq-raw" element
         */
        public java.lang.String getSeqRaw()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQRAW$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "seq-raw" element
         */
        public org.apache.xmlbeans.XmlString xgetSeqRaw()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEQRAW$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "seq-raw" element
         */
        public boolean isSetSeqRaw()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQRAW$14) != 0;
            }
        }
        
        /**
         * Sets the "seq-raw" element
         */
        public void setSeqRaw(java.lang.String seqRaw)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQRAW$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQRAW$14);
                }
                target.setStringValue(seqRaw);
            }
        }
        
        /**
         * Sets (as xml) the "seq-raw" element
         */
        public void xsetSeqRaw(org.apache.xmlbeans.XmlString seqRaw)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEQRAW$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEQRAW$14);
                }
                target.set(seqRaw);
            }
        }
        
        /**
         * Unsets the "seq-raw" element
         */
        public void unsetSeqRaw()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQRAW$14, 0);
            }
        }
        
        /**
         * Gets the "align-group" element
         */
        public java.math.BigInteger getAlignGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIGNGROUP$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "align-group" element
         */
        public org.apache.xmlbeans.XmlInteger xgetAlignGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ALIGNGROUP$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "align-group" element
         */
        public boolean isSetAlignGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALIGNGROUP$16) != 0;
            }
        }
        
        /**
         * Sets the "align-group" element
         */
        public void setAlignGroup(java.math.BigInteger alignGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIGNGROUP$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALIGNGROUP$16);
                }
                target.setBigIntegerValue(alignGroup);
            }
        }
        
        /**
         * Sets (as xml) the "align-group" element
         */
        public void xsetAlignGroup(org.apache.xmlbeans.XmlInteger alignGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ALIGNGROUP$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ALIGNGROUP$16);
                }
                target.set(alignGroup);
            }
        }
        
        /**
         * Unsets the "align-group" element
         */
        public void unsetAlignGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALIGNGROUP$16, 0);
            }
        }
        
        /**
         * Gets the "comment" element
         */
        public java.lang.String getComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "comment" element
         */
        public org.apache.xmlbeans.XmlString xgetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$18, 0);
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
        public void setComment(java.lang.String comment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENT$18);
                }
                target.setStringValue(comment);
            }
        }
        
        /**
         * Sets (as xml) the "comment" element
         */
        public void xsetComment(org.apache.xmlbeans.XmlString comment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENT$18);
                }
                target.set(comment);
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
         * Gets the "reftype" element
         */
        public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype getReftype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype)get_store().find_element_user(REFTYPE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "reftype" element
         */
        public boolean isSetReftype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REFTYPE$20) != 0;
            }
        }
        
        /**
         * Sets the "reftype" element
         */
        public void setReftype(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype reftype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype)get_store().find_element_user(REFTYPE$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype)get_store().add_element_user(REFTYPE$20);
                }
                target.set(reftype);
            }
        }
        
        /**
         * Appends and returns a new empty "reftype" element
         */
        public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype addNewReftype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype target = null;
                target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype)get_store().add_element_user(REFTYPE$20);
                return target;
            }
        }
        
        /**
         * Unsets the "reftype" element
         */
        public void unsetReftype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REFTYPE$20, 0);
            }
        }
        /**
         * An XML pub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PubImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Pub
        {
            
            public PubImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBEQUIV$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Pub-equiv");
            
            
            /**
             * Gets the "Pub-equiv" element
             */
            public gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv getPubEquiv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv target = null;
                    target = (gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv)get_store().find_element_user(PUBEQUIV$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Pub-equiv" element
             */
            public void setPubEquiv(gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv pubEquiv)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv target = null;
                    target = (gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv)get_store().find_element_user(PUBEQUIV$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv)get_store().add_element_user(PUBEQUIV$0);
                    }
                    target.set(pubEquiv);
                }
            }
            
            /**
             * Appends and returns a new empty "Pub-equiv" element
             */
            public gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv addNewPubEquiv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv target = null;
                    target = (gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv)get_store().add_element_user(PUBEQUIV$0);
                    return target;
                }
            }
        }
        /**
         * An XML num(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NumImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Num
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
         * An XML numexc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NumexcImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc
        {
            
            public NumexcImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PubdescDocument$Pubdesc$Numexc$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Numexc.Value
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
         * An XML poly-a(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PolyAImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA
        {
            
            public PolyAImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PubdescDocument$Pubdesc$PolyA$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.PolyA.Value
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
         * An XML reftype(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PubdescDocument$Pubdesc$Reftype.
         */
        public static class ReftypeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype
        {
            
            public ReftypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected ReftypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PubdescDocument$Pubdesc$Reftype$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc.Reftype.Value
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
    }
}
