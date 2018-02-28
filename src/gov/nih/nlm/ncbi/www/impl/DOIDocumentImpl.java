/*
 * An XML document type.
 * Localname: DOI
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.DOIDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one DOI(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class DOIDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DOIDocument
{
    
    public DOIDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOI$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "DOI");
    
    
    /**
     * Gets the "DOI" element
     */
    public java.lang.String getDOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DOI" element
     */
    public org.apache.xmlbeans.XmlString xgetDOI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DOI" element
     */
    public void setDOI(java.lang.String doi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOI$0);
            }
            target.setStringValue(doi);
        }
    }
    
    /**
     * Sets (as xml) the "DOI" element
     */
    public void xsetDOI(org.apache.xmlbeans.XmlString doi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOI$0);
            }
            target.set(doi);
        }
    }
}
