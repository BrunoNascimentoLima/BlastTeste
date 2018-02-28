/*
 * An XML document type.
 * Localname: Blast4-common-options-query-filtering
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-common-options-query-filtering(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4CommonOptionsQueryFilteringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument
{
    
    public Blast4CommonOptionsQueryFilteringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4COMMONOPTIONSQUERYFILTERING$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-common-options-query-filtering");
    
    
    /**
     * Gets the "Blast4-common-options-query-filtering" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering getBlast4CommonOptionsQueryFiltering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering)get_store().find_element_user(BLAST4COMMONOPTIONSQUERYFILTERING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-common-options-query-filtering" element
     */
    public void setBlast4CommonOptionsQueryFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering blast4CommonOptionsQueryFiltering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering)get_store().find_element_user(BLAST4COMMONOPTIONSQUERYFILTERING$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering)get_store().add_element_user(BLAST4COMMONOPTIONSQUERYFILTERING$0);
            }
            target.set(blast4CommonOptionsQueryFiltering);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-common-options-query-filtering" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering addNewBlast4CommonOptionsQueryFiltering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering)get_store().add_element_user(BLAST4COMMONOPTIONSQUERYFILTERING$0);
            return target;
        }
    }
    /**
     * An XML Blast4-common-options-query-filtering(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4CommonOptionsQueryFilteringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering
    {
        
        public Blast4CommonOptionsQueryFilteringImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USESEGFILTERING$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "use-seg-filtering");
        private static final javax.xml.namespace.QName USEDUSTFILTERING$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "use-dust-filtering");
        private static final javax.xml.namespace.QName MASKFORLOOKUPTABLEONLY$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mask-for-lookup-table-only");
        private static final javax.xml.namespace.QName REPEATSFILTERING$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "repeats-filtering");
        private static final javax.xml.namespace.QName USERSPECIFIEDMASKS$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "user-specified-masks");
        private static final javax.xml.namespace.QName NOFILTERING$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "no-filtering");
        
        
        /**
         * Gets the "use-seg-filtering" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering getUseSegFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering)get_store().find_element_user(USESEGFILTERING$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "use-seg-filtering" element
         */
        public boolean isSetUseSegFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USESEGFILTERING$0) != 0;
            }
        }
        
        /**
         * Sets the "use-seg-filtering" element
         */
        public void setUseSegFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering useSegFiltering)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering)get_store().find_element_user(USESEGFILTERING$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering)get_store().add_element_user(USESEGFILTERING$0);
                }
                target.set(useSegFiltering);
            }
        }
        
        /**
         * Appends and returns a new empty "use-seg-filtering" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering addNewUseSegFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering)get_store().add_element_user(USESEGFILTERING$0);
                return target;
            }
        }
        
        /**
         * Unsets the "use-seg-filtering" element
         */
        public void unsetUseSegFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USESEGFILTERING$0, 0);
            }
        }
        
        /**
         * Gets the "use-dust-filtering" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering getUseDustFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering)get_store().find_element_user(USEDUSTFILTERING$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "use-dust-filtering" element
         */
        public boolean isSetUseDustFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USEDUSTFILTERING$2) != 0;
            }
        }
        
        /**
         * Sets the "use-dust-filtering" element
         */
        public void setUseDustFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering useDustFiltering)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering)get_store().find_element_user(USEDUSTFILTERING$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering)get_store().add_element_user(USEDUSTFILTERING$2);
                }
                target.set(useDustFiltering);
            }
        }
        
        /**
         * Appends and returns a new empty "use-dust-filtering" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering addNewUseDustFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering)get_store().add_element_user(USEDUSTFILTERING$2);
                return target;
            }
        }
        
        /**
         * Unsets the "use-dust-filtering" element
         */
        public void unsetUseDustFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USEDUSTFILTERING$2, 0);
            }
        }
        
        /**
         * Gets the "mask-for-lookup-table-only" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly getMaskForLookupTableOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly)get_store().find_element_user(MASKFORLOOKUPTABLEONLY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "mask-for-lookup-table-only" element
         */
        public boolean isSetMaskForLookupTableOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MASKFORLOOKUPTABLEONLY$4) != 0;
            }
        }
        
        /**
         * Sets the "mask-for-lookup-table-only" element
         */
        public void setMaskForLookupTableOnly(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly maskForLookupTableOnly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly)get_store().find_element_user(MASKFORLOOKUPTABLEONLY$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly)get_store().add_element_user(MASKFORLOOKUPTABLEONLY$4);
                }
                target.set(maskForLookupTableOnly);
            }
        }
        
        /**
         * Appends and returns a new empty "mask-for-lookup-table-only" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly addNewMaskForLookupTableOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly)get_store().add_element_user(MASKFORLOOKUPTABLEONLY$4);
                return target;
            }
        }
        
        /**
         * Unsets the "mask-for-lookup-table-only" element
         */
        public void unsetMaskForLookupTableOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MASKFORLOOKUPTABLEONLY$4, 0);
            }
        }
        
        /**
         * Gets the "repeats-filtering" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering getRepeatsFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering)get_store().find_element_user(REPEATSFILTERING$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "repeats-filtering" element
         */
        public boolean isSetRepeatsFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPEATSFILTERING$6) != 0;
            }
        }
        
        /**
         * Sets the "repeats-filtering" element
         */
        public void setRepeatsFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering repeatsFiltering)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering)get_store().find_element_user(REPEATSFILTERING$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering)get_store().add_element_user(REPEATSFILTERING$6);
                }
                target.set(repeatsFiltering);
            }
        }
        
        /**
         * Appends and returns a new empty "repeats-filtering" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering addNewRepeatsFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering)get_store().add_element_user(REPEATSFILTERING$6);
                return target;
            }
        }
        
        /**
         * Unsets the "repeats-filtering" element
         */
        public void unsetRepeatsFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPEATSFILTERING$6, 0);
            }
        }
        
        /**
         * Gets the "user-specified-masks" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks getUserSpecifiedMasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks)get_store().find_element_user(USERSPECIFIEDMASKS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "user-specified-masks" element
         */
        public boolean isSetUserSpecifiedMasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USERSPECIFIEDMASKS$8) != 0;
            }
        }
        
        /**
         * Sets the "user-specified-masks" element
         */
        public void setUserSpecifiedMasks(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks userSpecifiedMasks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks)get_store().find_element_user(USERSPECIFIEDMASKS$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks)get_store().add_element_user(USERSPECIFIEDMASKS$8);
                }
                target.set(userSpecifiedMasks);
            }
        }
        
        /**
         * Appends and returns a new empty "user-specified-masks" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks addNewUserSpecifiedMasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks)get_store().add_element_user(USERSPECIFIEDMASKS$8);
                return target;
            }
        }
        
        /**
         * Unsets the "user-specified-masks" element
         */
        public void unsetUserSpecifiedMasks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USERSPECIFIEDMASKS$8, 0);
            }
        }
        
        /**
         * Gets the "no-filtering" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering getNoFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering)get_store().find_element_user(NOFILTERING$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "no-filtering" element
         */
        public boolean isSetNoFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOFILTERING$10) != 0;
            }
        }
        
        /**
         * Sets the "no-filtering" element
         */
        public void setNoFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering noFiltering)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering)get_store().find_element_user(NOFILTERING$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering)get_store().add_element_user(NOFILTERING$10);
                }
                target.set(noFiltering);
            }
        }
        
        /**
         * Appends and returns a new empty "no-filtering" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering addNewNoFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering)get_store().add_element_user(NOFILTERING$10);
                return target;
            }
        }
        
        /**
         * Unsets the "no-filtering" element
         */
        public void unsetNoFiltering()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOFILTERING$10, 0);
            }
        }
        /**
         * An XML use-seg-filtering(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class UseSegFilteringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering
        {
            
            public UseSegFilteringImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument$Blast4CommonOptionsQueryFiltering$UseSegFiltering$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseSegFiltering.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML use-dust-filtering(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class UseDustFilteringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering
        {
            
            public UseDustFilteringImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument$Blast4CommonOptionsQueryFiltering$UseDustFiltering$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UseDustFiltering.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML mask-for-lookup-table-only(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MaskForLookupTableOnlyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly
        {
            
            public MaskForLookupTableOnlyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument$Blast4CommonOptionsQueryFiltering$MaskForLookupTableOnly$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.MaskForLookupTableOnly.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML repeats-filtering(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RepeatsFilteringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.RepeatsFiltering
        {
            
            public RepeatsFilteringImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4COMMONOPTIONSREPEATSFILTERING$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-common-options-repeats-filtering");
            
            
            /**
             * Gets the "Blast4-common-options-repeats-filtering" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering getBlast4CommonOptionsRepeatsFiltering()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering)get_store().find_element_user(BLAST4COMMONOPTIONSREPEATSFILTERING$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-common-options-repeats-filtering" element
             */
            public void setBlast4CommonOptionsRepeatsFiltering(gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering blast4CommonOptionsRepeatsFiltering)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering)get_store().find_element_user(BLAST4COMMONOPTIONSREPEATSFILTERING$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering)get_store().add_element_user(BLAST4COMMONOPTIONSREPEATSFILTERING$0);
                    }
                    target.set(blast4CommonOptionsRepeatsFiltering);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-common-options-repeats-filtering" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering addNewBlast4CommonOptionsRepeatsFiltering()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsRepeatsFilteringDocument.Blast4CommonOptionsRepeatsFiltering)get_store().add_element_user(BLAST4COMMONOPTIONSREPEATSFILTERING$0);
                    return target;
                }
            }
        }
        /**
         * An XML user-specified-masks(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class UserSpecifiedMasksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.UserSpecifiedMasks
        {
            
            public UserSpecifiedMasksImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4MASK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-mask");
            
            
            /**
             * Gets array of all "Blast4-mask" elements
             */
            public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask[] getBlast4MaskArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(BLAST4MASK$0, targetList);
                    gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask[] result = new gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Blast4-mask" element
             */
            public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask getBlast4MaskArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().find_element_user(BLAST4MASK$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Blast4-mask" element
             */
            public int sizeOfBlast4MaskArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BLAST4MASK$0);
                }
            }
            
            /**
             * Sets array of all "Blast4-mask" element
             */
            public void setBlast4MaskArray(gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask[] blast4MaskArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(blast4MaskArray, BLAST4MASK$0);
                }
            }
            
            /**
             * Sets ith "Blast4-mask" element
             */
            public void setBlast4MaskArray(int i, gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask blast4Mask)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().find_element_user(BLAST4MASK$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(blast4Mask);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-mask" element
             */
            public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask insertNewBlast4Mask(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().insert_element_user(BLAST4MASK$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-mask" element
             */
            public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask addNewBlast4Mask()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().add_element_user(BLAST4MASK$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Blast4-mask" element
             */
            public void removeBlast4Mask(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BLAST4MASK$0, i);
                }
            }
        }
        /**
         * An XML no-filtering(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NoFilteringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering
        {
            
            public NoFilteringImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument$Blast4CommonOptionsQueryFiltering$NoFiltering$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsQueryFilteringDocument.Blast4CommonOptionsQueryFiltering.NoFiltering.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
    }
}
