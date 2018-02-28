/*
 * An XML document type.
 * Localname: Na-strand
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NaStrandDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Na-strand(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class NaStrandDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NaStrandDocument
{
    
    public NaStrandDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NASTRAND$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Na-strand");
    
    
    /**
     * Gets the "Na-strand" element
     */
    public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand getNaStrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
            target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().find_element_user(NASTRAND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Na-strand" element
     */
    public void setNaStrand(gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand naStrand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
            target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().find_element_user(NASTRAND$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().add_element_user(NASTRAND$0);
            }
            target.set(naStrand);
        }
    }
    
    /**
     * Appends and returns a new empty "Na-strand" element
     */
    public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand addNewNaStrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand target = null;
            target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand)get_store().add_element_user(NASTRAND$0);
            return target;
        }
    }
    /**
     * An XML Na-strand(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class NaStrandImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand
    {
        
        public NaStrandImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand.Value.Enum getValue()
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
                return (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand.Value.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand.Value xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand.Value target = null;
                target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand.Value)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand.Value.Enum value)
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
        public void xsetValue(gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand.Value target = null;
                target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand.Value)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand.Value)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.NaStrandDocument$NaStrand$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.NaStrandDocument.NaStrand.Value
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
