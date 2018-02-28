/*
 * An XML document type.
 * Localname: Sparse-align
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SparseAlignDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Sparse-align(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SparseAlignDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SparseAlignDocument
{
    
    public SparseAlignDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPARSEALIGN$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Sparse-align");
    
    
    /**
     * Gets the "Sparse-align" element
     */
    public gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign getSparseAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign target = null;
            target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign)get_store().find_element_user(SPARSEALIGN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Sparse-align" element
     */
    public void setSparseAlign(gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign sparseAlign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign target = null;
            target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign)get_store().find_element_user(SPARSEALIGN$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign)get_store().add_element_user(SPARSEALIGN$0);
            }
            target.set(sparseAlign);
        }
    }
    
    /**
     * Appends and returns a new empty "Sparse-align" element
     */
    public gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign addNewSparseAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign target = null;
            target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign)get_store().add_element_user(SPARSEALIGN$0);
            return target;
        }
    }
    /**
     * An XML Sparse-align(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SparseAlignImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign
    {
        
        public SparseAlignImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIRSTID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "first-id");
        private static final javax.xml.namespace.QName SECONDID$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "second-id");
        private static final javax.xml.namespace.QName NUMSEG$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "numseg");
        private static final javax.xml.namespace.QName FIRSTSTARTS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "first-starts");
        private static final javax.xml.namespace.QName SECONDSTARTS$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "second-starts");
        private static final javax.xml.namespace.QName LENS$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "lens");
        private static final javax.xml.namespace.QName SECONDSTRANDS$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "second-strands");
        private static final javax.xml.namespace.QName SEGSCORES$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seg-scores");
        
        
        /**
         * Gets the "first-id" element
         */
        public gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId getFirstId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId target = null;
                target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId)get_store().find_element_user(FIRSTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "first-id" element
         */
        public void setFirstId(gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId firstId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId target = null;
                target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId)get_store().find_element_user(FIRSTID$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId)get_store().add_element_user(FIRSTID$0);
                }
                target.set(firstId);
            }
        }
        
        /**
         * Appends and returns a new empty "first-id" element
         */
        public gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId addNewFirstId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId target = null;
                target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId)get_store().add_element_user(FIRSTID$0);
                return target;
            }
        }
        
        /**
         * Gets the "second-id" element
         */
        public gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId getSecondId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId target = null;
                target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId)get_store().find_element_user(SECONDID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "second-id" element
         */
        public void setSecondId(gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId secondId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId target = null;
                target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId)get_store().find_element_user(SECONDID$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId)get_store().add_element_user(SECONDID$2);
                }
                target.set(secondId);
            }
        }
        
        /**
         * Appends and returns a new empty "second-id" element
         */
        public gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId addNewSecondId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId target = null;
                target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId)get_store().add_element_user(SECONDID$2);
                return target;
            }
        }
        
        /**
         * Gets the "numseg" element
         */
        public java.math.BigInteger getNumseg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMSEG$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "numseg" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNumseg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMSEG$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numseg" element
         */
        public void setNumseg(java.math.BigInteger numseg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMSEG$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMSEG$4);
                }
                target.setBigIntegerValue(numseg);
            }
        }
        
        /**
         * Sets (as xml) the "numseg" element
         */
        public void xsetNumseg(org.apache.xmlbeans.XmlInteger numseg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMSEG$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMSEG$4);
                }
                target.set(numseg);
            }
        }
        
        /**
         * Gets array of all "first-starts" elements
         */
        public java.math.BigInteger[] getFirstStartsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIRSTSTARTS$6, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "first-starts" element
         */
        public java.math.BigInteger getFirstStartsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTSTARTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "first-starts" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetFirstStartsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIRSTSTARTS$6, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "first-starts" element
         */
        public org.apache.xmlbeans.XmlInteger xgetFirstStartsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FIRSTSTARTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "first-starts" element
         */
        public int sizeOfFirstStartsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIRSTSTARTS$6);
            }
        }
        
        /**
         * Sets array of all "first-starts" element
         */
        public void setFirstStartsArray(java.math.BigInteger[] firstStartsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(firstStartsArray, FIRSTSTARTS$6);
            }
        }
        
        /**
         * Sets ith "first-starts" element
         */
        public void setFirstStartsArray(int i, java.math.BigInteger firstStarts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTSTARTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(firstStarts);
            }
        }
        
        /**
         * Sets (as xml) array of all "first-starts" element
         */
        public void xsetFirstStartsArray(org.apache.xmlbeans.XmlInteger[]firstStartsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(firstStartsArray, FIRSTSTARTS$6);
            }
        }
        
        /**
         * Sets (as xml) ith "first-starts" element
         */
        public void xsetFirstStartsArray(int i, org.apache.xmlbeans.XmlInteger firstStarts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FIRSTSTARTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(firstStarts);
            }
        }
        
        /**
         * Inserts the value as the ith "first-starts" element
         */
        public void insertFirstStarts(int i, java.math.BigInteger firstStarts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FIRSTSTARTS$6, i);
                target.setBigIntegerValue(firstStarts);
            }
        }
        
        /**
         * Appends the value as the last "first-starts" element
         */
        public void addFirstStarts(java.math.BigInteger firstStarts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTSTARTS$6);
                target.setBigIntegerValue(firstStarts);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "first-starts" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewFirstStarts(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(FIRSTSTARTS$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "first-starts" element
         */
        public org.apache.xmlbeans.XmlInteger addNewFirstStarts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FIRSTSTARTS$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "first-starts" element
         */
        public void removeFirstStarts(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIRSTSTARTS$6, i);
            }
        }
        
        /**
         * Gets array of all "second-starts" elements
         */
        public java.math.BigInteger[] getSecondStartsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SECONDSTARTS$8, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "second-starts" element
         */
        public java.math.BigInteger getSecondStartsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDSTARTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "second-starts" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetSecondStartsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SECONDSTARTS$8, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "second-starts" element
         */
        public org.apache.xmlbeans.XmlInteger xgetSecondStartsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SECONDSTARTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "second-starts" element
         */
        public int sizeOfSecondStartsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SECONDSTARTS$8);
            }
        }
        
        /**
         * Sets array of all "second-starts" element
         */
        public void setSecondStartsArray(java.math.BigInteger[] secondStartsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(secondStartsArray, SECONDSTARTS$8);
            }
        }
        
        /**
         * Sets ith "second-starts" element
         */
        public void setSecondStartsArray(int i, java.math.BigInteger secondStarts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDSTARTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(secondStarts);
            }
        }
        
        /**
         * Sets (as xml) array of all "second-starts" element
         */
        public void xsetSecondStartsArray(org.apache.xmlbeans.XmlInteger[]secondStartsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(secondStartsArray, SECONDSTARTS$8);
            }
        }
        
        /**
         * Sets (as xml) ith "second-starts" element
         */
        public void xsetSecondStartsArray(int i, org.apache.xmlbeans.XmlInteger secondStarts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SECONDSTARTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(secondStarts);
            }
        }
        
        /**
         * Inserts the value as the ith "second-starts" element
         */
        public void insertSecondStarts(int i, java.math.BigInteger secondStarts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SECONDSTARTS$8, i);
                target.setBigIntegerValue(secondStarts);
            }
        }
        
        /**
         * Appends the value as the last "second-starts" element
         */
        public void addSecondStarts(java.math.BigInteger secondStarts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDSTARTS$8);
                target.setBigIntegerValue(secondStarts);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "second-starts" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewSecondStarts(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(SECONDSTARTS$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "second-starts" element
         */
        public org.apache.xmlbeans.XmlInteger addNewSecondStarts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SECONDSTARTS$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "second-starts" element
         */
        public void removeSecondStarts(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SECONDSTARTS$8, i);
            }
        }
        
        /**
         * Gets array of all "lens" elements
         */
        public java.math.BigInteger[] getLensArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LENS$10, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "lens" element
         */
        public java.math.BigInteger getLensArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "lens" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetLensArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LENS$10, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "lens" element
         */
        public org.apache.xmlbeans.XmlInteger xgetLensArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LENS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "lens" element
         */
        public int sizeOfLensArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LENS$10);
            }
        }
        
        /**
         * Sets array of all "lens" element
         */
        public void setLensArray(java.math.BigInteger[] lensArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(lensArray, LENS$10);
            }
        }
        
        /**
         * Sets ith "lens" element
         */
        public void setLensArray(int i, java.math.BigInteger lens)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LENS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(lens);
            }
        }
        
        /**
         * Sets (as xml) array of all "lens" element
         */
        public void xsetLensArray(org.apache.xmlbeans.XmlInteger[]lensArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(lensArray, LENS$10);
            }
        }
        
        /**
         * Sets (as xml) ith "lens" element
         */
        public void xsetLensArray(int i, org.apache.xmlbeans.XmlInteger lens)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LENS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(lens);
            }
        }
        
        /**
         * Inserts the value as the ith "lens" element
         */
        public void insertLens(int i, java.math.BigInteger lens)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LENS$10, i);
                target.setBigIntegerValue(lens);
            }
        }
        
        /**
         * Appends the value as the last "lens" element
         */
        public void addLens(java.math.BigInteger lens)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LENS$10);
                target.setBigIntegerValue(lens);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "lens" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewLens(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(LENS$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "lens" element
         */
        public org.apache.xmlbeans.XmlInteger addNewLens()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(LENS$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "lens" element
         */
        public void removeLens(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LENS$10, i);
            }
        }
        
        /**
         * Gets the "second-strands" element
         */
        public gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands getSecondStrands()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands target = null;
                target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands)get_store().find_element_user(SECONDSTRANDS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "second-strands" element
         */
        public boolean isSetSecondStrands()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SECONDSTRANDS$12) != 0;
            }
        }
        
        /**
         * Sets the "second-strands" element
         */
        public void setSecondStrands(gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands secondStrands)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands target = null;
                target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands)get_store().find_element_user(SECONDSTRANDS$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands)get_store().add_element_user(SECONDSTRANDS$12);
                }
                target.set(secondStrands);
            }
        }
        
        /**
         * Appends and returns a new empty "second-strands" element
         */
        public gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands addNewSecondStrands()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands target = null;
                target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands)get_store().add_element_user(SECONDSTRANDS$12);
                return target;
            }
        }
        
        /**
         * Unsets the "second-strands" element
         */
        public void unsetSecondStrands()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SECONDSTRANDS$12, 0);
            }
        }
        
        /**
         * Gets the "seg-scores" element
         */
        public gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores getSegScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores target = null;
                target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores)get_store().find_element_user(SEGSCORES$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seg-scores" element
         */
        public boolean isSetSegScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEGSCORES$14) != 0;
            }
        }
        
        /**
         * Sets the "seg-scores" element
         */
        public void setSegScores(gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores segScores)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores target = null;
                target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores)get_store().find_element_user(SEGSCORES$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores)get_store().add_element_user(SEGSCORES$14);
                }
                target.set(segScores);
            }
        }
        
        /**
         * Appends and returns a new empty "seg-scores" element
         */
        public gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores addNewSegScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores target = null;
                target = (gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores)get_store().add_element_user(SEGSCORES$14);
                return target;
            }
        }
        
        /**
         * Unsets the "seg-scores" element
         */
        public void unsetSegScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEGSCORES$14, 0);
            }
        }
        /**
         * An XML first-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FirstIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.FirstId
        {
            
            public FirstIdImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
        /**
         * An XML second-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SecondIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondId
        {
            
            public SecondIdImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
        /**
         * An XML second-strands(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SecondStrandsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SecondStrands
        {
            
            public SecondStrandsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NASTRAND$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Na-strand");
            
            
            /**
             * Gets array of all "Na-strand" elements
             */
            public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand[] getNaStrandArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(NASTRAND$0, targetList);
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand[] result = new gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Na-strand" element
             */
            public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand getNaStrandArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().find_element_user(NASTRAND$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Na-strand" element
             */
            public int sizeOfNaStrandArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NASTRAND$0);
                }
            }
            
            /**
             * Sets array of all "Na-strand" element
             */
            public void setNaStrandArray(gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand[] naStrandArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(naStrandArray, NASTRAND$0);
                }
            }
            
            /**
             * Sets ith "Na-strand" element
             */
            public void setNaStrandArray(int i, gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand naStrand)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().find_element_user(NASTRAND$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(naStrand);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Na-strand" element
             */
            public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand insertNewNaStrand(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().insert_element_user(NASTRAND$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Na-strand" element
             */
            public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand addNewNaStrand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().add_element_user(NASTRAND$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Na-strand" element
             */
            public void removeNaStrand(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NASTRAND$0, i);
                }
            }
        }
        /**
         * An XML seg-scores(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SegScoresImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SparseAlignDocument.SparseAlign.SegScores
        {
            
            public SegScoresImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SCORE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Score");
            
            
            /**
             * Gets array of all "Score" elements
             */
            public gov.nih.nlm.ncbi.www.ScoreDocument.Score[] getScoreArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SCORE$0, targetList);
                    gov.nih.nlm.ncbi.www.ScoreDocument.Score[] result = new gov.nih.nlm.ncbi.www.ScoreDocument.Score[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Score" element
             */
            public gov.nih.nlm.ncbi.www.ScoreDocument.Score getScoreArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
                    target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().find_element_user(SCORE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Score" element
             */
            public int sizeOfScoreArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SCORE$0);
                }
            }
            
            /**
             * Sets array of all "Score" element
             */
            public void setScoreArray(gov.nih.nlm.ncbi.www.ScoreDocument.Score[] scoreArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(scoreArray, SCORE$0);
                }
            }
            
            /**
             * Sets ith "Score" element
             */
            public void setScoreArray(int i, gov.nih.nlm.ncbi.www.ScoreDocument.Score score)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
                    target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().find_element_user(SCORE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(score);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Score" element
             */
            public gov.nih.nlm.ncbi.www.ScoreDocument.Score insertNewScore(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
                    target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().insert_element_user(SCORE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Score" element
             */
            public gov.nih.nlm.ncbi.www.ScoreDocument.Score addNewScore()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ScoreDocument.Score target = null;
                    target = (gov.nih.nlm.ncbi.www.ScoreDocument.Score)get_store().add_element_user(SCORE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Score" element
             */
            public void removeScore(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SCORE$0, i);
                }
            }
        }
    }
}
