/*
 * An XML document type.
 * Localname: PCRPrimerSeq
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PCRPrimerSeqDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PCRPrimerSeq(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PCRPrimerSeqDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PCRPrimerSeqDocument
{
    
    public PCRPrimerSeqDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PCRPRIMERSEQ$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PCRPrimerSeq");
    
    
    /**
     * Gets the "PCRPrimerSeq" element
     */
    public java.lang.String getPCRPrimerSeq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCRPRIMERSEQ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PCRPrimerSeq" element
     */
    public org.apache.xmlbeans.XmlString xgetPCRPrimerSeq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PCRPRIMERSEQ$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PCRPrimerSeq" element
     */
    public void setPCRPrimerSeq(java.lang.String pcrPrimerSeq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCRPRIMERSEQ$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PCRPRIMERSEQ$0);
            }
            target.setStringValue(pcrPrimerSeq);
        }
    }
    
    /**
     * Sets (as xml) the "PCRPrimerSeq" element
     */
    public void xsetPCRPrimerSeq(org.apache.xmlbeans.XmlString pcrPrimerSeq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PCRPRIMERSEQ$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PCRPRIMERSEQ$0);
            }
            target.set(pcrPrimerSeq);
        }
    }
}
