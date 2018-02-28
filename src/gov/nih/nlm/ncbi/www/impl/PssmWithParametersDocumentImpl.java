/*
 * An XML document type.
 * Localname: PssmWithParameters
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PssmWithParametersDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PssmWithParameters(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PssmWithParametersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmWithParametersDocument
{
    
    public PssmWithParametersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PSSMWITHPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PssmWithParameters");
    
    
    /**
     * Gets the "PssmWithParameters" element
     */
    public gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters getPssmWithParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters target = null;
            target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters)get_store().find_element_user(PSSMWITHPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PssmWithParameters" element
     */
    public void setPssmWithParameters(gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters pssmWithParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters target = null;
            target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters)get_store().find_element_user(PSSMWITHPARAMETERS$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters)get_store().add_element_user(PSSMWITHPARAMETERS$0);
            }
            target.set(pssmWithParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "PssmWithParameters" element
     */
    public gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters addNewPssmWithParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters target = null;
            target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters)get_store().add_element_user(PSSMWITHPARAMETERS$0);
            return target;
        }
    }
    /**
     * An XML PssmWithParameters(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PssmWithParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters
    {
        
        public PssmWithParametersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PSSM$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pssm");
        private static final javax.xml.namespace.QName PARAMS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "params");
        
        
        /**
         * Gets the "pssm" element
         */
        public gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Pssm getPssm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Pssm target = null;
                target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Pssm)get_store().find_element_user(PSSM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "pssm" element
         */
        public void setPssm(gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Pssm pssm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Pssm target = null;
                target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Pssm)get_store().find_element_user(PSSM$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Pssm)get_store().add_element_user(PSSM$0);
                }
                target.set(pssm);
            }
        }
        
        /**
         * Appends and returns a new empty "pssm" element
         */
        public gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Pssm addNewPssm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Pssm target = null;
                target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Pssm)get_store().add_element_user(PSSM$0);
                return target;
            }
        }
        
        /**
         * Gets the "params" element
         */
        public gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Params getParams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Params target = null;
                target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Params)get_store().find_element_user(PARAMS$2, 0);
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
                return get_store().count_elements(PARAMS$2) != 0;
            }
        }
        
        /**
         * Sets the "params" element
         */
        public void setParams(gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Params params)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Params target = null;
                target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Params)get_store().find_element_user(PARAMS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Params)get_store().add_element_user(PARAMS$2);
                }
                target.set(params);
            }
        }
        
        /**
         * Appends and returns a new empty "params" element
         */
        public gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Params addNewParams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Params target = null;
                target = (gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Params)get_store().add_element_user(PARAMS$2);
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
                get_store().remove_element(PARAMS$2, 0);
            }
        }
        /**
         * An XML pssm(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PssmImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Pssm
        {
            
            public PssmImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PSSM$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Pssm");
            
            
            /**
             * Gets the "Pssm" element
             */
            public gov.nih.nlm.ncbi.www.PssmDocument.Pssm getPssm()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmDocument.Pssm target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm)get_store().find_element_user(PSSM$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Pssm" element
             */
            public void setPssm(gov.nih.nlm.ncbi.www.PssmDocument.Pssm pssm)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmDocument.Pssm target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm)get_store().find_element_user(PSSM$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm)get_store().add_element_user(PSSM$0);
                    }
                    target.set(pssm);
                }
            }
            
            /**
             * Appends and returns a new empty "Pssm" element
             */
            public gov.nih.nlm.ncbi.www.PssmDocument.Pssm addNewPssm()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmDocument.Pssm target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm)get_store().add_element_user(PSSM$0);
                    return target;
                }
            }
        }
        /**
         * An XML params(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ParamsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters.Params
        {
            
            public ParamsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PSSMPARAMETERS$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PssmParameters");
            
            
            /**
             * Gets the "PssmParameters" element
             */
            public gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters getPssmParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters)get_store().find_element_user(PSSMPARAMETERS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PssmParameters" element
             */
            public void setPssmParameters(gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters pssmParameters)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters)get_store().find_element_user(PSSMPARAMETERS$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters)get_store().add_element_user(PSSMPARAMETERS$0);
                    }
                    target.set(pssmParameters);
                }
            }
            
            /**
             * Appends and returns a new empty "PssmParameters" element
             */
            public gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters addNewPssmParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters)get_store().add_element_user(PSSMPARAMETERS$0);
                    return target;
                }
            }
        }
    }
}
