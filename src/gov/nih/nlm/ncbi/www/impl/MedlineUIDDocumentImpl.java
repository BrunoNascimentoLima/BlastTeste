/*
 * An XML document type.
 * Localname: MedlineUID
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.MedlineUIDDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one MedlineUID(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class MedlineUIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineUIDDocument
{
    
    public MedlineUIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDLINEUID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "MedlineUID");
    
    
    /**
     * Gets the "MedlineUID" element
     */
    public java.math.BigInteger getMedlineUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDLINEUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MedlineUID" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMedlineUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MEDLINEUID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MedlineUID" element
     */
    public void setMedlineUID(java.math.BigInteger medlineUID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDLINEUID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDLINEUID$0);
            }
            target.setBigIntegerValue(medlineUID);
        }
    }
    
    /**
     * Sets (as xml) the "MedlineUID" element
     */
    public void xsetMedlineUID(org.apache.xmlbeans.XmlInteger medlineUID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MEDLINEUID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MEDLINEUID$0);
            }
            target.set(medlineUID);
        }
    }
}
