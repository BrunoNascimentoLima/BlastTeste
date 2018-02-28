/*
 * An XML document type.
 * Localname: Blast4-error
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-error(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4ErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ErrorDocument
{
    
    public Blast4ErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4ERROR$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-error");
    
    
    /**
     * Gets the "Blast4-error" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error getBlast4Error()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error)get_store().find_element_user(BLAST4ERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-error" element
     */
    public void setBlast4Error(gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error blast4Error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error)get_store().find_element_user(BLAST4ERROR$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error)get_store().add_element_user(BLAST4ERROR$0);
            }
            target.set(blast4Error);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-error" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error addNewBlast4Error()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error)get_store().add_element_user(BLAST4ERROR$0);
            return target;
        }
    }
    /**
     * An XML Blast4-error(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4ErrorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error
    {
        
        public Blast4ErrorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CODE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "code");
        private static final javax.xml.namespace.QName MESSAGE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "message");
        
        
        /**
         * Gets the "code" element
         */
        public java.math.BigInteger getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "code" element
         */
        public org.apache.xmlbeans.XmlInteger xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "code" element
         */
        public void setCode(java.math.BigInteger code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
                }
                target.setBigIntegerValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "code" element
         */
        public void xsetCode(org.apache.xmlbeans.XmlInteger code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CODE$0);
                }
                target.set(code);
            }
        }
        
        /**
         * Gets the "message" element
         */
        public java.lang.String getMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "message" element
         */
        public org.apache.xmlbeans.XmlString xgetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "message" element
         */
        public boolean isSetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MESSAGE$2) != 0;
            }
        }
        
        /**
         * Sets the "message" element
         */
        public void setMessage(java.lang.String message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$2);
                }
                target.setStringValue(message);
            }
        }
        
        /**
         * Sets (as xml) the "message" element
         */
        public void xsetMessage(org.apache.xmlbeans.XmlString message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$2);
                }
                target.set(message);
            }
        }
        
        /**
         * Unsets the "message" element
         */
        public void unsetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MESSAGE$2, 0);
            }
        }
    }
}
