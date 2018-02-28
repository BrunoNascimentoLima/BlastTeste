/*
 * An XML document type.
 * Localname: Code-break
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CodeBreakDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Code-break(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CodeBreakDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CodeBreakDocument
{
    
    public CodeBreakDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODEBREAK$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Code-break");
    
    
    /**
     * Gets the "Code-break" element
     */
    public gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak getCodeBreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak target = null;
            target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak)get_store().find_element_user(CODEBREAK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Code-break" element
     */
    public void setCodeBreak(gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak codeBreak)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak target = null;
            target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak)get_store().find_element_user(CODEBREAK$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak)get_store().add_element_user(CODEBREAK$0);
            }
            target.set(codeBreak);
        }
    }
    
    /**
     * Appends and returns a new empty "Code-break" element
     */
    public gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak addNewCodeBreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak target = null;
            target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak)get_store().add_element_user(CODEBREAK$0);
            return target;
        }
    }
    /**
     * An XML Code-break(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CodeBreakImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak
    {
        
        public CodeBreakImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOC$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "loc");
        private static final javax.xml.namespace.QName AA$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "aa");
        
        
        /**
         * Gets the "loc" element
         */
        public gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc getLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc)get_store().find_element_user(LOC$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "loc" element
         */
        public void setLoc(gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc loc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc)get_store().find_element_user(LOC$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc)get_store().add_element_user(LOC$0);
                }
                target.set(loc);
            }
        }
        
        /**
         * Appends and returns a new empty "loc" element
         */
        public gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc addNewLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc)get_store().add_element_user(LOC$0);
                return target;
            }
        }
        
        /**
         * Gets the "aa" element
         */
        public gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa getAa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa target = null;
                target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa)get_store().find_element_user(AA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "aa" element
         */
        public void setAa(gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa aa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa target = null;
                target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa)get_store().find_element_user(AA$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa)get_store().add_element_user(AA$2);
                }
                target.set(aa);
            }
        }
        
        /**
         * Appends and returns a new empty "aa" element
         */
        public gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa addNewAa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa target = null;
                target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa)get_store().add_element_user(AA$2);
                return target;
            }
        }
        /**
         * An XML loc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LocImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Loc
        {
            
            public LocImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML aa(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak.Aa
        {
            
            public AaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NCBIEAA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbieaa");
            private static final javax.xml.namespace.QName NCBI8AA$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbi8aa");
            private static final javax.xml.namespace.QName NCBISTDAA$4 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbistdaa");
            
            
            /**
             * Gets the "ncbieaa" element
             */
            public java.math.BigInteger getNcbieaa()
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
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "ncbieaa" element
             */
            public org.apache.xmlbeans.XmlInteger xgetNcbieaa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NCBIEAA$0, 0);
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
                    return get_store().count_elements(NCBIEAA$0) != 0;
                }
            }
            
            /**
             * Sets the "ncbieaa" element
             */
            public void setNcbieaa(java.math.BigInteger ncbieaa)
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
                    target.setBigIntegerValue(ncbieaa);
                }
            }
            
            /**
             * Sets (as xml) the "ncbieaa" element
             */
            public void xsetNcbieaa(org.apache.xmlbeans.XmlInteger ncbieaa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NCBIEAA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NCBIEAA$0);
                    }
                    target.set(ncbieaa);
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
                    get_store().remove_element(NCBIEAA$0, 0);
                }
            }
            
            /**
             * Gets the "ncbi8aa" element
             */
            public java.math.BigInteger getNcbi8Aa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI8AA$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "ncbi8aa" element
             */
            public org.apache.xmlbeans.XmlInteger xgetNcbi8Aa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NCBI8AA$2, 0);
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
                    return get_store().count_elements(NCBI8AA$2) != 0;
                }
            }
            
            /**
             * Sets the "ncbi8aa" element
             */
            public void setNcbi8Aa(java.math.BigInteger ncbi8Aa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI8AA$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBI8AA$2);
                    }
                    target.setBigIntegerValue(ncbi8Aa);
                }
            }
            
            /**
             * Sets (as xml) the "ncbi8aa" element
             */
            public void xsetNcbi8Aa(org.apache.xmlbeans.XmlInteger ncbi8Aa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NCBI8AA$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NCBI8AA$2);
                    }
                    target.set(ncbi8Aa);
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
                    get_store().remove_element(NCBI8AA$2, 0);
                }
            }
            
            /**
             * Gets the "ncbistdaa" element
             */
            public java.math.BigInteger getNcbistdaa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBISTDAA$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "ncbistdaa" element
             */
            public org.apache.xmlbeans.XmlInteger xgetNcbistdaa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NCBISTDAA$4, 0);
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
                    return get_store().count_elements(NCBISTDAA$4) != 0;
                }
            }
            
            /**
             * Sets the "ncbistdaa" element
             */
            public void setNcbistdaa(java.math.BigInteger ncbistdaa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBISTDAA$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBISTDAA$4);
                    }
                    target.setBigIntegerValue(ncbistdaa);
                }
            }
            
            /**
             * Sets (as xml) the "ncbistdaa" element
             */
            public void xsetNcbistdaa(org.apache.xmlbeans.XmlInteger ncbistdaa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NCBISTDAA$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NCBISTDAA$4);
                    }
                    target.set(ncbistdaa);
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
                    get_store().remove_element(NCBISTDAA$4, 0);
                }
            }
        }
    }
}
