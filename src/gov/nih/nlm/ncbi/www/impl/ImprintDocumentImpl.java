/*
 * An XML document type.
 * Localname: Imprint
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ImprintDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Imprint(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ImprintDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ImprintDocument
{
    
    public ImprintDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Imprint(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ImprintImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ImprintDocument.Imprint
    {
        
        public ImprintImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "date");
        private static final javax.xml.namespace.QName VOLUME$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "volume");
        private static final javax.xml.namespace.QName ISSUE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "issue");
        private static final javax.xml.namespace.QName PAGES$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pages");
        private static final javax.xml.namespace.QName SECTION$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "section");
        private static final javax.xml.namespace.QName PUB$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pub");
        private static final javax.xml.namespace.QName CPRT$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "cprt");
        private static final javax.xml.namespace.QName PARTSUP$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "part-sup");
        private static final javax.xml.namespace.QName LANGUAGE$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "language");
        private static final javax.xml.namespace.QName PREPUB$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "prepub");
        private static final javax.xml.namespace.QName PARTSUPI$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "part-supi");
        private static final javax.xml.namespace.QName RETRACT$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "retract");
        private static final javax.xml.namespace.QName PUBSTATUS$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pubstatus");
        private static final javax.xml.namespace.QName HISTORY$26 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "history");
        
        
        /**
         * Gets the "date" element
         */
        public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "date" element
         */
        public void setDate(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date)get_store().add_element_user(DATE$0);
                }
                target.set(date);
            }
        }
        
        /**
         * Appends and returns a new empty "date" element
         */
        public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date addNewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date)get_store().add_element_user(DATE$0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOLUME$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOLUME$2, 0);
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
                return get_store().count_elements(VOLUME$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOLUME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VOLUME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOLUME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VOLUME$2);
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
                get_store().remove_element(VOLUME$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUE$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUE$4, 0);
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
                return get_store().count_elements(ISSUE$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUE$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISSUE$4);
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
                get_store().remove_element(ISSUE$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGES$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGES$6, 0);
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
                return get_store().count_elements(PAGES$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGES$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGES$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGES$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAGES$6);
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
                get_store().remove_element(PAGES$6, 0);
            }
        }
        
        /**
         * Gets the "section" element
         */
        public java.lang.String getSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECTION$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "section" element
         */
        public org.apache.xmlbeans.XmlString xgetSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECTION$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "section" element
         */
        public boolean isSetSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SECTION$8) != 0;
            }
        }
        
        /**
         * Sets the "section" element
         */
        public void setSection(java.lang.String section)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECTION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECTION$8);
                }
                target.setStringValue(section);
            }
        }
        
        /**
         * Sets (as xml) the "section" element
         */
        public void xsetSection(org.apache.xmlbeans.XmlString section)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECTION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECTION$8);
                }
                target.set(section);
            }
        }
        
        /**
         * Unsets the "section" element
         */
        public void unsetSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SECTION$8, 0);
            }
        }
        
        /**
         * Gets the "pub" element
         */
        public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub getPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub)get_store().find_element_user(PUB$10, 0);
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
                return get_store().count_elements(PUB$10) != 0;
            }
        }
        
        /**
         * Sets the "pub" element
         */
        public void setPub(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub pub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub)get_store().find_element_user(PUB$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub)get_store().add_element_user(PUB$10);
                }
                target.set(pub);
            }
        }
        
        /**
         * Appends and returns a new empty "pub" element
         */
        public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub addNewPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub)get_store().add_element_user(PUB$10);
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
                get_store().remove_element(PUB$10, 0);
            }
        }
        
        /**
         * Gets the "cprt" element
         */
        public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt getCprt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt)get_store().find_element_user(CPRT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "cprt" element
         */
        public boolean isSetCprt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CPRT$12) != 0;
            }
        }
        
        /**
         * Sets the "cprt" element
         */
        public void setCprt(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt cprt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt)get_store().find_element_user(CPRT$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt)get_store().add_element_user(CPRT$12);
                }
                target.set(cprt);
            }
        }
        
        /**
         * Appends and returns a new empty "cprt" element
         */
        public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt addNewCprt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt)get_store().add_element_user(CPRT$12);
                return target;
            }
        }
        
        /**
         * Unsets the "cprt" element
         */
        public void unsetCprt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CPRT$12, 0);
            }
        }
        
        /**
         * Gets the "part-sup" element
         */
        public java.lang.String getPartSup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTSUP$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "part-sup" element
         */
        public org.apache.xmlbeans.XmlString xgetPartSup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTSUP$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "part-sup" element
         */
        public boolean isSetPartSup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARTSUP$14) != 0;
            }
        }
        
        /**
         * Sets the "part-sup" element
         */
        public void setPartSup(java.lang.String partSup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTSUP$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTSUP$14);
                }
                target.setStringValue(partSup);
            }
        }
        
        /**
         * Sets (as xml) the "part-sup" element
         */
        public void xsetPartSup(org.apache.xmlbeans.XmlString partSup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTSUP$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTSUP$14);
                }
                target.set(partSup);
            }
        }
        
        /**
         * Unsets the "part-sup" element
         */
        public void unsetPartSup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARTSUP$14, 0);
            }
        }
        
        /**
         * Gets the "language" element
         */
        public java.lang.String getLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "language" element
         */
        public org.apache.xmlbeans.XmlString xgetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "language" element
         */
        public void setLanguage(java.lang.String language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$16);
                }
                target.setStringValue(language);
            }
        }
        
        /**
         * Sets (as xml) the "language" element
         */
        public void xsetLanguage(org.apache.xmlbeans.XmlString language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGE$16);
                }
                target.set(language);
            }
        }
        
        /**
         * Gets the "prepub" element
         */
        public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub getPrepub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub)get_store().find_element_user(PREPUB$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "prepub" element
         */
        public boolean isSetPrepub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PREPUB$18) != 0;
            }
        }
        
        /**
         * Sets the "prepub" element
         */
        public void setPrepub(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub prepub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub)get_store().find_element_user(PREPUB$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub)get_store().add_element_user(PREPUB$18);
                }
                target.set(prepub);
            }
        }
        
        /**
         * Appends and returns a new empty "prepub" element
         */
        public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub addNewPrepub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub)get_store().add_element_user(PREPUB$18);
                return target;
            }
        }
        
        /**
         * Unsets the "prepub" element
         */
        public void unsetPrepub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PREPUB$18, 0);
            }
        }
        
        /**
         * Gets the "part-supi" element
         */
        public java.lang.String getPartSupi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTSUPI$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "part-supi" element
         */
        public org.apache.xmlbeans.XmlString xgetPartSupi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTSUPI$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "part-supi" element
         */
        public boolean isSetPartSupi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARTSUPI$20) != 0;
            }
        }
        
        /**
         * Sets the "part-supi" element
         */
        public void setPartSupi(java.lang.String partSupi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTSUPI$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTSUPI$20);
                }
                target.setStringValue(partSupi);
            }
        }
        
        /**
         * Sets (as xml) the "part-supi" element
         */
        public void xsetPartSupi(org.apache.xmlbeans.XmlString partSupi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTSUPI$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTSUPI$20);
                }
                target.set(partSupi);
            }
        }
        
        /**
         * Unsets the "part-supi" element
         */
        public void unsetPartSupi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARTSUPI$20, 0);
            }
        }
        
        /**
         * Gets the "retract" element
         */
        public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract getRetract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract)get_store().find_element_user(RETRACT$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "retract" element
         */
        public boolean isSetRetract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETRACT$22) != 0;
            }
        }
        
        /**
         * Sets the "retract" element
         */
        public void setRetract(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract retract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract)get_store().find_element_user(RETRACT$22, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract)get_store().add_element_user(RETRACT$22);
                }
                target.set(retract);
            }
        }
        
        /**
         * Appends and returns a new empty "retract" element
         */
        public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract addNewRetract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract)get_store().add_element_user(RETRACT$22);
                return target;
            }
        }
        
        /**
         * Unsets the "retract" element
         */
        public void unsetRetract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETRACT$22, 0);
            }
        }
        
        /**
         * Gets the "pubstatus" element
         */
        public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus getPubstatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus)get_store().find_element_user(PUBSTATUS$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pubstatus" element
         */
        public boolean isSetPubstatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUBSTATUS$24) != 0;
            }
        }
        
        /**
         * Sets the "pubstatus" element
         */
        public void setPubstatus(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus pubstatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus)get_store().find_element_user(PUBSTATUS$24, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus)get_store().add_element_user(PUBSTATUS$24);
                }
                target.set(pubstatus);
            }
        }
        
        /**
         * Appends and returns a new empty "pubstatus" element
         */
        public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus addNewPubstatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus)get_store().add_element_user(PUBSTATUS$24);
                return target;
            }
        }
        
        /**
         * Unsets the "pubstatus" element
         */
        public void unsetPubstatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUBSTATUS$24, 0);
            }
        }
        
        /**
         * Gets the "history" element
         */
        public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History getHistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History)get_store().find_element_user(HISTORY$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "history" element
         */
        public boolean isSetHistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HISTORY$26) != 0;
            }
        }
        
        /**
         * Sets the "history" element
         */
        public void setHistory(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History history)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History)get_store().find_element_user(HISTORY$26, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History)get_store().add_element_user(HISTORY$26);
                }
                target.set(history);
            }
        }
        
        /**
         * Appends and returns a new empty "history" element
         */
        public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History addNewHistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History target = null;
                target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History)get_store().add_element_user(HISTORY$26);
                return target;
            }
        }
        
        /**
         * Unsets the "history" element
         */
        public void unsetHistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HISTORY$26, 0);
            }
        }
        /**
         * An XML date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Date
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
         * An XML pub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PubImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pub
        {
            
            public PubImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML cprt(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CprtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Cprt
        {
            
            public CprtImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML prepub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PrepubImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub
        {
            
            public PrepubImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.ImprintDocument$Imprint$Prepub$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Prepub.Value
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
         * An XML retract(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RetractImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Retract
        {
            
            public RetractImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CITRETRACT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "CitRetract");
            
            
            /**
             * Gets the "CitRetract" element
             */
            public gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract getCitRetract()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract target = null;
                    target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract)get_store().find_element_user(CITRETRACT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "CitRetract" element
             */
            public void setCitRetract(gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract citRetract)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract target = null;
                    target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract)get_store().find_element_user(CITRETRACT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract)get_store().add_element_user(CITRETRACT$0);
                    }
                    target.set(citRetract);
                }
            }
            
            /**
             * Appends and returns a new empty "CitRetract" element
             */
            public gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract addNewCitRetract()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract target = null;
                    target = (gov.nih.nlm.ncbi.www.CitRetractDocument.CitRetract)get_store().add_element_user(CITRETRACT$0);
                    return target;
                }
            }
        }
        /**
         * An XML pubstatus(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PubstatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.Pubstatus
        {
            
            public PubstatusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBSTATUS$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PubStatus");
            
            
            /**
             * Gets the "PubStatus" element
             */
            public gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus getPubStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus target = null;
                    target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus)get_store().find_element_user(PUBSTATUS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PubStatus" element
             */
            public void setPubStatus(gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus pubStatus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus target = null;
                    target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus)get_store().find_element_user(PUBSTATUS$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus)get_store().add_element_user(PUBSTATUS$0);
                    }
                    target.set(pubStatus);
                }
            }
            
            /**
             * Appends and returns a new empty "PubStatus" element
             */
            public gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus addNewPubStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus target = null;
                    target = (gov.nih.nlm.ncbi.www.PubStatusDocument.PubStatus)get_store().add_element_user(PUBSTATUS$0);
                    return target;
                }
            }
        }
        /**
         * An XML history(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class HistoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ImprintDocument.Imprint.History
        {
            
            public HistoryImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBSTATUSDATESET$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PubStatusDateSet");
            
            
            /**
             * Gets the "PubStatusDateSet" element
             */
            public gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet getPubStatusDateSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet)get_store().find_element_user(PUBSTATUSDATESET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PubStatusDateSet" element
             */
            public void setPubStatusDateSet(gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet pubStatusDateSet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet)get_store().find_element_user(PUBSTATUSDATESET$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet)get_store().add_element_user(PUBSTATUSDATESET$0);
                    }
                    target.set(pubStatusDateSet);
                }
            }
            
            /**
             * Appends and returns a new empty "PubStatusDateSet" element
             */
            public gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet addNewPubStatusDateSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PubStatusDateSetDocument.PubStatusDateSet)get_store().add_element_user(PUBSTATUSDATESET$0);
                    return target;
                }
            }
        }
    }
}
