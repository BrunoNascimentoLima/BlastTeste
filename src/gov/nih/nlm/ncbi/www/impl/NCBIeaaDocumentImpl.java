/*
 * An XML document type.
 * Localname: NCBIeaa
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NCBIeaaDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one NCBIeaa(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class NCBIeaaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NCBIeaaDocument
{
    
    public NCBIeaaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NCBIEAA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBIeaa");
    
    
    /**
     * Gets the "NCBIeaa" element
     */
    public java.lang.String getNCBIeaa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBIEAA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NCBIeaa" element
     */
    public org.apache.xmlbeans.XmlString xgetNCBIeaa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NCBIEAA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NCBIeaa" element
     */
    public void setNCBIeaa(java.lang.String ncbIeaa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBIEAA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBIEAA$0);
            }
            target.setStringValue(ncbIeaa);
        }
    }
    
    /**
     * Sets (as xml) the "NCBIeaa" element
     */
    public void xsetNCBIeaa(org.apache.xmlbeans.XmlString ncbIeaa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NCBIEAA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NCBIEAA$0);
            }
            target.set(ncbIeaa);
        }
    }
}
