/*
 * An XML document type.
 * Localname: Num-real
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NumRealDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Num-real(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class NumRealDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumRealDocument
{
    
    public NumRealDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMREAL$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Num-real");
    
    
    /**
     * Gets the "Num-real" element
     */
    public gov.nih.nlm.ncbi.www.NumRealDocument.NumReal getNumReal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumRealDocument.NumReal target = null;
            target = (gov.nih.nlm.ncbi.www.NumRealDocument.NumReal)get_store().find_element_user(NUMREAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Num-real" element
     */
    public void setNumReal(gov.nih.nlm.ncbi.www.NumRealDocument.NumReal numReal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumRealDocument.NumReal target = null;
            target = (gov.nih.nlm.ncbi.www.NumRealDocument.NumReal)get_store().find_element_user(NUMREAL$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.NumRealDocument.NumReal)get_store().add_element_user(NUMREAL$0);
            }
            target.set(numReal);
        }
    }
    
    /**
     * Appends and returns a new empty "Num-real" element
     */
    public gov.nih.nlm.ncbi.www.NumRealDocument.NumReal addNewNumReal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumRealDocument.NumReal target = null;
            target = (gov.nih.nlm.ncbi.www.NumRealDocument.NumReal)get_store().add_element_user(NUMREAL$0);
            return target;
        }
    }
    /**
     * An XML Num-real(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class NumRealImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumRealDocument.NumReal
    {
        
        public NumRealImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName A$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "a");
        private static final javax.xml.namespace.QName B$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "b");
        private static final javax.xml.namespace.QName UNITS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "units");
        
        
        /**
         * Gets the "a" element
         */
        public double getA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(A$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "a" element
         */
        public org.apache.xmlbeans.XmlDouble xgetA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(A$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "a" element
         */
        public void setA(double a)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(A$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(A$0);
                }
                target.setDoubleValue(a);
            }
        }
        
        /**
         * Sets (as xml) the "a" element
         */
        public void xsetA(org.apache.xmlbeans.XmlDouble a)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(A$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(A$0);
                }
                target.set(a);
            }
        }
        
        /**
         * Gets the "b" element
         */
        public double getB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(B$2, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "b" element
         */
        public org.apache.xmlbeans.XmlDouble xgetB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(B$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "b" element
         */
        public void setB(double b)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(B$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(B$2);
                }
                target.setDoubleValue(b);
            }
        }
        
        /**
         * Sets (as xml) the "b" element
         */
        public void xsetB(org.apache.xmlbeans.XmlDouble b)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(B$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(B$2);
                }
                target.set(b);
            }
        }
        
        /**
         * Gets the "units" element
         */
        public java.lang.String getUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "units" element
         */
        public org.apache.xmlbeans.XmlString xgetUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNITS$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "units" element
         */
        public boolean isSetUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UNITS$4) != 0;
            }
        }
        
        /**
         * Sets the "units" element
         */
        public void setUnits(java.lang.String units)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITS$4);
                }
                target.setStringValue(units);
            }
        }
        
        /**
         * Sets (as xml) the "units" element
         */
        public void xsetUnits(org.apache.xmlbeans.XmlString units)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNITS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNITS$4);
                }
                target.set(units);
            }
        }
        
        /**
         * Unsets the "units" element
         */
        public void unsetUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UNITS$4, 0);
            }
        }
    }
}
