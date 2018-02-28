/*
 * An XML document type.
 * Localname: Seq-literal
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqLiteralDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-literal(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqLiteralDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLiteralDocument
{
    
    public SeqLiteralDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQLITERAL$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-literal");
    
    
    /**
     * Gets the "Seq-literal" element
     */
    public gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral getSeqLiteral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral target = null;
            target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral)get_store().find_element_user(SEQLITERAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-literal" element
     */
    public void setSeqLiteral(gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral seqLiteral)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral target = null;
            target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral)get_store().find_element_user(SEQLITERAL$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral)get_store().add_element_user(SEQLITERAL$0);
            }
            target.set(seqLiteral);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-literal" element
     */
    public gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral addNewSeqLiteral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral target = null;
            target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral)get_store().add_element_user(SEQLITERAL$0);
            return target;
        }
    }
    /**
     * An XML Seq-literal(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqLiteralImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral
    {
        
        public SeqLiteralImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LENGTH$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "length");
        private static final javax.xml.namespace.QName FUZZ$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "fuzz");
        private static final javax.xml.namespace.QName SEQDATA$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-data");
        
        
        /**
         * Gets the "length" element
         */
        public java.math.BigInteger getLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTH$0, 0);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LENGTH$0, 0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENGTH$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LENGTH$0);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LENGTH$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(LENGTH$0);
                }
                target.set(length);
            }
        }
        
        /**
         * Gets the "fuzz" element
         */
        public gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz getFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz)get_store().find_element_user(FUZZ$2, 0);
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
                return get_store().count_elements(FUZZ$2) != 0;
            }
        }
        
        /**
         * Sets the "fuzz" element
         */
        public void setFuzz(gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz fuzz)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz)get_store().find_element_user(FUZZ$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz)get_store().add_element_user(FUZZ$2);
                }
                target.set(fuzz);
            }
        }
        
        /**
         * Appends and returns a new empty "fuzz" element
         */
        public gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz addNewFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz)get_store().add_element_user(FUZZ$2);
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
                get_store().remove_element(FUZZ$2, 0);
            }
        }
        
        /**
         * Gets the "seq-data" element
         */
        public gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData getSeqData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData)get_store().find_element_user(SEQDATA$4, 0);
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
                return get_store().count_elements(SEQDATA$4) != 0;
            }
        }
        
        /**
         * Sets the "seq-data" element
         */
        public void setSeqData(gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData seqData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData)get_store().find_element_user(SEQDATA$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData)get_store().add_element_user(SEQDATA$4);
                }
                target.set(seqData);
            }
        }
        
        /**
         * Appends and returns a new empty "seq-data" element
         */
        public gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData addNewSeqData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData)get_store().add_element_user(SEQDATA$4);
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
                get_store().remove_element(SEQDATA$4, 0);
            }
        }
        /**
         * An XML fuzz(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FuzzImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.Fuzz
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
         * An XML seq-data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral.SeqData
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
    }
}
