/*
 * An XML document type.
 * Localname: GIBB-method
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GIBBMethodDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one GIBB-method(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class GIBBMethodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GIBBMethodDocument
{
    
    public GIBBMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GIBBMETHOD$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "GIBB-method");
    
    
    /**
     * Gets the "GIBB-method" element
     */
    public gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod getGIBBMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod target = null;
            target = (gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod)get_store().find_element_user(GIBBMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GIBB-method" element
     */
    public void setGIBBMethod(gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod gibbMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod target = null;
            target = (gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod)get_store().find_element_user(GIBBMETHOD$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod)get_store().add_element_user(GIBBMETHOD$0);
            }
            target.set(gibbMethod);
        }
    }
    
    /**
     * Appends and returns a new empty "GIBB-method" element
     */
    public gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod addNewGIBBMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod target = null;
            target = (gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod)get_store().add_element_user(GIBBMETHOD$0);
            return target;
        }
    }
    /**
     * An XML GIBB-method(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class GIBBMethodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod
    {
        
        public GIBBMethodImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod.Value.Enum getValue()
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
                return (gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod.Value.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod.Value xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod.Value target = null;
                target = (gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod.Value)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod.Value.Enum value)
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
        public void xsetValue(gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod.Value target = null;
                target = (gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod.Value)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod.Value)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.GIBBMethodDocument$GIBBMethod$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod.Value
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
