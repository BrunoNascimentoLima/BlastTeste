/*
 * An XML document type.
 * Localname: PubMedId
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PubMedIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PubMedId(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PubMedIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubMedIdDocument
{
    
    public PubMedIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBMEDID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PubMedId");
    
    
    /**
     * Gets the "PubMedId" element
     */
    public java.math.BigInteger getPubMedId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBMEDID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "PubMedId" element
     */
    public org.apache.xmlbeans.XmlInteger xgetPubMedId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PUBMEDID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PubMedId" element
     */
    public void setPubMedId(java.math.BigInteger pubMedId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBMEDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBMEDID$0);
            }
            target.setBigIntegerValue(pubMedId);
        }
    }
    
    /**
     * Sets (as xml) the "PubMedId" element
     */
    public void xsetPubMedId(org.apache.xmlbeans.XmlInteger pubMedId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PUBMEDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PUBMEDID$0);
            }
            target.set(pubMedId);
        }
    }
}
