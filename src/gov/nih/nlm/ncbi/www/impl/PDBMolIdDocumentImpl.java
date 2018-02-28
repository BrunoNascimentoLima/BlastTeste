/*
 * An XML document type.
 * Localname: PDB-mol-id
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PDBMolIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PDB-mol-id(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PDBMolIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PDBMolIdDocument
{
    
    public PDBMolIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PDBMOLID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PDB-mol-id");
    
    
    /**
     * Gets the "PDB-mol-id" element
     */
    public java.lang.String getPDBMolId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PDBMOLID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PDB-mol-id" element
     */
    public org.apache.xmlbeans.XmlString xgetPDBMolId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PDBMOLID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PDB-mol-id" element
     */
    public void setPDBMolId(java.lang.String pdbMolId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PDBMOLID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PDBMOLID$0);
            }
            target.setStringValue(pdbMolId);
        }
    }
    
    /**
     * Sets (as xml) the "PDB-mol-id" element
     */
    public void xsetPDBMolId(org.apache.xmlbeans.XmlString pdbMolId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PDBMOLID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PDBMOLID$0);
            }
            target.set(pdbMolId);
        }
    }
}
