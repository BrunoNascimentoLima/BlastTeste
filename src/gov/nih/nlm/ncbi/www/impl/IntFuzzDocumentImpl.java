/*
 * An XML document type.
 * Localname: Int-fuzz
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.IntFuzzDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Int-fuzz(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class IntFuzzDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.IntFuzzDocument
{
    
    public IntFuzzDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Int-fuzz(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class IntFuzzImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz
    {
        
        public IntFuzzImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PM$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "p-m");
        private static final javax.xml.namespace.QName RANGE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "range");
        private static final javax.xml.namespace.QName PCT$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pct");
        private static final javax.xml.namespace.QName LIM$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "lim");
        private static final javax.xml.namespace.QName ALT$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "alt");
        
        
        /**
         * Gets the "p-m" element
         */
        public java.math.BigInteger getPM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "p-m" element
         */
        public org.apache.xmlbeans.XmlInteger xgetPM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PM$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "p-m" element
         */
        public boolean isSetPM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PM$0) != 0;
            }
        }
        
        /**
         * Sets the "p-m" element
         */
        public void setPM(java.math.BigInteger pm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PM$0);
                }
                target.setBigIntegerValue(pm);
            }
        }
        
        /**
         * Sets (as xml) the "p-m" element
         */
        public void xsetPM(org.apache.xmlbeans.XmlInteger pm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PM$0);
                }
                target.set(pm);
            }
        }
        
        /**
         * Unsets the "p-m" element
         */
        public void unsetPM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PM$0, 0);
            }
        }
        
        /**
         * Gets the "range" element
         */
        public gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range getRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range target = null;
                target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range)get_store().find_element_user(RANGE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "range" element
         */
        public boolean isSetRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RANGE$2) != 0;
            }
        }
        
        /**
         * Sets the "range" element
         */
        public void setRange(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range range)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range target = null;
                target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range)get_store().find_element_user(RANGE$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range)get_store().add_element_user(RANGE$2);
                }
                target.set(range);
            }
        }
        
        /**
         * Appends and returns a new empty "range" element
         */
        public gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range addNewRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range target = null;
                target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range)get_store().add_element_user(RANGE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "range" element
         */
        public void unsetRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RANGE$2, 0);
            }
        }
        
        /**
         * Gets the "pct" element
         */
        public java.math.BigInteger getPct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "pct" element
         */
        public org.apache.xmlbeans.XmlInteger xgetPct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PCT$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "pct" element
         */
        public boolean isSetPct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PCT$4) != 0;
            }
        }
        
        /**
         * Sets the "pct" element
         */
        public void setPct(java.math.BigInteger pct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PCT$4);
                }
                target.setBigIntegerValue(pct);
            }
        }
        
        /**
         * Sets (as xml) the "pct" element
         */
        public void xsetPct(org.apache.xmlbeans.XmlInteger pct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PCT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PCT$4);
                }
                target.set(pct);
            }
        }
        
        /**
         * Unsets the "pct" element
         */
        public void unsetPct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PCT$4, 0);
            }
        }
        
        /**
         * Gets the "lim" element
         */
        public gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim getLim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim target = null;
                target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim)get_store().find_element_user(LIM$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "lim" element
         */
        public boolean isSetLim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LIM$6) != 0;
            }
        }
        
        /**
         * Sets the "lim" element
         */
        public void setLim(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim lim)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim target = null;
                target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim)get_store().find_element_user(LIM$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim)get_store().add_element_user(LIM$6);
                }
                target.set(lim);
            }
        }
        
        /**
         * Appends and returns a new empty "lim" element
         */
        public gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim addNewLim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim target = null;
                target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim)get_store().add_element_user(LIM$6);
                return target;
            }
        }
        
        /**
         * Unsets the "lim" element
         */
        public void unsetLim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LIM$6, 0);
            }
        }
        
        /**
         * Gets array of all "alt" elements
         */
        public java.math.BigInteger[] getAltArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALT$8, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "alt" element
         */
        public java.math.BigInteger getAltArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALT$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "alt" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetAltArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALT$8, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "alt" element
         */
        public org.apache.xmlbeans.XmlInteger xgetAltArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ALT$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "alt" element
         */
        public int sizeOfAltArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALT$8);
            }
        }
        
        /**
         * Sets array of all "alt" element
         */
        public void setAltArray(java.math.BigInteger[] altArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(altArray, ALT$8);
            }
        }
        
        /**
         * Sets ith "alt" element
         */
        public void setAltArray(int i, java.math.BigInteger alt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALT$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(alt);
            }
        }
        
        /**
         * Sets (as xml) array of all "alt" element
         */
        public void xsetAltArray(org.apache.xmlbeans.XmlInteger[]altArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(altArray, ALT$8);
            }
        }
        
        /**
         * Sets (as xml) ith "alt" element
         */
        public void xsetAltArray(int i, org.apache.xmlbeans.XmlInteger alt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ALT$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(alt);
            }
        }
        
        /**
         * Inserts the value as the ith "alt" element
         */
        public void insertAlt(int i, java.math.BigInteger alt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ALT$8, i);
                target.setBigIntegerValue(alt);
            }
        }
        
        /**
         * Appends the value as the last "alt" element
         */
        public void addAlt(java.math.BigInteger alt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALT$8);
                target.setBigIntegerValue(alt);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alt" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewAlt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(ALT$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alt" element
         */
        public org.apache.xmlbeans.XmlInteger addNewAlt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ALT$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "alt" element
         */
        public void removeAlt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALT$8, i);
            }
        }
        /**
         * An XML range(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Range
        {
            
            public RangeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MAX$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "max");
            private static final javax.xml.namespace.QName MIN$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "min");
            
            
            /**
             * Gets the "max" element
             */
            public java.math.BigInteger getMax()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAX$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "max" element
             */
            public org.apache.xmlbeans.XmlInteger xgetMax()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAX$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "max" element
             */
            public void setMax(java.math.BigInteger max)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAX$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAX$0);
                    }
                    target.setBigIntegerValue(max);
                }
            }
            
            /**
             * Sets (as xml) the "max" element
             */
            public void xsetMax(org.apache.xmlbeans.XmlInteger max)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAX$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MAX$0);
                    }
                    target.set(max);
                }
            }
            
            /**
             * Gets the "min" element
             */
            public java.math.BigInteger getMin()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIN$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "min" element
             */
            public org.apache.xmlbeans.XmlInteger xgetMin()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MIN$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "min" element
             */
            public void setMin(java.math.BigInteger min)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIN$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIN$2);
                    }
                    target.setBigIntegerValue(min);
                }
            }
            
            /**
             * Sets (as xml) the "min" element
             */
            public void xsetMin(org.apache.xmlbeans.XmlInteger min)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MIN$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MIN$2);
                    }
                    target.set(min);
                }
            }
        }
        /**
         * An XML lim(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LimImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim
        {
            
            public LimImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.IntFuzzDocument$IntFuzz$Lim$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz.Lim.Value
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
