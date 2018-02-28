/*
 * An XML document type.
 * Localname: Id-pat
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.IdPatDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Id-pat(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class IdPatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.IdPatDocument
{
    
    public IdPatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDPAT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Id-pat");
    
    
    /**
     * Gets the "Id-pat" element
     */
    public gov.nih.nlm.ncbi.www.IdPatDocument.IdPat getIdPat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.IdPatDocument.IdPat target = null;
            target = (gov.nih.nlm.ncbi.www.IdPatDocument.IdPat)get_store().find_element_user(IDPAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Id-pat" element
     */
    public void setIdPat(gov.nih.nlm.ncbi.www.IdPatDocument.IdPat idPat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.IdPatDocument.IdPat target = null;
            target = (gov.nih.nlm.ncbi.www.IdPatDocument.IdPat)get_store().find_element_user(IDPAT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.IdPatDocument.IdPat)get_store().add_element_user(IDPAT$0);
            }
            target.set(idPat);
        }
    }
    
    /**
     * Appends and returns a new empty "Id-pat" element
     */
    public gov.nih.nlm.ncbi.www.IdPatDocument.IdPat addNewIdPat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.IdPatDocument.IdPat target = null;
            target = (gov.nih.nlm.ncbi.www.IdPatDocument.IdPat)get_store().add_element_user(IDPAT$0);
            return target;
        }
    }
    /**
     * An XML Id-pat(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class IdPatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.IdPatDocument.IdPat
    {
        
        public IdPatImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COUNTRY$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "country");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName DOCTYPE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "doc-type");
        
        
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
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.IdPatDocument.IdPat.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.IdPatDocument.IdPat.Id target = null;
                target = (gov.nih.nlm.ncbi.www.IdPatDocument.IdPat.Id)get_store().find_element_user(ID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(gov.nih.nlm.ncbi.www.IdPatDocument.IdPat.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.IdPatDocument.IdPat.Id target = null;
                target = (gov.nih.nlm.ncbi.www.IdPatDocument.IdPat.Id)get_store().find_element_user(ID$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.IdPatDocument.IdPat.Id)get_store().add_element_user(ID$2);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.IdPatDocument.IdPat.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.IdPatDocument.IdPat.Id target = null;
                target = (gov.nih.nlm.ncbi.www.IdPatDocument.IdPat.Id)get_store().add_element_user(ID$2);
                return target;
            }
        }
        
        /**
         * Gets the "doc-type" element
         */
        public java.lang.String getDocType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCTYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "doc-type" element
         */
        public org.apache.xmlbeans.XmlString xgetDocType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCTYPE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "doc-type" element
         */
        public boolean isSetDocType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOCTYPE$4) != 0;
            }
        }
        
        /**
         * Sets the "doc-type" element
         */
        public void setDocType(java.lang.String docType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCTYPE$4);
                }
                target.setStringValue(docType);
            }
        }
        
        /**
         * Sets (as xml) the "doc-type" element
         */
        public void xsetDocType(org.apache.xmlbeans.XmlString docType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCTYPE$4);
                }
                target.set(docType);
            }
        }
        
        /**
         * Unsets the "doc-type" element
         */
        public void unsetDocType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOCTYPE$4, 0);
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.IdPatDocument.IdPat.Id
        {
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NUMBER$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "number");
            private static final javax.xml.namespace.QName APPNUMBER$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "app-number");
            
            
            /**
             * Gets the "number" element
             */
            public java.lang.String getNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "number" element
             */
            public boolean isSetNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NUMBER$0) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$0);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBER$0);
                    }
                    target.set(number);
                }
            }
            
            /**
             * Unsets the "number" element
             */
            public void unsetNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NUMBER$0, 0);
                }
            }
            
            /**
             * Gets the "app-number" element
             */
            public java.lang.String getAppNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPNUMBER$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "app-number" element
             */
            public org.apache.xmlbeans.XmlString xgetAppNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPNUMBER$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "app-number" element
             */
            public boolean isSetAppNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(APPNUMBER$2) != 0;
                }
            }
            
            /**
             * Sets the "app-number" element
             */
            public void setAppNumber(java.lang.String appNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPNUMBER$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPNUMBER$2);
                    }
                    target.setStringValue(appNumber);
                }
            }
            
            /**
             * Sets (as xml) the "app-number" element
             */
            public void xsetAppNumber(org.apache.xmlbeans.XmlString appNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPNUMBER$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPNUMBER$2);
                    }
                    target.set(appNumber);
                }
            }
            
            /**
             * Unsets the "app-number" element
             */
            public void unsetAppNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(APPNUMBER$2, 0);
                }
            }
        }
    }
}
