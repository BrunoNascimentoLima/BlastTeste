/*
 * An XML document type.
 * Localname: Date-std
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.DateStdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Date-std(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class DateStdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DateStdDocument
{
    
    public DateStdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATESTD$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Date-std");
    
    
    /**
     * Gets the "Date-std" element
     */
    public gov.nih.nlm.ncbi.www.DateStdDocument.DateStd getDateStd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DateStdDocument.DateStd target = null;
            target = (gov.nih.nlm.ncbi.www.DateStdDocument.DateStd)get_store().find_element_user(DATESTD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Date-std" element
     */
    public void setDateStd(gov.nih.nlm.ncbi.www.DateStdDocument.DateStd dateStd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DateStdDocument.DateStd target = null;
            target = (gov.nih.nlm.ncbi.www.DateStdDocument.DateStd)get_store().find_element_user(DATESTD$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.DateStdDocument.DateStd)get_store().add_element_user(DATESTD$0);
            }
            target.set(dateStd);
        }
    }
    
    /**
     * Appends and returns a new empty "Date-std" element
     */
    public gov.nih.nlm.ncbi.www.DateStdDocument.DateStd addNewDateStd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DateStdDocument.DateStd target = null;
            target = (gov.nih.nlm.ncbi.www.DateStdDocument.DateStd)get_store().add_element_user(DATESTD$0);
            return target;
        }
    }
    /**
     * An XML Date-std(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class DateStdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DateStdDocument.DateStd
    {
        
        public DateStdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName YEAR$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "year");
        private static final javax.xml.namespace.QName MONTH$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "month");
        private static final javax.xml.namespace.QName DAY$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "day");
        private static final javax.xml.namespace.QName SEASON$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "season");
        private static final javax.xml.namespace.QName HOUR$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "hour");
        private static final javax.xml.namespace.QName MINUTE$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "minute");
        private static final javax.xml.namespace.QName SECOND$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "second");
        
        
        /**
         * Gets the "year" element
         */
        public java.math.BigInteger getYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEAR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "year" element
         */
        public org.apache.xmlbeans.XmlInteger xgetYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(YEAR$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "year" element
         */
        public void setYear(java.math.BigInteger year)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEAR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YEAR$0);
                }
                target.setBigIntegerValue(year);
            }
        }
        
        /**
         * Sets (as xml) the "year" element
         */
        public void xsetYear(org.apache.xmlbeans.XmlInteger year)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(YEAR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(YEAR$0);
                }
                target.set(year);
            }
        }
        
        /**
         * Gets the "month" element
         */
        public java.math.BigInteger getMonth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTH$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "month" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMonth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MONTH$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "month" element
         */
        public boolean isSetMonth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MONTH$2) != 0;
            }
        }
        
        /**
         * Sets the "month" element
         */
        public void setMonth(java.math.BigInteger month)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTH$2);
                }
                target.setBigIntegerValue(month);
            }
        }
        
        /**
         * Sets (as xml) the "month" element
         */
        public void xsetMonth(org.apache.xmlbeans.XmlInteger month)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MONTH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MONTH$2);
                }
                target.set(month);
            }
        }
        
        /**
         * Unsets the "month" element
         */
        public void unsetMonth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MONTH$2, 0);
            }
        }
        
        /**
         * Gets the "day" element
         */
        public java.math.BigInteger getDay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "day" element
         */
        public org.apache.xmlbeans.XmlInteger xgetDay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DAY$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "day" element
         */
        public boolean isSetDay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DAY$4) != 0;
            }
        }
        
        /**
         * Sets the "day" element
         */
        public void setDay(java.math.BigInteger day)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAY$4);
                }
                target.setBigIntegerValue(day);
            }
        }
        
        /**
         * Sets (as xml) the "day" element
         */
        public void xsetDay(org.apache.xmlbeans.XmlInteger day)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DAY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DAY$4);
                }
                target.set(day);
            }
        }
        
        /**
         * Unsets the "day" element
         */
        public void unsetDay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DAY$4, 0);
            }
        }
        
        /**
         * Gets the "season" element
         */
        public java.lang.String getSeason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEASON$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "season" element
         */
        public org.apache.xmlbeans.XmlString xgetSeason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEASON$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "season" element
         */
        public boolean isSetSeason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEASON$6) != 0;
            }
        }
        
        /**
         * Sets the "season" element
         */
        public void setSeason(java.lang.String season)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEASON$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEASON$6);
                }
                target.setStringValue(season);
            }
        }
        
        /**
         * Sets (as xml) the "season" element
         */
        public void xsetSeason(org.apache.xmlbeans.XmlString season)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEASON$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEASON$6);
                }
                target.set(season);
            }
        }
        
        /**
         * Unsets the "season" element
         */
        public void unsetSeason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEASON$6, 0);
            }
        }
        
        /**
         * Gets the "hour" element
         */
        public java.math.BigInteger getHour()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOUR$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "hour" element
         */
        public org.apache.xmlbeans.XmlInteger xgetHour()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(HOUR$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "hour" element
         */
        public boolean isSetHour()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HOUR$8) != 0;
            }
        }
        
        /**
         * Sets the "hour" element
         */
        public void setHour(java.math.BigInteger hour)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOUR$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOUR$8);
                }
                target.setBigIntegerValue(hour);
            }
        }
        
        /**
         * Sets (as xml) the "hour" element
         */
        public void xsetHour(org.apache.xmlbeans.XmlInteger hour)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(HOUR$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(HOUR$8);
                }
                target.set(hour);
            }
        }
        
        /**
         * Unsets the "hour" element
         */
        public void unsetHour()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HOUR$8, 0);
            }
        }
        
        /**
         * Gets the "minute" element
         */
        public java.math.BigInteger getMinute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "minute" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMinute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MINUTE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "minute" element
         */
        public boolean isSetMinute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MINUTE$10) != 0;
            }
        }
        
        /**
         * Sets the "minute" element
         */
        public void setMinute(java.math.BigInteger minute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINUTE$10);
                }
                target.setBigIntegerValue(minute);
            }
        }
        
        /**
         * Sets (as xml) the "minute" element
         */
        public void xsetMinute(org.apache.xmlbeans.XmlInteger minute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MINUTE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MINUTE$10);
                }
                target.set(minute);
            }
        }
        
        /**
         * Unsets the "minute" element
         */
        public void unsetMinute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MINUTE$10, 0);
            }
        }
        
        /**
         * Gets the "second" element
         */
        public java.math.BigInteger getSecond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECOND$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "second" element
         */
        public org.apache.xmlbeans.XmlInteger xgetSecond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SECOND$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "second" element
         */
        public boolean isSetSecond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SECOND$12) != 0;
            }
        }
        
        /**
         * Sets the "second" element
         */
        public void setSecond(java.math.BigInteger second)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECOND$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECOND$12);
                }
                target.setBigIntegerValue(second);
            }
        }
        
        /**
         * Sets (as xml) the "second" element
         */
        public void xsetSecond(org.apache.xmlbeans.XmlInteger second)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SECOND$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SECOND$12);
                }
                target.set(second);
            }
        }
        
        /**
         * Unsets the "second" element
         */
        public void unsetSecond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SECOND$12, 0);
            }
        }
    }
}
