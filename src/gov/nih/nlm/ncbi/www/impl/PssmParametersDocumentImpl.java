/*
 * An XML document type.
 * Localname: PssmParameters
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PssmParametersDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PssmParameters(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PssmParametersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmParametersDocument
{
    
    public PssmParametersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML PssmParameters(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PssmParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters
    {
        
        public PssmParametersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PSEUDOCOUNT$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pseudocount");
        private static final javax.xml.namespace.QName RPSDBPARAMS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "rpsdbparams");
        private static final javax.xml.namespace.QName CONSTRAINTS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "constraints");
        
        
        /**
         * Gets the "pseudocount" element
         */
        public java.math.BigInteger getPseudocount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSEUDOCOUNT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "pseudocount" element
         */
        public org.apache.xmlbeans.XmlInteger xgetPseudocount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PSEUDOCOUNT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "pseudocount" element
         */
        public boolean isSetPseudocount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PSEUDOCOUNT$0) != 0;
            }
        }
        
        /**
         * Sets the "pseudocount" element
         */
        public void setPseudocount(java.math.BigInteger pseudocount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSEUDOCOUNT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PSEUDOCOUNT$0);
                }
                target.setBigIntegerValue(pseudocount);
            }
        }
        
        /**
         * Sets (as xml) the "pseudocount" element
         */
        public void xsetPseudocount(org.apache.xmlbeans.XmlInteger pseudocount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PSEUDOCOUNT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PSEUDOCOUNT$0);
                }
                target.set(pseudocount);
            }
        }
        
        /**
         * Unsets the "pseudocount" element
         */
        public void unsetPseudocount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PSEUDOCOUNT$0, 0);
            }
        }
        
        /**
         * Gets the "rpsdbparams" element
         */
        public gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams getRpsdbparams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams target = null;
                target = (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams)get_store().find_element_user(RPSDBPARAMS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "rpsdbparams" element
         */
        public boolean isSetRpsdbparams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RPSDBPARAMS$2) != 0;
            }
        }
        
        /**
         * Sets the "rpsdbparams" element
         */
        public void setRpsdbparams(gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams rpsdbparams)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams target = null;
                target = (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams)get_store().find_element_user(RPSDBPARAMS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams)get_store().add_element_user(RPSDBPARAMS$2);
                }
                target.set(rpsdbparams);
            }
        }
        
        /**
         * Appends and returns a new empty "rpsdbparams" element
         */
        public gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams addNewRpsdbparams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams target = null;
                target = (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams)get_store().add_element_user(RPSDBPARAMS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "rpsdbparams" element
         */
        public void unsetRpsdbparams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RPSDBPARAMS$2, 0);
            }
        }
        
        /**
         * Gets the "constraints" element
         */
        public gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints getConstraints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints target = null;
                target = (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints)get_store().find_element_user(CONSTRAINTS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "constraints" element
         */
        public boolean isSetConstraints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONSTRAINTS$4) != 0;
            }
        }
        
        /**
         * Sets the "constraints" element
         */
        public void setConstraints(gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints constraints)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints target = null;
                target = (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints)get_store().find_element_user(CONSTRAINTS$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints)get_store().add_element_user(CONSTRAINTS$4);
                }
                target.set(constraints);
            }
        }
        
        /**
         * Appends and returns a new empty "constraints" element
         */
        public gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints addNewConstraints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints target = null;
                target = (gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints)get_store().add_element_user(CONSTRAINTS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "constraints" element
         */
        public void unsetConstraints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONSTRAINTS$4, 0);
            }
        }
        /**
         * An XML rpsdbparams(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RpsdbparamsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Rpsdbparams
        {
            
            public RpsdbparamsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FORMATRPSDBPARAMETERS$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "FormatRpsDbParameters");
            
            
            /**
             * Gets the "FormatRpsDbParameters" element
             */
            public gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters getFormatRpsDbParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters target = null;
                    target = (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters)get_store().find_element_user(FORMATRPSDBPARAMETERS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "FormatRpsDbParameters" element
             */
            public void setFormatRpsDbParameters(gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters formatRpsDbParameters)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters target = null;
                    target = (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters)get_store().find_element_user(FORMATRPSDBPARAMETERS$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters)get_store().add_element_user(FORMATRPSDBPARAMETERS$0);
                    }
                    target.set(formatRpsDbParameters);
                }
            }
            
            /**
             * Appends and returns a new empty "FormatRpsDbParameters" element
             */
            public gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters addNewFormatRpsDbParameters()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters target = null;
                    target = (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters)get_store().add_element_user(FORMATRPSDBPARAMETERS$0);
                    return target;
                }
            }
        }
        /**
         * An XML constraints(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ConstraintsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmParametersDocument.PssmParameters.Constraints
        {
            
            public ConstraintsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName COREDEF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "CoreDef");
            
            
            /**
             * Gets the "CoreDef" element
             */
            public gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef getCoreDef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef target = null;
                    target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef)get_store().find_element_user(COREDEF$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "CoreDef" element
             */
            public void setCoreDef(gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef coreDef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef target = null;
                    target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef)get_store().find_element_user(COREDEF$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef)get_store().add_element_user(COREDEF$0);
                    }
                    target.set(coreDef);
                }
            }
            
            /**
             * Appends and returns a new empty "CoreDef" element
             */
            public gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef addNewCoreDef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef target = null;
                    target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef)get_store().add_element_user(COREDEF$0);
                    return target;
                }
            }
        }
    }
}
