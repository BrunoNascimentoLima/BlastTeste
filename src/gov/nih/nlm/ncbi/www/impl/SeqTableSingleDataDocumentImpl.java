/*
 * An XML document type.
 * Localname: SeqTable-single-data
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one SeqTable-single-data(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqTableSingleDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument
{
    
    public SeqTableSingleDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQTABLESINGLEDATA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqTable-single-data");
    
    
    /**
     * Gets the "SeqTable-single-data" element
     */
    public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData getSeqTableSingleData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData target = null;
            target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData)get_store().find_element_user(SEQTABLESINGLEDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SeqTable-single-data" element
     */
    public void setSeqTableSingleData(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData seqTableSingleData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData target = null;
            target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData)get_store().find_element_user(SEQTABLESINGLEDATA$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData)get_store().add_element_user(SEQTABLESINGLEDATA$0);
            }
            target.set(seqTableSingleData);
        }
    }
    
    /**
     * Appends and returns a new empty "SeqTable-single-data" element
     */
    public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData addNewSeqTableSingleData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData target = null;
            target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData)get_store().add_element_user(SEQTABLESINGLEDATA$0);
            return target;
        }
    }
    /**
     * An XML SeqTable-single-data(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqTableSingleDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData
    {
        
        public SeqTableSingleDataImpl(org.apache.xmlbeans.SchemaType sType)
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
        private static final javax.xml.namespace.QName BIT$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bit");
        private static final javax.xml.namespace.QName LOC$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "loc");
        private static final javax.xml.namespace.QName ID$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName INTERVAL$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "interval");
        
        
        /**
         * Gets the "int" element
         */
        public java.math.BigInteger getInt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "int" element
         */
        public org.apache.xmlbeans.XmlInteger xgetInt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "int" element
         */
        public boolean isSetInt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INT$0) != 0;
            }
        }
        
        /**
         * Sets the "int" element
         */
        public void setInt(java.math.BigInteger xint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INT$0);
                }
                target.setBigIntegerValue(xint);
            }
        }
        
        /**
         * Sets (as xml) the "int" element
         */
        public void xsetInt(org.apache.xmlbeans.XmlInteger xint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(INT$0);
                }
                target.set(xint);
            }
        }
        
        /**
         * Unsets the "int" element
         */
        public void unsetInt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INT$0, 0);
            }
        }
        
        /**
         * Gets the "real" element
         */
        public double getReal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REAL$2, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "real" element
         */
        public org.apache.xmlbeans.XmlDouble xgetReal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REAL$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "real" element
         */
        public boolean isSetReal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REAL$2) != 0;
            }
        }
        
        /**
         * Sets the "real" element
         */
        public void setReal(double real)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REAL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REAL$2);
                }
                target.setDoubleValue(real);
            }
        }
        
        /**
         * Sets (as xml) the "real" element
         */
        public void xsetReal(org.apache.xmlbeans.XmlDouble real)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REAL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(REAL$2);
                }
                target.set(real);
            }
        }
        
        /**
         * Unsets the "real" element
         */
        public void unsetReal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REAL$2, 0);
            }
        }
        
        /**
         * Gets the "string" element
         */
        public java.lang.String getString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRING$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "string" element
         */
        public org.apache.xmlbeans.XmlString xgetString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRING$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "string" element
         */
        public boolean isSetString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRING$4) != 0;
            }
        }
        
        /**
         * Sets the "string" element
         */
        public void setString(java.lang.String string)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRING$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRING$4);
                }
                target.setStringValue(string);
            }
        }
        
        /**
         * Sets (as xml) the "string" element
         */
        public void xsetString(org.apache.xmlbeans.XmlString string)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRING$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRING$4);
                }
                target.set(string);
            }
        }
        
        /**
         * Unsets the "string" element
         */
        public void unsetString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRING$4, 0);
            }
        }
        
        /**
         * Gets the "bytes" element
         */
        public byte[] getBytes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYTES$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "bytes" element
         */
        public org.apache.xmlbeans.XmlHexBinary xgetBytes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(BYTES$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "bytes" element
         */
        public boolean isSetBytes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BYTES$6) != 0;
            }
        }
        
        /**
         * Sets the "bytes" element
         */
        public void setBytes(byte[] bytes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYTES$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BYTES$6);
                }
                target.setByteArrayValue(bytes);
            }
        }
        
        /**
         * Sets (as xml) the "bytes" element
         */
        public void xsetBytes(org.apache.xmlbeans.XmlHexBinary bytes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(BYTES$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(BYTES$6);
                }
                target.set(bytes);
            }
        }
        
        /**
         * Unsets the "bytes" element
         */
        public void unsetBytes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BYTES$6, 0);
            }
        }
        
        /**
         * Gets the "bit" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit getBit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit)get_store().find_element_user(BIT$8, 0);
                if (target == null)
                {
                    return null;
                }
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
                return get_store().count_elements(BIT$8) != 0;
            }
        }
        
        /**
         * Sets the "bit" element
         */
        public void setBit(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit bit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit)get_store().find_element_user(BIT$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit)get_store().add_element_user(BIT$8);
                }
                target.set(bit);
            }
        }
        
        /**
         * Appends and returns a new empty "bit" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit addNewBit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit)get_store().add_element_user(BIT$8);
                return target;
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
                get_store().remove_element(BIT$8, 0);
            }
        }
        
        /**
         * Gets the "loc" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc getLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc)get_store().find_element_user(LOC$10, 0);
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
                return get_store().count_elements(LOC$10) != 0;
            }
        }
        
        /**
         * Sets the "loc" element
         */
        public void setLoc(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc loc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc)get_store().find_element_user(LOC$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc)get_store().add_element_user(LOC$10);
                }
                target.set(loc);
            }
        }
        
        /**
         * Appends and returns a new empty "loc" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc addNewLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc)get_store().add_element_user(LOC$10);
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
                get_store().remove_element(LOC$10, 0);
            }
        }
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id)get_store().find_element_user(ID$12, 0);
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
                return get_store().count_elements(ID$12) != 0;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id)get_store().find_element_user(ID$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id)get_store().add_element_user(ID$12);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id)get_store().add_element_user(ID$12);
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
                get_store().remove_element(ID$12, 0);
            }
        }
        
        /**
         * Gets the "interval" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval getInterval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval)get_store().find_element_user(INTERVAL$14, 0);
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
                return get_store().count_elements(INTERVAL$14) != 0;
            }
        }
        
        /**
         * Sets the "interval" element
         */
        public void setInterval(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval interval)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval)get_store().find_element_user(INTERVAL$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval)get_store().add_element_user(INTERVAL$14);
                }
                target.set(interval);
            }
        }
        
        /**
         * Appends and returns a new empty "interval" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval addNewInterval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval)get_store().add_element_user(INTERVAL$14);
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
                get_store().remove_element(INTERVAL$14, 0);
            }
        }
        /**
         * An XML bit(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit
        {
            
            public BitImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument$SeqTableSingleData$Bit$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Bit.Value
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
         * An XML loc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LocImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Loc
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
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Id
        {
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML interval(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IntervalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData.Interval
        {
            
            public IntervalImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQINTERVAL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-interval");
            
            
            /**
             * Gets the "Seq-interval" element
             */
            public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval getSeqInterval()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().find_element_user(SEQINTERVAL$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-interval" element
             */
            public void setSeqInterval(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval seqInterval)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().find_element_user(SEQINTERVAL$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().add_element_user(SEQINTERVAL$0);
                    }
                    target.set(seqInterval);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-interval" element
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
        }
    }
}
