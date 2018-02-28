/*
 * An XML document type.
 * Localname: GIBB-mod
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GIBBModDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one GIBB-mod(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class GIBBModDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GIBBModDocument
{
    
    public GIBBModDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GIBBMOD$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "GIBB-mod");
    
    
    /**
     * Gets the "GIBB-mod" element
     */
    public gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod getGIBBMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod target = null;
            target = (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod)get_store().find_element_user(GIBBMOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GIBB-mod" element
     */
    public void setGIBBMod(gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod gibbMod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod target = null;
            target = (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod)get_store().find_element_user(GIBBMOD$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod)get_store().add_element_user(GIBBMOD$0);
            }
            target.set(gibbMod);
        }
    }
    
    /**
     * Appends and returns a new empty "GIBB-mod" element
     */
    public gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod addNewGIBBMod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod target = null;
            target = (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod)get_store().add_element_user(GIBBMOD$0);
            return target;
        }
    }
    /**
     * An XML GIBB-mod(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class GIBBModImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod
    {
        
        public GIBBModImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value.Enum getValue()
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
                return (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value target = null;
                target = (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value.Enum value)
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
        public void xsetValue(gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value target = null;
                target = (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.GIBBModDocument$GIBBMod$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod.Value
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
