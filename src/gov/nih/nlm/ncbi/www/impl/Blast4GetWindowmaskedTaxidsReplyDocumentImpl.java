/*
 * An XML document type.
 * Localname: Blast4-get-windowmasked-taxids-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetWindowmaskedTaxidsReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-windowmasked-taxids-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetWindowmaskedTaxidsReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetWindowmaskedTaxidsReplyDocument
{
    
    public Blast4GetWindowmaskedTaxidsReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETWINDOWMASKEDTAXIDSREPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-windowmasked-taxids-reply");
    
    
    /**
     * Gets the "Blast4-get-windowmasked-taxids-reply" element
     */
    public java.math.BigInteger getBlast4GetWindowmaskedTaxidsReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLAST4GETWINDOWMASKEDTAXIDSREPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Blast4-get-windowmasked-taxids-reply" element
     */
    public org.apache.xmlbeans.XmlInteger xgetBlast4GetWindowmaskedTaxidsReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BLAST4GETWINDOWMASKEDTAXIDSREPLY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-windowmasked-taxids-reply" element
     */
    public void setBlast4GetWindowmaskedTaxidsReply(java.math.BigInteger blast4GetWindowmaskedTaxidsReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLAST4GETWINDOWMASKEDTAXIDSREPLY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLAST4GETWINDOWMASKEDTAXIDSREPLY$0);
            }
            target.setBigIntegerValue(blast4GetWindowmaskedTaxidsReply);
        }
    }
    
    /**
     * Sets (as xml) the "Blast4-get-windowmasked-taxids-reply" element
     */
    public void xsetBlast4GetWindowmaskedTaxidsReply(org.apache.xmlbeans.XmlInteger blast4GetWindowmaskedTaxidsReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BLAST4GETWINDOWMASKEDTAXIDSREPLY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BLAST4GETWINDOWMASKEDTAXIDSREPLY$0);
            }
            target.set(blast4GetWindowmaskedTaxidsReply);
        }
    }
}
