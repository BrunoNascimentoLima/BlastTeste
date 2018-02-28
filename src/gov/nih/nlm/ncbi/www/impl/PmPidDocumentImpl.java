/*
 * An XML document type.
 * Localname: PmPid
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PmPidDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PmPid(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PmPidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PmPidDocument
{
    
    public PmPidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PMPID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PmPid");
    
    
    /**
     * Gets the "PmPid" element
     */
    public java.lang.String getPmPid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PmPid" element
     */
    public org.apache.xmlbeans.XmlString xgetPmPid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PMPID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PmPid" element
     */
    public void setPmPid(java.lang.String pmPid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PMPID$0);
            }
            target.setStringValue(pmPid);
        }
    }
    
    /**
     * Sets (as xml) the "PmPid" element
     */
    public void xsetPmPid(org.apache.xmlbeans.XmlString pmPid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PMPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PMPID$0);
            }
            target.set(pmPid);
        }
    }
}
