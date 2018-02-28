/*
 * An XML document type.
 * Localname: Heterogen
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.HeterogenDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Heterogen(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class HeterogenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.HeterogenDocument
{
    
    public HeterogenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HETEROGEN$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Heterogen");
    
    
    /**
     * Gets the "Heterogen" element
     */
    public java.lang.String getHeterogen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HETEROGEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Heterogen" element
     */
    public org.apache.xmlbeans.XmlString xgetHeterogen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HETEROGEN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Heterogen" element
     */
    public void setHeterogen(java.lang.String heterogen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HETEROGEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HETEROGEN$0);
            }
            target.setStringValue(heterogen);
        }
    }
    
    /**
     * Sets (as xml) the "Heterogen" element
     */
    public void xsetHeterogen(org.apache.xmlbeans.XmlString heterogen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HETEROGEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HETEROGEN$0);
            }
            target.set(heterogen);
        }
    }
}
