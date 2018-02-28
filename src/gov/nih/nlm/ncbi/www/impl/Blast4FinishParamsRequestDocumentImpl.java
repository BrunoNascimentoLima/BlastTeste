/*
 * An XML document type.
 * Localname: Blast4-finish-params-request
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-finish-params-request(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4FinishParamsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument
{
    
    public Blast4FinishParamsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4FINISHPARAMSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-finish-params-request");
    
    
    /**
     * Gets the "Blast4-finish-params-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest getBlast4FinishParamsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest)get_store().find_element_user(BLAST4FINISHPARAMSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-finish-params-request" element
     */
    public void setBlast4FinishParamsRequest(gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest blast4FinishParamsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest)get_store().find_element_user(BLAST4FINISHPARAMSREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest)get_store().add_element_user(BLAST4FINISHPARAMSREQUEST$0);
            }
            target.set(blast4FinishParamsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-finish-params-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest addNewBlast4FinishParamsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest)get_store().add_element_user(BLAST4FINISHPARAMSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML Blast4-finish-params-request(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4FinishParamsRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest
    {
        
        public Blast4FinishParamsRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROGRAM$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "program");
        private static final javax.xml.namespace.QName SERVICE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "service");
        private static final javax.xml.namespace.QName PARAMSET$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "paramset");
        private static final javax.xml.namespace.QName PARAMS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "params");
        
        
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
         * Gets the "service" element
         */
        public java.lang.String getService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "service" element
         */
        public org.apache.xmlbeans.XmlString xgetService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "service" element
         */
        public void setService(java.lang.String service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICE$2);
                }
                target.setStringValue(service);
            }
        }
        
        /**
         * Sets (as xml) the "service" element
         */
        public void xsetService(org.apache.xmlbeans.XmlString service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICE$2);
                }
                target.set(service);
            }
        }
        
        /**
         * Gets the "paramset" element
         */
        public java.lang.String getParamset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMSET$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paramset" element
         */
        public org.apache.xmlbeans.XmlString xgetParamset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMSET$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "paramset" element
         */
        public boolean isSetParamset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARAMSET$4) != 0;
            }
        }
        
        /**
         * Sets the "paramset" element
         */
        public void setParamset(java.lang.String paramset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMSET$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMSET$4);
                }
                target.setStringValue(paramset);
            }
        }
        
        /**
         * Sets (as xml) the "paramset" element
         */
        public void xsetParamset(org.apache.xmlbeans.XmlString paramset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMSET$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMSET$4);
                }
                target.set(paramset);
            }
        }
        
        /**
         * Unsets the "paramset" element
         */
        public void unsetParamset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARAMSET$4, 0);
            }
        }
        
        /**
         * Gets the "params" element
         */
        public gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest.Params getParams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest.Params target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest.Params)get_store().find_element_user(PARAMS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "params" element
         */
        public boolean isSetParams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARAMS$6) != 0;
            }
        }
        
        /**
         * Sets the "params" element
         */
        public void setParams(gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest.Params params)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest.Params target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest.Params)get_store().find_element_user(PARAMS$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest.Params)get_store().add_element_user(PARAMS$6);
                }
                target.set(params);
            }
        }
        
        /**
         * Appends and returns a new empty "params" element
         */
        public gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest.Params addNewParams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest.Params target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest.Params)get_store().add_element_user(PARAMS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "params" element
         */
        public void unsetParams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARAMS$6, 0);
            }
        }
        /**
         * An XML params(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ParamsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest.Params
        {
            
            public ParamsImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
    }
}
