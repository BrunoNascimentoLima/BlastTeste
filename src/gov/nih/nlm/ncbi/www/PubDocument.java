/*
 * An XML document type.
 * Localname: Pub
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PubDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Pub(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PubDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PubDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pubb089doctype");
    
    /**
     * Gets the "Pub" element
     */
    gov.nih.nlm.ncbi.www.PubDocument.Pub getPub();
    
    /**
     * Sets the "Pub" element
     */
    void setPub(gov.nih.nlm.ncbi.www.PubDocument.Pub pub);
    
    /**
     * Appends and returns a new empty "Pub" element
     */
    gov.nih.nlm.ncbi.www.PubDocument.Pub addNewPub();
    
    /**
     * An XML Pub(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Pub extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pub.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pube992elemtype");
        
        /**
         * Gets the "gen" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen getGen();
        
        /**
         * True if has "gen" element
         */
        boolean isSetGen();
        
        /**
         * Sets the "gen" element
         */
        void setGen(gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen gen);
        
        /**
         * Appends and returns a new empty "gen" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen addNewGen();
        
        /**
         * Unsets the "gen" element
         */
        void unsetGen();
        
        /**
         * Gets the "sub" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub getSub();
        
        /**
         * True if has "sub" element
         */
        boolean isSetSub();
        
        /**
         * Sets the "sub" element
         */
        void setSub(gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub sub);
        
        /**
         * Appends and returns a new empty "sub" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub addNewSub();
        
        /**
         * Unsets the "sub" element
         */
        void unsetSub();
        
        /**
         * Gets the "medline" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline getMedline();
        
        /**
         * True if has "medline" element
         */
        boolean isSetMedline();
        
        /**
         * Sets the "medline" element
         */
        void setMedline(gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline medline);
        
        /**
         * Appends and returns a new empty "medline" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline addNewMedline();
        
        /**
         * Unsets the "medline" element
         */
        void unsetMedline();
        
        /**
         * Gets the "muid" element
         */
        java.math.BigInteger getMuid();
        
        /**
         * Gets (as xml) the "muid" element
         */
        org.apache.xmlbeans.XmlInteger xgetMuid();
        
        /**
         * True if has "muid" element
         */
        boolean isSetMuid();
        
        /**
         * Sets the "muid" element
         */
        void setMuid(java.math.BigInteger muid);
        
        /**
         * Sets (as xml) the "muid" element
         */
        void xsetMuid(org.apache.xmlbeans.XmlInteger muid);
        
        /**
         * Unsets the "muid" element
         */
        void unsetMuid();
        
        /**
         * Gets the "article" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Article getArticle();
        
        /**
         * True if has "article" element
         */
        boolean isSetArticle();
        
        /**
         * Sets the "article" element
         */
        void setArticle(gov.nih.nlm.ncbi.www.PubDocument.Pub.Article article);
        
        /**
         * Appends and returns a new empty "article" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Article addNewArticle();
        
        /**
         * Unsets the "article" element
         */
        void unsetArticle();
        
        /**
         * Gets the "journal" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal getJournal();
        
        /**
         * True if has "journal" element
         */
        boolean isSetJournal();
        
        /**
         * Sets the "journal" element
         */
        void setJournal(gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal journal);
        
        /**
         * Appends and returns a new empty "journal" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal addNewJournal();
        
        /**
         * Unsets the "journal" element
         */
        void unsetJournal();
        
        /**
         * Gets the "book" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Book getBook();
        
        /**
         * True if has "book" element
         */
        boolean isSetBook();
        
        /**
         * Sets the "book" element
         */
        void setBook(gov.nih.nlm.ncbi.www.PubDocument.Pub.Book book);
        
        /**
         * Appends and returns a new empty "book" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Book addNewBook();
        
        /**
         * Unsets the "book" element
         */
        void unsetBook();
        
        /**
         * Gets the "proc" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc getProc();
        
        /**
         * True if has "proc" element
         */
        boolean isSetProc();
        
        /**
         * Sets the "proc" element
         */
        void setProc(gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc proc);
        
        /**
         * Appends and returns a new empty "proc" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc addNewProc();
        
        /**
         * Unsets the "proc" element
         */
        void unsetProc();
        
        /**
         * Gets the "patent" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent getPatent();
        
        /**
         * True if has "patent" element
         */
        boolean isSetPatent();
        
        /**
         * Sets the "patent" element
         */
        void setPatent(gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent patent);
        
        /**
         * Appends and returns a new empty "patent" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent addNewPatent();
        
        /**
         * Unsets the "patent" element
         */
        void unsetPatent();
        
        /**
         * Gets the "pat-id" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId getPatId();
        
        /**
         * True if has "pat-id" element
         */
        boolean isSetPatId();
        
        /**
         * Sets the "pat-id" element
         */
        void setPatId(gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId patId);
        
        /**
         * Appends and returns a new empty "pat-id" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId addNewPatId();
        
        /**
         * Unsets the "pat-id" element
         */
        void unsetPatId();
        
        /**
         * Gets the "man" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Man getMan();
        
        /**
         * True if has "man" element
         */
        boolean isSetMan();
        
        /**
         * Sets the "man" element
         */
        void setMan(gov.nih.nlm.ncbi.www.PubDocument.Pub.Man man);
        
        /**
         * Appends and returns a new empty "man" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Man addNewMan();
        
        /**
         * Unsets the "man" element
         */
        void unsetMan();
        
        /**
         * Gets the "equiv" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv getEquiv();
        
        /**
         * True if has "equiv" element
         */
        boolean isSetEquiv();
        
        /**
         * Sets the "equiv" element
         */
        void setEquiv(gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv equiv);
        
        /**
         * Appends and returns a new empty "equiv" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv addNewEquiv();
        
        /**
         * Unsets the "equiv" element
         */
        void unsetEquiv();
        
        /**
         * Gets the "pmid" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid getPmid();
        
        /**
         * True if has "pmid" element
         */
        boolean isSetPmid();
        
        /**
         * Sets the "pmid" element
         */
        void setPmid(gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid pmid);
        
        /**
         * Appends and returns a new empty "pmid" element
         */
        gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid addNewPmid();
        
        /**
         * Unsets the "pmid" element
         */
        void unsetPmid();
        
        /**
         * An XML gen(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Gen extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Gen.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("gen1d4eelemtype");
            
            /**
             * Gets the "Cit-gen" element
             */
            gov.nih.nlm.ncbi.www.CitGenDocument.CitGen getCitGen();
            
            /**
             * Sets the "Cit-gen" element
             */
            void setCitGen(gov.nih.nlm.ncbi.www.CitGenDocument.CitGen citGen);
            
            /**
             * Appends and returns a new empty "Cit-gen" element
             */
            gov.nih.nlm.ncbi.www.CitGenDocument.CitGen addNewCitGen();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Gen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML sub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Sub extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sub.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("sub9c3eelemtype");
            
            /**
             * Gets the "Cit-sub" element
             */
            gov.nih.nlm.ncbi.www.CitSubDocument.CitSub getCitSub();
            
            /**
             * Sets the "Cit-sub" element
             */
            void setCitSub(gov.nih.nlm.ncbi.www.CitSubDocument.CitSub citSub);
            
            /**
             * Appends and returns a new empty "Cit-sub" element
             */
            gov.nih.nlm.ncbi.www.CitSubDocument.CitSub addNewCitSub();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Sub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML medline(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Medline extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Medline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("medline79beelemtype");
            
            /**
             * Gets the "Medline-entry" element
             */
            gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry getMedlineEntry();
            
            /**
             * Sets the "Medline-entry" element
             */
            void setMedlineEntry(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry medlineEntry);
            
            /**
             * Appends and returns a new empty "Medline-entry" element
             */
            gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry addNewMedlineEntry();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Medline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML article(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Article extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Article.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("articlec8f4elemtype");
            
            /**
             * Gets the "Cit-art" element
             */
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt getCitArt();
            
            /**
             * Sets the "Cit-art" element
             */
            void setCitArt(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt citArt);
            
            /**
             * Appends and returns a new empty "Cit-art" element
             */
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt addNewCitArt();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Article newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Article newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML journal(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Journal extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Journal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("journal9635elemtype");
            
            /**
             * Gets the "Cit-jour" element
             */
            gov.nih.nlm.ncbi.www.CitJourDocument.CitJour getCitJour();
            
            /**
             * Sets the "Cit-jour" element
             */
            void setCitJour(gov.nih.nlm.ncbi.www.CitJourDocument.CitJour citJour);
            
            /**
             * Appends and returns a new empty "Cit-jour" element
             */
            gov.nih.nlm.ncbi.www.CitJourDocument.CitJour addNewCitJour();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Journal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML book(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Book extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Book.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("book7817elemtype");
            
            /**
             * Gets the "Cit-book" element
             */
            gov.nih.nlm.ncbi.www.CitBookDocument.CitBook getCitBook();
            
            /**
             * Sets the "Cit-book" element
             */
            void setCitBook(gov.nih.nlm.ncbi.www.CitBookDocument.CitBook citBook);
            
            /**
             * Appends and returns a new empty "Cit-book" element
             */
            gov.nih.nlm.ncbi.www.CitBookDocument.CitBook addNewCitBook();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Book newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Book) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Book newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Book) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML proc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Proc extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Proc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("proc2f84elemtype");
            
            /**
             * Gets the "Cit-proc" element
             */
            gov.nih.nlm.ncbi.www.CitProcDocument.CitProc getCitProc();
            
            /**
             * Sets the "Cit-proc" element
             */
            void setCitProc(gov.nih.nlm.ncbi.www.CitProcDocument.CitProc citProc);
            
            /**
             * Appends and returns a new empty "Cit-proc" element
             */
            gov.nih.nlm.ncbi.www.CitProcDocument.CitProc addNewCitProc();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Proc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML patent(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Patent extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Patent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("patentbd96elemtype");
            
            /**
             * Gets the "Cit-pat" element
             */
            gov.nih.nlm.ncbi.www.CitPatDocument.CitPat getCitPat();
            
            /**
             * Sets the "Cit-pat" element
             */
            void setCitPat(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat citPat);
            
            /**
             * Appends and returns a new empty "Cit-pat" element
             */
            gov.nih.nlm.ncbi.www.CitPatDocument.CitPat addNewCitPat();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Patent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pat-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface PatId extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PatId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("patidc9b3elemtype");
            
            /**
             * Gets the "Id-pat" element
             */
            gov.nih.nlm.ncbi.www.IdPatDocument.IdPat getIdPat();
            
            /**
             * Sets the "Id-pat" element
             */
            void setIdPat(gov.nih.nlm.ncbi.www.IdPatDocument.IdPat idPat);
            
            /**
             * Appends and returns a new empty "Id-pat" element
             */
            gov.nih.nlm.ncbi.www.IdPatDocument.IdPat addNewIdPat();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.PatId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML man(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Man extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Man.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("mane158elemtype");
            
            /**
             * Gets the "Cit-let" element
             */
            gov.nih.nlm.ncbi.www.CitLetDocument.CitLet getCitLet();
            
            /**
             * Sets the "Cit-let" element
             */
            void setCitLet(gov.nih.nlm.ncbi.www.CitLetDocument.CitLet citLet);
            
            /**
             * Appends and returns a new empty "Cit-let" element
             */
            gov.nih.nlm.ncbi.www.CitLetDocument.CitLet addNewCitLet();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Man newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Man) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Man newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Man) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML equiv(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Equiv extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Equiv.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("equiv1e34elemtype");
            
            /**
             * Gets the "Pub-equiv" element
             */
            gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv getPubEquiv();
            
            /**
             * Sets the "Pub-equiv" element
             */
            void setPubEquiv(gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv pubEquiv);
            
            /**
             * Appends and returns a new empty "Pub-equiv" element
             */
            gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv addNewPubEquiv();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Equiv) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pmid(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pmid extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pmid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pmidf206elemtype");
            
            /**
             * Gets the "PubMedId" element
             */
            java.math.BigInteger getPubMedId();
            
            /**
             * Gets (as xml) the "PubMedId" element
             */
            org.apache.xmlbeans.XmlInteger xgetPubMedId();
            
            /**
             * Sets the "PubMedId" element
             */
            void setPubMedId(java.math.BigInteger pubMedId);
            
            /**
             * Sets (as xml) the "PubMedId" element
             */
            void xsetPubMedId(org.apache.xmlbeans.XmlInteger pubMedId);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubDocument.Pub.Pmid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PubDocument.Pub newInstance() {
              return (gov.nih.nlm.ncbi.www.PubDocument.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PubDocument.Pub newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PubDocument.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PubDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PubDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PubDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PubDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PubDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PubDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
