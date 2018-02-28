/*
 * An XML document type.
 * Localname: Trna-ext
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.TrnaExtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Trna-ext(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class TrnaExtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TrnaExtDocument
{
    
    public TrnaExtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRNAEXT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Trna-ext");
    
    
    /**
     * Gets the "Trna-ext" element
     */
    public gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt getTrnaExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt target = null;
            target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt)get_store().find_element_user(TRNAEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Trna-ext" element
     */
    public void setTrnaExt(gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt trnaExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt target = null;
            target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt)get_store().find_element_user(TRNAEXT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt)get_store().add_element_user(TRNAEXT$0);
            }
            target.set(trnaExt);
        }
    }
    
    /**
     * Appends and returns a new empty "Trna-ext" element
     */
    public gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt addNewTrnaExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt target = null;
            target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt)get_store().add_element_user(TRNAEXT$0);
            return target;
        }
    }
    /**
     * An XML Trna-ext(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class TrnaExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt
    {
        
        public TrnaExtImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AA$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "aa");
        private static final javax.xml.namespace.QName CODON$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "codon");
        private static final javax.xml.namespace.QName ANTICODON$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "anticodon");
        
        
        /**
         * Gets the "aa" element
         */
        public gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa getAa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa target = null;
                target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa)get_store().find_element_user(AA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "aa" element
         */
        public boolean isSetAa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AA$0) != 0;
            }
        }
        
        /**
         * Sets the "aa" element
         */
        public void setAa(gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa aa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa target = null;
                target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa)get_store().find_element_user(AA$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa)get_store().add_element_user(AA$0);
                }
                target.set(aa);
            }
        }
        
        /**
         * Appends and returns a new empty "aa" element
         */
        public gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa addNewAa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa target = null;
                target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa)get_store().add_element_user(AA$0);
                return target;
            }
        }
        
        /**
         * Unsets the "aa" element
         */
        public void unsetAa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AA$0, 0);
            }
        }
        
        /**
         * Gets array of all "codon" elements
         */
        public java.math.BigInteger[] getCodonArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CODON$2, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "codon" element
         */
        public java.math.BigInteger getCodonArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODON$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "codon" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetCodonArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CODON$2, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "codon" element
         */
        public org.apache.xmlbeans.XmlInteger xgetCodonArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CODON$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "codon" element
         */
        public int sizeOfCodonArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CODON$2);
            }
        }
        
        /**
         * Sets array of all "codon" element
         */
        public void setCodonArray(java.math.BigInteger[] codonArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(codonArray, CODON$2);
            }
        }
        
        /**
         * Sets ith "codon" element
         */
        public void setCodonArray(int i, java.math.BigInteger codon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODON$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(codon);
            }
        }
        
        /**
         * Sets (as xml) array of all "codon" element
         */
        public void xsetCodonArray(org.apache.xmlbeans.XmlInteger[]codonArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(codonArray, CODON$2);
            }
        }
        
        /**
         * Sets (as xml) ith "codon" element
         */
        public void xsetCodonArray(int i, org.apache.xmlbeans.XmlInteger codon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CODON$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(codon);
            }
        }
        
        /**
         * Inserts the value as the ith "codon" element
         */
        public void insertCodon(int i, java.math.BigInteger codon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CODON$2, i);
                target.setBigIntegerValue(codon);
            }
        }
        
        /**
         * Appends the value as the last "codon" element
         */
        public void addCodon(java.math.BigInteger codon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODON$2);
                target.setBigIntegerValue(codon);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "codon" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewCodon(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(CODON$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "codon" element
         */
        public org.apache.xmlbeans.XmlInteger addNewCodon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CODON$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "codon" element
         */
        public void removeCodon(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CODON$2, i);
            }
        }
        
        /**
         * Gets the "anticodon" element
         */
        public gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon getAnticodon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon target = null;
                target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon)get_store().find_element_user(ANTICODON$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "anticodon" element
         */
        public boolean isSetAnticodon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ANTICODON$4) != 0;
            }
        }
        
        /**
         * Sets the "anticodon" element
         */
        public void setAnticodon(gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon anticodon)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon target = null;
                target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon)get_store().find_element_user(ANTICODON$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon)get_store().add_element_user(ANTICODON$4);
                }
                target.set(anticodon);
            }
        }
        
        /**
         * Appends and returns a new empty "anticodon" element
         */
        public gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon addNewAnticodon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon target = null;
                target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon)get_store().add_element_user(ANTICODON$4);
                return target;
            }
        }
        
        /**
         * Unsets the "anticodon" element
         */
        public void unsetAnticodon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ANTICODON$4, 0);
            }
        }
        /**
         * An XML aa(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Aa
        {
            
            public AaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName IUPACAA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "iupacaa");
            private static final javax.xml.namespace.QName NCBIEAA$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbieaa");
            private static final javax.xml.namespace.QName NCBI8AA$4 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbi8aa");
            private static final javax.xml.namespace.QName NCBISTDAA$6 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbistdaa");
            
            
            /**
             * Gets the "iupacaa" element
             */
            public java.math.BigInteger getIupacaa()
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
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "iupacaa" element
             */
            public org.apache.xmlbeans.XmlInteger xgetIupacaa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(IUPACAA$0, 0);
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
                    return get_store().count_elements(IUPACAA$0) != 0;
                }
            }
            
            /**
             * Sets the "iupacaa" element
             */
            public void setIupacaa(java.math.BigInteger iupacaa)
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
                    target.setBigIntegerValue(iupacaa);
                }
            }
            
            /**
             * Sets (as xml) the "iupacaa" element
             */
            public void xsetIupacaa(org.apache.xmlbeans.XmlInteger iupacaa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(IUPACAA$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(IUPACAA$0);
                    }
                    target.set(iupacaa);
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
                    get_store().remove_element(IUPACAA$0, 0);
                }
            }
            
            /**
             * Gets the "ncbieaa" element
             */
            public java.math.BigInteger getNcbieaa()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBIEAA$2, 0);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NCBIEAA$2, 0);
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
                    return get_store().count_elements(NCBIEAA$2) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBIEAA$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBIEAA$2);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NCBIEAA$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NCBIEAA$2);
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
                    get_store().remove_element(NCBIEAA$2, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI8AA$4, 0);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NCBI8AA$4, 0);
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
                    return get_store().count_elements(NCBI8AA$4) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI8AA$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBI8AA$4);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NCBI8AA$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NCBI8AA$4);
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
                    get_store().remove_element(NCBI8AA$4, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBISTDAA$6, 0);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NCBISTDAA$6, 0);
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
                    return get_store().count_elements(NCBISTDAA$6) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBISTDAA$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBISTDAA$6);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NCBISTDAA$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NCBISTDAA$6);
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
                    get_store().remove_element(NCBISTDAA$6, 0);
                }
            }
        }
        /**
         * An XML anticodon(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AnticodonImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt.Anticodon
        {
            
            public AnticodonImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
