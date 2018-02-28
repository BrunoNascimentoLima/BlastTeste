/*
 * An XML document type.
 * Localname: Real-graph
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.RealGraphDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Real-graph(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class RealGraphDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RealGraphDocument
{
    
    public RealGraphDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALGRAPH$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Real-graph");
    
    
    /**
     * Gets the "Real-graph" element
     */
    public gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph getRealGraph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph target = null;
            target = (gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph)get_store().find_element_user(REALGRAPH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Real-graph" element
     */
    public void setRealGraph(gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph realGraph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph target = null;
            target = (gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph)get_store().find_element_user(REALGRAPH$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph)get_store().add_element_user(REALGRAPH$0);
            }
            target.set(realGraph);
        }
    }
    
    /**
     * Appends and returns a new empty "Real-graph" element
     */
    public gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph addNewRealGraph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph target = null;
            target = (gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph)get_store().add_element_user(REALGRAPH$0);
            return target;
        }
    }
    /**
     * An XML Real-graph(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class RealGraphImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph
    {
        
        public RealGraphImpl(org.apache.xmlbeans.SchemaType sType)
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
        public double getMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAX$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "max" element
         */
        public org.apache.xmlbeans.XmlDouble xgetMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAX$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "max" element
         */
        public void setMax(double max)
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
                target.setDoubleValue(max);
            }
        }
        
        /**
         * Sets (as xml) the "max" element
         */
        public void xsetMax(org.apache.xmlbeans.XmlDouble max)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAX$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MAX$0);
                }
                target.set(max);
            }
        }
        
        /**
         * Gets the "min" element
         */
        public double getMin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIN$2, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "min" element
         */
        public org.apache.xmlbeans.XmlDouble xgetMin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MIN$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "min" element
         */
        public void setMin(double min)
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
                target.setDoubleValue(min);
            }
        }
        
        /**
         * Sets (as xml) the "min" element
         */
        public void xsetMin(org.apache.xmlbeans.XmlDouble min)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MIN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MIN$2);
                }
                target.set(min);
            }
        }
        
        /**
         * Gets the "axis" element
         */
        public double getAxis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AXIS$4, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "axis" element
         */
        public org.apache.xmlbeans.XmlDouble xgetAxis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AXIS$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "axis" element
         */
        public void setAxis(double axis)
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
                target.setDoubleValue(axis);
            }
        }
        
        /**
         * Sets (as xml) the "axis" element
         */
        public void xsetAxis(org.apache.xmlbeans.XmlDouble axis)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AXIS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(AXIS$4);
                }
                target.set(axis);
            }
        }
        
        /**
         * Gets array of all "values" elements
         */
        public double[] getValuesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALUES$6, targetList);
                double[] result = new double[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
                return result;
            }
        }
        
        /**
         * Gets ith "values" element
         */
        public double getValuesArray(int i)
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
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "values" elements
         */
        public org.apache.xmlbeans.XmlDouble[] xgetValuesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALUES$6, targetList);
                org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "values" element
         */
        public org.apache.xmlbeans.XmlDouble xgetValuesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VALUES$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlDouble)target;
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
        public void setValuesArray(double[] valuesArray)
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
        public void setValuesArray(int i, double values)
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
                target.setDoubleValue(values);
            }
        }
        
        /**
         * Sets (as xml) array of all "values" element
         */
        public void xsetValuesArray(org.apache.xmlbeans.XmlDouble[]valuesArray)
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
        public void xsetValuesArray(int i, org.apache.xmlbeans.XmlDouble values)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VALUES$6, i);
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
        public void insertValues(int i, double values)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(VALUES$6, i);
                target.setDoubleValue(values);
            }
        }
        
        /**
         * Appends the value as the last "values" element
         */
        public void addValues(double values)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUES$6);
                target.setDoubleValue(values);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "values" element
         */
        public org.apache.xmlbeans.XmlDouble insertNewValues(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(VALUES$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "values" element
         */
        public org.apache.xmlbeans.XmlDouble addNewValues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(VALUES$6);
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
