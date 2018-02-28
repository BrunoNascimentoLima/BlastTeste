/*
 * An XML document type.
 * Localname: Blast4-result-types
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-result-types(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4ResultTypesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument
{
    
    public Blast4ResultTypesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4RESULTTYPES$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-result-types");
    
    
    /**
     * Gets the "Blast4-result-types" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes getBlast4ResultTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes)get_store().find_element_user(BLAST4RESULTTYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-result-types" element
     */
    public void setBlast4ResultTypes(gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes blast4ResultTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes)get_store().find_element_user(BLAST4RESULTTYPES$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes)get_store().add_element_user(BLAST4RESULTTYPES$0);
            }
            target.set(blast4ResultTypes);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-result-types" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes addNewBlast4ResultTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes)get_store().add_element_user(BLAST4RESULTTYPES$0);
            return target;
        }
    }
    /**
     * An XML Blast4-result-types(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4ResultTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes
    {
        
        public Blast4ResultTypesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value.Enum getValue()
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
                return (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value.Enum value)
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
        public void xsetValue(gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument$Blast4ResultTypes$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.Blast4ResultTypesDocument.Blast4ResultTypes.Value
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
