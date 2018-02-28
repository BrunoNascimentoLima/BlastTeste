/*
 * An XML document type.
 * Localname: Program-id
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ProgramIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Program-id(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ProgramIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ProgramIdDocument
{
    
    public ProgramIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROGRAMID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Program-id");
    
    
    /**
     * Gets the "Program-id" element
     */
    public gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId getProgramId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId target = null;
            target = (gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId)get_store().find_element_user(PROGRAMID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Program-id" element
     */
    public void setProgramId(gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId programId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId target = null;
            target = (gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId)get_store().find_element_user(PROGRAMID$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId)get_store().add_element_user(PROGRAMID$0);
            }
            target.set(programId);
        }
    }
    
    /**
     * Appends and returns a new empty "Program-id" element
     */
    public gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId addNewProgramId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId target = null;
            target = (gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId)get_store().add_element_user(PROGRAMID$0);
            return target;
        }
    }
    /**
     * An XML Program-id(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ProgramIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ProgramIdDocument.ProgramId
    {
        
        public ProgramIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName VERSION$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "version");
        
        
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
         * Gets the "version" element
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" element
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "version" element
         */
        public boolean isSetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VERSION$2) != 0;
            }
        }
        
        /**
         * Sets the "version" element
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$2);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" element
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$2);
                }
                target.set(version);
            }
        }
        
        /**
         * Unsets the "version" element
         */
        public void unsetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VERSION$2, 0);
            }
        }
    }
}
