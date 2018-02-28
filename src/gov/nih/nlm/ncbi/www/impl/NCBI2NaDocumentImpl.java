/*
 * An XML document type.
 * Localname: NCBI2na
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NCBI2NaDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one NCBI2na(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class NCBI2NaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NCBI2NaDocument
{
    
    public NCBI2NaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NCBI2NA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBI2na");
    
    
    /**
     * Gets the "NCBI2na" element
     */
    public byte[] getNCBI2Na()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI2NA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "NCBI2na" element
     */
    public org.apache.xmlbeans.XmlHexBinary xgetNCBI2Na()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI2NA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NCBI2na" element
     */
    public void setNCBI2Na(byte[] ncbi2Na)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI2NA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBI2NA$0);
            }
            target.setByteArrayValue(ncbi2Na);
        }
    }
    
    /**
     * Sets (as xml) the "NCBI2na" element
     */
    public void xsetNCBI2Na(org.apache.xmlbeans.XmlHexBinary ncbi2Na)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI2NA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBI2NA$0);
            }
            target.set(ncbi2Na);
        }
    }
}
