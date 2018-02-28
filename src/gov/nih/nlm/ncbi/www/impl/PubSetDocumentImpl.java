/*
 * An XML document type.
 * Localname: Pub-set
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PubSetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Pub-set(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PubSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubSetDocument
{
    
    public PubSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBSET$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Pub-set");
    
    
    /**
     * Gets the "Pub-set" element
     */
    public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet getPubSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubSetDocument.PubSet target = null;
            target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet)get_store().find_element_user(PUBSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Pub-set" element
     */
    public void setPubSet(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet pubSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubSetDocument.PubSet target = null;
            target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet)get_store().find_element_user(PUBSET$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet)get_store().add_element_user(PUBSET$0);
            }
            target.set(pubSet);
        }
    }
    
    /**
     * Appends and returns a new empty "Pub-set" element
     */
    public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet addNewPubSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubSetDocument.PubSet target = null;
            target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet)get_store().add_element_user(PUBSET$0);
            return target;
        }
    }
    /**
     * An XML Pub-set(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PubSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubSetDocument.PubSet
    {
        
        public PubSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PUB$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pub");
        private static final javax.xml.namespace.QName MEDLINE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "medline");
        private static final javax.xml.namespace.QName ARTICLE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "article");
        private static final javax.xml.namespace.QName JOURNAL$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "journal");
        private static final javax.xml.namespace.QName BOOK$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "book");
        private static final javax.xml.namespace.QName PROC$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "proc");
        private static final javax.xml.namespace.QName PATENT$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "patent");
        
        
        /**
         * Gets the "pub" element
         */
        public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub getPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub)get_store().find_element_user(PUB$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pub" element
         */
        public boolean isSetPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUB$0) != 0;
            }
        }
        
        /**
         * Sets the "pub" element
         */
        public void setPub(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub pub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub)get_store().find_element_user(PUB$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub)get_store().add_element_user(PUB$0);
                }
                target.set(pub);
            }
        }
        
        /**
         * Appends and returns a new empty "pub" element
         */
        public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub addNewPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub)get_store().add_element_user(PUB$0);
                return target;
            }
        }
        
        /**
         * Unsets the "pub" element
         */
        public void unsetPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUB$0, 0);
            }
        }
        
        /**
         * Gets the "medline" element
         */
        public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline getMedline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline)get_store().find_element_user(MEDLINE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "medline" element
         */
        public boolean isSetMedline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEDLINE$2) != 0;
            }
        }
        
        /**
         * Sets the "medline" element
         */
        public void setMedline(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline medline)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline)get_store().find_element_user(MEDLINE$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline)get_store().add_element_user(MEDLINE$2);
                }
                target.set(medline);
            }
        }
        
        /**
         * Appends and returns a new empty "medline" element
         */
        public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline addNewMedline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline)get_store().add_element_user(MEDLINE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "medline" element
         */
        public void unsetMedline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEDLINE$2, 0);
            }
        }
        
        /**
         * Gets the "article" element
         */
        public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article getArticle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article)get_store().find_element_user(ARTICLE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "article" element
         */
        public boolean isSetArticle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARTICLE$4) != 0;
            }
        }
        
        /**
         * Sets the "article" element
         */
        public void setArticle(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article article)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article)get_store().find_element_user(ARTICLE$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article)get_store().add_element_user(ARTICLE$4);
                }
                target.set(article);
            }
        }
        
        /**
         * Appends and returns a new empty "article" element
         */
        public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article addNewArticle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article)get_store().add_element_user(ARTICLE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "article" element
         */
        public void unsetArticle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARTICLE$4, 0);
            }
        }
        
        /**
         * Gets the "journal" element
         */
        public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal getJournal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal)get_store().find_element_user(JOURNAL$6, 0);
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
                return get_store().count_elements(JOURNAL$6) != 0;
            }
        }
        
        /**
         * Sets the "journal" element
         */
        public void setJournal(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal journal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal)get_store().find_element_user(JOURNAL$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal)get_store().add_element_user(JOURNAL$6);
                }
                target.set(journal);
            }
        }
        
        /**
         * Appends and returns a new empty "journal" element
         */
        public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal addNewJournal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal)get_store().add_element_user(JOURNAL$6);
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
                get_store().remove_element(JOURNAL$6, 0);
            }
        }
        
        /**
         * Gets the "book" element
         */
        public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book getBook()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book)get_store().find_element_user(BOOK$8, 0);
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
                return get_store().count_elements(BOOK$8) != 0;
            }
        }
        
        /**
         * Sets the "book" element
         */
        public void setBook(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book book)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book)get_store().find_element_user(BOOK$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book)get_store().add_element_user(BOOK$8);
                }
                target.set(book);
            }
        }
        
        /**
         * Appends and returns a new empty "book" element
         */
        public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book addNewBook()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book)get_store().add_element_user(BOOK$8);
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
                get_store().remove_element(BOOK$8, 0);
            }
        }
        
        /**
         * Gets the "proc" element
         */
        public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc getProc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc)get_store().find_element_user(PROC$10, 0);
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
                return get_store().count_elements(PROC$10) != 0;
            }
        }
        
        /**
         * Sets the "proc" element
         */
        public void setProc(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc proc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc)get_store().find_element_user(PROC$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc)get_store().add_element_user(PROC$10);
                }
                target.set(proc);
            }
        }
        
        /**
         * Appends and returns a new empty "proc" element
         */
        public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc addNewProc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc)get_store().add_element_user(PROC$10);
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
                get_store().remove_element(PROC$10, 0);
            }
        }
        
        /**
         * Gets the "patent" element
         */
        public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent getPatent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent)get_store().find_element_user(PATENT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "patent" element
         */
        public boolean isSetPatent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PATENT$12) != 0;
            }
        }
        
        /**
         * Sets the "patent" element
         */
        public void setPatent(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent patent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent)get_store().find_element_user(PATENT$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent)get_store().add_element_user(PATENT$12);
                }
                target.set(patent);
            }
        }
        
        /**
         * Appends and returns a new empty "patent" element
         */
        public gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent addNewPatent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent target = null;
                target = (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent)get_store().add_element_user(PATENT$12);
                return target;
            }
        }
        
        /**
         * Unsets the "patent" element
         */
        public void unsetPatent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PATENT$12, 0);
            }
        }
        /**
         * An XML pub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PubImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub
        {
            
            public PubImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUB$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Pub");
            
            
            /**
             * Gets array of all "Pub" elements
             */
            public gov.nih.nlm.ncbi.www.PubDocument.Pub[] getPubArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PUB$0, targetList);
                    gov.nih.nlm.ncbi.www.PubDocument.Pub[] result = new gov.nih.nlm.ncbi.www.PubDocument.Pub[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Pub" element
             */
            public gov.nih.nlm.ncbi.www.PubDocument.Pub getPubArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubDocument.Pub target = null;
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().find_element_user(PUB$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Pub" element
             */
            public int sizeOfPubArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PUB$0);
                }
            }
            
            /**
             * Sets array of all "Pub" element
             */
            public void setPubArray(gov.nih.nlm.ncbi.www.PubDocument.Pub[] pubArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(pubArray, PUB$0);
                }
            }
            
            /**
             * Sets ith "Pub" element
             */
            public void setPubArray(int i, gov.nih.nlm.ncbi.www.PubDocument.Pub pub)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubDocument.Pub target = null;
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().find_element_user(PUB$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(pub);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Pub" element
             */
            public gov.nih.nlm.ncbi.www.PubDocument.Pub insertNewPub(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubDocument.Pub target = null;
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().insert_element_user(PUB$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Pub" element
             */
            public gov.nih.nlm.ncbi.www.PubDocument.Pub addNewPub()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubDocument.Pub target = null;
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().add_element_user(PUB$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Pub" element
             */
            public void removePub(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PUB$0, i);
                }
            }
        }
        /**
         * An XML medline(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MedlineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline
        {
            
            public MedlineImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MEDLINEENTRY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Medline-entry");
            
            
            /**
             * Gets array of all "Medline-entry" elements
             */
            public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry[] getMedlineEntryArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MEDLINEENTRY$0, targetList);
                    gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry[] result = new gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Medline-entry" element
             */
            public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry getMedlineEntryArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry)get_store().find_element_user(MEDLINEENTRY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Medline-entry" element
             */
            public int sizeOfMedlineEntryArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MEDLINEENTRY$0);
                }
            }
            
            /**
             * Sets array of all "Medline-entry" element
             */
            public void setMedlineEntryArray(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry[] medlineEntryArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(medlineEntryArray, MEDLINEENTRY$0);
                }
            }
            
            /**
             * Sets ith "Medline-entry" element
             */
            public void setMedlineEntryArray(int i, gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry medlineEntry)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry)get_store().find_element_user(MEDLINEENTRY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(medlineEntry);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Medline-entry" element
             */
            public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry insertNewMedlineEntry(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry)get_store().insert_element_user(MEDLINEENTRY$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Medline-entry" element
             */
            public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry addNewMedlineEntry()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry)get_store().add_element_user(MEDLINEENTRY$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Medline-entry" element
             */
            public void removeMedlineEntry(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MEDLINEENTRY$0, i);
                }
            }
        }
        /**
         * An XML article(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ArticleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article
        {
            
            public ArticleImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CITART$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-art");
            
            
            /**
             * Gets array of all "Cit-art" elements
             */
            public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt[] getCitArtArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CITART$0, targetList);
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt[] result = new gov.nih.nlm.ncbi.www.CitArtDocument.CitArt[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Cit-art" element
             */
            public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt getCitArtArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt)get_store().find_element_user(CITART$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Cit-art" element
             */
            public int sizeOfCitArtArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CITART$0);
                }
            }
            
            /**
             * Sets array of all "Cit-art" element
             */
            public void setCitArtArray(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt[] citArtArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(citArtArray, CITART$0);
                }
            }
            
            /**
             * Sets ith "Cit-art" element
             */
            public void setCitArtArray(int i, gov.nih.nlm.ncbi.www.CitArtDocument.CitArt citArt)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt)get_store().find_element_user(CITART$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(citArt);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Cit-art" element
             */
            public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt insertNewCitArt(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt)get_store().insert_element_user(CITART$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Cit-art" element
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
             * Removes the ith "Cit-art" element
             */
            public void removeCitArt(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CITART$0, i);
                }
            }
        }
        /**
         * An XML journal(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class JournalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal
        {
            
            public JournalImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CITJOUR$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-jour");
            
            
            /**
             * Gets array of all "Cit-jour" elements
             */
            public gov.nih.nlm.ncbi.www.CitJourDocument.CitJour[] getCitJourArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CITJOUR$0, targetList);
                    gov.nih.nlm.ncbi.www.CitJourDocument.CitJour[] result = new gov.nih.nlm.ncbi.www.CitJourDocument.CitJour[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Cit-jour" element
             */
            public gov.nih.nlm.ncbi.www.CitJourDocument.CitJour getCitJourArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitJourDocument.CitJour target = null;
                    target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour)get_store().find_element_user(CITJOUR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Cit-jour" element
             */
            public int sizeOfCitJourArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CITJOUR$0);
                }
            }
            
            /**
             * Sets array of all "Cit-jour" element
             */
            public void setCitJourArray(gov.nih.nlm.ncbi.www.CitJourDocument.CitJour[] citJourArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(citJourArray, CITJOUR$0);
                }
            }
            
            /**
             * Sets ith "Cit-jour" element
             */
            public void setCitJourArray(int i, gov.nih.nlm.ncbi.www.CitJourDocument.CitJour citJour)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitJourDocument.CitJour target = null;
                    target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour)get_store().find_element_user(CITJOUR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(citJour);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Cit-jour" element
             */
            public gov.nih.nlm.ncbi.www.CitJourDocument.CitJour insertNewCitJour(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitJourDocument.CitJour target = null;
                    target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour)get_store().insert_element_user(CITJOUR$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Cit-jour" element
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
            
            /**
             * Removes the ith "Cit-jour" element
             */
            public void removeCitJour(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CITJOUR$0, i);
                }
            }
        }
        /**
         * An XML book(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BookImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book
        {
            
            public BookImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CITBOOK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-book");
            
            
            /**
             * Gets array of all "Cit-book" elements
             */
            public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook[] getCitBookArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CITBOOK$0, targetList);
                    gov.nih.nlm.ncbi.www.CitBookDocument.CitBook[] result = new gov.nih.nlm.ncbi.www.CitBookDocument.CitBook[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Cit-book" element
             */
            public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook getCitBookArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitBookDocument.CitBook target = null;
                    target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook)get_store().find_element_user(CITBOOK$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Cit-book" element
             */
            public int sizeOfCitBookArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CITBOOK$0);
                }
            }
            
            /**
             * Sets array of all "Cit-book" element
             */
            public void setCitBookArray(gov.nih.nlm.ncbi.www.CitBookDocument.CitBook[] citBookArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(citBookArray, CITBOOK$0);
                }
            }
            
            /**
             * Sets ith "Cit-book" element
             */
            public void setCitBookArray(int i, gov.nih.nlm.ncbi.www.CitBookDocument.CitBook citBook)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitBookDocument.CitBook target = null;
                    target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook)get_store().find_element_user(CITBOOK$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(citBook);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Cit-book" element
             */
            public gov.nih.nlm.ncbi.www.CitBookDocument.CitBook insertNewCitBook(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitBookDocument.CitBook target = null;
                    target = (gov.nih.nlm.ncbi.www.CitBookDocument.CitBook)get_store().insert_element_user(CITBOOK$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Cit-book" element
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
             * Removes the ith "Cit-book" element
             */
            public void removeCitBook(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CITBOOK$0, i);
                }
            }
        }
        /**
         * An XML proc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProcImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc
        {
            
            public ProcImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CITPROC$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-proc");
            
            
            /**
             * Gets array of all "Cit-proc" elements
             */
            public gov.nih.nlm.ncbi.www.CitProcDocument.CitProc[] getCitProcArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CITPROC$0, targetList);
                    gov.nih.nlm.ncbi.www.CitProcDocument.CitProc[] result = new gov.nih.nlm.ncbi.www.CitProcDocument.CitProc[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Cit-proc" element
             */
            public gov.nih.nlm.ncbi.www.CitProcDocument.CitProc getCitProcArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitProcDocument.CitProc target = null;
                    target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc)get_store().find_element_user(CITPROC$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Cit-proc" element
             */
            public int sizeOfCitProcArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CITPROC$0);
                }
            }
            
            /**
             * Sets array of all "Cit-proc" element
             */
            public void setCitProcArray(gov.nih.nlm.ncbi.www.CitProcDocument.CitProc[] citProcArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(citProcArray, CITPROC$0);
                }
            }
            
            /**
             * Sets ith "Cit-proc" element
             */
            public void setCitProcArray(int i, gov.nih.nlm.ncbi.www.CitProcDocument.CitProc citProc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitProcDocument.CitProc target = null;
                    target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc)get_store().find_element_user(CITPROC$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(citProc);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Cit-proc" element
             */
            public gov.nih.nlm.ncbi.www.CitProcDocument.CitProc insertNewCitProc(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitProcDocument.CitProc target = null;
                    target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc)get_store().insert_element_user(CITPROC$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Cit-proc" element
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
            
            /**
             * Removes the ith "Cit-proc" element
             */
            public void removeCitProc(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CITPROC$0, i);
                }
            }
        }
        /**
         * An XML patent(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PatentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent
        {
            
            public PatentImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CITPAT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-pat");
            
            
            /**
             * Gets array of all "Cit-pat" elements
             */
            public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat[] getCitPatArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CITPAT$0, targetList);
                    gov.nih.nlm.ncbi.www.CitPatDocument.CitPat[] result = new gov.nih.nlm.ncbi.www.CitPatDocument.CitPat[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Cit-pat" element
             */
            public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat getCitPatArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitPatDocument.CitPat target = null;
                    target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat)get_store().find_element_user(CITPAT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Cit-pat" element
             */
            public int sizeOfCitPatArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CITPAT$0);
                }
            }
            
            /**
             * Sets array of all "Cit-pat" element
             */
            public void setCitPatArray(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat[] citPatArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(citPatArray, CITPAT$0);
                }
            }
            
            /**
             * Sets ith "Cit-pat" element
             */
            public void setCitPatArray(int i, gov.nih.nlm.ncbi.www.CitPatDocument.CitPat citPat)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitPatDocument.CitPat target = null;
                    target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat)get_store().find_element_user(CITPAT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(citPat);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Cit-pat" element
             */
            public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat insertNewCitPat(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitPatDocument.CitPat target = null;
                    target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat)get_store().insert_element_user(CITPAT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Cit-pat" element
             */
            public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat addNewCitPat()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitPatDocument.CitPat target = null;
                    target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat)get_store().add_element_user(CITPAT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Cit-pat" element
             */
            public void removeCitPat(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CITPAT$0, i);
                }
            }
        }
    }
}
