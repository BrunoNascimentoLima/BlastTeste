/*
 * An XML document type.
 * Localname: PmcID
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PmcIDDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PmcID(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PmcIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PmcIDDocument
{
    
    public PmcIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PMCID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PmcID");
    
    
    /**
     * Gets the "PmcID" element
     */
    public java.math.BigInteger getPmcID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMCID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "PmcID" element
     */
    public org.apache.xmlbeans.XmlInteger xgetPmcID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PMCID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PmcID" element
     */
    public void setPmcID(java.math.BigInteger pmcID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMCID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PMCID$0);
            }
            target.setBigIntegerValue(pmcID);
        }
    }
    
    /**
     * Sets (as xml) the "PmcID" element
     */
    public void xsetPmcID(org.apache.xmlbeans.XmlInteger pmcID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PMCID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PMCID$0);
            }
            target.set(pmcID);
        }
    }
}
