/*
 * An XML document type.
 * Localname: Affil
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.AffilDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Affil(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class AffilDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AffilDocument
{
    
    public AffilDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AFFIL$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Affil");
    
    
    /**
     * Gets the "Affil" element
     */
    public gov.nih.nlm.ncbi.www.AffilDocument.Affil getAffil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AffilDocument.Affil target = null;
            target = (gov.nih.nlm.ncbi.www.AffilDocument.Affil)get_store().find_element_user(AFFIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Affil" element
     */
    public void setAffil(gov.nih.nlm.ncbi.www.AffilDocument.Affil affil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AffilDocument.Affil target = null;
            target = (gov.nih.nlm.ncbi.www.AffilDocument.Affil)get_store().find_element_user(AFFIL$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.AffilDocument.Affil)get_store().add_element_user(AFFIL$0);
            }
            target.set(affil);
        }
    }
    
    /**
     * Appends and returns a new empty "Affil" element
     */
    public gov.nih.nlm.ncbi.www.AffilDocument.Affil addNewAffil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AffilDocument.Affil target = null;
            target = (gov.nih.nlm.ncbi.www.AffilDocument.Affil)get_store().add_element_user(AFFIL$0);
            return target;
        }
    }
    /**
     * An XML Affil(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class AffilImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AffilDocument.Affil
    {
        
        public AffilImpl(org.apache.xmlbeans.SchemaType sType)
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
        public gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std getStd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std target = null;
                target = (gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std)get_store().find_element_user(STD$2, 0);
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
        public void setStd(gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std std)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std target = null;
                target = (gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std)get_store().find_element_user(STD$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std)get_store().add_element_user(STD$2);
                }
                target.set(std);
            }
        }
        
        /**
         * Appends and returns a new empty "std" element
         */
        public gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std addNewStd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std target = null;
                target = (gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std)get_store().add_element_user(STD$2);
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
        public static class StdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AffilDocument.Affil.Std
        {
            
            public StdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName AFFIL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "affil");
            private static final javax.xml.namespace.QName DIV$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "div");
            private static final javax.xml.namespace.QName CITY$4 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "city");
            private static final javax.xml.namespace.QName SUB$6 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "sub");
            private static final javax.xml.namespace.QName COUNTRY$8 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "country");
            private static final javax.xml.namespace.QName STREET$10 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "street");
            private static final javax.xml.namespace.QName EMAIL$12 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "email");
            private static final javax.xml.namespace.QName FAX$14 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "fax");
            private static final javax.xml.namespace.QName PHONE$16 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "phone");
            private static final javax.xml.namespace.QName POSTALCODE$18 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "postal-code");
            
            
            /**
             * Gets the "affil" element
             */
            public java.lang.String getAffil()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AFFIL$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "affil" element
             */
            public org.apache.xmlbeans.XmlString xgetAffil()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AFFIL$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "affil" element
             */
            public boolean isSetAffil()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AFFIL$0) != 0;
                }
            }
            
            /**
             * Sets the "affil" element
             */
            public void setAffil(java.lang.String affil)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AFFIL$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AFFIL$0);
                    }
                    target.setStringValue(affil);
                }
            }
            
            /**
             * Sets (as xml) the "affil" element
             */
            public void xsetAffil(org.apache.xmlbeans.XmlString affil)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AFFIL$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AFFIL$0);
                    }
                    target.set(affil);
                }
            }
            
            /**
             * Unsets the "affil" element
             */
            public void unsetAffil()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AFFIL$0, 0);
                }
            }
            
            /**
             * Gets the "div" element
             */
            public java.lang.String getDiv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIV$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "div" element
             */
            public org.apache.xmlbeans.XmlString xgetDiv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIV$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "div" element
             */
            public boolean isSetDiv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DIV$2) != 0;
                }
            }
            
            /**
             * Sets the "div" element
             */
            public void setDiv(java.lang.String div)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIV$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIV$2);
                    }
                    target.setStringValue(div);
                }
            }
            
            /**
             * Sets (as xml) the "div" element
             */
            public void xsetDiv(org.apache.xmlbeans.XmlString div)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIV$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIV$2);
                    }
                    target.set(div);
                }
            }
            
            /**
             * Unsets the "div" element
             */
            public void unsetDiv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DIV$2, 0);
                }
            }
            
            /**
             * Gets the "city" element
             */
            public java.lang.String getCity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "city" element
             */
            public org.apache.xmlbeans.XmlString xgetCity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "city" element
             */
            public boolean isSetCity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CITY$4) != 0;
                }
            }
            
            /**
             * Sets the "city" element
             */
            public void setCity(java.lang.String city)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$4);
                    }
                    target.setStringValue(city);
                }
            }
            
            /**
             * Sets (as xml) the "city" element
             */
            public void xsetCity(org.apache.xmlbeans.XmlString city)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$4);
                    }
                    target.set(city);
                }
            }
            
            /**
             * Unsets the "city" element
             */
            public void unsetCity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CITY$4, 0);
                }
            }
            
            /**
             * Gets the "sub" element
             */
            public java.lang.String getSub()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUB$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "sub" element
             */
            public org.apache.xmlbeans.XmlString xgetSub()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUB$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "sub" element
             */
            public boolean isSetSub()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SUB$6) != 0;
                }
            }
            
            /**
             * Sets the "sub" element
             */
            public void setSub(java.lang.String sub)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUB$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUB$6);
                    }
                    target.setStringValue(sub);
                }
            }
            
            /**
             * Sets (as xml) the "sub" element
             */
            public void xsetSub(org.apache.xmlbeans.XmlString sub)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUB$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUB$6);
                    }
                    target.set(sub);
                }
            }
            
            /**
             * Unsets the "sub" element
             */
            public void unsetSub()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SUB$6, 0);
                }
            }
            
            /**
             * Gets the "country" element
             */
            public java.lang.String getCountry()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$8, 0);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "country" element
             */
            public boolean isSetCountry()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(COUNTRY$8) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$8);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$8);
                    }
                    target.set(country);
                }
            }
            
            /**
             * Unsets the "country" element
             */
            public void unsetCountry()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(COUNTRY$8, 0);
                }
            }
            
            /**
             * Gets the "street" element
             */
            public java.lang.String getStreet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "street" element
             */
            public org.apache.xmlbeans.XmlString xgetStreet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREET$10, 0);
                    return target;
                }
            }
            
            /**
             * True if has "street" element
             */
            public boolean isSetStreet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(STREET$10) != 0;
                }
            }
            
            /**
             * Sets the "street" element
             */
            public void setStreet(java.lang.String street)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREET$10);
                    }
                    target.setStringValue(street);
                }
            }
            
            /**
             * Sets (as xml) the "street" element
             */
            public void xsetStreet(org.apache.xmlbeans.XmlString street)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREET$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STREET$10);
                    }
                    target.set(street);
                }
            }
            
            /**
             * Unsets the "street" element
             */
            public void unsetStreet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(STREET$10, 0);
                }
            }
            
            /**
             * Gets the "email" element
             */
            public java.lang.String getEmail()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "email" element
             */
            public org.apache.xmlbeans.XmlString xgetEmail()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$12, 0);
                    return target;
                }
            }
            
            /**
             * True if has "email" element
             */
            public boolean isSetEmail()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EMAIL$12) != 0;
                }
            }
            
            /**
             * Sets the "email" element
             */
            public void setEmail(java.lang.String email)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$12);
                    }
                    target.setStringValue(email);
                }
            }
            
            /**
             * Sets (as xml) the "email" element
             */
            public void xsetEmail(org.apache.xmlbeans.XmlString email)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$12);
                    }
                    target.set(email);
                }
            }
            
            /**
             * Unsets the "email" element
             */
            public void unsetEmail()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EMAIL$12, 0);
                }
            }
            
            /**
             * Gets the "fax" element
             */
            public java.lang.String getFax()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "fax" element
             */
            public org.apache.xmlbeans.XmlString xgetFax()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$14, 0);
                    return target;
                }
            }
            
            /**
             * True if has "fax" element
             */
            public boolean isSetFax()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FAX$14) != 0;
                }
            }
            
            /**
             * Sets the "fax" element
             */
            public void setFax(java.lang.String fax)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$14);
                    }
                    target.setStringValue(fax);
                }
            }
            
            /**
             * Sets (as xml) the "fax" element
             */
            public void xsetFax(org.apache.xmlbeans.XmlString fax)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAX$14);
                    }
                    target.set(fax);
                }
            }
            
            /**
             * Unsets the "fax" element
             */
            public void unsetFax()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FAX$14, 0);
                }
            }
            
            /**
             * Gets the "phone" element
             */
            public java.lang.String getPhone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$16, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "phone" element
             */
            public org.apache.xmlbeans.XmlString xgetPhone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$16, 0);
                    return target;
                }
            }
            
            /**
             * True if has "phone" element
             */
            public boolean isSetPhone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PHONE$16) != 0;
                }
            }
            
            /**
             * Sets the "phone" element
             */
            public void setPhone(java.lang.String phone)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$16);
                    }
                    target.setStringValue(phone);
                }
            }
            
            /**
             * Sets (as xml) the "phone" element
             */
            public void xsetPhone(org.apache.xmlbeans.XmlString phone)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$16);
                    }
                    target.set(phone);
                }
            }
            
            /**
             * Unsets the "phone" element
             */
            public void unsetPhone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PHONE$16, 0);
                }
            }
            
            /**
             * Gets the "postal-code" element
             */
            public java.lang.String getPostalCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALCODE$18, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "postal-code" element
             */
            public org.apache.xmlbeans.XmlString xgetPostalCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTALCODE$18, 0);
                    return target;
                }
            }
            
            /**
             * True if has "postal-code" element
             */
            public boolean isSetPostalCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(POSTALCODE$18) != 0;
                }
            }
            
            /**
             * Sets the "postal-code" element
             */
            public void setPostalCode(java.lang.String postalCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALCODE$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTALCODE$18);
                    }
                    target.setStringValue(postalCode);
                }
            }
            
            /**
             * Sets (as xml) the "postal-code" element
             */
            public void xsetPostalCode(org.apache.xmlbeans.XmlString postalCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTALCODE$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTALCODE$18);
                    }
                    target.set(postalCode);
                }
            }
            
            /**
             * Unsets the "postal-code" element
             */
            public void unsetPostalCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(POSTALCODE$18, 0);
                }
            }
        }
    }
}
