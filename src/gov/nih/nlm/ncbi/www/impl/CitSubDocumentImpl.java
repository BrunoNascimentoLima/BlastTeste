/*
 * An XML document type.
 * Localname: Cit-sub
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CitSubDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Cit-sub(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CitSubDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitSubDocument
{
    
    public CitSubDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITSUB$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-sub");
    
    
    /**
     * Gets the "Cit-sub" element
     */
    public gov.nih.nlm.ncbi.www.CitSubDocument.CitSub getCitSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitSubDocument.CitSub target = null;
            target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub)get_store().find_element_user(CITSUB$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Cit-sub" element
     */
    public void setCitSub(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub citSub)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitSubDocument.CitSub target = null;
            target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub)get_store().find_element_user(CITSUB$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub)get_store().add_element_user(CITSUB$0);
            }
            target.set(citSub);
        }
    }
    
    /**
     * Appends and returns a new empty "Cit-sub" element
     */
    public gov.nih.nlm.ncbi.www.CitSubDocument.CitSub addNewCitSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitSubDocument.CitSub target = null;
            target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub)get_store().add_element_user(CITSUB$0);
            return target;
        }
    }
    /**
     * An XML Cit-sub(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CitSubImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitSubDocument.CitSub
    {
        
        public CitSubImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AUTHORS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "authors");
        private static final javax.xml.namespace.QName IMP$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "imp");
        private static final javax.xml.namespace.QName MEDIUM$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "medium");
        private static final javax.xml.namespace.QName DATE$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "date");
        private static final javax.xml.namespace.QName DESCR$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "descr");
        
        
        /**
         * Gets the "authors" element
         */
        public gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors getAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors)get_store().find_element_user(AUTHORS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "authors" element
         */
        public void setAuthors(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors authors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors)get_store().find_element_user(AUTHORS$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors)get_store().add_element_user(AUTHORS$0);
                }
                target.set(authors);
            }
        }
        
        /**
         * Appends and returns a new empty "authors" element
         */
        public gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors addNewAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors)get_store().add_element_user(AUTHORS$0);
                return target;
            }
        }
        
        /**
         * Gets the "imp" element
         */
        public gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp getImp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp target = null;
                target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp)get_store().find_element_user(IMP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "imp" element
         */
        public boolean isSetImp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMP$2) != 0;
            }
        }
        
        /**
         * Sets the "imp" element
         */
        public void setImp(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp imp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp target = null;
                target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp)get_store().find_element_user(IMP$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp)get_store().add_element_user(IMP$2);
                }
                target.set(imp);
            }
        }
        
        /**
         * Appends and returns a new empty "imp" element
         */
        public gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp addNewImp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp target = null;
                target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp)get_store().add_element_user(IMP$2);
                return target;
            }
        }
        
        /**
         * Unsets the "imp" element
         */
        public void unsetImp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMP$2, 0);
            }
        }
        
        /**
         * Gets the "medium" element
         */
        public gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium getMedium()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium target = null;
                target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium)get_store().find_element_user(MEDIUM$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "medium" element
         */
        public boolean isSetMedium()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEDIUM$4) != 0;
            }
        }
        
        /**
         * Sets the "medium" element
         */
        public void setMedium(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium medium)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium target = null;
                target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium)get_store().find_element_user(MEDIUM$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium)get_store().add_element_user(MEDIUM$4);
                }
                target.set(medium);
            }
        }
        
        /**
         * Appends and returns a new empty "medium" element
         */
        public gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium addNewMedium()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium target = null;
                target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium)get_store().add_element_user(MEDIUM$4);
                return target;
            }
        }
        
        /**
         * Unsets the "medium" element
         */
        public void unsetMedium()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEDIUM$4, 0);
            }
        }
        
        /**
         * Gets the "date" element
         */
        public gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date target = null;
                target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date)get_store().find_element_user(DATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "date" element
         */
        public boolean isSetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATE$6) != 0;
            }
        }
        
        /**
         * Sets the "date" element
         */
        public void setDate(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date target = null;
                target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date)get_store().find_element_user(DATE$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date)get_store().add_element_user(DATE$6);
                }
                target.set(date);
            }
        }
        
        /**
         * Appends and returns a new empty "date" element
         */
        public gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date addNewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date target = null;
                target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date)get_store().add_element_user(DATE$6);
                return target;
            }
        }
        
        /**
         * Unsets the "date" element
         */
        public void unsetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATE$6, 0);
            }
        }
        
        /**
         * Gets the "descr" element
         */
        public java.lang.String getDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCR$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "descr" element
         */
        public org.apache.xmlbeans.XmlString xgetDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCR$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "descr" element
         */
        public boolean isSetDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCR$8) != 0;
            }
        }
        
        /**
         * Sets the "descr" element
         */
        public void setDescr(java.lang.String descr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCR$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCR$8);
                }
                target.setStringValue(descr);
            }
        }
        
        /**
         * Sets (as xml) the "descr" element
         */
        public void xsetDescr(org.apache.xmlbeans.XmlString descr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCR$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCR$8);
                }
                target.set(descr);
            }
        }
        
        /**
         * Unsets the "descr" element
         */
        public void unsetDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCR$8, 0);
            }
        }
        /**
         * An XML authors(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AuthorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Authors
        {
            
            public AuthorsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName AUTHLIST$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Auth-list");
            
            
            /**
             * Gets the "Auth-list" element
             */
            public gov.nih.nlm.ncbi.www.AuthListDocument.AuthList getAuthList()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AuthListDocument.AuthList target = null;
                    target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList)get_store().find_element_user(AUTHLIST$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Auth-list" element
             */
            public void setAuthList(gov.nih.nlm.ncbi.www.AuthListDocument.AuthList authList)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AuthListDocument.AuthList target = null;
                    target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList)get_store().find_element_user(AUTHLIST$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList)get_store().add_element_user(AUTHLIST$0);
                    }
                    target.set(authList);
                }
            }
            
            /**
             * Appends and returns a new empty "Auth-list" element
             */
            public gov.nih.nlm.ncbi.www.AuthListDocument.AuthList addNewAuthList()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AuthListDocument.AuthList target = null;
                    target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList)get_store().add_element_user(AUTHLIST$0);
                    return target;
                }
            }
        }
        /**
         * An XML imp(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ImpImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Imp
        {
            
            public ImpImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName IMPRINT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Imprint");
            
            
            /**
             * Gets the "Imprint" element
             */
            public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint getImprint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ImprintDocument.Imprint target = null;
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint)get_store().find_element_user(IMPRINT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Imprint" element
             */
            public void setImprint(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint imprint)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ImprintDocument.Imprint target = null;
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint)get_store().find_element_user(IMPRINT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint)get_store().add_element_user(IMPRINT$0);
                    }
                    target.set(imprint);
                }
            }
            
            /**
             * Appends and returns a new empty "Imprint" element
             */
            public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint addNewImprint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ImprintDocument.Imprint target = null;
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint)get_store().add_element_user(IMPRINT$0);
                    return target;
                }
            }
        }
        /**
         * An XML medium(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MediumImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium
        {
            
            public MediumImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CitSubDocument$CitSub$Medium$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Medium.Value
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
         * An XML date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitSubDocument.CitSub.Date
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
