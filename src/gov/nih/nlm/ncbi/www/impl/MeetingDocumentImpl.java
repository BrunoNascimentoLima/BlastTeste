/*
 * An XML document type.
 * Localname: Meeting
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.MeetingDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Meeting(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class MeetingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MeetingDocument
{
    
    public MeetingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Meeting(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class MeetingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MeetingDocument.Meeting
    {
        
        public MeetingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMBER$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "number");
        private static final javax.xml.namespace.QName DATE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "date");
        private static final javax.xml.namespace.QName PLACE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "place");
        
        
        /**
         * Gets the "number" element
         */
        public java.lang.String getNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$0, 0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBER$0);
                }
                target.set(number);
            }
        }
        
        /**
         * Gets the "date" element
         */
        public gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Date getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Date target = null;
                target = (gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Date)get_store().find_element_user(DATE$2, 0);
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
        public void setDate(gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Date date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Date target = null;
                target = (gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Date)get_store().find_element_user(DATE$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Date)get_store().add_element_user(DATE$2);
                }
                target.set(date);
            }
        }
        
        /**
         * Appends and returns a new empty "date" element
         */
        public gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Date addNewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Date target = null;
                target = (gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Date)get_store().add_element_user(DATE$2);
                return target;
            }
        }
        
        /**
         * Gets the "place" element
         */
        public gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Place getPlace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Place target = null;
                target = (gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Place)get_store().find_element_user(PLACE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "place" element
         */
        public boolean isSetPlace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PLACE$4) != 0;
            }
        }
        
        /**
         * Sets the "place" element
         */
        public void setPlace(gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Place place)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Place target = null;
                target = (gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Place)get_store().find_element_user(PLACE$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Place)get_store().add_element_user(PLACE$4);
                }
                target.set(place);
            }
        }
        
        /**
         * Appends and returns a new empty "place" element
         */
        public gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Place addNewPlace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Place target = null;
                target = (gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Place)get_store().add_element_user(PLACE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "place" element
         */
        public void unsetPlace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PLACE$4, 0);
            }
        }
        /**
         * An XML date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Date
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
         * An XML place(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PlaceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MeetingDocument.Meeting.Place
        {
            
            public PlaceImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
