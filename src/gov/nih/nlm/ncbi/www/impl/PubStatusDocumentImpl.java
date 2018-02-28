/*
 * An XML document type.
 * Localname: PubStatus
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PubStatusDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PubStatus(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PubStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubStatusDocument
{
    
    public PubStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PubStatus");
    
    
    /**
     * Gets the "PubStatus" element
     */
    public gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus getPubStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus target = null;
            target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus)get_store().find_element_user(PUBSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PubStatus" element
     */
    public void setPubStatus(gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus pubStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus target = null;
            target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus)get_store().find_element_user(PUBSTATUS$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus)get_store().add_element_user(PUBSTATUS$0);
            }
            target.set(pubStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "PubStatus" element
     */
    public gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus addNewPubStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus target = null;
            target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus)get_store().add_element_user(PUBSTATUS$0);
            return target;
        }
    }
    /**
     * An XML PubStatus(@http://www.ncbi.nlm.nih.gov).
     *
     * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PubStatusDocument$PubStatus.
     */
    public static class PubStatusImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus
    {
        
        public PubStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected PubStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus.Value.Enum getValue()
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
                return (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus.Value.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus.Value xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus.Value target = null;
                target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus.Value)get_store().find_attribute_user(VALUE$0);
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
        public void setValue(gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus.Value.Enum value)
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
        public void xsetValue(gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus.Value target = null;
                target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus.Value)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus.Value)get_store().add_attribute_user(VALUE$0);
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
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PubStatusDocument$PubStatus$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus.Value
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
