/*
 * An XML document type.
 * Localname: Blast4-program-info
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-program-info(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4ProgramInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument
{
    
    public Blast4ProgramInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4PROGRAMINFO$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-program-info");
    
    
    /**
     * Gets the "Blast4-program-info" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo getBlast4ProgramInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo)get_store().find_element_user(BLAST4PROGRAMINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-program-info" element
     */
    public void setBlast4ProgramInfo(gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo blast4ProgramInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo)get_store().find_element_user(BLAST4PROGRAMINFO$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo)get_store().add_element_user(BLAST4PROGRAMINFO$0);
            }
            target.set(blast4ProgramInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-program-info" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo addNewBlast4ProgramInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo)get_store().add_element_user(BLAST4PROGRAMINFO$0);
            return target;
        }
    }
    /**
     * An XML Blast4-program-info(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4ProgramInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ProgramInfoDocument.Blast4ProgramInfo
    {
        
        public Blast4ProgramInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROGRAM$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "program");
        private static final javax.xml.namespace.QName SERVICES$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "services");
        
        
        /**
         * Gets the "program" element
         */
        public java.lang.String getProgram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRAM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "program" element
         */
        public org.apache.xmlbeans.XmlString xgetProgram()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROGRAM$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "program" element
         */
        public void setProgram(java.lang.String program)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRAM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROGRAM$0);
                }
                target.setStringValue(program);
            }
        }
        
        /**
         * Sets (as xml) the "program" element
         */
        public void xsetProgram(org.apache.xmlbeans.XmlString program)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROGRAM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROGRAM$0);
                }
                target.set(program);
            }
        }
        
        /**
         * Gets array of all "services" elements
         */
        public java.lang.String[] getServicesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SERVICES$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "services" element
         */
        public java.lang.String getServicesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "services" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetServicesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SERVICES$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "services" element
         */
        public org.apache.xmlbeans.XmlString xgetServicesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "services" element
         */
        public int sizeOfServicesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICES$2);
            }
        }
        
        /**
         * Sets array of all "services" element
         */
        public void setServicesArray(java.lang.String[] servicesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(servicesArray, SERVICES$2);
            }
        }
        
        /**
         * Sets ith "services" element
         */
        public void setServicesArray(int i, java.lang.String services)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(services);
            }
        }
        
        /**
         * Sets (as xml) array of all "services" element
         */
        public void xsetServicesArray(org.apache.xmlbeans.XmlString[]servicesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(servicesArray, SERVICES$2);
            }
        }
        
        /**
         * Sets (as xml) ith "services" element
         */
        public void xsetServicesArray(int i, org.apache.xmlbeans.XmlString services)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(services);
            }
        }
        
        /**
         * Inserts the value as the ith "services" element
         */
        public void insertServices(int i, java.lang.String services)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SERVICES$2, i);
                target.setStringValue(services);
            }
        }
        
        /**
         * Appends the value as the last "services" element
         */
        public void addServices(java.lang.String services)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICES$2);
                target.setStringValue(services);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "services" element
         */
        public org.apache.xmlbeans.XmlString insertNewServices(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SERVICES$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "services" element
         */
        public org.apache.xmlbeans.XmlString addNewServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICES$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "services" element
         */
        public void removeServices(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICES$2, i);
            }
        }
    }
}
