/*
 * An XML document type.
 * Localname: Person-id
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PersonIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Person-id(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PersonIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PersonIdDocument
{
    
    public PersonIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Person-id");
    
    
    /**
     * Gets the "Person-id" element
     */
    public gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId getPersonId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId target = null;
            target = (gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId)get_store().find_element_user(PERSONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Person-id" element
     */
    public void setPersonId(gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId personId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId target = null;
            target = (gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId)get_store().find_element_user(PERSONID$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId)get_store().add_element_user(PERSONID$0);
            }
            target.set(personId);
        }
    }
    
    /**
     * Appends and returns a new empty "Person-id" element
     */
    public gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId addNewPersonId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId target = null;
            target = (gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId)get_store().add_element_user(PERSONID$0);
            return target;
        }
    }
    /**
     * An XML Person-id(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PersonIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId
    {
        
        public PersonIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DBTAG$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "dbtag");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName ML$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ml");
        private static final javax.xml.namespace.QName STR$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "str");
        private static final javax.xml.namespace.QName CONSORTIUM$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "consortium");
        
        
        /**
         * Gets the "dbtag" element
         */
        public gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Dbtag getDbtag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Dbtag target = null;
                target = (gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dbtag" element
         */
        public boolean isSetDbtag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DBTAG$0) != 0;
            }
        }
        
        /**
         * Sets the "dbtag" element
         */
        public void setDbtag(gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Dbtag dbtag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Dbtag target = null;
                target = (gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Dbtag)get_store().add_element_user(DBTAG$0);
                }
                target.set(dbtag);
            }
        }
        
        /**
         * Appends and returns a new empty "dbtag" element
         */
        public gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Dbtag addNewDbtag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Dbtag target = null;
                target = (gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Dbtag)get_store().add_element_user(DBTAG$0);
                return target;
            }
        }
        
        /**
         * Unsets the "dbtag" element
         */
        public void unsetDbtag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DBTAG$0, 0);
            }
        }
        
        /**
         * Gets the "name" element
         */
        public gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Name getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Name target = null;
                target = (gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Name)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "name" element
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$2) != 0;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Name name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Name target = null;
                target = (gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Name)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Name)get_store().add_element_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Appends and returns a new empty "name" element
         */
        public gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Name addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Name target = null;
                target = (gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Name)get_store().add_element_user(NAME$2);
                return target;
            }
        }
        
        /**
         * Unsets the "name" element
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$2, 0);
            }
        }
        
        /**
         * Gets the "ml" element
         */
        public java.lang.String getMl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ML$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ml" element
         */
        public org.apache.xmlbeans.XmlString xgetMl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ML$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "ml" element
         */
        public boolean isSetMl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ML$4) != 0;
            }
        }
        
        /**
         * Sets the "ml" element
         */
        public void setMl(java.lang.String ml)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ML$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ML$4);
                }
                target.setStringValue(ml);
            }
        }
        
        /**
         * Sets (as xml) the "ml" element
         */
        public void xsetMl(org.apache.xmlbeans.XmlString ml)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ML$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ML$4);
                }
                target.set(ml);
            }
        }
        
        /**
         * Unsets the "ml" element
         */
        public void unsetMl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ML$4, 0);
            }
        }
        
        /**
         * Gets the "str" element
         */
        public java.lang.String getStr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STR$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STR$6, 0);
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
                return get_store().count_elements(STR$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STR$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STR$6);
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
                get_store().remove_element(STR$6, 0);
            }
        }
        
        /**
         * Gets the "consortium" element
         */
        public java.lang.String getConsortium()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSORTIUM$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "consortium" element
         */
        public org.apache.xmlbeans.XmlString xgetConsortium()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSORTIUM$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "consortium" element
         */
        public boolean isSetConsortium()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONSORTIUM$8) != 0;
            }
        }
        
        /**
         * Sets the "consortium" element
         */
        public void setConsortium(java.lang.String consortium)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSORTIUM$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONSORTIUM$8);
                }
                target.setStringValue(consortium);
            }
        }
        
        /**
         * Sets (as xml) the "consortium" element
         */
        public void xsetConsortium(org.apache.xmlbeans.XmlString consortium)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSORTIUM$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONSORTIUM$8);
                }
                target.set(consortium);
            }
        }
        
        /**
         * Unsets the "consortium" element
         */
        public void unsetConsortium()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONSORTIUM$8, 0);
            }
        }
        /**
         * An XML dbtag(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DbtagImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Dbtag
        {
            
            public DbtagImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DBTAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
            
            
            /**
             * Gets the "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Dbtag" element
             */
            public void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    }
                    target.set(dbtag);
                }
            }
            
            /**
             * Appends and returns a new empty "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    return target;
                }
            }
        }
        /**
         * An XML name(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PersonIdDocument.PersonId.Name
        {
            
            public NameImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
    }
}
