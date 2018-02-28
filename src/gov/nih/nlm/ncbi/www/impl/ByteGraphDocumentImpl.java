/*
 * An XML document type.
 * Localname: Byte-graph
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ByteGraphDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Byte-graph(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ByteGraphDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ByteGraphDocument
{
    
    public ByteGraphDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BYTEGRAPH$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Byte-graph");
    
    
    /**
     * Gets the "Byte-graph" element
     */
    public gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph getByteGraph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph target = null;
            target = (gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph)get_store().find_element_user(BYTEGRAPH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Byte-graph" element
     */
    public void setByteGraph(gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph byteGraph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph target = null;
            target = (gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph)get_store().find_element_user(BYTEGRAPH$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph)get_store().add_element_user(BYTEGRAPH$0);
            }
            target.set(byteGraph);
        }
    }
    
    /**
     * Appends and returns a new empty "Byte-graph" element
     */
    public gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph addNewByteGraph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph target = null;
            target = (gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph)get_store().add_element_user(BYTEGRAPH$0);
            return target;
        }
    }
    /**
     * An XML Byte-graph(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ByteGraphImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph
    {
        
        public ByteGraphImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MAX$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "max");
        private static final javax.xml.namespace.QName MIN$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "min");
        private static final javax.xml.namespace.QName AXIS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "axis");
        private static final javax.xml.namespace.QName VALUES$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "values");
        
        
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
        
        /**
         * Gets the "axis" element
         */
        public java.math.BigInteger getAxis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AXIS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "axis" element
         */
        public org.apache.xmlbeans.XmlInteger xgetAxis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AXIS$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "axis" element
         */
        public void setAxis(java.math.BigInteger axis)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AXIS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AXIS$4);
                }
                target.setBigIntegerValue(axis);
            }
        }
        
        /**
         * Sets (as xml) the "axis" element
         */
        public void xsetAxis(org.apache.xmlbeans.XmlInteger axis)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AXIS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(AXIS$4);
                }
                target.set(axis);
            }
        }
        
        /**
         * Gets the "values" element
         */
        public byte[] getValues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUES$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "values" element
         */
        public org.apache.xmlbeans.XmlHexBinary xgetValues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(VALUES$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "values" element
         */
        public void setValues(byte[] values)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUES$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUES$6);
                }
                target.setByteArrayValue(values);
            }
        }
        
        /**
         * Sets (as xml) the "values" element
         */
        public void xsetValues(org.apache.xmlbeans.XmlHexBinary values)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(VALUES$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(VALUES$6);
                }
                target.set(values);
            }
        }
    }
}
