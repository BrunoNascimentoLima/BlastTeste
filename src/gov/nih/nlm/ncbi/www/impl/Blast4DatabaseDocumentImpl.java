/*
 * An XML document type.
 * Localname: Blast4-database
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4DatabaseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-database(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4DatabaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4DatabaseDocument
{
    
    public Blast4DatabaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4DATABASE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-database");
    
    
    /**
     * Gets the "Blast4-database" element
     */
    public gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database getBlast4Database()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database)get_store().find_element_user(BLAST4DATABASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-database" element
     */
    public void setBlast4Database(gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database blast4Database)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database)get_store().find_element_user(BLAST4DATABASE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database)get_store().add_element_user(BLAST4DATABASE$0);
            }
            target.set(blast4Database);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-database" element
     */
    public gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database addNewBlast4Database()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database)get_store().add_element_user(BLAST4DATABASE$0);
            return target;
        }
    }
    /**
     * An XML Blast4-database(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4DatabaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database
    {
        
        public Blast4DatabaseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database.Type target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database.Type)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database.Type target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database.Type)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database.Type)get_store().add_element_user(TYPE$2);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database.Type target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database.Type)get_store().add_element_user(TYPE$2);
                return target;
            }
        }
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database.Type
        {
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4RESIDUETYPE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-residue-type");
            
            
            /**
             * Gets the "Blast4-residue-type" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType getBlast4ResidueType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType)get_store().find_element_user(BLAST4RESIDUETYPE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-residue-type" element
             */
            public void setBlast4ResidueType(gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType blast4ResidueType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType)get_store().find_element_user(BLAST4RESIDUETYPE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType)get_store().add_element_user(BLAST4RESIDUETYPE$0);
                    }
                    target.set(blast4ResidueType);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-residue-type" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType addNewBlast4ResidueType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ResidueTypeDocument.Blast4ResidueType)get_store().add_element_user(BLAST4RESIDUETYPE$0);
                    return target;
                }
            }
        }
    }
}
