/*
 * An XML document type.
 * Localname: Blast4-parameter
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ParameterDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-parameter(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4ParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ParameterDocument
{
    
    public Blast4ParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4PARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-parameter");
    
    
    /**
     * Gets the "Blast4-parameter" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter getBlast4Parameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter)get_store().find_element_user(BLAST4PARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-parameter" element
     */
    public void setBlast4Parameter(gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter blast4Parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter)get_store().find_element_user(BLAST4PARAMETER$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter)get_store().add_element_user(BLAST4PARAMETER$0);
            }
            target.set(blast4Parameter);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-parameter" element
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
     * An XML Blast4-parameter(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4ParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter
    {
        
        public Blast4ParameterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "value");
        
        
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
         * Gets the "value" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter.Value getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter.Value)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "value" element
         */
        public void setValue(gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter.Value)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter.Value)get_store().add_element_user(VALUE$2);
                }
                target.set(value);
            }
        }
        
        /**
         * Appends and returns a new empty "value" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter.Value addNewValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter.Value target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter.Value)get_store().add_element_user(VALUE$2);
                return target;
            }
        }
        /**
         * An XML value(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ParameterDocument.Blast4Parameter.Value
        {
            
            public ValueImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4VALUE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-value");
            
            
            /**
             * Gets the "Blast4-value" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value getBlast4Value()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value)get_store().find_element_user(BLAST4VALUE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-value" element
             */
            public void setBlast4Value(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value blast4Value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value)get_store().find_element_user(BLAST4VALUE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value)get_store().add_element_user(BLAST4VALUE$0);
                    }
                    target.set(blast4Value);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-value" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value addNewBlast4Value()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value)get_store().add_element_user(BLAST4VALUE$0);
                    return target;
                }
            }
        }
    }
}
