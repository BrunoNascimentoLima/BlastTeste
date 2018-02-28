/*
 * An XML document type.
 * Localname: Blast4-common-options-db-restriction
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-common-options-db-restriction(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4CommonOptionsDbRestrictionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument
{
    
    public Blast4CommonOptionsDbRestrictionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4COMMONOPTIONSDBRESTRICTION$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-common-options-db-restriction");
    
    
    /**
     * Gets the "Blast4-common-options-db-restriction" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction getBlast4CommonOptionsDbRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction)get_store().find_element_user(BLAST4COMMONOPTIONSDBRESTRICTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-common-options-db-restriction" element
     */
    public void setBlast4CommonOptionsDbRestriction(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction blast4CommonOptionsDbRestriction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction)get_store().find_element_user(BLAST4COMMONOPTIONSDBRESTRICTION$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction)get_store().add_element_user(BLAST4COMMONOPTIONSDBRESTRICTION$0);
            }
            target.set(blast4CommonOptionsDbRestriction);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-common-options-db-restriction" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction addNewBlast4CommonOptionsDbRestriction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction)get_store().add_element_user(BLAST4COMMONOPTIONSDBRESTRICTION$0);
            return target;
        }
    }
    /**
     * An XML Blast4-common-options-db-restriction(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4CommonOptionsDbRestrictionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction
    {
        
        public Blast4CommonOptionsDbRestrictionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTREZQUERY$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "entrez-query");
        private static final javax.xml.namespace.QName ORGANISM$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "organism");
        
        
        /**
         * Gets the "entrez-query" element
         */
        public java.lang.String getEntrezQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTREZQUERY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entrez-query" element
         */
        public org.apache.xmlbeans.XmlString xgetEntrezQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTREZQUERY$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "entrez-query" element
         */
        public boolean isSetEntrezQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTREZQUERY$0) != 0;
            }
        }
        
        /**
         * Sets the "entrez-query" element
         */
        public void setEntrezQuery(java.lang.String entrezQuery)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTREZQUERY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTREZQUERY$0);
                }
                target.setStringValue(entrezQuery);
            }
        }
        
        /**
         * Sets (as xml) the "entrez-query" element
         */
        public void xsetEntrezQuery(org.apache.xmlbeans.XmlString entrezQuery)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTREZQUERY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTREZQUERY$0);
                }
                target.set(entrezQuery);
            }
        }
        
        /**
         * Unsets the "entrez-query" element
         */
        public void unsetEntrezQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTREZQUERY$0, 0);
            }
        }
        
        /**
         * Gets the "organism" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism getOrganism()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism)get_store().find_element_user(ORGANISM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "organism" element
         */
        public boolean isSetOrganism()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISM$2) != 0;
            }
        }
        
        /**
         * Sets the "organism" element
         */
        public void setOrganism(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism organism)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism)get_store().find_element_user(ORGANISM$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism)get_store().add_element_user(ORGANISM$2);
                }
                target.set(organism);
            }
        }
        
        /**
         * Appends and returns a new empty "organism" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism addNewOrganism()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism)get_store().add_element_user(ORGANISM$2);
                return target;
            }
        }
        
        /**
         * Unsets the "organism" element
         */
        public void unsetOrganism()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISM$2, 0);
            }
        }
        /**
         * An XML organism(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class OrganismImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsDbRestrictionDocument.Blast4CommonOptionsDbRestriction.Organism
        {
            
            public OrganismImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
    }
}
