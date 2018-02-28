/*
 * An XML document type.
 * Localname: SeqTable-multi-data
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one SeqTable-multi-data(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqTableMultiDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument
{
    
    public SeqTableMultiDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQTABLEMULTIDATA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqTable-multi-data");
    
    
    /**
     * Gets the "SeqTable-multi-data" element
     */
    public gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData getSeqTableMultiData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData target = null;
            target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData)get_store().find_element_user(SEQTABLEMULTIDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SeqTable-multi-data" element
     */
    public void setSeqTableMultiData(gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData seqTableMultiData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData target = null;
            target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData)get_store().find_element_user(SEQTABLEMULTIDATA$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData)get_store().add_element_user(SEQTABLEMULTIDATA$0);
            }
            target.set(seqTableMultiData);
        }
    }
    
    /**
     * Appends and returns a new empty "SeqTable-multi-data" element
     */
    public gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData addNewSeqTableMultiData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData target = null;
            target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData)get_store().add_element_user(SEQTABLEMULTIDATA$0);
            return target;
        }
    }
    /**
     * An XML SeqTable-multi-data(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqTableMultiDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData
    {
        
        public SeqTableMultiDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INT$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "int");
        private static final javax.xml.namespace.QName REAL$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "real");
        private static final javax.xml.namespace.QName STRING$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "string");
        private static final javax.xml.namespace.QName BYTES$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bytes");
        private static final javax.xml.namespace.QName COMMONSTRING$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "common-string");
        private static final javax.xml.namespace.QName COMMONBYTES$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "common-bytes");
        private static final javax.xml.namespace.QName BIT$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bit");
        private static final javax.xml.namespace.QName LOC$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "loc");
        private static final javax.xml.namespace.QName ID$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName INTERVAL$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "interval");
        
        
        /**
         * Gets array of all "int" elements
         */
        public java.math.BigInteger[] getIntArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INT$0, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "int" element
         */
        public java.math.BigInteger getIntArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "int" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetIntArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INT$0, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "int" element
         */
        public org.apache.xmlbeans.XmlInteger xgetIntArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "int" element
         */
        public int sizeOfIntArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INT$0);
            }
        }
        
        /**
         * Sets array of all "int" element
         */
        public void setIntArray(java.math.BigInteger[] xintArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(xintArray, INT$0);
            }
        }
        
        /**
         * Sets ith "int" element
         */
        public void setIntArray(int i, java.math.BigInteger xint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(xint);
            }
        }
        
        /**
         * Sets (as xml) array of all "int" element
         */
        public void xsetIntArray(org.apache.xmlbeans.XmlInteger[]xintArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(xintArray, INT$0);
            }
        }
        
        /**
         * Sets (as xml) ith "int" element
         */
        public void xsetIntArray(int i, org.apache.xmlbeans.XmlInteger xint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(xint);
            }
        }
        
        /**
         * Inserts the value as the ith "int" element
         */
        public void insertInt(int i, java.math.BigInteger xint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INT$0, i);
                target.setBigIntegerValue(xint);
            }
        }
        
        /**
         * Appends the value as the last "int" element
         */
        public void addInt(java.math.BigInteger xint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INT$0);
                target.setBigIntegerValue(xint);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "int" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewInt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(INT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "int" element
         */
        public org.apache.xmlbeans.XmlInteger addNewInt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(INT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "int" element
         */
        public void removeInt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INT$0, i);
            }
        }
        
        /**
         * Gets array of all "real" elements
         */
        public double[] getRealArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REAL$2, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "real" element
         */
        public double getRealArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REAL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "real" elements
         */
        public org.apache.xmlbeans.XmlDouble[] xgetRealArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REAL$2, targetList);
                org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "real" element
         */
        public org.apache.xmlbeans.XmlDouble xgetRealArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REAL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlDouble)target;
            }
        }
        
        /**
         * Returns number of "real" element
         */
        public int sizeOfRealArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REAL$2);
            }
        }
        
        /**
         * Sets array of all "real" element
         */
        public void setRealArray(double[] realArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(realArray, REAL$2);
            }
        }
        
        /**
         * Sets ith "real" element
         */
        public void setRealArray(int i, double real)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REAL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setDoubleValue(real);
            }
        }
        
        /**
         * Sets (as xml) array of all "real" element
         */
        public void xsetRealArray(org.apache.xmlbeans.XmlDouble[]realArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(realArray, REAL$2);
            }
        }
        
        /**
         * Sets (as xml) ith "real" element
         */
        public void xsetRealArray(int i, org.apache.xmlbeans.XmlDouble real)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REAL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(real);
            }
        }
        
        /**
         * Inserts the value as the ith "real" element
         */
        public void insertReal(int i, double real)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(REAL$2, i);
                target.setDoubleValue(real);
            }
        }
        
        /**
         * Appends the value as the last "real" element
         */
        public void addReal(double real)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REAL$2);
                target.setDoubleValue(real);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "real" element
         */
        public org.apache.xmlbeans.XmlDouble insertNewReal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(REAL$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "real" element
         */
        public org.apache.xmlbeans.XmlDouble addNewReal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(REAL$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "real" element
         */
        public void removeReal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REAL$2, i);
            }
        }
        
        /**
         * Gets array of all "string" elements
         */
        public java.lang.String[] getStringArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STRING$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "string" element
         */
        public java.lang.String getStringArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRING$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "string" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetStringArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STRING$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "string" element
         */
        public org.apache.xmlbeans.XmlString xgetStringArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRING$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "string" element
         */
        public int sizeOfStringArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRING$4);
            }
        }
        
        /**
         * Sets array of all "string" element
         */
        public void setStringArray(java.lang.String[] stringArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(stringArray, STRING$4);
            }
        }
        
        /**
         * Sets ith "string" element
         */
        public void setStringArray(int i, java.lang.String string)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRING$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(string);
            }
        }
        
        /**
         * Sets (as xml) array of all "string" element
         */
        public void xsetStringArray(org.apache.xmlbeans.XmlString[]stringArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(stringArray, STRING$4);
            }
        }
        
        /**
         * Sets (as xml) ith "string" element
         */
        public void xsetStringArray(int i, org.apache.xmlbeans.XmlString string)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRING$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(string);
            }
        }
        
        /**
         * Inserts the value as the ith "string" element
         */
        public void insertString(int i, java.lang.String string)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STRING$4, i);
                target.setStringValue(string);
            }
        }
        
        /**
         * Appends the value as the last "string" element
         */
        public void addString(java.lang.String string)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRING$4);
                target.setStringValue(string);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "string" element
         */
        public org.apache.xmlbeans.XmlString insertNewString(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STRING$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "string" element
         */
        public org.apache.xmlbeans.XmlString addNewString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRING$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "string" element
         */
        public void removeString(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRING$4, i);
            }
        }
        
        /**
         * Gets array of all "bytes" elements
         */
        public byte[][] getBytesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BYTES$6, targetList);
                byte[][] result = new byte[targetList.size()][];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getByteArrayValue();
                return result;
            }
        }
        
        /**
         * Gets ith "bytes" element
         */
        public byte[] getBytesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYTES$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "bytes" elements
         */
        public org.apache.xmlbeans.XmlHexBinary[] xgetBytesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BYTES$6, targetList);
                org.apache.xmlbeans.XmlHexBinary[] result = new org.apache.xmlbeans.XmlHexBinary[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "bytes" element
         */
        public org.apache.xmlbeans.XmlHexBinary xgetBytesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(BYTES$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlHexBinary)target;
            }
        }
        
        /**
         * Returns number of "bytes" element
         */
        public int sizeOfBytesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BYTES$6);
            }
        }
        
        /**
         * Sets array of all "bytes" element
         */
        public void setBytesArray(byte[][] bytesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bytesArray, BYTES$6);
            }
        }
        
        /**
         * Sets ith "bytes" element
         */
        public void setBytesArray(int i, byte[] bytes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYTES$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setByteArrayValue(bytes);
            }
        }
        
        /**
         * Sets (as xml) array of all "bytes" element
         */
        public void xsetBytesArray(org.apache.xmlbeans.XmlHexBinary[]bytesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bytesArray, BYTES$6);
            }
        }
        
        /**
         * Sets (as xml) ith "bytes" element
         */
        public void xsetBytesArray(int i, org.apache.xmlbeans.XmlHexBinary bytes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(BYTES$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bytes);
            }
        }
        
        /**
         * Inserts the value as the ith "bytes" element
         */
        public void insertBytes(int i, byte[] bytes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BYTES$6, i);
                target.setByteArrayValue(bytes);
            }
        }
        
        /**
         * Appends the value as the last "bytes" element
         */
        public void addBytes(byte[] bytes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BYTES$6);
                target.setByteArrayValue(bytes);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "bytes" element
         */
        public org.apache.xmlbeans.XmlHexBinary insertNewBytes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().insert_element_user(BYTES$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "bytes" element
         */
        public org.apache.xmlbeans.XmlHexBinary addNewBytes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(BYTES$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "bytes" element
         */
        public void removeBytes(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BYTES$6, i);
            }
        }
        
        /**
         * Gets the "common-string" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString getCommonString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString)get_store().find_element_user(COMMONSTRING$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "common-string" element
         */
        public boolean isSetCommonString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMONSTRING$8) != 0;
            }
        }
        
        /**
         * Sets the "common-string" element
         */
        public void setCommonString(gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString commonString)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString)get_store().find_element_user(COMMONSTRING$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString)get_store().add_element_user(COMMONSTRING$8);
                }
                target.set(commonString);
            }
        }
        
        /**
         * Appends and returns a new empty "common-string" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString addNewCommonString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString)get_store().add_element_user(COMMONSTRING$8);
                return target;
            }
        }
        
        /**
         * Unsets the "common-string" element
         */
        public void unsetCommonString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMONSTRING$8, 0);
            }
        }
        
        /**
         * Gets the "common-bytes" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes getCommonBytes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes)get_store().find_element_user(COMMONBYTES$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "common-bytes" element
         */
        public boolean isSetCommonBytes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMONBYTES$10) != 0;
            }
        }
        
        /**
         * Sets the "common-bytes" element
         */
        public void setCommonBytes(gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes commonBytes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes)get_store().find_element_user(COMMONBYTES$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes)get_store().add_element_user(COMMONBYTES$10);
                }
                target.set(commonBytes);
            }
        }
        
        /**
         * Appends and returns a new empty "common-bytes" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes addNewCommonBytes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes)get_store().add_element_user(COMMONBYTES$10);
                return target;
            }
        }
        
        /**
         * Unsets the "common-bytes" element
         */
        public void unsetCommonBytes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMONBYTES$10, 0);
            }
        }
        
        /**
         * Gets the "bit" element
         */
        public byte[] getBit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "bit" element
         */
        public org.apache.xmlbeans.XmlHexBinary xgetBit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(BIT$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "bit" element
         */
        public boolean isSetBit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIT$12) != 0;
            }
        }
        
        /**
         * Sets the "bit" element
         */
        public void setBit(byte[] bit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIT$12);
                }
                target.setByteArrayValue(bit);
            }
        }
        
        /**
         * Sets (as xml) the "bit" element
         */
        public void xsetBit(org.apache.xmlbeans.XmlHexBinary bit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(BIT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(BIT$12);
                }
                target.set(bit);
            }
        }
        
        /**
         * Unsets the "bit" element
         */
        public void unsetBit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIT$12, 0);
            }
        }
        
        /**
         * Gets the "loc" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc getLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc)get_store().find_element_user(LOC$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "loc" element
         */
        public boolean isSetLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOC$14) != 0;
            }
        }
        
        /**
         * Sets the "loc" element
         */
        public void setLoc(gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc loc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc)get_store().find_element_user(LOC$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc)get_store().add_element_user(LOC$14);
                }
                target.set(loc);
            }
        }
        
        /**
         * Appends and returns a new empty "loc" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc addNewLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc)get_store().add_element_user(LOC$14);
                return target;
            }
        }
        
        /**
         * Unsets the "loc" element
         */
        public void unsetLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOC$14, 0);
            }
        }
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id)get_store().find_element_user(ID$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "id" element
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ID$16) != 0;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id)get_store().find_element_user(ID$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id)get_store().add_element_user(ID$16);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id)get_store().add_element_user(ID$16);
                return target;
            }
        }
        
        /**
         * Unsets the "id" element
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ID$16, 0);
            }
        }
        
        /**
         * Gets the "interval" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval getInterval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval)get_store().find_element_user(INTERVAL$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "interval" element
         */
        public boolean isSetInterval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTERVAL$18) != 0;
            }
        }
        
        /**
         * Sets the "interval" element
         */
        public void setInterval(gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval interval)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval)get_store().find_element_user(INTERVAL$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval)get_store().add_element_user(INTERVAL$18);
                }
                target.set(interval);
            }
        }
        
        /**
         * Appends and returns a new empty "interval" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval addNewInterval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval)get_store().add_element_user(INTERVAL$18);
                return target;
            }
        }
        
        /**
         * Unsets the "interval" element
         */
        public void unsetInterval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTERVAL$18, 0);
            }
        }
        /**
         * An XML common-string(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CommonStringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString
        {
            
            public CommonStringImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName COMMONSTRINGTABLE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "CommonString-table");
            
            
            /**
             * Gets the "CommonString-table" element
             */
            public gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable getCommonStringTable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable target = null;
                    target = (gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable)get_store().find_element_user(COMMONSTRINGTABLE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "CommonString-table" element
             */
            public void setCommonStringTable(gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable commonStringTable)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable target = null;
                    target = (gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable)get_store().find_element_user(COMMONSTRINGTABLE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable)get_store().add_element_user(COMMONSTRINGTABLE$0);
                    }
                    target.set(commonStringTable);
                }
            }
            
            /**
             * Appends and returns a new empty "CommonString-table" element
             */
            public gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable addNewCommonStringTable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable target = null;
                    target = (gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable)get_store().add_element_user(COMMONSTRINGTABLE$0);
                    return target;
                }
            }
        }
        /**
         * An XML common-bytes(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CommonBytesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes
        {
            
            public CommonBytesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName COMMONBYTESTABLE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "CommonBytes-table");
            
            
            /**
             * Gets the "CommonBytes-table" element
             */
            public gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable getCommonBytesTable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable target = null;
                    target = (gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable)get_store().find_element_user(COMMONBYTESTABLE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "CommonBytes-table" element
             */
            public void setCommonBytesTable(gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable commonBytesTable)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable target = null;
                    target = (gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable)get_store().find_element_user(COMMONBYTESTABLE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable)get_store().add_element_user(COMMONBYTESTABLE$0);
                    }
                    target.set(commonBytesTable);
                }
            }
            
            /**
             * Appends and returns a new empty "CommonBytes-table" element
             */
            public gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable addNewCommonBytesTable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable target = null;
                    target = (gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable)get_store().add_element_user(COMMONBYTESTABLE$0);
                    return target;
                }
            }
        }
        /**
         * An XML loc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LocImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc
        {
            
            public LocImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQLOC$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-loc");
            
            
            /**
             * Gets array of all "Seq-loc" elements
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] getSeqLocArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQLOC$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] result = new gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Seq-loc" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLocArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Seq-loc" element
             */
            public int sizeOfSeqLocArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQLOC$0);
                }
            }
            
            /**
             * Sets array of all "Seq-loc" element
             */
            public void setSeqLocArray(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] seqLocArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqLocArray, SEQLOC$0);
                }
            }
            
            /**
             * Sets ith "Seq-loc" element
             */
            public void setSeqLocArray(int i, gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqLoc);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-loc" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc insertNewSeqLoc(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().insert_element_user(SEQLOC$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-loc" element
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
            
            /**
             * Removes the ith "Seq-loc" element
             */
            public void removeSeqLoc(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQLOC$0, i);
                }
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id
        {
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML interval(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IntervalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval
        {
            
            public IntervalImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQINTERVAL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-interval");
            
            
            /**
             * Gets array of all "Seq-interval" elements
             */
            public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[] getSeqIntervalArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQINTERVAL$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[] result = new gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Seq-interval" element
             */
            public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval getSeqIntervalArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().find_element_user(SEQINTERVAL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Seq-interval" element
             */
            public int sizeOfSeqIntervalArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQINTERVAL$0);
                }
            }
            
            /**
             * Sets array of all "Seq-interval" element
             */
            public void setSeqIntervalArray(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[] seqIntervalArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqIntervalArray, SEQINTERVAL$0);
                }
            }
            
            /**
             * Sets ith "Seq-interval" element
             */
            public void setSeqIntervalArray(int i, gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval seqInterval)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().find_element_user(SEQINTERVAL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqInterval);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-interval" element
             */
            public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval insertNewSeqInterval(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().insert_element_user(SEQINTERVAL$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-interval" element
             */
            public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval addNewSeqInterval()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().add_element_user(SEQINTERVAL$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Seq-interval" element
             */
            public void removeSeqInterval(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQINTERVAL$0, i);
                }
            }
        }
    }
}
