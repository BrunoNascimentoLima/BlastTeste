/*
 * An XML document type.
 * Localname: NCBIstdaa
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NCBIstdaaDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one NCBIstdaa(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class NCBIstdaaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NCBIstdaaDocument
{
    
    public NCBIstdaaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NCBISTDAA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBIstdaa");
    
    
    /**
     * Gets the "NCBIstdaa" element
     */
    public byte[] getNCBIstdaa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBISTDAA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "NCBIstdaa" element
     */
    public org.apache.xmlbeans.XmlHexBinary xgetNCBIstdaa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBISTDAA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NCBIstdaa" element
     */
    public void setNCBIstdaa(byte[] ncbIstdaa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBISTDAA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBISTDAA$0);
            }
            target.setByteArrayValue(ncbIstdaa);
        }
    }
    
    /**
     * Sets (as xml) the "NCBIstdaa" element
     */
    public void xsetNCBIstdaa(org.apache.xmlbeans.XmlHexBinary ncbIstdaa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBISTDAA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBISTDAA$0);
            }
            target.set(ncbIstdaa);
        }
    }
}
