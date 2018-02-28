/*
 * An XML document type.
 * Localname: Auth-list
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.AuthListDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Auth-list(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class AuthListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AuthListDocument
{
    
    public AuthListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Auth-list(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class AuthListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AuthListDocument.AuthList
    {
        
        public AuthListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAMES$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "names");
        private static final javax.xml.namespace.QName AFFIL$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "affil");
        
        
        /**
         * Gets the "names" element
         */
        public gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names getNames()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names target = null;
                target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names)get_store().find_element_user(NAMES$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "names" element
         */
        public void setNames(gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names names)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names target = null;
                target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names)get_store().find_element_user(NAMES$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names)get_store().add_element_user(NAMES$0);
                }
                target.set(names);
            }
        }
        
        /**
         * Appends and returns a new empty "names" element
         */
        public gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names addNewNames()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names target = null;
                target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names)get_store().add_element_user(NAMES$0);
                return target;
            }
        }
        
        /**
         * Gets the "affil" element
         */
        public gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil getAffil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil target = null;
                target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil)get_store().find_element_user(AFFIL$2, 0);
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
                return get_store().count_elements(AFFIL$2) != 0;
            }
        }
        
        /**
         * Sets the "affil" element
         */
        public void setAffil(gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil affil)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil target = null;
                target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil)get_store().find_element_user(AFFIL$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil)get_store().add_element_user(AFFIL$2);
                }
                target.set(affil);
            }
        }
        
        /**
         * Appends and returns a new empty "affil" element
         */
        public gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil addNewAffil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil target = null;
                target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil)get_store().add_element_user(AFFIL$2);
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
                get_store().remove_element(AFFIL$2, 0);
            }
        }
        /**
         * An XML names(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NamesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names
        {
            
            public NamesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName STD$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "std");
            private static final javax.xml.namespace.QName ML$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ml");
            private static final javax.xml.namespace.QName STR$4 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "str");
            
            
            /**
             * Gets the "std" element
             */
            public gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std getStd()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std target = null;
                    target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std)get_store().find_element_user(STD$0, 0);
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
                    return get_store().count_elements(STD$0) != 0;
                }
            }
            
            /**
             * Sets the "std" element
             */
            public void setStd(gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std std)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std target = null;
                    target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std)get_store().find_element_user(STD$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std)get_store().add_element_user(STD$0);
                    }
                    target.set(std);
                }
            }
            
            /**
             * Appends and returns a new empty "std" element
             */
            public gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std addNewStd()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std target = null;
                    target = (gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std)get_store().add_element_user(STD$0);
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
                    get_store().remove_element(STD$0, 0);
                }
            }
            
            /**
             * Gets array of all "ml" elements
             */
            public java.lang.String[] getMlArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ML$2, targetList);
                    java.lang.String[] result = new java.lang.String[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "ml" element
             */
            public java.lang.String getMlArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ML$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "ml" elements
             */
            public org.apache.xmlbeans.XmlString[] xgetMlArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ML$2, targetList);
                    org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "ml" element
             */
            public org.apache.xmlbeans.XmlString xgetMlArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ML$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlString)target;
                }
            }
            
            /**
             * Returns number of "ml" element
             */
            public int sizeOfMlArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ML$2);
                }
            }
            
            /**
             * Sets array of all "ml" element
             */
            public void setMlArray(java.lang.String[] mlArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(mlArray, ML$2);
                }
            }
            
            /**
             * Sets ith "ml" element
             */
            public void setMlArray(int i, java.lang.String ml)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ML$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setStringValue(ml);
                }
            }
            
            /**
             * Sets (as xml) array of all "ml" element
             */
            public void xsetMlArray(org.apache.xmlbeans.XmlString[]mlArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(mlArray, ML$2);
                }
            }
            
            /**
             * Sets (as xml) ith "ml" element
             */
            public void xsetMlArray(int i, org.apache.xmlbeans.XmlString ml)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ML$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(ml);
                }
            }
            
            /**
             * Inserts the value as the ith "ml" element
             */
            public void insertMl(int i, java.lang.String ml)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ML$2, i);
                    target.setStringValue(ml);
                }
            }
            
            /**
             * Appends the value as the last "ml" element
             */
            public void addMl(java.lang.String ml)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ML$2);
                    target.setStringValue(ml);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ml" element
             */
            public org.apache.xmlbeans.XmlString insertNewMl(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ML$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ml" element
             */
            public org.apache.xmlbeans.XmlString addNewMl()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ML$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "ml" element
             */
            public void removeMl(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ML$2, i);
                }
            }
            
            /**
             * Gets array of all "str" elements
             */
            public java.lang.String[] getStrArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(STR$4, targetList);
                    java.lang.String[] result = new java.lang.String[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "str" element
             */
            public java.lang.String getStrArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STR$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "str" elements
             */
            public org.apache.xmlbeans.XmlString[] xgetStrArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(STR$4, targetList);
                    org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "str" element
             */
            public org.apache.xmlbeans.XmlString xgetStrArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STR$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlString)target;
                }
            }
            
            /**
             * Returns number of "str" element
             */
            public int sizeOfStrArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(STR$4);
                }
            }
            
            /**
             * Sets array of all "str" element
             */
            public void setStrArray(java.lang.String[] strArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(strArray, STR$4);
                }
            }
            
            /**
             * Sets ith "str" element
             */
            public void setStrArray(int i, java.lang.String str)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STR$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setStringValue(str);
                }
            }
            
            /**
             * Sets (as xml) array of all "str" element
             */
            public void xsetStrArray(org.apache.xmlbeans.XmlString[]strArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(strArray, STR$4);
                }
            }
            
            /**
             * Sets (as xml) ith "str" element
             */
            public void xsetStrArray(int i, org.apache.xmlbeans.XmlString str)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STR$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(str);
                }
            }
            
            /**
             * Inserts the value as the ith "str" element
             */
            public void insertStr(int i, java.lang.String str)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STR$4, i);
                    target.setStringValue(str);
                }
            }
            
            /**
             * Appends the value as the last "str" element
             */
            public void addStr(java.lang.String str)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STR$4);
                    target.setStringValue(str);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "str" element
             */
            public org.apache.xmlbeans.XmlString insertNewStr(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STR$4, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "str" element
             */
            public org.apache.xmlbeans.XmlString addNewStr()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STR$4);
                    return target;
                }
            }
            
            /**
             * Removes the ith "str" element
             */
            public void removeStr(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(STR$4, i);
                }
            }
            /**
             * An XML std(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class StdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Names.Std
            {
                
                public StdImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName AUTHOR$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Author");
                
                
                /**
                 * Gets array of all "Author" elements
                 */
                public gov.nih.nlm.ncbi.www.AuthorDocument.Author[] getAuthorArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(AUTHOR$0, targetList);
                      gov.nih.nlm.ncbi.www.AuthorDocument.Author[] result = new gov.nih.nlm.ncbi.www.AuthorDocument.Author[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Author" element
                 */
                public gov.nih.nlm.ncbi.www.AuthorDocument.Author getAuthorArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.AuthorDocument.Author target = null;
                      target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author)get_store().find_element_user(AUTHOR$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "Author" element
                 */
                public int sizeOfAuthorArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(AUTHOR$0);
                    }
                }
                
                /**
                 * Sets array of all "Author" element
                 */
                public void setAuthorArray(gov.nih.nlm.ncbi.www.AuthorDocument.Author[] authorArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(authorArray, AUTHOR$0);
                    }
                }
                
                /**
                 * Sets ith "Author" element
                 */
                public void setAuthorArray(int i, gov.nih.nlm.ncbi.www.AuthorDocument.Author author)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.AuthorDocument.Author target = null;
                      target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author)get_store().find_element_user(AUTHOR$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(author);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Author" element
                 */
                public gov.nih.nlm.ncbi.www.AuthorDocument.Author insertNewAuthor(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.AuthorDocument.Author target = null;
                      target = (gov.nih.nlm.ncbi.www.AuthorDocument.Author)get_store().insert_element_user(AUTHOR$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Author" element
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
                 * Removes the ith "Author" element
                 */
                public void removeAuthor(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(AUTHOR$0, i);
                    }
                }
            }
        }
        /**
         * An XML affil(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AffilImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AuthListDocument.AuthList.Affil
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
    }
}
