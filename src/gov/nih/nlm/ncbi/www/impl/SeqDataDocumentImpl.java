/*
 * An XML document type.
 * Localname: Seq-data
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-data(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDataDocument
{
    
    public SeqDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Seq-data(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData
    {
        
        public SeqDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IUPACNA$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "iupacna");
        private static final javax.xml.namespace.QName IUPACAA$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "iupacaa");
        private static final javax.xml.namespace.QName NCBI2NA$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbi2na");
        private static final javax.xml.namespace.QName NCBI4NA$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbi4na");
        private static final javax.xml.namespace.QName NCBI8NA$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbi8na");
        private static final javax.xml.namespace.QName NCBIPNA$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbipna");
        private static final javax.xml.namespace.QName NCBI8AA$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbi8aa");
        private static final javax.xml.namespace.QName NCBIEAA$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbieaa");
        private static final javax.xml.namespace.QName NCBIPAA$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbipaa");
        private static final javax.xml.namespace.QName NCBISTDAA$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbistdaa");
        private static final javax.xml.namespace.QName GAP$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gap");
        
        
        /**
         * Gets the "iupacna" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna getIupacna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna)get_store().find_element_user(IUPACNA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "iupacna" element
         */
        public boolean isSetIupacna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IUPACNA$0) != 0;
            }
        }
        
        /**
         * Sets the "iupacna" element
         */
        public void setIupacna(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna iupacna)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna)get_store().find_element_user(IUPACNA$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna)get_store().add_element_user(IUPACNA$0);
                }
                target.set(iupacna);
            }
        }
        
        /**
         * Appends and returns a new empty "iupacna" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna addNewIupacna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna)get_store().add_element_user(IUPACNA$0);
                return target;
            }
        }
        
        /**
         * Unsets the "iupacna" element
         */
        public void unsetIupacna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IUPACNA$0, 0);
            }
        }
        
        /**
         * Gets the "iupacaa" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa getIupacaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa)get_store().find_element_user(IUPACAA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "iupacaa" element
         */
        public boolean isSetIupacaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IUPACAA$2) != 0;
            }
        }
        
        /**
         * Sets the "iupacaa" element
         */
        public void setIupacaa(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa iupacaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa)get_store().find_element_user(IUPACAA$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa)get_store().add_element_user(IUPACAA$2);
                }
                target.set(iupacaa);
            }
        }
        
        /**
         * Appends and returns a new empty "iupacaa" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa addNewIupacaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa)get_store().add_element_user(IUPACAA$2);
                return target;
            }
        }
        
        /**
         * Unsets the "iupacaa" element
         */
        public void unsetIupacaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IUPACAA$2, 0);
            }
        }
        
        /**
         * Gets the "ncbi2na" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na getNcbi2Na()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na)get_store().find_element_user(NCBI2NA$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ncbi2na" element
         */
        public boolean isSetNcbi2Na()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NCBI2NA$4) != 0;
            }
        }
        
        /**
         * Sets the "ncbi2na" element
         */
        public void setNcbi2Na(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na ncbi2Na)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na)get_store().find_element_user(NCBI2NA$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na)get_store().add_element_user(NCBI2NA$4);
                }
                target.set(ncbi2Na);
            }
        }
        
        /**
         * Appends and returns a new empty "ncbi2na" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na addNewNcbi2Na()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na)get_store().add_element_user(NCBI2NA$4);
                return target;
            }
        }
        
        /**
         * Unsets the "ncbi2na" element
         */
        public void unsetNcbi2Na()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NCBI2NA$4, 0);
            }
        }
        
        /**
         * Gets the "ncbi4na" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na getNcbi4Na()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na)get_store().find_element_user(NCBI4NA$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ncbi4na" element
         */
        public boolean isSetNcbi4Na()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NCBI4NA$6) != 0;
            }
        }
        
        /**
         * Sets the "ncbi4na" element
         */
        public void setNcbi4Na(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na ncbi4Na)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na)get_store().find_element_user(NCBI4NA$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na)get_store().add_element_user(NCBI4NA$6);
                }
                target.set(ncbi4Na);
            }
        }
        
        /**
         * Appends and returns a new empty "ncbi4na" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na addNewNcbi4Na()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na)get_store().add_element_user(NCBI4NA$6);
                return target;
            }
        }
        
        /**
         * Unsets the "ncbi4na" element
         */
        public void unsetNcbi4Na()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NCBI4NA$6, 0);
            }
        }
        
        /**
         * Gets the "ncbi8na" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na getNcbi8Na()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na)get_store().find_element_user(NCBI8NA$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ncbi8na" element
         */
        public boolean isSetNcbi8Na()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NCBI8NA$8) != 0;
            }
        }
        
        /**
         * Sets the "ncbi8na" element
         */
        public void setNcbi8Na(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na ncbi8Na)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na)get_store().find_element_user(NCBI8NA$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na)get_store().add_element_user(NCBI8NA$8);
                }
                target.set(ncbi8Na);
            }
        }
        
        /**
         * Appends and returns a new empty "ncbi8na" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na addNewNcbi8Na()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na)get_store().add_element_user(NCBI8NA$8);
                return target;
            }
        }
        
        /**
         * Unsets the "ncbi8na" element
         */
        public void unsetNcbi8Na()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NCBI8NA$8, 0);
            }
        }
        
        /**
         * Gets the "ncbipna" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna getNcbipna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna)get_store().find_element_user(NCBIPNA$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ncbipna" element
         */
        public boolean isSetNcbipna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NCBIPNA$10) != 0;
            }
        }
        
        /**
         * Sets the "ncbipna" element
         */
        public void setNcbipna(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna ncbipna)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna)get_store().find_element_user(NCBIPNA$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna)get_store().add_element_user(NCBIPNA$10);
                }
                target.set(ncbipna);
            }
        }
        
        /**
         * Appends and returns a new empty "ncbipna" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna addNewNcbipna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna)get_store().add_element_user(NCBIPNA$10);
                return target;
            }
        }
        
        /**
         * Unsets the "ncbipna" element
         */
        public void unsetNcbipna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NCBIPNA$10, 0);
            }
        }
        
        /**
         * Gets the "ncbi8aa" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa getNcbi8Aa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa)get_store().find_element_user(NCBI8AA$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ncbi8aa" element
         */
        public boolean isSetNcbi8Aa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NCBI8AA$12) != 0;
            }
        }
        
        /**
         * Sets the "ncbi8aa" element
         */
        public void setNcbi8Aa(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa ncbi8Aa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa)get_store().find_element_user(NCBI8AA$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa)get_store().add_element_user(NCBI8AA$12);
                }
                target.set(ncbi8Aa);
            }
        }
        
        /**
         * Appends and returns a new empty "ncbi8aa" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa addNewNcbi8Aa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa)get_store().add_element_user(NCBI8AA$12);
                return target;
            }
        }
        
        /**
         * Unsets the "ncbi8aa" element
         */
        public void unsetNcbi8Aa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NCBI8AA$12, 0);
            }
        }
        
        /**
         * Gets the "ncbieaa" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa getNcbieaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa)get_store().find_element_user(NCBIEAA$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ncbieaa" element
         */
        public boolean isSetNcbieaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NCBIEAA$14) != 0;
            }
        }
        
        /**
         * Sets the "ncbieaa" element
         */
        public void setNcbieaa(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa ncbieaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa)get_store().find_element_user(NCBIEAA$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa)get_store().add_element_user(NCBIEAA$14);
                }
                target.set(ncbieaa);
            }
        }
        
        /**
         * Appends and returns a new empty "ncbieaa" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa addNewNcbieaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa)get_store().add_element_user(NCBIEAA$14);
                return target;
            }
        }
        
        /**
         * Unsets the "ncbieaa" element
         */
        public void unsetNcbieaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NCBIEAA$14, 0);
            }
        }
        
        /**
         * Gets the "ncbipaa" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa getNcbipaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa)get_store().find_element_user(NCBIPAA$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ncbipaa" element
         */
        public boolean isSetNcbipaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NCBIPAA$16) != 0;
            }
        }
        
        /**
         * Sets the "ncbipaa" element
         */
        public void setNcbipaa(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa ncbipaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa)get_store().find_element_user(NCBIPAA$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa)get_store().add_element_user(NCBIPAA$16);
                }
                target.set(ncbipaa);
            }
        }
        
        /**
         * Appends and returns a new empty "ncbipaa" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa addNewNcbipaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa)get_store().add_element_user(NCBIPAA$16);
                return target;
            }
        }
        
        /**
         * Unsets the "ncbipaa" element
         */
        public void unsetNcbipaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NCBIPAA$16, 0);
            }
        }
        
        /**
         * Gets the "ncbistdaa" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa getNcbistdaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa)get_store().find_element_user(NCBISTDAA$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ncbistdaa" element
         */
        public boolean isSetNcbistdaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NCBISTDAA$18) != 0;
            }
        }
        
        /**
         * Sets the "ncbistdaa" element
         */
        public void setNcbistdaa(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa ncbistdaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa)get_store().find_element_user(NCBISTDAA$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa)get_store().add_element_user(NCBISTDAA$18);
                }
                target.set(ncbistdaa);
            }
        }
        
        /**
         * Appends and returns a new empty "ncbistdaa" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa addNewNcbistdaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa)get_store().add_element_user(NCBISTDAA$18);
                return target;
            }
        }
        
        /**
         * Unsets the "ncbistdaa" element
         */
        public void unsetNcbistdaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NCBISTDAA$18, 0);
            }
        }
        
        /**
         * Gets the "gap" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap getGap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap)get_store().find_element_user(GAP$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "gap" element
         */
        public boolean isSetGap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GAP$20) != 0;
            }
        }
        
        /**
         * Sets the "gap" element
         */
        public void setGap(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap gap)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap)get_store().find_element_user(GAP$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap)get_store().add_element_user(GAP$20);
                }
                target.set(gap);
            }
        }
        
        /**
         * Appends and returns a new empty "gap" element
         */
        public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap addNewGap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap target = null;
                target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap)get_store().add_element_user(GAP$20);
                return target;
            }
        }
        
        /**
         * Unsets the "gap" element
         */
        public void unsetGap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GAP$20, 0);
            }
        }
        /**
         * An XML iupacna(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IupacnaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna
        {
            
            public IupacnaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName IUPACNA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "IUPACna");
            
            
            /**
             * Gets the "IUPACna" element
             */
            public java.lang.String getIUPACna()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IUPACNA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "IUPACna" element
             */
            public org.apache.xmlbeans.XmlString xgetIUPACna()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IUPACNA$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "IUPACna" element
             */
            public void setIUPACna(java.lang.String iupaCna)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IUPACNA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IUPACNA$0);
                    }
                    target.setStringValue(iupaCna);
                }
            }
            
            /**
             * Sets (as xml) the "IUPACna" element
             */
            public void xsetIUPACna(org.apache.xmlbeans.XmlString iupaCna)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IUPACNA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IUPACNA$0);
                    }
                    target.set(iupaCna);
                }
            }
        }
        /**
         * An XML iupacaa(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IupacaaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa
        {
            
            public IupacaaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName IUPACAA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "IUPACaa");
            
            
            /**
             * Gets the "IUPACaa" element
             */
            public java.lang.String getIUPACaa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IUPACAA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "IUPACaa" element
             */
            public org.apache.xmlbeans.XmlString xgetIUPACaa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IUPACAA$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "IUPACaa" element
             */
            public void setIUPACaa(java.lang.String iupaCaa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IUPACAA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IUPACAA$0);
                    }
                    target.setStringValue(iupaCaa);
                }
            }
            
            /**
             * Sets (as xml) the "IUPACaa" element
             */
            public void xsetIUPACaa(org.apache.xmlbeans.XmlString iupaCaa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IUPACAA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IUPACAA$0);
                    }
                    target.set(iupaCaa);
                }
            }
        }
        /**
         * An XML ncbi2na(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class Ncbi2NaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na
        {
            
            public Ncbi2NaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NCBI2NA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBI2na");
            
            
            /**
             * Gets the "NCBI2na" element
             */
            public byte[] getNCBI2Na()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI2NA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getByteArrayValue();
                }
            }
            
            /**
             * Gets (as xml) the "NCBI2na" element
             */
            public org.apache.xmlbeans.XmlHexBinary xgetNCBI2Na()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI2NA$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NCBI2na" element
             */
            public void setNCBI2Na(byte[] ncbi2Na)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI2NA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBI2NA$0);
                    }
                    target.setByteArrayValue(ncbi2Na);
                }
            }
            
            /**
             * Sets (as xml) the "NCBI2na" element
             */
            public void xsetNCBI2Na(org.apache.xmlbeans.XmlHexBinary ncbi2Na)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI2NA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBI2NA$0);
                    }
                    target.set(ncbi2Na);
                }
            }
        }
        /**
         * An XML ncbi4na(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class Ncbi4NaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na
        {
            
            public Ncbi4NaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NCBI4NA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBI4na");
            
            
            /**
             * Gets the "NCBI4na" element
             */
            public byte[] getNCBI4Na()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI4NA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getByteArrayValue();
                }
            }
            
            /**
             * Gets (as xml) the "NCBI4na" element
             */
            public org.apache.xmlbeans.XmlHexBinary xgetNCBI4Na()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI4NA$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NCBI4na" element
             */
            public void setNCBI4Na(byte[] ncbi4Na)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI4NA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBI4NA$0);
                    }
                    target.setByteArrayValue(ncbi4Na);
                }
            }
            
            /**
             * Sets (as xml) the "NCBI4na" element
             */
            public void xsetNCBI4Na(org.apache.xmlbeans.XmlHexBinary ncbi4Na)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI4NA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBI4NA$0);
                    }
                    target.set(ncbi4Na);
                }
            }
        }
        /**
         * An XML ncbi8na(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class Ncbi8NaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na
        {
            
            public Ncbi8NaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NCBI8NA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBI8na");
            
            
            /**
             * Gets the "NCBI8na" element
             */
            public byte[] getNCBI8Na()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI8NA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getByteArrayValue();
                }
            }
            
            /**
             * Gets (as xml) the "NCBI8na" element
             */
            public org.apache.xmlbeans.XmlHexBinary xgetNCBI8Na()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI8NA$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NCBI8na" element
             */
            public void setNCBI8Na(byte[] ncbi8Na)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI8NA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBI8NA$0);
                    }
                    target.setByteArrayValue(ncbi8Na);
                }
            }
            
            /**
             * Sets (as xml) the "NCBI8na" element
             */
            public void xsetNCBI8Na(org.apache.xmlbeans.XmlHexBinary ncbi8Na)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI8NA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBI8NA$0);
                    }
                    target.set(ncbi8Na);
                }
            }
        }
        /**
         * An XML ncbipna(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NcbipnaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna
        {
            
            public NcbipnaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NCBIPNA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBIpna");
            
            
            /**
             * Gets the "NCBIpna" element
             */
            public byte[] getNCBIpna()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBIPNA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getByteArrayValue();
                }
            }
            
            /**
             * Gets (as xml) the "NCBIpna" element
             */
            public org.apache.xmlbeans.XmlHexBinary xgetNCBIpna()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBIPNA$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NCBIpna" element
             */
            public void setNCBIpna(byte[] ncbIpna)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBIPNA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBIPNA$0);
                    }
                    target.setByteArrayValue(ncbIpna);
                }
            }
            
            /**
             * Sets (as xml) the "NCBIpna" element
             */
            public void xsetNCBIpna(org.apache.xmlbeans.XmlHexBinary ncbIpna)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBIPNA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBIPNA$0);
                    }
                    target.set(ncbIpna);
                }
            }
        }
        /**
         * An XML ncbi8aa(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class Ncbi8AaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa
        {
            
            public Ncbi8AaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NCBI8AA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBI8aa");
            
            
            /**
             * Gets the "NCBI8aa" element
             */
            public byte[] getNCBI8Aa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI8AA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getByteArrayValue();
                }
            }
            
            /**
             * Gets (as xml) the "NCBI8aa" element
             */
            public org.apache.xmlbeans.XmlHexBinary xgetNCBI8Aa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI8AA$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NCBI8aa" element
             */
            public void setNCBI8Aa(byte[] ncbi8Aa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI8AA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBI8AA$0);
                    }
                    target.setByteArrayValue(ncbi8Aa);
                }
            }
            
            /**
             * Sets (as xml) the "NCBI8aa" element
             */
            public void xsetNCBI8Aa(org.apache.xmlbeans.XmlHexBinary ncbi8Aa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI8AA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBI8AA$0);
                    }
                    target.set(ncbi8Aa);
                }
            }
        }
        /**
         * An XML ncbieaa(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NcbieaaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa
        {
            
            public NcbieaaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NCBIEAA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBIeaa");
            
            
            /**
             * Gets the "NCBIeaa" element
             */
            public java.lang.String getNCBIeaa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBIEAA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "NCBIeaa" element
             */
            public org.apache.xmlbeans.XmlString xgetNCBIeaa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NCBIEAA$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NCBIeaa" element
             */
            public void setNCBIeaa(java.lang.String ncbIeaa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBIEAA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBIEAA$0);
                    }
                    target.setStringValue(ncbIeaa);
                }
            }
            
            /**
             * Sets (as xml) the "NCBIeaa" element
             */
            public void xsetNCBIeaa(org.apache.xmlbeans.XmlString ncbIeaa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NCBIEAA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NCBIEAA$0);
                    }
                    target.set(ncbIeaa);
                }
            }
        }
        /**
         * An XML ncbipaa(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NcbipaaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa
        {
            
            public NcbipaaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NCBIPAA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBIpaa");
            
            
            /**
             * Gets the "NCBIpaa" element
             */
            public byte[] getNCBIpaa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBIPAA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getByteArrayValue();
                }
            }
            
            /**
             * Gets (as xml) the "NCBIpaa" element
             */
            public org.apache.xmlbeans.XmlHexBinary xgetNCBIpaa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBIPAA$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NCBIpaa" element
             */
            public void setNCBIpaa(byte[] ncbIpaa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBIPAA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBIPAA$0);
                    }
                    target.setByteArrayValue(ncbIpaa);
                }
            }
            
            /**
             * Sets (as xml) the "NCBIpaa" element
             */
            public void xsetNCBIpaa(org.apache.xmlbeans.XmlHexBinary ncbIpaa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBIPAA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBIPAA$0);
                    }
                    target.set(ncbIpaa);
                }
            }
        }
        /**
         * An XML ncbistdaa(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NcbistdaaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa
        {
            
            public NcbistdaaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NCBISTDAA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBIstdaa");
            
            
            /**
             * Gets the "NCBIstdaa" element
             */
            public byte[] getNCBIstdaa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBISTDAA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getByteArrayValue();
                }
            }
            
            /**
             * Gets (as xml) the "NCBIstdaa" element
             */
            public org.apache.xmlbeans.XmlHexBinary xgetNCBIstdaa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBISTDAA$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "NCBIstdaa" element
             */
            public void setNCBIstdaa(byte[] ncbIstdaa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBISTDAA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBISTDAA$0);
                    }
                    target.setByteArrayValue(ncbIstdaa);
                }
            }
            
            /**
             * Sets (as xml) the "NCBIstdaa" element
             */
            public void xsetNCBIstdaa(org.apache.xmlbeans.XmlHexBinary ncbIstdaa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlHexBinary target = null;
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBISTDAA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBISTDAA$0);
                    }
                    target.set(ncbIstdaa);
                }
            }
        }
        /**
         * An XML gap(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap
        {
            
            public GapImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQGAP$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-gap");
            
            
            /**
             * Gets the "Seq-gap" element
             */
            public gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap getSeqGap()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap)get_store().find_element_user(SEQGAP$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-gap" element
             */
            public void setSeqGap(gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap seqGap)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap)get_store().find_element_user(SEQGAP$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap)get_store().add_element_user(SEQGAP$0);
                    }
                    target.set(seqGap);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-gap" element
             */
            public gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap addNewSeqGap()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap)get_store().add_element_user(SEQGAP$0);
                    return target;
                }
            }
        }
    }
}
