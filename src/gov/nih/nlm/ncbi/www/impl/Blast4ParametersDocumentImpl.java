/*
 * An XML document type.
 * Localname: Blast4-parameters
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ParametersDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-parameters(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4ParametersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ParametersDocument
{
    
    public Blast4ParametersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4PARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-parameters");
    
    
    /**
     * Gets the "Blast4-parameters" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters getBlast4Parameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().find_element_user(BLAST4PARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-parameters" element
     */
    public void setBlast4Parameters(gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters blast4Parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().find_element_user(BLAST4PARAMETERS$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().add_element_user(BLAST4PARAMETERS$0);
            }
            target.set(blast4Parameters);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-parameters" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters addNewBlast4Parameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters)get_store().add_element_user(BLAST4PARAMETERS$0);
            return target;
        }
    }
    /**
     * An XML Blast4-parameters(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4ParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ParametersDocument.Blast4Parameters
    {
        
        public Blast4ParametersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BLAST4PARAMETER$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-parameter");
        
        
        /**
         * Gets array of all "Blast4-parameter" elements
         */
        public gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter[] getBlast4ParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BLAST4PARAMETER$0, targetList);
                gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter[] result = new gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Blast4-parameter" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter getBlast4ParameterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter)get_store().find_element_user(BLAST4PARAMETER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Blast4-parameter" element
         */
        public int sizeOfBlast4ParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BLAST4PARAMETER$0);
            }
        }
        
        /**
         * Sets array of all "Blast4-parameter" element
         */
        public void setBlast4ParameterArray(gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter[] blast4ParameterArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(blast4ParameterArray, BLAST4PARAMETER$0);
            }
        }
        
        /**
         * Sets ith "Blast4-parameter" element
         */
        public void setBlast4ParameterArray(int i, gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter blast4Parameter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter)get_store().find_element_user(BLAST4PARAMETER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(blast4Parameter);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Blast4-parameter" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter insertNewBlast4Parameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter)get_store().insert_element_user(BLAST4PARAMETER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Blast4-parameter" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter addNewBlast4Parameter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter)get_store().add_element_user(BLAST4PARAMETER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Blast4-parameter" element
         */
        public void removeBlast4Parameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BLAST4PARAMETER$0, i);
            }
        }
    }
}
