/*
 * An XML document type.
 * Localname: PCRPrimerName
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PCRPrimerNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PCRPrimerName(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PCRPrimerNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PCRPrimerNameDocument
{
    
    public PCRPrimerNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PCRPRIMERNAME$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PCRPrimerName");
    
    
    /**
     * Gets the "PCRPrimerName" element
     */
    public java.lang.String getPCRPrimerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCRPRIMERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PCRPrimerName" element
     */
    public org.apache.xmlbeans.XmlString xgetPCRPrimerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PCRPRIMERNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PCRPrimerName" element
     */
    public void setPCRPrimerName(java.lang.String pcrPrimerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCRPRIMERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PCRPRIMERNAME$0);
            }
            target.setStringValue(pcrPrimerName);
        }
    }
    
    /**
     * Sets (as xml) the "PCRPrimerName" element
     */
    public void xsetPCRPrimerName(org.apache.xmlbeans.XmlString pcrPrimerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PCRPRIMERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PCRPRIMERNAME$0);
            }
            target.set(pcrPrimerName);
        }
    }
}
