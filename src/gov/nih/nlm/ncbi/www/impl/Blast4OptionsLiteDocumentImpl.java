/*
 * An XML document type.
 * Localname: Blast4-options-lite
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-options-lite(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4OptionsLiteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument
{
    
    public Blast4OptionsLiteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4OPTIONSLITE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-options-lite");
    
    
    /**
     * Gets the "Blast4-options-lite" element
     */
    public gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite getBlast4OptionsLite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite)get_store().find_element_user(BLAST4OPTIONSLITE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-options-lite" element
     */
    public void setBlast4OptionsLite(gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite blast4OptionsLite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite)get_store().find_element_user(BLAST4OPTIONSLITE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite)get_store().add_element_user(BLAST4OPTIONSLITE$0);
            }
            target.set(blast4OptionsLite);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-options-lite" element
     */
    public gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite addNewBlast4OptionsLite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite)get_store().add_element_user(BLAST4OPTIONSLITE$0);
            return target;
        }
    }
    /**
     * An XML Blast4-options-lite(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4OptionsLiteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite
    {
        
        public Blast4OptionsLiteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASK$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "task");
        private static final javax.xml.namespace.QName OPTIONS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "options");
        
        
        /**
         * Gets the "task" element
         */
        public java.lang.String getTask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "task" element
         */
        public org.apache.xmlbeans.XmlString xgetTask()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASK$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "task" element
         */
        public void setTask(java.lang.String task)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASK$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASK$0);
                }
                target.setStringValue(task);
            }
        }
        
        /**
         * Sets (as xml) the "task" element
         */
        public void xsetTask(org.apache.xmlbeans.XmlString task)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TASK$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TASK$0);
                }
                target.set(task);
            }
        }
        
        /**
         * Gets the "options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite.Options getOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite.Options target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite.Options)get_store().find_element_user(OPTIONS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "options" element
         */
        public boolean isSetOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPTIONS$2) != 0;
            }
        }
        
        /**
         * Sets the "options" element
         */
        public void setOptions(gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite.Options options)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite.Options target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite.Options)get_store().find_element_user(OPTIONS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite.Options)get_store().add_element_user(OPTIONS$2);
                }
                target.set(options);
            }
        }
        
        /**
         * Appends and returns a new empty "options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite.Options addNewOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite.Options target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite.Options)get_store().add_element_user(OPTIONS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "options" element
         */
        public void unsetOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPTIONS$2, 0);
            }
        }
        /**
         * An XML options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class OptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4OptionsLiteDocument.Blast4OptionsLite.Options
        {
            
            public OptionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4COMMONOPTIONS$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-common-options");
            
            
            /**
             * Gets the "Blast4-common-options" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions getBlast4CommonOptions()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions)get_store().find_element_user(BLAST4COMMONOPTIONS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-common-options" element
             */
            public void setBlast4CommonOptions(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions blast4CommonOptions)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions)get_store().find_element_user(BLAST4COMMONOPTIONS$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions)get_store().add_element_user(BLAST4COMMONOPTIONS$0);
                    }
                    target.set(blast4CommonOptions);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-common-options" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions addNewBlast4CommonOptions()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDocument.Blast4CommonOptions)get_store().add_element_user(BLAST4COMMONOPTIONS$0);
                    return target;
                }
            }
        }
    }
}
