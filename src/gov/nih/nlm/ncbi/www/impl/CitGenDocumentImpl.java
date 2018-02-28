/*
 * An XML document type.
 * Localname: Cit-gen
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CitGenDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Cit-gen(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CitGenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitGenDocument
{
    
    public CitGenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Cit-gen(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CitGenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitGenDocument.CitGen
    {
        
        public CitGenImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CIT$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "cit");
        private static final javax.xml.namespace.QName AUTHORS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "authors");
        private static final javax.xml.namespace.QName MUID$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "muid");
        private static final javax.xml.namespace.QName JOURNAL$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "journal");
        private static final javax.xml.namespace.QName VOLUME$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "volume");
        private static final javax.xml.namespace.QName ISSUE$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "issue");
        private static final javax.xml.namespace.QName PAGES$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pages");
        private static final javax.xml.namespace.QName DATE$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "date");
        private static final javax.xml.namespace.QName SERIALNUMBER$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "serial-number");
        private static final javax.xml.namespace.QName TITLE$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "title");
        private static final javax.xml.namespace.QName PMID$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pmid");
        
        
        /**
         * Gets the "cit" element
         */
        public java.lang.String getCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cit" element
         */
        public org.apache.xmlbeans.XmlString xgetCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "cit" element
         */
        public boolean isSetCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CIT$0) != 0;
            }
        }
        
        /**
         * Sets the "cit" element
         */
        public void setCit(java.lang.String cit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CIT$0);
                }
                target.setStringValue(cit);
            }
        }
        
        /**
         * Sets (as xml) the "cit" element
         */
        public void xsetCit(org.apache.xmlbeans.XmlString cit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CIT$0);
                }
                target.set(cit);
            }
        }
        
        /**
         * Unsets the "cit" element
         */
        public void unsetCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CIT$0, 0);
            }
        }
        
        /**
         * Gets the "authors" element
         */
        public gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors getAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors)get_store().find_element_user(AUTHORS$2, 0);
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
        public void setAuthors(gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors authors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors)get_store().find_element_user(AUTHORS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors)get_store().add_element_user(AUTHORS$2);
                }
                target.set(authors);
            }
        }
        
        /**
         * Appends and returns a new empty "authors" element
         */
        public gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors addNewAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors)get_store().add_element_user(AUTHORS$2);
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
         * Gets the "muid" element
         */
        public java.math.BigInteger getMuid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUID$4, 0);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MUID$4, 0);
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
                return get_store().count_elements(MUID$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MUID$4);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MUID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MUID$4);
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
                get_store().remove_element(MUID$4, 0);
            }
        }
        
        /**
         * Gets the "journal" element
         */
        public gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal getJournal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal target = null;
                target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal)get_store().find_element_user(JOURNAL$6, 0);
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
        public void setJournal(gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal journal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal target = null;
                target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal)get_store().find_element_user(JOURNAL$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal)get_store().add_element_user(JOURNAL$6);
                }
                target.set(journal);
            }
        }
        
        /**
         * Appends and returns a new empty "journal" element
         */
        public gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal addNewJournal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal target = null;
                target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal)get_store().add_element_user(JOURNAL$6);
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
         * Gets the "volume" element
         */
        public java.lang.String getVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOLUME$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "volume" element
         */
        public org.apache.xmlbeans.XmlString xgetVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOLUME$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "volume" element
         */
        public boolean isSetVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VOLUME$8) != 0;
            }
        }
        
        /**
         * Sets the "volume" element
         */
        public void setVolume(java.lang.String volume)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOLUME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VOLUME$8);
                }
                target.setStringValue(volume);
            }
        }
        
        /**
         * Sets (as xml) the "volume" element
         */
        public void xsetVolume(org.apache.xmlbeans.XmlString volume)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOLUME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VOLUME$8);
                }
                target.set(volume);
            }
        }
        
        /**
         * Unsets the "volume" element
         */
        public void unsetVolume()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VOLUME$8, 0);
            }
        }
        
        /**
         * Gets the "issue" element
         */
        public java.lang.String getIssue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "issue" element
         */
        public org.apache.xmlbeans.XmlString xgetIssue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "issue" element
         */
        public boolean isSetIssue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISSUE$10) != 0;
            }
        }
        
        /**
         * Sets the "issue" element
         */
        public void setIssue(java.lang.String issue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUE$10);
                }
                target.setStringValue(issue);
            }
        }
        
        /**
         * Sets (as xml) the "issue" element
         */
        public void xsetIssue(org.apache.xmlbeans.XmlString issue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISSUE$10);
                }
                target.set(issue);
            }
        }
        
        /**
         * Unsets the "issue" element
         */
        public void unsetIssue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISSUE$10, 0);
            }
        }
        
        /**
         * Gets the "pages" element
         */
        public java.lang.String getPages()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGES$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pages" element
         */
        public org.apache.xmlbeans.XmlString xgetPages()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGES$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "pages" element
         */
        public boolean isSetPages()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PAGES$12) != 0;
            }
        }
        
        /**
         * Sets the "pages" element
         */
        public void setPages(java.lang.String pages)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGES$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGES$12);
                }
                target.setStringValue(pages);
            }
        }
        
        /**
         * Sets (as xml) the "pages" element
         */
        public void xsetPages(org.apache.xmlbeans.XmlString pages)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGES$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAGES$12);
                }
                target.set(pages);
            }
        }
        
        /**
         * Unsets the "pages" element
         */
        public void unsetPages()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PAGES$12, 0);
            }
        }
        
        /**
         * Gets the "date" element
         */
        public gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date target = null;
                target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date)get_store().find_element_user(DATE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "date" element
         */
        public boolean isSetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATE$14) != 0;
            }
        }
        
        /**
         * Sets the "date" element
         */
        public void setDate(gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date target = null;
                target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date)get_store().find_element_user(DATE$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date)get_store().add_element_user(DATE$14);
                }
                target.set(date);
            }
        }
        
        /**
         * Appends and returns a new empty "date" element
         */
        public gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date addNewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date target = null;
                target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date)get_store().add_element_user(DATE$14);
                return target;
            }
        }
        
        /**
         * Unsets the "date" element
         */
        public void unsetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATE$14, 0);
            }
        }
        
        /**
         * Gets the "serial-number" element
         */
        public java.math.BigInteger getSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIALNUMBER$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "serial-number" element
         */
        public org.apache.xmlbeans.XmlInteger xgetSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SERIALNUMBER$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "serial-number" element
         */
        public boolean isSetSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERIALNUMBER$16) != 0;
            }
        }
        
        /**
         * Sets the "serial-number" element
         */
        public void setSerialNumber(java.math.BigInteger serialNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIALNUMBER$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERIALNUMBER$16);
                }
                target.setBigIntegerValue(serialNumber);
            }
        }
        
        /**
         * Sets (as xml) the "serial-number" element
         */
        public void xsetSerialNumber(org.apache.xmlbeans.XmlInteger serialNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SERIALNUMBER$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SERIALNUMBER$16);
                }
                target.set(serialNumber);
            }
        }
        
        /**
         * Unsets the "serial-number" element
         */
        public void unsetSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERIALNUMBER$16, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$18, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$18, 0);
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
                return get_store().count_elements(TITLE$18) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$18);
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
                get_store().remove_element(TITLE$18, 0);
            }
        }
        
        /**
         * Gets the "pmid" element
         */
        public gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid getPmid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid target = null;
                target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid)get_store().find_element_user(PMID$20, 0);
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
                return get_store().count_elements(PMID$20) != 0;
            }
        }
        
        /**
         * Sets the "pmid" element
         */
        public void setPmid(gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid pmid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid target = null;
                target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid)get_store().find_element_user(PMID$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid)get_store().add_element_user(PMID$20);
                }
                target.set(pmid);
            }
        }
        
        /**
         * Appends and returns a new empty "pmid" element
         */
        public gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid addNewPmid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid target = null;
                target = (gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid)get_store().add_element_user(PMID$20);
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
                get_store().remove_element(PMID$20, 0);
            }
        }
        /**
         * An XML authors(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AuthorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Authors
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
         * An XML journal(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class JournalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Journal
        {
            
            public JournalImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Date
        {
            
            public DateImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Date");
            
            
            /**
             * Gets the "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date getDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Date" element
             */
            public void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    }
                    target.set(date);
                }
            }
            
            /**
             * Appends and returns a new empty "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    return target;
                }
            }
        }
        /**
         * An XML pmid(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PmidImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitGenDocument.CitGen.Pmid
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
