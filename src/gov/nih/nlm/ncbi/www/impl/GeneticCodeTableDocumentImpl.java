/*
 * An XML document type.
 * Localname: Genetic-code-table
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GeneticCodeTableDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Genetic-code-table(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class GeneticCodeTableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GeneticCodeTableDocument
{
    
    public GeneticCodeTableDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENETICCODETABLE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Genetic-code-table");
    
    
    /**
     * Gets the "Genetic-code-table" element
     */
    public gov.nih.nlm.ncbi.www.GeneticCodeTableDocument.GeneticCodeTable getGeneticCodeTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GeneticCodeTableDocument.GeneticCodeTable target = null;
            target = (gov.nih.nlm.ncbi.www.GeneticCodeTableDocument.GeneticCodeTable)get_store().find_element_user(GENETICCODETABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Genetic-code-table" element
     */
    public void setGeneticCodeTable(gov.nih.nlm.ncbi.www.GeneticCodeTableDocument.GeneticCodeTable geneticCodeTable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GeneticCodeTableDocument.GeneticCodeTable target = null;
            target = (gov.nih.nlm.ncbi.www.GeneticCodeTableDocument.GeneticCodeTable)get_store().find_element_user(GENETICCODETABLE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.GeneticCodeTableDocument.GeneticCodeTable)get_store().add_element_user(GENETICCODETABLE$0);
            }
            target.set(geneticCodeTable);
        }
    }
    
    /**
     * Appends and returns a new empty "Genetic-code-table" element
     */
    public gov.nih.nlm.ncbi.www.GeneticCodeTableDocument.GeneticCodeTable addNewGeneticCodeTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GeneticCodeTableDocument.GeneticCodeTable target = null;
            target = (gov.nih.nlm.ncbi.www.GeneticCodeTableDocument.GeneticCodeTable)get_store().add_element_user(GENETICCODETABLE$0);
            return target;
        }
    }
    /**
     * An XML Genetic-code-table(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class GeneticCodeTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GeneticCodeTableDocument.GeneticCodeTable
    {
        
        public GeneticCodeTableImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GENETICCODE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Genetic-code");
        
        
        /**
         * Gets array of all "Genetic-code" elements
         */
        public gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode[] getGeneticCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GENETICCODE$0, targetList);
                gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode[] result = new gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Genetic-code" element
         */
        public gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode getGeneticCodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode target = null;
                target = (gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode)get_store().find_element_user(GENETICCODE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Genetic-code" element
         */
        public int sizeOfGeneticCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENETICCODE$0);
            }
        }
        
        /**
         * Sets array of all "Genetic-code" element
         */
        public void setGeneticCodeArray(gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode[] geneticCodeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(geneticCodeArray, GENETICCODE$0);
            }
        }
        
        /**
         * Sets ith "Genetic-code" element
         */
        public void setGeneticCodeArray(int i, gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode geneticCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode target = null;
                target = (gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode)get_store().find_element_user(GENETICCODE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(geneticCode);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Genetic-code" element
         */
        public gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode insertNewGeneticCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode target = null;
                target = (gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode)get_store().insert_element_user(GENETICCODE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Genetic-code" element
         */
        public gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode addNewGeneticCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode target = null;
                target = (gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode)get_store().add_element_user(GENETICCODE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Genetic-code" element
         */
        public void removeGeneticCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENETICCODE$0, i);
            }
        }
    }
}
