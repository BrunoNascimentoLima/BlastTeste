/*
 * An XML document type.
 * Localname: NCBI8aa
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NCBI8AaDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one NCBI8aa(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class NCBI8AaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NCBI8AaDocument
{
    
    public NCBI8AaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NCBI8AA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "NCBI8aa");
    
    
    /**
     * Gets the "NCBI8aa" element
     */
    public byte[] getNCBI8Aa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI8AA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "NCBI8aa" element
     */
    public org.apache.xmlbeans.XmlHexBinary xgetNCBI8Aa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI8AA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NCBI8aa" element
     */
    public void setNCBI8Aa(byte[] ncbi8Aa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI8AA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBI8AA$0);
            }
            target.setByteArrayValue(ncbi8Aa);
        }
    }
    
    /**
     * Sets (as xml) the "NCBI8aa" element
     */
    public void xsetNCBI8Aa(org.apache.xmlbeans.XmlHexBinary ncbi8Aa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI8AA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBI8AA$0);
            }
            target.set(ncbi8Aa);
        }
    }
}
