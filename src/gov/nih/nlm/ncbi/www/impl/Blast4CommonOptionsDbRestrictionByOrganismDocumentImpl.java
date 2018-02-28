/*
 * An XML document type.
 * Localname: Blast4-common-options-db-restriction-by-organism
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-common-options-db-restriction-by-organism(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4CommonOptionsDbRestrictionByOrganismDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument
{
    
    public Blast4CommonOptionsDbRestrictionByOrganismDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4COMMONOPTIONSDBRESTRICTIONBYORGANISM$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-common-options-db-restriction-by-organism");
    
    
    /**
     * Gets the "Blast4-common-options-db-restriction-by-organism" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism getBlast4CommonOptionsDbRestrictionByOrganism()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism)get_store().find_element_user(BLAST4COMMONOPTIONSDBRESTRICTIONBYORGANISM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-common-options-db-restriction-by-organism" element
     */
    public void setBlast4CommonOptionsDbRestrictionByOrganism(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism blast4CommonOptionsDbRestrictionByOrganism)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism)get_store().find_element_user(BLAST4COMMONOPTIONSDBRESTRICTIONBYORGANISM$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism)get_store().add_element_user(BLAST4COMMONOPTIONSDBRESTRICTIONBYORGANISM$0);
            }
            target.set(blast4CommonOptionsDbRestrictionByOrganism);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-common-options-db-restriction-by-organism" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism addNewBlast4CommonOptionsDbRestrictionByOrganism()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism)get_store().add_element_user(BLAST4COMMONOPTIONSDBRESTRICTIONBYORGANISM$0);
            return target;
        }
    }
    /**
     * An XML Blast4-common-options-db-restriction-by-organism(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4CommonOptionsDbRestrictionByOrganismImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionByOrganismDocument.Blast4CommonOptionsDbRestrictionByOrganism
    {
        
        public Blast4CommonOptionsDbRestrictionByOrganismImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANISMRESTRICTION$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "organism-restriction");
        private static final javax.xml.namespace.QName TAXIDRESTRICTION$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "taxid-restriction");
        
        
        /**
         * Gets the "organism-restriction" element
         */
        public java.lang.String getOrganismRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISMRESTRICTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "organism-restriction" element
         */
        public org.apache.xmlbeans.XmlString xgetOrganismRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANISMRESTRICTION$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "organism-restriction" element
         */
        public boolean isSetOrganismRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISMRESTRICTION$0) != 0;
            }
        }
        
        /**
         * Sets the "organism-restriction" element
         */
        public void setOrganismRestriction(java.lang.String organismRestriction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISMRESTRICTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISMRESTRICTION$0);
                }
                target.setStringValue(organismRestriction);
            }
        }
        
        /**
         * Sets (as xml) the "organism-restriction" element
         */
        public void xsetOrganismRestriction(org.apache.xmlbeans.XmlString organismRestriction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANISMRESTRICTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANISMRESTRICTION$0);
                }
                target.set(organismRestriction);
            }
        }
        
        /**
         * Unsets the "organism-restriction" element
         */
        public void unsetOrganismRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISMRESTRICTION$0, 0);
            }
        }
        
        /**
         * Gets the "taxid-restriction" element
         */
        public java.math.BigInteger getTaxidRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXIDRESTRICTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "taxid-restriction" element
         */
        public org.apache.xmlbeans.XmlInteger xgetTaxidRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TAXIDRESTRICTION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "taxid-restriction" element
         */
        public boolean isSetTaxidRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TAXIDRESTRICTION$2) != 0;
            }
        }
        
        /**
         * Sets the "taxid-restriction" element
         */
        public void setTaxidRestriction(java.math.BigInteger taxidRestriction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXIDRESTRICTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXIDRESTRICTION$2);
                }
                target.setBigIntegerValue(taxidRestriction);
            }
        }
        
        /**
         * Sets (as xml) the "taxid-restriction" element
         */
        public void xsetTaxidRestriction(org.apache.xmlbeans.XmlInteger taxidRestriction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TAXIDRESTRICTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TAXIDRESTRICTION$2);
                }
                target.set(taxidRestriction);
            }
        }
        
        /**
         * Unsets the "taxid-restriction" element
         */
        public void unsetTaxidRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TAXIDRESTRICTION$2, 0);
            }
        }
    }
}
