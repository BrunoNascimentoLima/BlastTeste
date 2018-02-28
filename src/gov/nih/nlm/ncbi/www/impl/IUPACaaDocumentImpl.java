/*
 * An XML document type.
 * Localname: IUPACaa
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.IUPACaaDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one IUPACaa(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class IUPACaaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.IUPACaaDocument
{
    
    public IUPACaaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IUPACAA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "IUPACaa");
    
    
    /**
     * Gets the "IUPACaa" element
     */
    public java.lang.String getIUPACaa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IUPACAA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IUPACaa" element
     */
    public org.apache.xmlbeans.XmlString xgetIUPACaa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IUPACAA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IUPACaa" element
     */
    public void setIUPACaa(java.lang.String iupaCaa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IUPACAA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IUPACAA$0);
            }
            target.setStringValue(iupaCaa);
        }
    }
    
    /**
     * Sets (as xml) the "IUPACaa" element
     */
    public void xsetIUPACaa(org.apache.xmlbeans.XmlString iupaCaa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IUPACAA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IUPACAA$0);
            }
            target.set(iupaCaa);
        }
    }
}
