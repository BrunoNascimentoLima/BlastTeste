/*
 * An XML document type.
 * Localname: Pub
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PubDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Pub(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PubDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubDocument
{
    
    public PubDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUB$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Pub");
    
    
    /**
     * Gets the "Pub" element
     */
    public gov.nih.nlm.ncbi.www.PubDocument.Pub getPub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubDocument.Pub target = null;
            target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().find_element_user(PUB$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Pub" element
     */
    public void setPub(gov.nih.nlm.ncbi.www.PubDocument.Pub pub)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubDocument.Pub target = null;
            target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().find_element_user(PUB$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().add_element_user(PUB$0);
            }
            target.set(pub);
        }
    }
    
    /**
     * Appends and returns a new empty "Pub" element
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
     * An XML Pub(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PubImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubDocument.Pub
    {
        
        public PubImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GEN$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gen");
        private static final javax.xml.namespace.QName SUB$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "sub");
        private static final javax.xml.namespace.QName MEDLINE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "medline");
        private static final javax.xml.namespace.QName MUID$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "muid");
        private static final javax.xml.namespace.QName ARTICLE$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "article");
        private static final javax.xml.namespace.QName JOURNAL$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "journal");
        private static final javax.xml.namespace.QName BOOK$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "book");
        private static final javax.xml.namespace.QName PROC$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "proc");
        private static final javax.xml.namespace.QName PATENT$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "patent");
        private static final javax.xml.namespace.QName PATID$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pat-id");
        private static final javax.xml.namespace.QName MAN$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "man");
        private static final javax.xml.namespace.QName EQUIV$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "equiv");
        private static final javax.xml.namespace.QName PMID$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pmid");
        
        
        /**
         * Gets the "gen" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen getGen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen)get_store().find_element_user(GEN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "gen" element
         */
        public boolean isSetGen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GEN$0) != 0;
            }
        }
        
        /**
         * Sets the "gen" element
         */
        public void setGen(gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen gen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen)get_store().find_element_user(GEN$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen)get_store().add_element_user(GEN$0);
                }
                target.set(gen);
            }
        }
        
        /**
         * Appends and returns a new empty "gen" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen addNewGen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen)get_store().add_element_user(GEN$0);
                return target;
            }
        }
        
        /**
         * Unsets the "gen" element
         */
        public void unsetGen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GEN$0, 0);
            }
        }
        
        /**
         * Gets the "sub" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub getSub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub)get_store().find_element_user(SUB$2, 0);
                if (target == null)
                {
                    return null;
                }
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
                return get_store().count_elements(SUB$2) != 0;
            }
        }
        
        /**
         * Sets the "sub" element
         */
        public void setSub(gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub sub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub)get_store().find_element_user(SUB$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub)get_store().add_element_user(SUB$2);
                }
                target.set(sub);
            }
        }
        
        /**
         * Appends and returns a new empty "sub" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub addNewSub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub)get_store().add_element_user(SUB$2);
                return target;
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
                get_store().remove_element(SUB$2, 0);
            }
        }
        
        /**
         * Gets the "medline" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline getMedline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline)get_store().find_element_user(MEDLINE$4, 0);
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
                return get_store().count_elements(MEDLINE$4) != 0;
            }
        }
        
        /**
         * Sets the "medline" element
         */
        public void setMedline(gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline medline)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline)get_store().find_element_user(MEDLINE$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline)get_store().add_element_user(MEDLINE$4);
                }
                target.set(medline);
            }
        }
        
        /**
         * Appends and returns a new empty "medline" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline addNewMedline()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline)get_store().add_element_user(MEDLINE$4);
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
                get_store().remove_element(MEDLINE$4, 0);
            }
        }
        
        /**
         * Gets the "muid" element
         */
        public java.math.BigInteger getMuid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "muid" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMuid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MUID$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "muid" element
         */
        public boolean isSetMuid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MUID$6) != 0;
            }
        }
        
        /**
         * Sets the "muid" element
         */
        public void setMuid(java.math.BigInteger muid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MUID$6);
                }
                target.setBigIntegerValue(muid);
            }
        }
        
        /**
         * Sets (as xml) the "muid" element
         */
        public void xsetMuid(org.apache.xmlbeans.XmlInteger muid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MUID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MUID$6);
                }
                target.set(muid);
            }
        }
        
        /**
         * Unsets the "muid" element
         */
        public void unsetMuid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MUID$6, 0);
            }
        }
        
        /**
         * Gets the "article" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Article getArticle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Article target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Article)get_store().find_element_user(ARTICLE$8, 0);
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
                return get_store().count_elements(ARTICLE$8) != 0;
            }
        }
        
        /**
         * Sets the "article" element
         */
        public void setArticle(gov.nih.nlm.ncbi.www.PubDocument.Pub.Article article)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Article target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Article)get_store().find_element_user(ARTICLE$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Article)get_store().add_element_user(ARTICLE$8);
                }
                target.set(article);
            }
        }
        
        /**
         * Appends and returns a new empty "article" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Article addNewArticle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Article target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Article)get_store().add_element_user(ARTICLE$8);
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
                get_store().remove_element(ARTICLE$8, 0);
            }
        }
        
        /**
         * Gets the "journal" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal getJournal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal)get_store().find_element_user(JOURNAL$10, 0);
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
                return get_store().count_elements(JOURNAL$10) != 0;
            }
        }
        
        /**
         * Sets the "journal" element
         */
        public void setJournal(gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal journal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal)get_store().find_element_user(JOURNAL$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal)get_store().add_element_user(JOURNAL$10);
                }
                target.set(journal);
            }
        }
        
        /**
         * Appends and returns a new empty "journal" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal addNewJournal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal)get_store().add_element_user(JOURNAL$10);
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
                get_store().remove_element(JOURNAL$10, 0);
            }
        }
        
        /**
         * Gets the "book" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Book getBook()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Book target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Book)get_store().find_element_user(BOOK$12, 0);
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
                return get_store().count_elements(BOOK$12) != 0;
            }
        }
        
        /**
         * Sets the "book" element
         */
        public void setBook(gov.nih.nlm.ncbi.www.PubDocument.Pub.Book book)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Book target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Book)get_store().find_element_user(BOOK$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Book)get_store().add_element_user(BOOK$12);
                }
                target.set(book);
            }
        }
        
        /**
         * Appends and returns a new empty "book" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Book addNewBook()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Book target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Book)get_store().add_element_user(BOOK$12);
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
                get_store().remove_element(BOOK$12, 0);
            }
        }
        
        /**
         * Gets the "proc" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc getProc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc)get_store().find_element_user(PROC$14, 0);
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
                return get_store().count_elements(PROC$14) != 0;
            }
        }
        
        /**
         * Sets the "proc" element
         */
        public void setProc(gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc proc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc)get_store().find_element_user(PROC$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc)get_store().add_element_user(PROC$14);
                }
                target.set(proc);
            }
        }
        
        /**
         * Appends and returns a new empty "proc" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc addNewProc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc)get_store().add_element_user(PROC$14);
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
                get_store().remove_element(PROC$14, 0);
            }
        }
        
        /**
         * Gets the "patent" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent getPatent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent)get_store().find_element_user(PATENT$16, 0);
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
                return get_store().count_elements(PATENT$16) != 0;
            }
        }
        
        /**
         * Sets the "patent" element
         */
        public void setPatent(gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent patent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent)get_store().find_element_user(PATENT$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent)get_store().add_element_user(PATENT$16);
                }
                target.set(patent);
            }
        }
        
        /**
         * Appends and returns a new empty "patent" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent addNewPatent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent)get_store().add_element_user(PATENT$16);
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
                get_store().remove_element(PATENT$16, 0);
            }
        }
        
        /**
         * Gets the "pat-id" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId getPatId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId)get_store().find_element_user(PATID$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pat-id" element
         */
        public boolean isSetPatId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PATID$18) != 0;
            }
        }
        
        /**
         * Sets the "pat-id" element
         */
        public void setPatId(gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId patId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId)get_store().find_element_user(PATID$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId)get_store().add_element_user(PATID$18);
                }
                target.set(patId);
            }
        }
        
        /**
         * Appends and returns a new empty "pat-id" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId addNewPatId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId)get_store().add_element_user(PATID$18);
                return target;
            }
        }
        
        /**
         * Unsets the "pat-id" element
         */
        public void unsetPatId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PATID$18, 0);
            }
        }
        
        /**
         * Gets the "man" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Man getMan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Man target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Man)get_store().find_element_user(MAN$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "man" element
         */
        public boolean isSetMan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAN$20) != 0;
            }
        }
        
        /**
         * Sets the "man" element
         */
        public void setMan(gov.nih.nlm.ncbi.www.PubDocument.Pub.Man man)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Man target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Man)get_store().find_element_user(MAN$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Man)get_store().add_element_user(MAN$20);
                }
                target.set(man);
            }
        }
        
        /**
         * Appends and returns a new empty "man" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Man addNewMan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Man target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Man)get_store().add_element_user(MAN$20);
                return target;
            }
        }
        
        /**
         * Unsets the "man" element
         */
        public void unsetMan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAN$20, 0);
            }
        }
        
        /**
         * Gets the "equiv" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv getEquiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv)get_store().find_element_user(EQUIV$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "equiv" element
         */
        public boolean isSetEquiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EQUIV$22) != 0;
            }
        }
        
        /**
         * Sets the "equiv" element
         */
        public void setEquiv(gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv equiv)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv)get_store().find_element_user(EQUIV$22, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv)get_store().add_element_user(EQUIV$22);
                }
                target.set(equiv);
            }
        }
        
        /**
         * Appends and returns a new empty "equiv" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv addNewEquiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv)get_store().add_element_user(EQUIV$22);
                return target;
            }
        }
        
        /**
         * Unsets the "equiv" element
         */
        public void unsetEquiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EQUIV$22, 0);
            }
        }
        
        /**
         * Gets the "pmid" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid getPmid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid)get_store().find_element_user(PMID$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pmid" element
         */
        public boolean isSetPmid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PMID$24) != 0;
            }
        }
        
        /**
         * Sets the "pmid" element
         */
        public void setPmid(gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid pmid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid)get_store().find_element_user(PMID$24, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid)get_store().add_element_user(PMID$24);
                }
                target.set(pmid);
            }
        }
        
        /**
         * Appends and returns a new empty "pmid" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid addNewPmid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid)get_store().add_element_user(PMID$24);
                return target;
            }
        }
        
        /**
         * Unsets the "pmid" element
         */
        public void unsetPmid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PMID$24, 0);
            }
        }
        /**
         * An XML gen(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen
        {
            
            public GenImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CITGEN$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-gen");
            
            
            /**
             * Gets the "Cit-gen" element
             */
            public gov.nih.nlm.ncbi.www.CitGenDocument.CitGen getCitGen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitGenDocument.CitGen target = null;
                    target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen)get_store().find_element_user(CITGEN$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Cit-gen" element
             */
            public void setCitGen(gov.nih.nlm.ncbi.www.CitGenDocument.CitGen citGen)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitGenDocument.CitGen target = null;
                    target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen)get_store().find_element_user(CITGEN$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen)get_store().add_element_user(CITGEN$0);
                    }
                    target.set(citGen);
                }
            }
            
            /**
             * Appends and returns a new empty "Cit-gen" element
             */
            public gov.nih.nlm.ncbi.www.CitGenDocument.CitGen addNewCitGen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitGenDocument.CitGen target = null;
                    target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen)get_store().add_element_user(CITGEN$0);
                    return target;
                }
            }
        }
        /**
         * An XML sub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SubImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub
        {
            
            public SubImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
        /**
         * An XML medline(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MedlineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline
        {
            
            public MedlineImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MEDLINEENTRY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Medline-entry");
            
            
            /**
             * Gets the "Medline-entry" element
             */
            public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry getMedlineEntry()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry)get_store().find_element_user(MEDLINEENTRY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Medline-entry" element
             */
            public void setMedlineEntry(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry medlineEntry)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry)get_store().find_element_user(MEDLINEENTRY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry)get_store().add_element_user(MEDLINEENTRY$0);
                    }
                    target.set(medlineEntry);
                }
            }
            
            /**
             * Appends and returns a new empty "Medline-entry" element
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
        }
        /**
         * An XML article(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ArticleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubDocument.Pub.Article
        {
            
            public ArticleImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
        /**
         * An XML journal(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class JournalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal
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
        public static class BookImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubDocument.Pub.Book
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
        public static class ProcImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc
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
        /**
         * An XML patent(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PatentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent
        {
            
            public PatentImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CITPAT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-pat");
            
            
            /**
             * Gets the "Cit-pat" element
             */
            public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat getCitPat()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitPatDocument.CitPat target = null;
                    target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat)get_store().find_element_user(CITPAT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Cit-pat" element
             */
            public void setCitPat(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat citPat)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitPatDocument.CitPat target = null;
                    target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat)get_store().find_element_user(CITPAT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat)get_store().add_element_user(CITPAT$0);
                    }
                    target.set(citPat);
                }
            }
            
            /**
             * Appends and returns a new empty "Cit-pat" element
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
        }
        /**
         * An XML pat-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PatIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId
        {
            
            public PatIdImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
        /**
         * An XML man(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ManImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubDocument.Pub.Man
        {
            
            public ManImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CITLET$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-let");
            
            
            /**
             * Gets the "Cit-let" element
             */
            public gov.nih.nlm.ncbi.www.CitLetDocument.CitLet getCitLet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitLetDocument.CitLet target = null;
                    target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet)get_store().find_element_user(CITLET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Cit-let" element
             */
            public void setCitLet(gov.nih.nlm.ncbi.www.CitLetDocument.CitLet citLet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitLetDocument.CitLet target = null;
                    target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet)get_store().find_element_user(CITLET$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet)get_store().add_element_user(CITLET$0);
                    }
                    target.set(citLet);
                }
            }
            
            /**
             * Appends and returns a new empty "Cit-let" element
             */
            public gov.nih.nlm.ncbi.www.CitLetDocument.CitLet addNewCitLet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitLetDocument.CitLet target = null;
                    target = (gov.nih.nlm.ncbi.www.CitLetDocument.CitLet)get_store().add_element_user(CITLET$0);
                    return target;
                }
            }
        }
        /**
         * An XML equiv(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class EquivImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv
        {
            
            public EquivImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBEQUIV$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Pub-equiv");
            
            
            /**
             * Gets the "Pub-equiv" element
             */
            public gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv getPubEquiv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv target = null;
                    target = (gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv)get_store().find_element_user(PUBEQUIV$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Pub-equiv" element
             */
            public void setPubEquiv(gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv pubEquiv)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv target = null;
                    target = (gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv)get_store().find_element_user(PUBEQUIV$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv)get_store().add_element_user(PUBEQUIV$0);
                    }
                    target.set(pubEquiv);
                }
            }
            
            /**
             * Appends and returns a new empty "Pub-equiv" element
             */
            public gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv addNewPubEquiv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv target = null;
                    target = (gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv)get_store().add_element_user(PUBEQUIV$0);
                    return target;
                }
            }
        }
        /**
         * An XML pmid(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PmidImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid
        {
            
            public PmidImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBMEDID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PubMedId");
            
            
            /**
             * Gets the "PubMedId" element
             */
            public java.math.BigInteger getPubMedId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBMEDID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "PubMedId" element
             */
            public org.apache.xmlbeans.XmlInteger xgetPubMedId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PUBMEDID$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "PubMedId" element
             */
            public void setPubMedId(java.math.BigInteger pubMedId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBMEDID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBMEDID$0);
                    }
                    target.setBigIntegerValue(pubMedId);
                }
            }
            
            /**
             * Sets (as xml) the "PubMedId" element
             */
            public void xsetPubMedId(org.apache.xmlbeans.XmlInteger pubMedId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PUBMEDID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PUBMEDID$0);
                    }
                    target.set(pubMedId);
                }
            }
        }
    }
}
