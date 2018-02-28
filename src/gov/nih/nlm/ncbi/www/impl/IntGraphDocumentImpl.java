/*
 * An XML document type.
 * Localname: Int-graph
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.IntGraphDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Int-graph(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class IntGraphDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.IntGraphDocument
{
    
    public IntGraphDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTGRAPH$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Int-graph");
    
    
    /**
     * Gets the "Int-graph" element
     */
    public gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph getIntGraph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph target = null;
            target = (gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph)get_store().find_element_user(INTGRAPH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Int-graph" element
     */
    public void setIntGraph(gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph intGraph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph target = null;
            target = (gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph)get_store().find_element_user(INTGRAPH$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph)get_store().add_element_user(INTGRAPH$0);
            }
            target.set(intGraph);
        }
    }
    
    /**
     * Appends and returns a new empty "Int-graph" element
     */
    public gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph addNewIntGraph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph target = null;
            target = (gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph)get_store().add_element_user(INTGRAPH$0);
            return target;
        }
    }
    /**
     * An XML Int-graph(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class IntGraphImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph
    {
        
        public IntGraphImpl(org.apache.xmlbeans.SchemaType sType)
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
         * Gets array of all "values" elements
         */
        public java.math.BigInteger[] getValuesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALUES$6, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "values" element
         */
        public java.math.BigInteger getValuesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUES$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "values" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetValuesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALUES$6, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "values" element
         */
        public org.apache.xmlbeans.XmlInteger xgetValuesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VALUES$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "values" element
         */
        public int sizeOfValuesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALUES$6);
            }
        }
        
        /**
         * Sets array of all "values" element
         */
        public void setValuesArray(java.math.BigInteger[] valuesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(valuesArray, VALUES$6);
            }
        }
        
        /**
         * Sets ith "values" element
         */
        public void setValuesArray(int i, java.math.BigInteger values)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUES$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(values);
            }
        }
        
        /**
         * Sets (as xml) array of all "values" element
         */
        public void xsetValuesArray(org.apache.xmlbeans.XmlInteger[]valuesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(valuesArray, VALUES$6);
            }
        }
        
        /**
         * Sets (as xml) ith "values" element
         */
        public void xsetValuesArray(int i, org.apache.xmlbeans.XmlInteger values)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VALUES$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(values);
            }
        }
        
        /**
         * Inserts the value as the ith "values" element
         */
        public void insertValues(int i, java.math.BigInteger values)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(VALUES$6, i);
                target.setBigIntegerValue(values);
            }
        }
        
        /**
         * Appends the value as the last "values" element
         */
        public void addValues(java.math.BigInteger values)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUES$6);
                target.setBigIntegerValue(values);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "values" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewValues(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(VALUES$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "values" element
         */
        public org.apache.xmlbeans.XmlInteger addNewValues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(VALUES$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "values" element
         */
        public void removeValues(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALUES$6, i);
            }
        }
    }
}
