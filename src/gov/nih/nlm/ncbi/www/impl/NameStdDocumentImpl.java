/*
 * An XML document type.
 * Localname: Name-std
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NameStdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Name-std(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class NameStdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NameStdDocument
{
    
    public NameStdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMESTD$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Name-std");
    
    
    /**
     * Gets the "Name-std" element
     */
    public gov.nih.nlm.ncbi.www.NameStdDocument.NameStd getNameStd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NameStdDocument.NameStd target = null;
            target = (gov.nih.nlm.ncbi.www.NameStdDocument.NameStd)get_store().find_element_user(NAMESTD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Name-std" element
     */
    public void setNameStd(gov.nih.nlm.ncbi.www.NameStdDocument.NameStd nameStd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NameStdDocument.NameStd target = null;
            target = (gov.nih.nlm.ncbi.www.NameStdDocument.NameStd)get_store().find_element_user(NAMESTD$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.NameStdDocument.NameStd)get_store().add_element_user(NAMESTD$0);
            }
            target.set(nameStd);
        }
    }
    
    /**
     * Appends and returns a new empty "Name-std" element
     */
    public gov.nih.nlm.ncbi.www.NameStdDocument.NameStd addNewNameStd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NameStdDocument.NameStd target = null;
            target = (gov.nih.nlm.ncbi.www.NameStdDocument.NameStd)get_store().add_element_user(NAMESTD$0);
            return target;
        }
    }
    /**
     * An XML Name-std(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class NameStdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NameStdDocument.NameStd
    {
        
        public NameStdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LAST$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "last");
        private static final javax.xml.namespace.QName FIRST$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "first");
        private static final javax.xml.namespace.QName MIDDLE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "middle");
        private static final javax.xml.namespace.QName FULL$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "full");
        private static final javax.xml.namespace.QName INITIALS$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "initials");
        private static final javax.xml.namespace.QName SUFFIX$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "suffix");
        private static final javax.xml.namespace.QName TITLE$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "title");
        
        
        /**
         * Gets the "last" element
         */
        public java.lang.String getLast()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "last" element
         */
        public org.apache.xmlbeans.XmlString xgetLast()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAST$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "last" element
         */
        public void setLast(java.lang.String last)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST$0);
                }
                target.setStringValue(last);
            }
        }
        
        /**
         * Sets (as xml) the "last" element
         */
        public void xsetLast(org.apache.xmlbeans.XmlString last)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAST$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LAST$0);
                }
                target.set(last);
            }
        }
        
        /**
         * Gets the "first" element
         */
        public java.lang.String getFirst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "first" element
         */
        public org.apache.xmlbeans.XmlString xgetFirst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRST$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "first" element
         */
        public boolean isSetFirst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIRST$2) != 0;
            }
        }
        
        /**
         * Sets the "first" element
         */
        public void setFirst(java.lang.String first)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRST$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRST$2);
                }
                target.setStringValue(first);
            }
        }
        
        /**
         * Sets (as xml) the "first" element
         */
        public void xsetFirst(org.apache.xmlbeans.XmlString first)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRST$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIRST$2);
                }
                target.set(first);
            }
        }
        
        /**
         * Unsets the "first" element
         */
        public void unsetFirst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIRST$2, 0);
            }
        }
        
        /**
         * Gets the "middle" element
         */
        public java.lang.String getMiddle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "middle" element
         */
        public org.apache.xmlbeans.XmlString xgetMiddle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDDLE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "middle" element
         */
        public boolean isSetMiddle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MIDDLE$4) != 0;
            }
        }
        
        /**
         * Sets the "middle" element
         */
        public void setMiddle(java.lang.String middle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIDDLE$4);
                }
                target.setStringValue(middle);
            }
        }
        
        /**
         * Sets (as xml) the "middle" element
         */
        public void xsetMiddle(org.apache.xmlbeans.XmlString middle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDDLE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIDDLE$4);
                }
                target.set(middle);
            }
        }
        
        /**
         * Unsets the "middle" element
         */
        public void unsetMiddle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MIDDLE$4, 0);
            }
        }
        
        /**
         * Gets the "full" element
         */
        public java.lang.String getFull()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULL$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "full" element
         */
        public org.apache.xmlbeans.XmlString xgetFull()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FULL$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "full" element
         */
        public boolean isSetFull()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FULL$6) != 0;
            }
        }
        
        /**
         * Sets the "full" element
         */
        public void setFull(java.lang.String full)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULL$6);
                }
                target.setStringValue(full);
            }
        }
        
        /**
         * Sets (as xml) the "full" element
         */
        public void xsetFull(org.apache.xmlbeans.XmlString full)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FULL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FULL$6);
                }
                target.set(full);
            }
        }
        
        /**
         * Unsets the "full" element
         */
        public void unsetFull()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FULL$6, 0);
            }
        }
        
        /**
         * Gets the "initials" element
         */
        public java.lang.String getInitials()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "initials" element
         */
        public org.apache.xmlbeans.XmlString xgetInitials()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INITIALS$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "initials" element
         */
        public boolean isSetInitials()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INITIALS$8) != 0;
            }
        }
        
        /**
         * Sets the "initials" element
         */
        public void setInitials(java.lang.String initials)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INITIALS$8);
                }
                target.setStringValue(initials);
            }
        }
        
        /**
         * Sets (as xml) the "initials" element
         */
        public void xsetInitials(org.apache.xmlbeans.XmlString initials)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INITIALS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INITIALS$8);
                }
                target.set(initials);
            }
        }
        
        /**
         * Unsets the "initials" element
         */
        public void unsetInitials()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INITIALS$8, 0);
            }
        }
        
        /**
         * Gets the "suffix" element
         */
        public java.lang.String getSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUFFIX$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "suffix" element
         */
        public org.apache.xmlbeans.XmlString xgetSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUFFIX$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "suffix" element
         */
        public boolean isSetSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUFFIX$10) != 0;
            }
        }
        
        /**
         * Sets the "suffix" element
         */
        public void setSuffix(java.lang.String suffix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUFFIX$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUFFIX$10);
                }
                target.setStringValue(suffix);
            }
        }
        
        /**
         * Sets (as xml) the "suffix" element
         */
        public void xsetSuffix(org.apache.xmlbeans.XmlString suffix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUFFIX$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUFFIX$10);
                }
                target.set(suffix);
            }
        }
        
        /**
         * Unsets the "suffix" element
         */
        public void unsetSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUFFIX$10, 0);
            }
        }
        
        /**
         * Gets the "title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" element
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "title" element
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLE$12) != 0;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$12);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" element
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$12);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "title" element
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLE$12, 0);
            }
        }
    }
}
