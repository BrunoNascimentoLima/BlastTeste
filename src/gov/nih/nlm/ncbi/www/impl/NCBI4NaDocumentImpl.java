/*
 * An XML document type.
 * Localname: NCBI4na
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NCBI4NaDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one NCBI4na(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class NCBI4NaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NCBI4NaDocument
{
    
    public NCBI4NaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NCBI4NA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBI4na");
    
    
    /**
     * Gets the "NCBI4na" element
     */
    public byte[] getNCBI4Na()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI4NA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "NCBI4na" element
     */
    public org.apache.xmlbeans.XmlHexBinary xgetNCBI4Na()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI4NA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NCBI4na" element
     */
    public void setNCBI4Na(byte[] ncbi4Na)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI4NA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBI4NA$0);
            }
            target.setByteArrayValue(ncbi4Na);
        }
    }
    
    /**
     * Sets (as xml) the "NCBI4na" element
     */
    public void xsetNCBI4Na(org.apache.xmlbeans.XmlHexBinary ncbi4Na)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI4NA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBI4NA$0);
            }
            target.set(ncbi4Na);
        }
    }
}
