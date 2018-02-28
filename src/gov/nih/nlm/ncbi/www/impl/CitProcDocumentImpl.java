/*
 * An XML document type.
 * Localname: Cit-proc
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CitProcDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Cit-proc(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CitProcDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitProcDocument
{
    
    public CitProcDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Cit-proc(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CitProcImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitProcDocument.CitProc
    {
        
        public CitProcImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BOOK$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "book");
        private static final javax.xml.namespace.QName MEET$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "meet");
        
        
        /**
         * Gets the "book" element
         */
        public gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Book getBook()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Book target = null;
                target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Book)get_store().find_element_user(BOOK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "book" element
         */
        public void setBook(gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Book book)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Book target = null;
                target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Book)get_store().find_element_user(BOOK$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Book)get_store().add_element_user(BOOK$0);
                }
                target.set(book);
            }
        }
        
        /**
         * Appends and returns a new empty "book" element
         */
        public gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Book addNewBook()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Book target = null;
                target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Book)get_store().add_element_user(BOOK$0);
                return target;
            }
        }
        
        /**
         * Gets the "meet" element
         */
        public gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Meet getMeet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Meet target = null;
                target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Meet)get_store().find_element_user(MEET$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "meet" element
         */
        public void setMeet(gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Meet meet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Meet target = null;
                target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Meet)get_store().find_element_user(MEET$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Meet)get_store().add_element_user(MEET$2);
                }
                target.set(meet);
            }
        }
        
        /**
         * Appends and returns a new empty "meet" element
         */
        public gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Meet addNewMeet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Meet target = null;
                target = (gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Meet)get_store().add_element_user(MEET$2);
                return target;
            }
        }
        /**
         * An XML book(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BookImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Book
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
         * An XML meet(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MeetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitProcDocument.CitProc.Meet
        {
            
            public MeetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MEETING$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Meeting");
            
            
            /**
             * Gets the "Meeting" element
             */
            public gov.nih.nlm.ncbi.www.MeetingDocument.Meeting getMeeting()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MeetingDocument.Meeting target = null;
                    target = (gov.nih.nlm.ncbi.www.MeetingDocument.Meeting)get_store().find_element_user(MEETING$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Meeting" element
             */
            public void setMeeting(gov.nih.nlm.ncbi.www.MeetingDocument.Meeting meeting)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MeetingDocument.Meeting target = null;
                    target = (gov.nih.nlm.ncbi.www.MeetingDocument.Meeting)get_store().find_element_user(MEETING$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MeetingDocument.Meeting)get_store().add_element_user(MEETING$0);
                    }
                    target.set(meeting);
                }
            }
            
            /**
             * Appends and returns a new empty "Meeting" element
             */
            public gov.nih.nlm.ncbi.www.MeetingDocument.Meeting addNewMeeting()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MeetingDocument.Meeting target = null;
                    target = (gov.nih.nlm.ncbi.www.MeetingDocument.Meeting)get_store().add_element_user(MEETING$0);
                    return target;
                }
            }
        }
    }
}
