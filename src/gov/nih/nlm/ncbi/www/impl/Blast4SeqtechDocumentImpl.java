/*
 * An XML document type.
 * Localname: Blast4-seqtech
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4SeqtechDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-seqtech(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4SeqtechDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SeqtechDocument
{
    
    public Blast4SeqtechDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4SEQTECH$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-seqtech");
    
    
    /**
     * Gets the "Blast4-seqtech" element
     */
    public gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech getBlast4Seqtech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech)get_store().find_element_user(BLAST4SEQTECH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-seqtech" element
     */
    public void setBlast4Seqtech(gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech blast4Seqtech)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech)get_store().find_element_user(BLAST4SEQTECH$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech)get_store().add_element_user(BLAST4SEQTECH$0);
            }
            target.set(blast4Seqtech);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-seqtech" element
     */
    public gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech addNewBlast4Seqtech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech)get_store().add_element_user(BLAST4SEQTECH$0);
            return target;
        }
    }
    /**
     * An XML Blast4-seqtech(@http://www.ncbi.nlm.nih.gov).
     *
     * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4SeqtechDocument$Blast4Seqtech.
     */
    public static class Blast4SeqtechImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech
    {
        
        public Blast4SeqtechImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected Blast4SeqtechImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value.Enum getValue()
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
                return (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value)get_store().find_attribute_user(VALUE$0);
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
        public void setValue(gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value.Enum value)
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
        public void xsetValue(gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value)get_store().add_attribute_user(VALUE$0);
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
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4SeqtechDocument$Blast4Seqtech$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech.Value
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
