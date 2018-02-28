/*
 * An XML document type.
 * Localname: NCBIpaa
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NCBIpaaDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one NCBIpaa(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class NCBIpaaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NCBIpaaDocument
{
    
    public NCBIpaaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NCBIPAA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBIpaa");
    
    
    /**
     * Gets the "NCBIpaa" element
     */
    public byte[] getNCBIpaa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBIPAA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "NCBIpaa" element
     */
    public org.apache.xmlbeans.XmlHexBinary xgetNCBIpaa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBIPAA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NCBIpaa" element
     */
    public void setNCBIpaa(byte[] ncbIpaa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBIPAA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBIPAA$0);
            }
            target.setByteArrayValue(ncbIpaa);
        }
    }
    
    /**
     * Sets (as xml) the "NCBIpaa" element
     */
    public void xsetNCBIpaa(org.apache.xmlbeans.XmlHexBinary ncbIpaa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBIPAA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBIPAA$0);
            }
            target.set(ncbIpaa);
        }
    }
}
