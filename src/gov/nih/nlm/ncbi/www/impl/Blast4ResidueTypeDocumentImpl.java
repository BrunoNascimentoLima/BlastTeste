/*
 * An XML document type.
 * Localname: Blast4-residue-type
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-residue-type(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4ResidueTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument
{
    
    public Blast4ResidueTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4RESIDUETYPE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-residue-type");
    
    
    /**
     * Gets the "Blast4-residue-type" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType getBlast4ResidueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType)get_store().find_element_user(BLAST4RESIDUETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-residue-type" element
     */
    public void setBlast4ResidueType(gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType blast4ResidueType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType)get_store().find_element_user(BLAST4RESIDUETYPE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType)get_store().add_element_user(BLAST4RESIDUETYPE$0);
            }
            target.set(blast4ResidueType);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-residue-type" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType addNewBlast4ResidueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType)get_store().add_element_user(BLAST4RESIDUETYPE$0);
            return target;
        }
    }
    /**
     * An XML Blast4-residue-type(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4ResidueTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType
    {
        
        public Blast4ResidueTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType.Value.Enum getValue()
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
                return (gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType.Value.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType.Value xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType.Value)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType.Value.Enum value)
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
        public void xsetValue(gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType.Value)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType.Value)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument$Blast4ResidueType$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType.Value
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
