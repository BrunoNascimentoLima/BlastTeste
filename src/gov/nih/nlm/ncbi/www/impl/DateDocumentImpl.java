/*
 * An XML document type.
 * Localname: Date
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.DateDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Date(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class DateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DateDocument
{
    
    public DateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Date");
    
    
    /**
     * Gets the "Date" element
     */
    public gov.nih.nlm.ncbi.www.DateDocument.Date getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
            target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Date" element
     */
    public void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
            target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
            }
            target.set(date);
        }
    }
    
    /**
     * Appends and returns a new empty "Date" element
     */
    public gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
            target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
            return target;
        }
    }
    /**
     * An XML Date(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class DateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DateDocument.Date
    {
        
        public DateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STR$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "str");
        private static final javax.xml.namespace.QName STD$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "std");
        
        
        /**
         * Gets the "str" element
         */
        public java.lang.String getStr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "str" element
         */
        public org.apache.xmlbeans.XmlString xgetStr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STR$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "str" element
         */
        public boolean isSetStr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STR$0) != 0;
            }
        }
        
        /**
         * Sets the "str" element
         */
        public void setStr(java.lang.String str)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STR$0);
                }
                target.setStringValue(str);
            }
        }
        
        /**
         * Sets (as xml) the "str" element
         */
        public void xsetStr(org.apache.xmlbeans.XmlString str)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STR$0);
                }
                target.set(str);
            }
        }
        
        /**
         * Unsets the "str" element
         */
        public void unsetStr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STR$0, 0);
            }
        }
        
        /**
         * Gets the "std" element
         */
        public gov.nih.nlm.ncbi.www.DateDocument.Date.Std getStd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DateDocument.Date.Std target = null;
                target = (gov.nih.nlm.ncbi.www.DateDocument.Date.Std)get_store().find_element_user(STD$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "std" element
         */
        public boolean isSetStd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STD$2) != 0;
            }
        }
        
        /**
         * Sets the "std" element
         */
        public void setStd(gov.nih.nlm.ncbi.www.DateDocument.Date.Std std)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DateDocument.Date.Std target = null;
                target = (gov.nih.nlm.ncbi.www.DateDocument.Date.Std)get_store().find_element_user(STD$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date.Std)get_store().add_element_user(STD$2);
                }
                target.set(std);
            }
        }
        
        /**
         * Appends and returns a new empty "std" element
         */
        public gov.nih.nlm.ncbi.www.DateDocument.Date.Std addNewStd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DateDocument.Date.Std target = null;
                target = (gov.nih.nlm.ncbi.www.DateDocument.Date.Std)get_store().add_element_user(STD$2);
                return target;
            }
        }
        
        /**
         * Unsets the "std" element
         */
        public void unsetStd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STD$2, 0);
            }
        }
        /**
         * An XML std(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class StdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DateDocument.Date.Std
        {
            
            public StdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATESTD$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Date-std");
            
            
            /**
             * Gets the "Date-std" element
             */
            public gov.nih.nlm.ncbi.www.DateStdDocument.DateStd getDateStd()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateStdDocument.DateStd target = null;
                    target = (gov.nih.nlm.ncbi.www.DateStdDocument.DateStd)get_store().find_element_user(DATESTD$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Date-std" element
             */
            public void setDateStd(gov.nih.nlm.ncbi.www.DateStdDocument.DateStd dateStd)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateStdDocument.DateStd target = null;
                    target = (gov.nih.nlm.ncbi.www.DateStdDocument.DateStd)get_store().find_element_user(DATESTD$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DateStdDocument.DateStd)get_store().add_element_user(DATESTD$0);
                    }
                    target.set(dateStd);
                }
            }
            
            /**
             * Appends and returns a new empty "Date-std" element
             */
            public gov.nih.nlm.ncbi.www.DateStdDocument.DateStd addNewDateStd()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateStdDocument.DateStd target = null;
                    target = (gov.nih.nlm.ncbi.www.DateStdDocument.DateStd)get_store().add_element_user(DATESTD$0);
                    return target;
                }
            }
        }
    }
}
