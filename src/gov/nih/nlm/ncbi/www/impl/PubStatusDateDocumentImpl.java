/*
 * An XML document type.
 * Localname: PubStatusDate
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PubStatusDateDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PubStatusDate(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PubStatusDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubStatusDateDocument
{
    
    public PubStatusDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBSTATUSDATE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PubStatusDate");
    
    
    /**
     * Gets the "PubStatusDate" element
     */
    public gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate getPubStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate target = null;
            target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate)get_store().find_element_user(PUBSTATUSDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PubStatusDate" element
     */
    public void setPubStatusDate(gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate pubStatusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate target = null;
            target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate)get_store().find_element_user(PUBSTATUSDATE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate)get_store().add_element_user(PUBSTATUSDATE$0);
            }
            target.set(pubStatusDate);
        }
    }
    
    /**
     * Appends and returns a new empty "PubStatusDate" element
     */
    public gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate addNewPubStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate target = null;
            target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate)get_store().add_element_user(PUBSTATUSDATE$0);
            return target;
        }
    }
    /**
     * An XML PubStatusDate(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PubStatusDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate
    {
        
        public PubStatusDateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PUBSTATUS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pubstatus");
        private static final javax.xml.namespace.QName DATE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "date");
        
        
        /**
         * Gets the "pubstatus" element
         */
        public gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Pubstatus getPubstatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Pubstatus target = null;
                target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Pubstatus)get_store().find_element_user(PUBSTATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "pubstatus" element
         */
        public void setPubstatus(gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Pubstatus pubstatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Pubstatus target = null;
                target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Pubstatus)get_store().find_element_user(PUBSTATUS$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Pubstatus)get_store().add_element_user(PUBSTATUS$0);
                }
                target.set(pubstatus);
            }
        }
        
        /**
         * Appends and returns a new empty "pubstatus" element
         */
        public gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Pubstatus addNewPubstatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Pubstatus target = null;
                target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Pubstatus)get_store().add_element_user(PUBSTATUS$0);
                return target;
            }
        }
        
        /**
         * Gets the "date" element
         */
        public gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Date getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Date target = null;
                target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Date)get_store().find_element_user(DATE$2, 0);
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
        public void setDate(gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Date date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Date target = null;
                target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Date)get_store().find_element_user(DATE$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Date)get_store().add_element_user(DATE$2);
                }
                target.set(date);
            }
        }
        
        /**
         * Appends and returns a new empty "date" element
         */
        public gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Date addNewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Date target = null;
                target = (gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Date)get_store().add_element_user(DATE$2);
                return target;
            }
        }
        /**
         * An XML pubstatus(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PubstatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Pubstatus
        {
            
            public PubstatusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBSTATUS$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PubStatus");
            
            
            /**
             * Gets the "PubStatus" element
             */
            public gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus getPubStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus target = null;
                    target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus)get_store().find_element_user(PUBSTATUS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PubStatus" element
             */
            public void setPubStatus(gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus pubStatus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus target = null;
                    target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus)get_store().find_element_user(PUBSTATUS$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus)get_store().add_element_user(PUBSTATUS$0);
                    }
                    target.set(pubStatus);
                }
            }
            
            /**
             * Appends and returns a new empty "PubStatus" element
             */
            public gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus addNewPubStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus target = null;
                    target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus)get_store().add_element_user(PUBSTATUS$0);
                    return target;
                }
            }
        }
        /**
         * An XML date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubStatusDateDocument.PubStatusDate.Date
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
