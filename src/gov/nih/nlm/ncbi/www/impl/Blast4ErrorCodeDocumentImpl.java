/*
 * An XML document type.
 * Localname: Blast4-error-code
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-error-code(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4ErrorCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument
{
    
    public Blast4ErrorCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4ERRORCODE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-error-code");
    
    
    /**
     * Gets the "Blast4-error-code" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode getBlast4ErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode)get_store().find_element_user(BLAST4ERRORCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-error-code" element
     */
    public void setBlast4ErrorCode(gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode blast4ErrorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode)get_store().find_element_user(BLAST4ERRORCODE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode)get_store().add_element_user(BLAST4ERRORCODE$0);
            }
            target.set(blast4ErrorCode);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-error-code" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode addNewBlast4ErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode)get_store().add_element_user(BLAST4ERRORCODE$0);
            return target;
        }
    }
    /**
     * An XML Blast4-error-code(@http://www.ncbi.nlm.nih.gov).
     *
     * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument$Blast4ErrorCode.
     */
    public static class Blast4ErrorCodeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode
    {
        
        public Blast4ErrorCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected Blast4ErrorCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode.Value.Enum getValue()
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
                return (gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode.Value.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode.Value xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode.Value)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$0) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode.Value.Enum value)
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
        public void xsetValue(gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode.Value)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode.Value)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        
        /**
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$0);
            }
        }
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument$Blast4ErrorCode$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.Blast4ErrorCodeDocument.Blast4ErrorCode.Value
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
