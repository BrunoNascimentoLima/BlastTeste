/*
 * An XML document type.
 * Localname: PCRReaction
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PCRReactionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PCRReaction(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PCRReactionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PCRReactionDocument
{
    
    public PCRReactionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PCRREACTION$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PCRReaction");
    
    
    /**
     * Gets the "PCRReaction" element
     */
    public gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction getPCRReaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction target = null;
            target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction)get_store().find_element_user(PCRREACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PCRReaction" element
     */
    public void setPCRReaction(gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction pcrReaction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction target = null;
            target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction)get_store().find_element_user(PCRREACTION$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction)get_store().add_element_user(PCRREACTION$0);
            }
            target.set(pcrReaction);
        }
    }
    
    /**
     * Appends and returns a new empty "PCRReaction" element
     */
    public gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction addNewPCRReaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction target = null;
            target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction)get_store().add_element_user(PCRREACTION$0);
            return target;
        }
    }
    /**
     * An XML PCRReaction(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PCRReactionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction
    {
        
        public PCRReactionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FORWARD$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "forward");
        private static final javax.xml.namespace.QName REVERSE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "reverse");
        
        
        /**
         * Gets the "forward" element
         */
        public gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward getForward()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward target = null;
                target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward)get_store().find_element_user(FORWARD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "forward" element
         */
        public boolean isSetForward()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FORWARD$0) != 0;
            }
        }
        
        /**
         * Sets the "forward" element
         */
        public void setForward(gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward forward)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward target = null;
                target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward)get_store().find_element_user(FORWARD$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward)get_store().add_element_user(FORWARD$0);
                }
                target.set(forward);
            }
        }
        
        /**
         * Appends and returns a new empty "forward" element
         */
        public gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward addNewForward()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward target = null;
                target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward)get_store().add_element_user(FORWARD$0);
                return target;
            }
        }
        
        /**
         * Unsets the "forward" element
         */
        public void unsetForward()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FORWARD$0, 0);
            }
        }
        
        /**
         * Gets the "reverse" element
         */
        public gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse getReverse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse target = null;
                target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse)get_store().find_element_user(REVERSE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "reverse" element
         */
        public boolean isSetReverse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REVERSE$2) != 0;
            }
        }
        
        /**
         * Sets the "reverse" element
         */
        public void setReverse(gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse reverse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse target = null;
                target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse)get_store().find_element_user(REVERSE$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse)get_store().add_element_user(REVERSE$2);
                }
                target.set(reverse);
            }
        }
        
        /**
         * Appends and returns a new empty "reverse" element
         */
        public gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse addNewReverse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse target = null;
                target = (gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse)get_store().add_element_user(REVERSE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "reverse" element
         */
        public void unsetReverse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REVERSE$2, 0);
            }
        }
        /**
         * An XML forward(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ForwardImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Forward
        {
            
            public ForwardImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PCRPRIMERSET$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PCRPrimerSet");
            
            
            /**
             * Gets the "PCRPrimerSet" element
             */
            public gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet getPCRPrimerSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet)get_store().find_element_user(PCRPRIMERSET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PCRPrimerSet" element
             */
            public void setPCRPrimerSet(gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet pcrPrimerSet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet)get_store().find_element_user(PCRPRIMERSET$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet)get_store().add_element_user(PCRPRIMERSET$0);
                    }
                    target.set(pcrPrimerSet);
                }
            }
            
            /**
             * Appends and returns a new empty "PCRPrimerSet" element
             */
            public gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet addNewPCRPrimerSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet)get_store().add_element_user(PCRPRIMERSET$0);
                    return target;
                }
            }
        }
        /**
         * An XML reverse(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ReverseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PCRReactionDocument.PCRReaction.Reverse
        {
            
            public ReverseImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PCRPRIMERSET$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PCRPrimerSet");
            
            
            /**
             * Gets the "PCRPrimerSet" element
             */
            public gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet getPCRPrimerSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet)get_store().find_element_user(PCRPRIMERSET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PCRPrimerSet" element
             */
            public void setPCRPrimerSet(gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet pcrPrimerSet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet)get_store().find_element_user(PCRPRIMERSET$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet)get_store().add_element_user(PCRPRIMERSET$0);
                    }
                    target.set(pcrPrimerSet);
                }
            }
            
            /**
             * Appends and returns a new empty "PCRPrimerSet" element
             */
            public gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet addNewPCRPrimerSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PCRPrimerSetDocument.PCRPrimerSet)get_store().add_element_user(PCRPRIMERSET$0);
                    return target;
                }
            }
        }
    }
}
