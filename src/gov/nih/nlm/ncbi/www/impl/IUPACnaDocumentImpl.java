/*
 * An XML document type.
 * Localname: IUPACna
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.IUPACnaDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one IUPACna(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class IUPACnaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.IUPACnaDocument
{
    
    public IUPACnaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IUPACNA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "IUPACna");
    
    
    /**
     * Gets the "IUPACna" element
     */
    public java.lang.String getIUPACna()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IUPACNA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IUPACna" element
     */
    public org.apache.xmlbeans.XmlString xgetIUPACna()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IUPACNA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IUPACna" element
     */
    public void setIUPACna(java.lang.String iupaCna)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IUPACNA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IUPACNA$0);
            }
            target.setStringValue(iupaCna);
        }
    }
    
    /**
     * Sets (as xml) the "IUPACna" element
     */
    public void xsetIUPACna(org.apache.xmlbeans.XmlString iupaCna)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IUPACNA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IUPACNA$0);
            }
            target.set(iupaCna);
        }
    }
}
