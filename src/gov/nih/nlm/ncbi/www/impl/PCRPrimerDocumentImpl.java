/*
 * An XML document type.
 * Localname: PCRPrimer
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PCRPrimerDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PCRPrimer(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PCRPrimerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PCRPrimerDocument
{
    
    public PCRPrimerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PCRPRIMER$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PCRPrimer");
    
    
    /**
     * Gets the "PCRPrimer" element
     */
    public gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer getPCRPrimer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer target = null;
            target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer)get_store().find_element_user(PCRPRIMER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PCRPrimer" element
     */
    public void setPCRPrimer(gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer pcrPrimer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer target = null;
            target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer)get_store().find_element_user(PCRPRIMER$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer)get_store().add_element_user(PCRPRIMER$0);
            }
            target.set(pcrPrimer);
        }
    }
    
    /**
     * Appends and returns a new empty "PCRPrimer" element
     */
    public gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer addNewPCRPrimer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer target = null;
            target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer)get_store().add_element_user(PCRPRIMER$0);
            return target;
        }
    }
    /**
     * An XML PCRPrimer(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PCRPrimerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer
    {
        
        public PCRPrimerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEQ$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        
        
        /**
         * Gets the "seq" element
         */
        public gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq getSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq)get_store().find_element_user(SEQ$0, 0);
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
                return get_store().count_elements(SEQ$0) != 0;
            }
        }
        
        /**
         * Sets the "seq" element
         */
        public void setSeq(gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq seq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq)get_store().find_element_user(SEQ$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq)get_store().add_element_user(SEQ$0);
                }
                target.set(seq);
            }
        }
        
        /**
         * Appends and returns a new empty "seq" element
         */
        public gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq addNewSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq)get_store().add_element_user(SEQ$0);
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
                get_store().remove_element(SEQ$0, 0);
            }
        }
        
        /**
         * Gets the "name" element
         */
        public gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name target = null;
                target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    return null;
                }
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
        public void setName(gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name target = null;
                target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name)get_store().add_element_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Appends and returns a new empty "name" element
         */
        public gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name target = null;
                target = (gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name)get_store().add_element_user(NAME$2);
                return target;
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
         * An XML seq(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Seq
        {
            
            public SeqImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PCRPRIMERSEQ$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PCRPrimerSeq");
            
            
            /**
             * Gets the "PCRPrimerSeq" element
             */
            public java.lang.String getPCRPrimerSeq()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCRPRIMERSEQ$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "PCRPrimerSeq" element
             */
            public org.apache.xmlbeans.XmlString xgetPCRPrimerSeq()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PCRPRIMERSEQ$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "PCRPrimerSeq" element
             */
            public void setPCRPrimerSeq(java.lang.String pcrPrimerSeq)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCRPRIMERSEQ$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PCRPRIMERSEQ$0);
                    }
                    target.setStringValue(pcrPrimerSeq);
                }
            }
            
            /**
             * Sets (as xml) the "PCRPrimerSeq" element
             */
            public void xsetPCRPrimerSeq(org.apache.xmlbeans.XmlString pcrPrimerSeq)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PCRPRIMERSEQ$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PCRPRIMERSEQ$0);
                    }
                    target.set(pcrPrimerSeq);
                }
            }
        }
        /**
         * An XML name(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PCRPrimerDocument.PCRPrimer.Name
        {
            
            public NameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PCRPRIMERNAME$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PCRPrimerName");
            
            
            /**
             * Gets the "PCRPrimerName" element
             */
            public java.lang.String getPCRPrimerName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCRPRIMERNAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "PCRPrimerName" element
             */
            public org.apache.xmlbeans.XmlString xgetPCRPrimerName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PCRPRIMERNAME$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "PCRPrimerName" element
             */
            public void setPCRPrimerName(java.lang.String pcrPrimerName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCRPRIMERNAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PCRPRIMERNAME$0);
                    }
                    target.setStringValue(pcrPrimerName);
                }
            }
            
            /**
             * Sets (as xml) the "PCRPrimerName" element
             */
            public void xsetPCRPrimerName(org.apache.xmlbeans.XmlString pcrPrimerName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PCRPRIMERNAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PCRPRIMERNAME$0);
                    }
                    target.set(pcrPrimerName);
                }
            }
        }
    }
}
