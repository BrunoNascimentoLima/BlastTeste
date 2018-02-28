/*
 * An XML document type.
 * Localname: Packed-seg
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PackedSegDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Packed-seg(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PackedSegDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PackedSegDocument
{
    
    public PackedSegDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKEDSEG$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Packed-seg");
    
    
    /**
     * Gets the "Packed-seg" element
     */
    public gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg getPackedSeg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg target = null;
            target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg)get_store().find_element_user(PACKEDSEG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Packed-seg" element
     */
    public void setPackedSeg(gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg packedSeg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg target = null;
            target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg)get_store().find_element_user(PACKEDSEG$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg)get_store().add_element_user(PACKEDSEG$0);
            }
            target.set(packedSeg);
        }
    }
    
    /**
     * Appends and returns a new empty "Packed-seg" element
     */
    public gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg addNewPackedSeg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg target = null;
            target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg)get_store().add_element_user(PACKEDSEG$0);
            return target;
        }
    }
    /**
     * An XML Packed-seg(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PackedSegImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg
    {
        
        public PackedSegImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIM$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "dim");
        private static final javax.xml.namespace.QName NUMSEG$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "numseg");
        private static final javax.xml.namespace.QName IDS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ids");
        private static final javax.xml.namespace.QName STARTS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "starts");
        private static final javax.xml.namespace.QName PRESENT$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "present");
        private static final javax.xml.namespace.QName LENS$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "lens");
        private static final javax.xml.namespace.QName STRANDS$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "strands");
        private static final javax.xml.namespace.QName SCORES$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "scores");
        
        
        /**
         * Gets the "dim" element
         */
        public java.math.BigInteger getDim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "dim" element
         */
        public org.apache.xmlbeans.XmlInteger xgetDim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DIM$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dim" element
         */
        public void setDim(java.math.BigInteger dim)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIM$0);
                }
                target.setBigIntegerValue(dim);
            }
        }
        
        /**
         * Sets (as xml) the "dim" element
         */
        public void xsetDim(org.apache.xmlbeans.XmlInteger dim)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DIM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DIM$0);
                }
                target.set(dim);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMSEG$2, 0);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMSEG$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMSEG$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMSEG$2);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMSEG$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMSEG$2);
                }
                target.set(numseg);
            }
        }
        
        /**
         * Gets the "ids" element
         */
        public gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids getIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids)get_store().find_element_user(IDS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ids" element
         */
        public void setIds(gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids ids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids)get_store().find_element_user(IDS$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids)get_store().add_element_user(IDS$4);
                }
                target.set(ids);
            }
        }
        
        /**
         * Appends and returns a new empty "ids" element
         */
        public gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids addNewIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids)get_store().add_element_user(IDS$4);
                return target;
            }
        }
        
        /**
         * Gets array of all "starts" elements
         */
        public java.math.BigInteger[] getStartsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STARTS$6, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "starts" element
         */
        public java.math.BigInteger getStartsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "starts" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetStartsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STARTS$6, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "starts" element
         */
        public org.apache.xmlbeans.XmlInteger xgetStartsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STARTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "starts" element
         */
        public int sizeOfStartsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTS$6);
            }
        }
        
        /**
         * Sets array of all "starts" element
         */
        public void setStartsArray(java.math.BigInteger[] startsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(startsArray, STARTS$6);
            }
        }
        
        /**
         * Sets ith "starts" element
         */
        public void setStartsArray(int i, java.math.BigInteger starts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(starts);
            }
        }
        
        /**
         * Sets (as xml) array of all "starts" element
         */
        public void xsetStartsArray(org.apache.xmlbeans.XmlInteger[]startsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(startsArray, STARTS$6);
            }
        }
        
        /**
         * Sets (as xml) ith "starts" element
         */
        public void xsetStartsArray(int i, org.apache.xmlbeans.XmlInteger starts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STARTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(starts);
            }
        }
        
        /**
         * Inserts the value as the ith "starts" element
         */
        public void insertStarts(int i, java.math.BigInteger starts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STARTS$6, i);
                target.setBigIntegerValue(starts);
            }
        }
        
        /**
         * Appends the value as the last "starts" element
         */
        public void addStarts(java.math.BigInteger starts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTS$6);
                target.setBigIntegerValue(starts);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "starts" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewStarts(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(STARTS$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "starts" element
         */
        public org.apache.xmlbeans.XmlInteger addNewStarts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(STARTS$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "starts" element
         */
        public void removeStarts(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTS$6, i);
            }
        }
        
        /**
         * Gets the "present" element
         */
        public byte[] getPresent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "present" element
         */
        public org.apache.xmlbeans.XmlHexBinary xgetPresent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(PRESENT$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "present" element
         */
        public void setPresent(byte[] present)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENT$8);
                }
                target.setByteArrayValue(present);
            }
        }
        
        /**
         * Sets (as xml) the "present" element
         */
        public void xsetPresent(org.apache.xmlbeans.XmlHexBinary present)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(PRESENT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(PRESENT$8);
                }
                target.set(present);
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
         * Gets the "strands" element
         */
        public gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands getStrands()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands)get_store().find_element_user(STRANDS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "strands" element
         */
        public boolean isSetStrands()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRANDS$12) != 0;
            }
        }
        
        /**
         * Sets the "strands" element
         */
        public void setStrands(gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands strands)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands)get_store().find_element_user(STRANDS$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands)get_store().add_element_user(STRANDS$12);
                }
                target.set(strands);
            }
        }
        
        /**
         * Appends and returns a new empty "strands" element
         */
        public gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands addNewStrands()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands)get_store().add_element_user(STRANDS$12);
                return target;
            }
        }
        
        /**
         * Unsets the "strands" element
         */
        public void unsetStrands()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRANDS$12, 0);
            }
        }
        
        /**
         * Gets the "scores" element
         */
        public gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores getScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores)get_store().find_element_user(SCORES$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "scores" element
         */
        public boolean isSetScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCORES$14) != 0;
            }
        }
        
        /**
         * Sets the "scores" element
         */
        public void setScores(gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores scores)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores)get_store().find_element_user(SCORES$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores)get_store().add_element_user(SCORES$14);
                }
                target.set(scores);
            }
        }
        
        /**
         * Appends and returns a new empty "scores" element
         */
        public gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores addNewScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores target = null;
                target = (gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores)get_store().add_element_user(SCORES$14);
                return target;
            }
        }
        
        /**
         * Unsets the "scores" element
         */
        public void unsetScores()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCORES$14, 0);
            }
        }
        /**
         * An XML ids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Ids
        {
            
            public IdsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-id");
            
            
            /**
             * Gets array of all "Seq-id" elements
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] getSeqIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQID$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] result = new gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqIdArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Seq-id" element
             */
            public int sizeOfSeqIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQID$0);
                }
            }
            
            /**
             * Sets array of all "Seq-id" element
             */
            public void setSeqIdArray(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] seqIdArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqIdArray, SEQID$0);
                }
            }
            
            /**
             * Sets ith "Seq-id" element
             */
            public void setSeqIdArray(int i, gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqId);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId insertNewSeqId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().insert_element_user(SEQID$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-id" element
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
            
            /**
             * Removes the ith "Seq-id" element
             */
            public void removeSeqId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQID$0, i);
                }
            }
        }
        /**
         * An XML strands(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class StrandsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Strands
        {
            
            public StrandsImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML scores(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ScoresImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PackedSegDocument.PackedSeg.Scores
        {
            
            public ScoresImpl(org.apache.xmlbeans.SchemaType sType)
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
