/*
 * An XML document type.
 * Localname: Blast4-task-info
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-task-info(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4TaskInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument
{
    
    public Blast4TaskInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4TASKINFO$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-task-info");
    
    
    /**
     * Gets the "Blast4-task-info" element
     */
    public gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo getBlast4TaskInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo)get_store().find_element_user(BLAST4TASKINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-task-info" element
     */
    public void setBlast4TaskInfo(gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo blast4TaskInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo)get_store().find_element_user(BLAST4TASKINFO$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo)get_store().add_element_user(BLAST4TASKINFO$0);
            }
            target.set(blast4TaskInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-task-info" element
     */
    public gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo addNewBlast4TaskInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo)get_store().add_element_user(BLAST4TASKINFO$0);
            return target;
        }
    }
    /**
     * An XML Blast4-task-info(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4TaskInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4TaskInfoDocument.Blast4TaskInfo
    {
        
        public Blast4TaskInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName DOCUMENTATION$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "documentation");
        
        
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
         * Gets the "documentation" element
         */
        public java.lang.String getDocumentation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTATION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "documentation" element
         */
        public org.apache.xmlbeans.XmlString xgetDocumentation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTATION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "documentation" element
         */
        public void setDocumentation(java.lang.String documentation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTATION$2);
                }
                target.setStringValue(documentation);
            }
        }
        
        /**
         * Sets (as xml) the "documentation" element
         */
        public void xsetDocumentation(org.apache.xmlbeans.XmlString documentation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTATION$2);
                }
                target.set(documentation);
            }
        }
    }
}
