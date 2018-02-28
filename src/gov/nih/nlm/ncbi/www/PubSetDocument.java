/*
 * An XML document type.
 * Localname: Pub-set
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PubSetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Pub-set(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface PubSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PubSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pubset9e1edoctype");
    
    /**
     * Gets the "Pub-set" element
     */
    gov.nih.nlm.ncbi.www.PubSetDocument.PubSet getPubSet();
    
    /**
     * Sets the "Pub-set" element
     */
    void setPubSet(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet pubSet);
    
    /**
     * Appends and returns a new empty "Pub-set" element
     */
    gov.nih.nlm.ncbi.www.PubSetDocument.PubSet addNewPubSet();
    
    /**
     * An XML Pub-set(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface PubSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PubSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pubset997celemtype");
        
        /**
         * Gets the "pub" element
         */
        gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub getPub();
        
        /**
         * True if has "pub" element
         */
        boolean isSetPub();
        
        /**
         * Sets the "pub" element
         */
        void setPub(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub pub);
        
        /**
         * Appends and returns a new empty "pub" element
         */
        gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub addNewPub();
        
        /**
         * Unsets the "pub" element
         */
        void unsetPub();
        
        /**
         * Gets the "medline" element
         */
        gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline getMedline();
        
        /**
         * True if has "medline" element
         */
        boolean isSetMedline();
        
        /**
         * Sets the "medline" element
         */
        void setMedline(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline medline);
        
        /**
         * Appends and returns a new empty "medline" element
         */
        gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline addNewMedline();
        
        /**
         * Unsets the "medline" element
         */
        void unsetMedline();
        
        /**
         * Gets the "article" element
         */
        gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article getArticle();
        
        /**
         * True if has "article" element
         */
        boolean isSetArticle();
        
        /**
         * Sets the "article" element
         */
        void setArticle(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article article);
        
        /**
         * Appends and returns a new empty "article" element
         */
        gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article addNewArticle();
        
        /**
         * Unsets the "article" element
         */
        void unsetArticle();
        
        /**
         * Gets the "journal" element
         */
        gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal getJournal();
        
        /**
         * True if has "journal" element
         */
        boolean isSetJournal();
        
        /**
         * Sets the "journal" element
         */
        void setJournal(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal journal);
        
        /**
         * Appends and returns a new empty "journal" element
         */
        gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal addNewJournal();
        
        /**
         * Unsets the "journal" element
         */
        void unsetJournal();
        
        /**
         * Gets the "book" element
         */
        gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book getBook();
        
        /**
         * True if has "book" element
         */
        boolean isSetBook();
        
        /**
         * Sets the "book" element
         */
        void setBook(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book book);
        
        /**
         * Appends and returns a new empty "book" element
         */
        gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book addNewBook();
        
        /**
         * Unsets the "book" element
         */
        void unsetBook();
        
        /**
         * Gets the "proc" element
         */
        gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc getProc();
        
        /**
         * True if has "proc" element
         */
        boolean isSetProc();
        
        /**
         * Sets the "proc" element
         */
        void setProc(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc proc);
        
        /**
         * Appends and returns a new empty "proc" element
         */
        gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc addNewProc();
        
        /**
         * Unsets the "proc" element
         */
        void unsetProc();
        
        /**
         * Gets the "patent" element
         */
        gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent getPatent();
        
        /**
         * True if has "patent" element
         */
        boolean isSetPatent();
        
        /**
         * Sets the "patent" element
         */
        void setPatent(gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent patent);
        
        /**
         * Appends and returns a new empty "patent" element
         */
        gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent addNewPatent();
        
        /**
         * Unsets the "patent" element
         */
        void unsetPatent();
        
        /**
         * An XML pub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pub extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pub.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pub86e5elemtype");
            
            /**
             * Gets array of all "Pub" elements
             */
            gov.nih.nlm.ncbi.www.PubDocument.Pub[] getPubArray();
            
            /**
             * Gets ith "Pub" element
             */
            gov.nih.nlm.ncbi.www.PubDocument.Pub getPubArray(int i);
            
            /**
             * Returns number of "Pub" element
             */
            int sizeOfPubArray();
            
            /**
             * Sets array of all "Pub" element
             */
            void setPubArray(gov.nih.nlm.ncbi.www.PubDocument.Pub[] pubArray);
            
            /**
             * Sets ith "Pub" element
             */
            void setPubArray(int i, gov.nih.nlm.ncbi.www.PubDocument.Pub pub);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Pub" element
             */
            gov.nih.nlm.ncbi.www.PubDocument.Pub insertNewPub(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Pub" element
             */
            gov.nih.nlm.ncbi.www.PubDocument.Pub addNewPub();
            
            /**
             * Removes the ith "Pub" element
             */
            void removePub(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Medline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("medline3da8elemtype");
            
            /**
             * Gets array of all "Medline-entry" elements
             */
            gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry[] getMedlineEntryArray();
            
            /**
             * Gets ith "Medline-entry" element
             */
            gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry getMedlineEntryArray(int i);
            
            /**
             * Returns number of "Medline-entry" element
             */
            int sizeOfMedlineEntryArray();
            
            /**
             * Sets array of all "Medline-entry" element
             */
            void setMedlineEntryArray(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry[] medlineEntryArray);
            
            /**
             * Sets ith "Medline-entry" element
             */
            void setMedlineEntryArray(int i, gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry medlineEntry);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Medline-entry" element
             */
            gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry insertNewMedlineEntry(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Medline-entry" element
             */
            gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry addNewMedlineEntry();
            
            /**
             * Removes the ith "Medline-entry" element
             */
            void removeMedlineEntry(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Medline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Article.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("articlef6deelemtype");
            
            /**
             * Gets array of all "Cit-art" elements
             */
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt[] getCitArtArray();
            
            /**
             * Gets ith "Cit-art" element
             */
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt getCitArtArray(int i);
            
            /**
             * Returns number of "Cit-art" element
             */
            int sizeOfCitArtArray();
            
            /**
             * Sets array of all "Cit-art" element
             */
            void setCitArtArray(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt[] citArtArray);
            
            /**
             * Sets ith "Cit-art" element
             */
            void setCitArtArray(int i, gov.nih.nlm.ncbi.www.CitArtDocument.CitArt citArt);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Cit-art" element
             */
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt insertNewCitArt(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Cit-art" element
             */
            gov.nih.nlm.ncbi.www.CitArtDocument.CitArt addNewCitArt();
            
            /**
             * Removes the ith "Cit-art" element
             */
            void removeCitArt(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Article) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Journal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("journalf31felemtype");
            
            /**
             * Gets array of all "Cit-jour" elements
             */
            gov.nih.nlm.ncbi.www.CitJourDocument.CitJour[] getCitJourArray();
            
            /**
             * Gets ith "Cit-jour" element
             */
            gov.nih.nlm.ncbi.www.CitJourDocument.CitJour getCitJourArray(int i);
            
            /**
             * Returns number of "Cit-jour" element
             */
            int sizeOfCitJourArray();
            
            /**
             * Sets array of all "Cit-jour" element
             */
            void setCitJourArray(gov.nih.nlm.ncbi.www.CitJourDocument.CitJour[] citJourArray);
            
            /**
             * Sets ith "Cit-jour" element
             */
            void setCitJourArray(int i, gov.nih.nlm.ncbi.www.CitJourDocument.CitJour citJour);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Cit-jour" element
             */
            gov.nih.nlm.ncbi.www.CitJourDocument.CitJour insertNewCitJour(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Cit-jour" element
             */
            gov.nih.nlm.ncbi.www.CitJourDocument.CitJour addNewCitJour();
            
            /**
             * Removes the ith "Cit-jour" element
             */
            void removeCitJour(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Journal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Book.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bookd301elemtype");
            
            /**
             * Gets array of all "Cit-book" elements
             */
            gov.nih.nlm.ncbi.www.CitBookDocument.CitBook[] getCitBookArray();
            
            /**
             * Gets ith "Cit-book" element
             */
            gov.nih.nlm.ncbi.www.CitBookDocument.CitBook getCitBookArray(int i);
            
            /**
             * Returns number of "Cit-book" element
             */
            int sizeOfCitBookArray();
            
            /**
             * Sets array of all "Cit-book" element
             */
            void setCitBookArray(gov.nih.nlm.ncbi.www.CitBookDocument.CitBook[] citBookArray);
            
            /**
             * Sets ith "Cit-book" element
             */
            void setCitBookArray(int i, gov.nih.nlm.ncbi.www.CitBookDocument.CitBook citBook);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Cit-book" element
             */
            gov.nih.nlm.ncbi.www.CitBookDocument.CitBook insertNewCitBook(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Cit-book" element
             */
            gov.nih.nlm.ncbi.www.CitBookDocument.CitBook addNewCitBook();
            
            /**
             * Removes the ith "Cit-book" element
             */
            void removeCitBook(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Book) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Proc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("proccd6eelemtype");
            
            /**
             * Gets array of all "Cit-proc" elements
             */
            gov.nih.nlm.ncbi.www.CitProcDocument.CitProc[] getCitProcArray();
            
            /**
             * Gets ith "Cit-proc" element
             */
            gov.nih.nlm.ncbi.www.CitProcDocument.CitProc getCitProcArray(int i);
            
            /**
             * Returns number of "Cit-proc" element
             */
            int sizeOfCitProcArray();
            
            /**
             * Sets array of all "Cit-proc" element
             */
            void setCitProcArray(gov.nih.nlm.ncbi.www.CitProcDocument.CitProc[] citProcArray);
            
            /**
             * Sets ith "Cit-proc" element
             */
            void setCitProcArray(int i, gov.nih.nlm.ncbi.www.CitProcDocument.CitProc citProc);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Cit-proc" element
             */
            gov.nih.nlm.ncbi.www.CitProcDocument.CitProc insertNewCitProc(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Cit-proc" element
             */
            gov.nih.nlm.ncbi.www.CitProcDocument.CitProc addNewCitProc();
            
            /**
             * Removes the ith "Cit-proc" element
             */
            void removeCitProc(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Proc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Patent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("patent2980elemtype");
            
            /**
             * Gets array of all "Cit-pat" elements
             */
            gov.nih.nlm.ncbi.www.CitPatDocument.CitPat[] getCitPatArray();
            
            /**
             * Gets ith "Cit-pat" element
             */
            gov.nih.nlm.ncbi.www.CitPatDocument.CitPat getCitPatArray(int i);
            
            /**
             * Returns number of "Cit-pat" element
             */
            int sizeOfCitPatArray();
            
            /**
             * Sets array of all "Cit-pat" element
             */
            void setCitPatArray(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat[] citPatArray);
            
            /**
             * Sets ith "Cit-pat" element
             */
            void setCitPatArray(int i, gov.nih.nlm.ncbi.www.CitPatDocument.CitPat citPat);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Cit-pat" element
             */
            gov.nih.nlm.ncbi.www.CitPatDocument.CitPat insertNewCitPat(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Cit-pat" element
             */
            gov.nih.nlm.ncbi.www.CitPatDocument.CitPat addNewCitPat();
            
            /**
             * Removes the ith "Cit-pat" element
             */
            void removeCitPat(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent newInstance() {
                  return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet.Patent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet newInstance() {
              return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.PubSetDocument.PubSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.PubSetDocument.PubSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.PubSetDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.PubSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.PubSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
