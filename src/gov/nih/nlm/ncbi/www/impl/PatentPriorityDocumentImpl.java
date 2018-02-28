/*
 * An XML document type.
 * Localname: Patent-priority
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PatentPriorityDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Patent-priority(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PatentPriorityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PatentPriorityDocument
{
    
    public PatentPriorityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATENTPRIORITY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Patent-priority");
    
    
    /**
     * Gets the "Patent-priority" element
     */
    public gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority getPatentPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority target = null;
            target = (gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority)get_store().find_element_user(PATENTPRIORITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Patent-priority" element
     */
    public void setPatentPriority(gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority patentPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority target = null;
            target = (gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority)get_store().find_element_user(PATENTPRIORITY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority)get_store().add_element_user(PATENTPRIORITY$0);
            }
            target.set(patentPriority);
        }
    }
    
    /**
     * Appends and returns a new empty "Patent-priority" element
     */
    public gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority addNewPatentPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority target = null;
            target = (gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority)get_store().add_element_user(PATENTPRIORITY$0);
            return target;
        }
    }
    /**
     * An XML Patent-priority(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PatentPriorityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority
    {
        
        public PatentPriorityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COUNTRY$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "country");
        private static final javax.xml.namespace.QName NUMBER$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "number");
        private static final javax.xml.namespace.QName DATE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "date");
        
        
        /**
         * Gets the "country" element
         */
        public java.lang.String getCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "country" element
         */
        public org.apache.xmlbeans.XmlString xgetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "country" element
         */
        public void setCountry(java.lang.String country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$0);
                }
                target.setStringValue(country);
            }
        }
        
        /**
         * Sets (as xml) the "country" element
         */
        public void xsetCountry(org.apache.xmlbeans.XmlString country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$0);
                }
                target.set(country);
            }
        }
        
        /**
         * Gets the "number" element
         */
        public java.lang.String getNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "number" element
         */
        public org.apache.xmlbeans.XmlString xgetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "number" element
         */
        public void setNumber(java.lang.String number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$2);
                }
                target.setStringValue(number);
            }
        }
        
        /**
         * Sets (as xml) the "number" element
         */
        public void xsetNumber(org.apache.xmlbeans.XmlString number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBER$2);
                }
                target.set(number);
            }
        }
        
        /**
         * Gets the "date" element
         */
        public gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority.Date getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority.Date target = null;
                target = (gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority.Date)get_store().find_element_user(DATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "date" element
         */
        public void setDate(gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority.Date date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority.Date target = null;
                target = (gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority.Date)get_store().find_element_user(DATE$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority.Date)get_store().add_element_user(DATE$4);
                }
                target.set(date);
            }
        }
        
        /**
         * Appends and returns a new empty "date" element
         */
        public gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority.Date addNewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority.Date target = null;
                target = (gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority.Date)get_store().add_element_user(DATE$4);
                return target;
            }
        }
        /**
         * An XML date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority.Date
        {
            
            public DateImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
    }
}
