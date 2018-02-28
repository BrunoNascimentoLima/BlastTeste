/*
 * An XML document type.
 * Localname: Author
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.AuthorDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Author(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class AuthorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AuthorDocument
{
    
    public AuthorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHOR$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Author");
    
    
    /**
     * Gets the "Author" element
     */
    public gov.nih.nlm.ncbi.www.AuthorDocument.Author getAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AuthorDocument.Author target = null;
            target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author)get_store().find_element_user(AUTHOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Author" element
     */
    public void setAuthor(gov.nih.nlm.ncbi.www.AuthorDocument.Author author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AuthorDocument.Author target = null;
            target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author)get_store().find_element_user(AUTHOR$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author)get_store().add_element_user(AUTHOR$0);
            }
            target.set(author);
        }
    }
    
    /**
     * Appends and returns a new empty "Author" element
     */
    public gov.nih.nlm.ncbi.www.AuthorDocument.Author addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AuthorDocument.Author target = null;
            target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author)get_store().add_element_user(AUTHOR$0);
            return target;
        }
    }
    /**
     * An XML Author(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class AuthorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AuthorDocument.Author
    {
        
        public AuthorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName LEVEL$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "level");
        private static final javax.xml.namespace.QName ROLE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "role");
        private static final javax.xml.namespace.QName AFFIL$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "affil");
        private static final javax.xml.namespace.QName ISCORR$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "is-corr");
        
        
        /**
         * Gets the "name" element
         */
        public gov.nih.nlm.ncbi.www.AuthorDocument.Author.Name getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.Name target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Name)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(gov.nih.nlm.ncbi.www.AuthorDocument.Author.Name name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.Name target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Name)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Name)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Appends and returns a new empty "name" element
         */
        public gov.nih.nlm.ncbi.www.AuthorDocument.Author.Name addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.Name target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Name)get_store().add_element_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Gets the "level" element
         */
        public gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level getLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level)get_store().find_element_user(LEVEL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "level" element
         */
        public boolean isSetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEVEL$2) != 0;
            }
        }
        
        /**
         * Sets the "level" element
         */
        public void setLevel(gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level level)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level)get_store().find_element_user(LEVEL$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level)get_store().add_element_user(LEVEL$2);
                }
                target.set(level);
            }
        }
        
        /**
         * Appends and returns a new empty "level" element
         */
        public gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level addNewLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level)get_store().add_element_user(LEVEL$2);
                return target;
            }
        }
        
        /**
         * Unsets the "level" element
         */
        public void unsetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEVEL$2, 0);
            }
        }
        
        /**
         * Gets the "role" element
         */
        public gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role getRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role)get_store().find_element_user(ROLE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "role" element
         */
        public boolean isSetRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROLE$4) != 0;
            }
        }
        
        /**
         * Sets the "role" element
         */
        public void setRole(gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role)get_store().find_element_user(ROLE$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role)get_store().add_element_user(ROLE$4);
                }
                target.set(role);
            }
        }
        
        /**
         * Appends and returns a new empty "role" element
         */
        public gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role addNewRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role)get_store().add_element_user(ROLE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "role" element
         */
        public void unsetRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROLE$4, 0);
            }
        }
        
        /**
         * Gets the "affil" element
         */
        public gov.nih.nlm.ncbi.www.AuthorDocument.Author.Affil getAffil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.Affil target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Affil)get_store().find_element_user(AFFIL$6, 0);
                if (target == null)
                {
                    return null;
                }
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
                return get_store().count_elements(AFFIL$6) != 0;
            }
        }
        
        /**
         * Sets the "affil" element
         */
        public void setAffil(gov.nih.nlm.ncbi.www.AuthorDocument.Author.Affil affil)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.Affil target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Affil)get_store().find_element_user(AFFIL$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Affil)get_store().add_element_user(AFFIL$6);
                }
                target.set(affil);
            }
        }
        
        /**
         * Appends and returns a new empty "affil" element
         */
        public gov.nih.nlm.ncbi.www.AuthorDocument.Author.Affil addNewAffil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.Affil target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Affil)get_store().add_element_user(AFFIL$6);
                return target;
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
                get_store().remove_element(AFFIL$6, 0);
            }
        }
        
        /**
         * Gets the "is-corr" element
         */
        public gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr getIsCorr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr)get_store().find_element_user(ISCORR$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "is-corr" element
         */
        public boolean isSetIsCorr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISCORR$8) != 0;
            }
        }
        
        /**
         * Sets the "is-corr" element
         */
        public void setIsCorr(gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr isCorr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr)get_store().find_element_user(ISCORR$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr)get_store().add_element_user(ISCORR$8);
                }
                target.set(isCorr);
            }
        }
        
        /**
         * Appends and returns a new empty "is-corr" element
         */
        public gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr addNewIsCorr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr target = null;
                target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr)get_store().add_element_user(ISCORR$8);
                return target;
            }
        }
        
        /**
         * Unsets the "is-corr" element
         */
        public void unsetIsCorr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISCORR$8, 0);
            }
        }
        /**
         * An XML name(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AuthorDocument.Author.Name
        {
            
            public NameImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
        /**
         * An XML level(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LevelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level
        {
            
            public LevelImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.AuthorDocument$Author$Level$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.AuthorDocument.Author.Level.Value
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
         * An XML role(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RoleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role
        {
            
            public RoleImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.AuthorDocument$Author$Role$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.AuthorDocument.Author.Role.Value
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
         * An XML affil(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AffilImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AuthorDocument.Author.Affil
        {
            
            public AffilImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
        /**
         * An XML is-corr(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IsCorrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr
        {
            
            public IsCorrImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.AuthorDocument$Author$IsCorr$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.AuthorDocument.Author.IsCorr.Value
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
