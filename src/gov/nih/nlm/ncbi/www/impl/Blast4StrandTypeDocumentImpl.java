/*
 * An XML document type.
 * Localname: Blast4-strand-type
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-strand-type(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4StrandTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument
{
    
    public Blast4StrandTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4STRANDTYPE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-strand-type");
    
    
    /**
     * Gets the "Blast4-strand-type" element
     */
    public gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType getBlast4StrandType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().find_element_user(BLAST4STRANDTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-strand-type" element
     */
    public void setBlast4StrandType(gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType blast4StrandType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().find_element_user(BLAST4STRANDTYPE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().add_element_user(BLAST4STRANDTYPE$0);
            }
            target.set(blast4StrandType);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-strand-type" element
     */
    public gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType addNewBlast4StrandType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().add_element_user(BLAST4STRANDTYPE$0);
            return target;
        }
    }
    /**
     * An XML Blast4-strand-type(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4StrandTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType
    {
        
        public Blast4StrandTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType.Value.Enum getValue()
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
                return (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType.Value.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType.Value xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType.Value)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType.Value.Enum value)
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
        public void xsetValue(gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType.Value)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType.Value)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument$Blast4StrandType$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType.Value
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
