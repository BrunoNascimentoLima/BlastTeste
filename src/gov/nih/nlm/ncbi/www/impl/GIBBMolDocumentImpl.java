/*
 * An XML document type.
 * Localname: GIBB-mol
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GIBBMolDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one GIBB-mol(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class GIBBMolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GIBBMolDocument
{
    
    public GIBBMolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GIBBMOL$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "GIBB-mol");
    
    
    /**
     * Gets the "GIBB-mol" element
     */
    public gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol getGIBBMol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol target = null;
            target = (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol)get_store().find_element_user(GIBBMOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GIBB-mol" element
     */
    public void setGIBBMol(gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol gibbMol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol target = null;
            target = (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol)get_store().find_element_user(GIBBMOL$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol)get_store().add_element_user(GIBBMOL$0);
            }
            target.set(gibbMol);
        }
    }
    
    /**
     * Appends and returns a new empty "GIBB-mol" element
     */
    public gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol addNewGIBBMol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol target = null;
            target = (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol)get_store().add_element_user(GIBBMOL$0);
            return target;
        }
    }
    /**
     * An XML GIBB-mol(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class GIBBMolImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol
    {
        
        public GIBBMolImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value.Enum getValue()
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
                return (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value target = null;
                target = (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value.Enum value)
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
        public void xsetValue(gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value target = null;
                target = (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.GIBBMolDocument$GIBBMol$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol.Value
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
