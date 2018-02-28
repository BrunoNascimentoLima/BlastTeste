/*
 * An XML document type.
 * Localname: Blast4-matrix-id
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-matrix-id(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4MatrixIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument
{
    
    public Blast4MatrixIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4MATRIXID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-matrix-id");
    
    
    /**
     * Gets the "Blast4-matrix-id" element
     */
    public gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId getBlast4MatrixId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId)get_store().find_element_user(BLAST4MATRIXID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-matrix-id" element
     */
    public void setBlast4MatrixId(gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId blast4MatrixId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId)get_store().find_element_user(BLAST4MATRIXID$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId)get_store().add_element_user(BLAST4MATRIXID$0);
            }
            target.set(blast4MatrixId);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-matrix-id" element
     */
    public gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId addNewBlast4MatrixId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId)get_store().add_element_user(BLAST4MATRIXID$0);
            return target;
        }
    }
    /**
     * An XML Blast4-matrix-id(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4MatrixIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId
    {
        
        public Blast4MatrixIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESIDUETYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "residue-type");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        
        
        /**
         * Gets the "residue-type" element
         */
        public gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId.ResidueType getResidueType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId.ResidueType target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId.ResidueType)get_store().find_element_user(RESIDUETYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "residue-type" element
         */
        public void setResidueType(gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId.ResidueType residueType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId.ResidueType target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId.ResidueType)get_store().find_element_user(RESIDUETYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId.ResidueType)get_store().add_element_user(RESIDUETYPE$0);
                }
                target.set(residueType);
            }
        }
        
        /**
         * Appends and returns a new empty "residue-type" element
         */
        public gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId.ResidueType addNewResidueType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId.ResidueType target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId.ResidueType)get_store().add_element_user(RESIDUETYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
                }
                target.set(name);
            }
        }
        /**
         * An XML residue-type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ResidueTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4MatrixIdDocument.Blast4MatrixId.ResidueType
        {
            
            public ResidueTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
