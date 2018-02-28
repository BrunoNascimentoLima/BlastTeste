/*
 * An XML document type.
 * Localname: NCBI8na
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NCBI8NaDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one NCBI8na(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class NCBI8NaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NCBI8NaDocument
{
    
    public NCBI8NaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NCBI8NA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBI8na");
    
    
    /**
     * Gets the "NCBI8na" element
     */
    public byte[] getNCBI8Na()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI8NA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "NCBI8na" element
     */
    public org.apache.xmlbeans.XmlHexBinary xgetNCBI8Na()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI8NA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NCBI8na" element
     */
    public void setNCBI8Na(byte[] ncbi8Na)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI8NA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBI8NA$0);
            }
            target.setByteArrayValue(ncbi8Na);
        }
    }
    
    /**
     * Sets (as xml) the "NCBI8na" element
     */
    public void xsetNCBI8Na(org.apache.xmlbeans.XmlHexBinary ncbi8Na)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI8NA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBI8NA$0);
            }
            target.set(ncbi8Na);
        }
    }
}
