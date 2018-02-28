/*
 * An XML document type.
 * Localname: Blast4-frame-type
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-frame-type(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4FrameTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument
{
    
    public Blast4FrameTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4FRAMETYPE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-frame-type");
    
    
    /**
     * Gets the "Blast4-frame-type" element
     */
    public gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType getBlast4FrameType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType)get_store().find_element_user(BLAST4FRAMETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-frame-type" element
     */
    public void setBlast4FrameType(gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType blast4FrameType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType)get_store().find_element_user(BLAST4FRAMETYPE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType)get_store().add_element_user(BLAST4FRAMETYPE$0);
            }
            target.set(blast4FrameType);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-frame-type" element
     */
    public gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType addNewBlast4FrameType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType)get_store().add_element_user(BLAST4FRAMETYPE$0);
            return target;
        }
    }
    /**
     * An XML Blast4-frame-type(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4FrameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType
    {
        
        public Blast4FrameTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType.Value.Enum getValue()
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
                return (gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType.Value.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType.Value xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType.Value)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType.Value.Enum value)
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
        public void xsetValue(gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType.Value)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType.Value)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument$Blast4FrameType$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType.Value
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
