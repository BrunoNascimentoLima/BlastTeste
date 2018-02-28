/*
 * An XML document type.
 * Localname: Cit-art
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CitArtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Cit-art(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CitArtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitArtDocument
{
    
    public CitArtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITART$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-art");
    
    
    /**
     * Gets the "Cit-art" element
     */
    public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt getCitArt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt target = null;
            target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt)get_store().find_element_user(CITART$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Cit-art" element
     */
    public void setCitArt(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt citArt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt target = null;
            target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt)get_store().find_element_user(CITART$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt)get_store().add_element_user(CITART$0);
            }
            target.set(citArt);
        }
    }
    
    /**
     * Appends and returns a new empty "Cit-art" element
     */
    public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt addNewCitArt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt target = null;
            target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt)get_store().add_element_user(CITART$0);
            return target;
        }
    }
    /**
     * An XML Cit-art(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CitArtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitArtDocument.CitArt
    {
        
        public CitArtImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "title");
        private static final javax.xml.namespace.QName AUTHORS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "authors");
        private static final javax.xml.namespace.QName FROM$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "from");
        private static final javax.xml.namespace.QName IDS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ids");
        
        
        /**
         * Gets the "title" element
         */
        public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title target = null;
                target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
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
                return get_store().count_elements(TITLE$0) != 0;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title target = null;
                target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title)get_store().add_element_user(TITLE$0);
                }
                target.set(title);
            }
        }
        
        /**
         * Appends and returns a new empty "title" element
         */
        public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title addNewTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title target = null;
                target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title)get_store().add_element_user(TITLE$0);
                return target;
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
                get_store().remove_element(TITLE$0, 0);
            }
        }
        
        /**
         * Gets the "authors" element
         */
        public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors getAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors)get_store().find_element_user(AUTHORS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "authors" element
         */
        public boolean isSetAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AUTHORS$2) != 0;
            }
        }
        
        /**
         * Sets the "authors" element
         */
        public void setAuthors(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors authors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors)get_store().find_element_user(AUTHORS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors)get_store().add_element_user(AUTHORS$2);
                }
                target.set(authors);
            }
        }
        
        /**
         * Appends and returns a new empty "authors" element
         */
        public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors addNewAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors)get_store().add_element_user(AUTHORS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "authors" element
         */
        public void unsetAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AUTHORS$2, 0);
            }
        }
        
        /**
         * Gets the "from" element
         */
        public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From getFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From target = null;
                target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From)get_store().find_element_user(FROM$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "from" element
         */
        public void setFrom(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From from)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From target = null;
                target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From)get_store().find_element_user(FROM$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From)get_store().add_element_user(FROM$4);
                }
                target.set(from);
            }
        }
        
        /**
         * Appends and returns a new empty "from" element
         */
        public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From addNewFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From target = null;
                target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From)get_store().add_element_user(FROM$4);
                return target;
            }
        }
        
        /**
         * Gets the "ids" element
         */
        public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids getIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids)get_store().find_element_user(IDS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ids" element
         */
        public boolean isSetIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDS$6) != 0;
            }
        }
        
        /**
         * Sets the "ids" element
         */
        public void setIds(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids ids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids)get_store().find_element_user(IDS$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids)get_store().add_element_user(IDS$6);
                }
                target.set(ids);
            }
        }
        
        /**
         * Appends and returns a new empty "ids" element
         */
        public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids addNewIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids)get_store().add_element_user(IDS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "ids" element
         */
        public void unsetIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDS$6, 0);
            }
        }
        /**
         * An XML title(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TitleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Title
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
         * An XML authors(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AuthorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Authors
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
         * An XML from(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FromImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From
        {
            
            public FromImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName JOURNAL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "journal");
            private static final javax.xml.namespace.QName BOOK$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "book");
            private static final javax.xml.namespace.QName PROC$4 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "proc");
            
            
            /**
             * Gets the "journal" element
             */
            public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal getJournal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal)get_store().find_element_user(JOURNAL$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "journal" element
             */
            public boolean isSetJournal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(JOURNAL$0) != 0;
                }
            }
            
            /**
             * Sets the "journal" element
             */
            public void setJournal(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal journal)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal)get_store().find_element_user(JOURNAL$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal)get_store().add_element_user(JOURNAL$0);
                    }
                    target.set(journal);
                }
            }
            
            /**
             * Appends and returns a new empty "journal" element
             */
            public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal addNewJournal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal)get_store().add_element_user(JOURNAL$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "journal" element
             */
            public void unsetJournal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(JOURNAL$0, 0);
                }
            }
            
            /**
             * Gets the "book" element
             */
            public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book getBook()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book)get_store().find_element_user(BOOK$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "book" element
             */
            public boolean isSetBook()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BOOK$2) != 0;
                }
            }
            
            /**
             * Sets the "book" element
             */
            public void setBook(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book book)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book)get_store().find_element_user(BOOK$2, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book)get_store().add_element_user(BOOK$2);
                    }
                    target.set(book);
                }
            }
            
            /**
             * Appends and returns a new empty "book" element
             */
            public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book addNewBook()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book)get_store().add_element_user(BOOK$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "book" element
             */
            public void unsetBook()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BOOK$2, 0);
                }
            }
            
            /**
             * Gets the "proc" element
             */
            public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc getProc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc)get_store().find_element_user(PROC$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "proc" element
             */
            public boolean isSetProc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PROC$4) != 0;
                }
            }
            
            /**
             * Sets the "proc" element
             */
            public void setProc(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc proc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc)get_store().find_element_user(PROC$4, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc)get_store().add_element_user(PROC$4);
                    }
                    target.set(proc);
                }
            }
            
            /**
             * Appends and returns a new empty "proc" element
             */
            public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc addNewProc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc)get_store().add_element_user(PROC$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "proc" element
             */
            public void unsetProc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PROC$4, 0);
                }
            }
            /**
             * An XML journal(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class JournalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Journal
            {
                
                public JournalImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName CITJOUR$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-jour");
                
                
                /**
                 * Gets the "Cit-jour" element
                 */
                public gov.nih.nlm.ncbi.www.CitJourDocument.CitJour getCitJour()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.CitJourDocument.CitJour target = null;
                      target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour)get_store().find_element_user(CITJOUR$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Cit-jour" element
                 */
                public void setCitJour(gov.nih.nlm.ncbi.www.CitJourDocument.CitJour citJour)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.CitJourDocument.CitJour target = null;
                      target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour)get_store().find_element_user(CITJOUR$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour)get_store().add_element_user(CITJOUR$0);
                      }
                      target.set(citJour);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Cit-jour" element
                 */
                public gov.nih.nlm.ncbi.www.CitJourDocument.CitJour addNewCitJour()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.CitJourDocument.CitJour target = null;
                      target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour)get_store().add_element_user(CITJOUR$0);
                      return target;
                    }
                }
            }
            /**
             * An XML book(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class BookImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Book
            {
                
                public BookImpl(org.apache.xmlbeans.SchemaType sType)
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
            }
            /**
             * An XML proc(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class ProcImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.From.Proc
            {
                
                public ProcImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName CITPROC$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-proc");
                
                
                /**
                 * Gets the "Cit-proc" element
                 */
                public gov.nih.nlm.ncbi.www.CitProcDocument.CitProc getCitProc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.CitProcDocument.CitProc target = null;
                      target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc)get_store().find_element_user(CITPROC$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Cit-proc" element
                 */
                public void setCitProc(gov.nih.nlm.ncbi.www.CitProcDocument.CitProc citProc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.CitProcDocument.CitProc target = null;
                      target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc)get_store().find_element_user(CITPROC$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc)get_store().add_element_user(CITPROC$0);
                      }
                      target.set(citProc);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Cit-proc" element
                 */
                public gov.nih.nlm.ncbi.www.CitProcDocument.CitProc addNewCitProc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.CitProcDocument.CitProc target = null;
                      target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc)get_store().add_element_user(CITPROC$0);
                      return target;
                    }
                }
            }
        }
        /**
         * An XML ids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitArtDocument.CitArt.Ids
        {
            
            public IdsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ARTICLEIDSET$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ArticleIdSet");
            
            
            /**
             * Gets the "ArticleIdSet" element
             */
            public gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet getArticleIdSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet target = null;
                    target = (gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet)get_store().find_element_user(ARTICLEIDSET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "ArticleIdSet" element
             */
            public void setArticleIdSet(gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet articleIdSet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet target = null;
                    target = (gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet)get_store().find_element_user(ARTICLEIDSET$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet)get_store().add_element_user(ARTICLEIDSET$0);
                    }
                    target.set(articleIdSet);
                }
            }
            
            /**
             * Appends and returns a new empty "ArticleIdSet" element
             */
            public gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet addNewArticleIdSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet target = null;
                    target = (gov.nih.nlm.ncbi.www.ArticleIdSetDocument.ArticleIdSet)get_store().add_element_user(ARTICLEIDSET$0);
                    return target;
                }
            }
        }
    }
}
