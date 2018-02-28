/*
 * An XML document type.
 * Localname: Cit-pat
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CitPatDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Cit-pat(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CitPatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitPatDocument
{
    
    public CitPatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Cit-pat(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CitPatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitPatDocument.CitPat
    {
        
        public CitPatImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "title");
        private static final javax.xml.namespace.QName AUTHORS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "authors");
        private static final javax.xml.namespace.QName COUNTRY$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "country");
        private static final javax.xml.namespace.QName DOCTYPE$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "doc-type");
        private static final javax.xml.namespace.QName NUMBER$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "number");
        private static final javax.xml.namespace.QName DATEISSUE$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "date-issue");
        private static final javax.xml.namespace.QName CLASS1$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "class");
        private static final javax.xml.namespace.QName APPNUMBER$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "app-number");
        private static final javax.xml.namespace.QName APPDATE$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "app-date");
        private static final javax.xml.namespace.QName APPLICANTS$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "applicants");
        private static final javax.xml.namespace.QName ASSIGNEES$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "assignees");
        private static final javax.xml.namespace.QName PRIORITY$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "priority");
        private static final javax.xml.namespace.QName ABSTRACT$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "abstract");
        
        
        /**
         * Gets the "title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$0);
                }
                target.set(title);
            }
        }
        
        /**
         * Gets the "authors" element
         */
        public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors getAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors)get_store().find_element_user(AUTHORS$2, 0);
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
        public void setAuthors(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors authors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors)get_store().find_element_user(AUTHORS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors)get_store().add_element_user(AUTHORS$2);
                }
                target.set(authors);
            }
        }
        
        /**
         * Appends and returns a new empty "authors" element
         */
        public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors addNewAuthors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors)get_store().add_element_user(AUTHORS$2);
                return target;
            }
        }
        
        /**
         * Gets the "country" element
         */
        public java.lang.String getCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "country" element
         */
        public org.apache.xmlbeans.XmlString xgetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "country" element
         */
        public void setCountry(java.lang.String country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$4);
                }
                target.setStringValue(country);
            }
        }
        
        /**
         * Sets (as xml) the "country" element
         */
        public void xsetCountry(org.apache.xmlbeans.XmlString country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$4);
                }
                target.set(country);
            }
        }
        
        /**
         * Gets the "doc-type" element
         */
        public java.lang.String getDocType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCTYPE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "doc-type" element
         */
        public org.apache.xmlbeans.XmlString xgetDocType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCTYPE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "doc-type" element
         */
        public void setDocType(java.lang.String docType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCTYPE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCTYPE$6);
                }
                target.setStringValue(docType);
            }
        }
        
        /**
         * Sets (as xml) the "doc-type" element
         */
        public void xsetDocType(org.apache.xmlbeans.XmlString docType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCTYPE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCTYPE$6);
                }
                target.set(docType);
            }
        }
        
        /**
         * Gets the "number" element
         */
        public java.lang.String getNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "number" element
         */
        public org.apache.xmlbeans.XmlString xgetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "number" element
         */
        public boolean isSetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMBER$8) != 0;
            }
        }
        
        /**
         * Sets the "number" element
         */
        public void setNumber(java.lang.String number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$8);
                }
                target.setStringValue(number);
            }
        }
        
        /**
         * Sets (as xml) the "number" element
         */
        public void xsetNumber(org.apache.xmlbeans.XmlString number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBER$8);
                }
                target.set(number);
            }
        }
        
        /**
         * Unsets the "number" element
         */
        public void unsetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMBER$8, 0);
            }
        }
        
        /**
         * Gets the "date-issue" element
         */
        public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue getDateIssue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue)get_store().find_element_user(DATEISSUE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "date-issue" element
         */
        public boolean isSetDateIssue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATEISSUE$10) != 0;
            }
        }
        
        /**
         * Sets the "date-issue" element
         */
        public void setDateIssue(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue dateIssue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue)get_store().find_element_user(DATEISSUE$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue)get_store().add_element_user(DATEISSUE$10);
                }
                target.set(dateIssue);
            }
        }
        
        /**
         * Appends and returns a new empty "date-issue" element
         */
        public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue addNewDateIssue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue)get_store().add_element_user(DATEISSUE$10);
                return target;
            }
        }
        
        /**
         * Unsets the "date-issue" element
         */
        public void unsetDateIssue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATEISSUE$10, 0);
            }
        }
        
        /**
         * Gets array of all "class" elements
         */
        public java.lang.String[] getClass1Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CLASS1$12, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "class" element
         */
        public java.lang.String getClass1Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASS1$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "class" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetClass1Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CLASS1$12, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "class" element
         */
        public org.apache.xmlbeans.XmlString xgetClass1Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASS1$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "class" element
         */
        public int sizeOfClass1Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASS1$12);
            }
        }
        
        /**
         * Sets array of all "class" element
         */
        public void setClass1Array(java.lang.String[] class1Array)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(class1Array, CLASS1$12);
            }
        }
        
        /**
         * Sets ith "class" element
         */
        public void setClass1Array(int i, java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASS1$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(class1);
            }
        }
        
        /**
         * Sets (as xml) array of all "class" element
         */
        public void xsetClass1Array(org.apache.xmlbeans.XmlString[]class1Array)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(class1Array, CLASS1$12);
            }
        }
        
        /**
         * Sets (as xml) ith "class" element
         */
        public void xsetClass1Array(int i, org.apache.xmlbeans.XmlString class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASS1$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(class1);
            }
        }
        
        /**
         * Inserts the value as the ith "class" element
         */
        public void insertClass1(int i, java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CLASS1$12, i);
                target.setStringValue(class1);
            }
        }
        
        /**
         * Appends the value as the last "class" element
         */
        public void addClass1(java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASS1$12);
                target.setStringValue(class1);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "class" element
         */
        public org.apache.xmlbeans.XmlString insertNewClass1(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CLASS1$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "class" element
         */
        public org.apache.xmlbeans.XmlString addNewClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASS1$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "class" element
         */
        public void removeClass1(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASS1$12, i);
            }
        }
        
        /**
         * Gets the "app-number" element
         */
        public java.lang.String getAppNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPNUMBER$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "app-number" element
         */
        public org.apache.xmlbeans.XmlString xgetAppNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPNUMBER$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "app-number" element
         */
        public boolean isSetAppNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APPNUMBER$14) != 0;
            }
        }
        
        /**
         * Sets the "app-number" element
         */
        public void setAppNumber(java.lang.String appNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPNUMBER$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPNUMBER$14);
                }
                target.setStringValue(appNumber);
            }
        }
        
        /**
         * Sets (as xml) the "app-number" element
         */
        public void xsetAppNumber(org.apache.xmlbeans.XmlString appNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPNUMBER$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPNUMBER$14);
                }
                target.set(appNumber);
            }
        }
        
        /**
         * Unsets the "app-number" element
         */
        public void unsetAppNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APPNUMBER$14, 0);
            }
        }
        
        /**
         * Gets the "app-date" element
         */
        public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate getAppDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate)get_store().find_element_user(APPDATE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "app-date" element
         */
        public boolean isSetAppDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APPDATE$16) != 0;
            }
        }
        
        /**
         * Sets the "app-date" element
         */
        public void setAppDate(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate appDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate)get_store().find_element_user(APPDATE$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate)get_store().add_element_user(APPDATE$16);
                }
                target.set(appDate);
            }
        }
        
        /**
         * Appends and returns a new empty "app-date" element
         */
        public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate addNewAppDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate)get_store().add_element_user(APPDATE$16);
                return target;
            }
        }
        
        /**
         * Unsets the "app-date" element
         */
        public void unsetAppDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APPDATE$16, 0);
            }
        }
        
        /**
         * Gets the "applicants" element
         */
        public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants getApplicants()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants)get_store().find_element_user(APPLICANTS$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "applicants" element
         */
        public boolean isSetApplicants()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APPLICANTS$18) != 0;
            }
        }
        
        /**
         * Sets the "applicants" element
         */
        public void setApplicants(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants applicants)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants)get_store().find_element_user(APPLICANTS$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants)get_store().add_element_user(APPLICANTS$18);
                }
                target.set(applicants);
            }
        }
        
        /**
         * Appends and returns a new empty "applicants" element
         */
        public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants addNewApplicants()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants)get_store().add_element_user(APPLICANTS$18);
                return target;
            }
        }
        
        /**
         * Unsets the "applicants" element
         */
        public void unsetApplicants()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APPLICANTS$18, 0);
            }
        }
        
        /**
         * Gets the "assignees" element
         */
        public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees getAssignees()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees)get_store().find_element_user(ASSIGNEES$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "assignees" element
         */
        public boolean isSetAssignees()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ASSIGNEES$20) != 0;
            }
        }
        
        /**
         * Sets the "assignees" element
         */
        public void setAssignees(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees assignees)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees)get_store().find_element_user(ASSIGNEES$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees)get_store().add_element_user(ASSIGNEES$20);
                }
                target.set(assignees);
            }
        }
        
        /**
         * Appends and returns a new empty "assignees" element
         */
        public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees addNewAssignees()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees)get_store().add_element_user(ASSIGNEES$20);
                return target;
            }
        }
        
        /**
         * Unsets the "assignees" element
         */
        public void unsetAssignees()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ASSIGNEES$20, 0);
            }
        }
        
        /**
         * Gets the "priority" element
         */
        public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority getPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority)get_store().find_element_user(PRIORITY$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "priority" element
         */
        public boolean isSetPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRIORITY$22) != 0;
            }
        }
        
        /**
         * Sets the "priority" element
         */
        public void setPriority(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority priority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority)get_store().find_element_user(PRIORITY$22, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority)get_store().add_element_user(PRIORITY$22);
                }
                target.set(priority);
            }
        }
        
        /**
         * Appends and returns a new empty "priority" element
         */
        public gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority addNewPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority target = null;
                target = (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority)get_store().add_element_user(PRIORITY$22);
                return target;
            }
        }
        
        /**
         * Unsets the "priority" element
         */
        public void unsetPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRIORITY$22, 0);
            }
        }
        
        /**
         * Gets the "abstract" element
         */
        public java.lang.String getAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABSTRACT$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "abstract" element
         */
        public org.apache.xmlbeans.XmlString xgetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABSTRACT$24, 0);
                return target;
            }
        }
        
        /**
         * True if has "abstract" element
         */
        public boolean isSetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ABSTRACT$24) != 0;
            }
        }
        
        /**
         * Sets the "abstract" element
         */
        public void setAbstract(java.lang.String xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABSTRACT$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABSTRACT$24);
                }
                target.setStringValue(xabstract);
            }
        }
        
        /**
         * Sets (as xml) the "abstract" element
         */
        public void xsetAbstract(org.apache.xmlbeans.XmlString xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABSTRACT$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ABSTRACT$24);
                }
                target.set(xabstract);
            }
        }
        
        /**
         * Unsets the "abstract" element
         */
        public void unsetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ABSTRACT$24, 0);
            }
        }
        /**
         * An XML authors(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AuthorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors
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
         * An XML date-issue(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DateIssueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue
        {
            
            public DateIssueImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML app-date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AppDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate
        {
            
            public AppDateImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML applicants(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ApplicantsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants
        {
            
            public ApplicantsImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML assignees(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AssigneesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees
        {
            
            public AssigneesImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML priority(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PriorityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority
        {
            
            public PriorityImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PATENTPRIORITY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Patent-priority");
            
            
            /**
             * Gets array of all "Patent-priority" elements
             */
            public gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority[] getPatentPriorityArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PATENTPRIORITY$0, targetList);
                    gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority[] result = new gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Patent-priority" element
             */
            public gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority getPatentPriorityArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority target = null;
                    target = (gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority)get_store().find_element_user(PATENTPRIORITY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Patent-priority" element
             */
            public int sizeOfPatentPriorityArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PATENTPRIORITY$0);
                }
            }
            
            /**
             * Sets array of all "Patent-priority" element
             */
            public void setPatentPriorityArray(gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority[] patentPriorityArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(patentPriorityArray, PATENTPRIORITY$0);
                }
            }
            
            /**
             * Sets ith "Patent-priority" element
             */
            public void setPatentPriorityArray(int i, gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority patentPriority)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority target = null;
                    target = (gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority)get_store().find_element_user(PATENTPRIORITY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(patentPriority);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Patent-priority" element
             */
            public gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority insertNewPatentPriority(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority target = null;
                    target = (gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority)get_store().insert_element_user(PATENTPRIORITY$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Patent-priority" element
             */
            public gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority addNewPatentPriority()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority target = null;
                    target = (gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority)get_store().add_element_user(PATENTPRIORITY$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Patent-priority" element
             */
            public void removePatentPriority(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PATENTPRIORITY$0, i);
                }
            }
        }
    }
}
