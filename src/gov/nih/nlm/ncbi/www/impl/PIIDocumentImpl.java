/*
 * An XML document type.
 * Localname: PII
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PIIDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PII(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PIIDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PIIDocument
{
    
    public PIIDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PII$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PII");
    
    
    /**
     * Gets the "PII" element
     */
    public java.lang.String getPII()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PII$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PII" element
     */
    public org.apache.xmlbeans.XmlString xgetPII()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PII$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PII" element
     */
    public void setPII(java.lang.String pii)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PII$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PII$0);
            }
            target.setStringValue(pii);
        }
    }
    
    /**
     * Sets (as xml) the "PII" element
     */
    public void xsetPII(org.apache.xmlbeans.XmlString pii)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PII$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PII$0);
            }
            target.set(pii);
        }
    }
}
