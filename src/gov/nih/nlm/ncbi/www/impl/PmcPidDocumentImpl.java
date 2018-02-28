/*
 * An XML document type.
 * Localname: PmcPid
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PmcPidDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PmcPid(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PmcPidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PmcPidDocument
{
    
    public PmcPidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PMCPID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PmcPid");
    
    
    /**
     * Gets the "PmcPid" element
     */
    public java.lang.String getPmcPid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMCPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PmcPid" element
     */
    public org.apache.xmlbeans.XmlString xgetPmcPid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PMCPID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PmcPid" element
     */
    public void setPmcPid(java.lang.String pmcPid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMCPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PMCPID$0);
            }
            target.setStringValue(pmcPid);
        }
    }
    
    /**
     * Sets (as xml) the "PmcPid" element
     */
    public void xsetPmcPid(org.apache.xmlbeans.XmlString pmcPid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PMCPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PMCPID$0);
            }
            target.set(pmcPid);
        }
    }
}
