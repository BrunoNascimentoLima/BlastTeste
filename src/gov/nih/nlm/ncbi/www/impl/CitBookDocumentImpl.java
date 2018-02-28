/*
 * An XML document type.
 * Localname: Cit-book
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CitBookDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Cit-book(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CitBookDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitBookDocument
{
    
    public CitBookDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITBOOK$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-book");
    
    
    /**
     * Gets the "Cit-book" element
     */
    public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook getCitBook()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitBookDocument.CitBook target = null;
            target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook)get_store().find_element_user(CITBOOK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Cit-book" element
     */
    public void setCitBook(gov.nih.nlm.ncbi.www.CitBookDocument.CitBook citBook)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitBookDocument.CitBook target = null;
            target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook)get_store().find_element_user(CITBOOK$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook)get_store().add_element_user(CITBOOK$0);
            }
            target.set(citBook);
        }
    }
    
    /**
     * Appends and returns a new empty "Cit-book" element
     */
    public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook addNewCitBook()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitBookDocument.CitBook target = null;
            target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook)get_store().add_element_user(CITBOOK$0);
            return target;
        }
    }
    /**
     * An XML Cit-book(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CitBookImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitBookDocument.CitBook
    {
        
        public CitBookImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "title");
        private static final javax.xml.namespace.QName COLL$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "coll");
        private static final javax.xml.namespace.QName AUTHORS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "authors");
        private static final javax.xml.namespace.QName IMP$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "imp");
        
        
        /**
         * Gets the "title" element
         */
        public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title target = null;
                target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title target = null;
                target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title)get_store().add_element_user(TITLE$0);
                }
                target.set(title);
            }
        }
        
        /**
         * Appends and returns a new empty "title" element
         */
        public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title addNewTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title target = null;
                target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title)get_store().add_element_user(TITLE$0);
                return target;
            }
        }
        
        /**
         * Gets the "coll" element
         */
        public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll getColl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll target = null;
                target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll)get_store().find_element_user(COLL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "coll" element
         */
        public boolean isSetColl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COLL$2) != 0;
            }
        }
        
        /**
         * Sets the "coll" element
         */
        public void setColl(gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll coll)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll target = null;
                target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll)get_store().find_element_user(COLL$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll)get_store().add_element_user(COLL$2);
                }
                target.set(coll);
            }
        }
        
        /**
         * Appends and returns a new empty "coll" element
         */
        public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll addNewColl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll target = null;
                target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll)get_store().add_element_user(COLL$2);
                return target;
            }
        }
        
        /**
         * Unsets the "coll" element
         */
        public void unsetColl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COLL$2, 0);
            }
        }
        
        /**
         * Gets the "authors" element
         */
        public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors getAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors)get_store().find_element_user(AUTHORS$4, 0);
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
        public void setAuthors(gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors authors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors)get_store().find_element_user(AUTHORS$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors)get_store().add_element_user(AUTHORS$4);
                }
                target.set(authors);
            }
        }
        
        /**
         * Appends and returns a new empty "authors" element
         */
        public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors addNewAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors)get_store().add_element_user(AUTHORS$4);
                return target;
            }
        }
        
        /**
         * Gets the "imp" element
         */
        public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp getImp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp target = null;
                target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp)get_store().find_element_user(IMP$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "imp" element
         */
        public void setImp(gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp imp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp target = null;
                target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp)get_store().find_element_user(IMP$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp)get_store().add_element_user(IMP$6);
                }
                target.set(imp);
            }
        }
        
        /**
         * Appends and returns a new empty "imp" element
         */
        public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp addNewImp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp target = null;
                target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp)get_store().add_element_user(IMP$6);
                return target;
            }
        }
        /**
         * An XML title(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TitleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Title
        {
            
            public TitleImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TITLE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Title");
            
            
            /**
             * Gets the "Title" element
             */
            public gov.nih.nlm.ncbi.www.TitleDocument.Title getTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TitleDocument.Title target = null;
                    target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().find_element_user(TITLE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Title" element
             */
            public void setTitle(gov.nih.nlm.ncbi.www.TitleDocument.Title title)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TitleDocument.Title target = null;
                    target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().find_element_user(TITLE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().add_element_user(TITLE$0);
                    }
                    target.set(title);
                }
            }
            
            /**
             * Appends and returns a new empty "Title" element
             */
            public gov.nih.nlm.ncbi.www.TitleDocument.Title addNewTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TitleDocument.Title target = null;
                    target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().add_element_user(TITLE$0);
                    return target;
                }
            }
        }
        /**
         * An XML coll(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CollImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Coll
        {
            
            public CollImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TITLE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Title");
            
            
            /**
             * Gets the "Title" element
             */
            public gov.nih.nlm.ncbi.www.TitleDocument.Title getTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TitleDocument.Title target = null;
                    target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().find_element_user(TITLE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Title" element
             */
            public void setTitle(gov.nih.nlm.ncbi.www.TitleDocument.Title title)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TitleDocument.Title target = null;
                    target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().find_element_user(TITLE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().add_element_user(TITLE$0);
                    }
                    target.set(title);
                }
            }
            
            /**
             * Appends and returns a new empty "Title" element
             */
            public gov.nih.nlm.ncbi.www.TitleDocument.Title addNewTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TitleDocument.Title target = null;
                    target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().add_element_user(TITLE$0);
                    return target;
                }
            }
        }
        /**
         * An XML authors(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AuthorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Authors
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
        public static class ImpImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitBookDocument.CitBook.Imp
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
    }
}
