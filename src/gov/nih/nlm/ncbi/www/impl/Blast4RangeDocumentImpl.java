/*
 * An XML document type.
 * Localname: Blast4-range
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4RangeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-range(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4RangeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RangeDocument
{
    
    public Blast4RangeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4RANGE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-range");
    
    
    /**
     * Gets the "Blast4-range" element
     */
    public gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range getBlast4Range()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range)get_store().find_element_user(BLAST4RANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-range" element
     */
    public void setBlast4Range(gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range blast4Range)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range)get_store().find_element_user(BLAST4RANGE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range)get_store().add_element_user(BLAST4RANGE$0);
            }
            target.set(blast4Range);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-range" element
     */
    public gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range addNewBlast4Range()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range)get_store().add_element_user(BLAST4RANGE$0);
            return target;
        }
    }
    /**
     * An XML Blast4-range(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4RangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RangeDocument.Blast4Range
    {
        
        public Blast4RangeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName START$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "start");
        private static final javax.xml.namespace.QName END$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "end");
        private static final javax.xml.namespace.QName STRAND$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "strand");
        
        
        /**
         * Gets the "start" element
         */
        public java.math.BigInteger getStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "start" element
         */
        public org.apache.xmlbeans.XmlInteger xgetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(START$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "start" element
         */
        public boolean isSetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(START$0) != 0;
            }
        }
        
        /**
         * Sets the "start" element
         */
        public void setStart(java.math.BigInteger start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(START$0);
                }
                target.setBigIntegerValue(start);
            }
        }
        
        /**
         * Sets (as xml) the "start" element
         */
        public void xsetStart(org.apache.xmlbeans.XmlInteger start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(START$0);
                }
                target.set(start);
            }
        }
        
        /**
         * Unsets the "start" element
         */
        public void unsetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(START$0, 0);
            }
        }
        
        /**
         * Gets the "end" element
         */
        public java.math.BigInteger getEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "end" element
         */
        public org.apache.xmlbeans.XmlInteger xgetEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(END$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "end" element
         */
        public boolean isSetEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(END$2) != 0;
            }
        }
        
        /**
         * Sets the "end" element
         */
        public void setEnd(java.math.BigInteger end)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(END$2);
                }
                target.setBigIntegerValue(end);
            }
        }
        
        /**
         * Sets (as xml) the "end" element
         */
        public void xsetEnd(org.apache.xmlbeans.XmlInteger end)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(END$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(END$2);
                }
                target.set(end);
            }
        }
        
        /**
         * Unsets the "end" element
         */
        public void unsetEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(END$2, 0);
            }
        }
        
        /**
         * Gets the "strand" element
         */
        public java.math.BigInteger getStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRAND$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "strand" element
         */
        public org.apache.xmlbeans.XmlInteger xgetStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STRAND$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "strand" element
         */
        public boolean isSetStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRAND$4) != 0;
            }
        }
        
        /**
         * Sets the "strand" element
         */
        public void setStrand(java.math.BigInteger strand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRAND$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRAND$4);
                }
                target.setBigIntegerValue(strand);
            }
        }
        
        /**
         * Sets (as xml) the "strand" element
         */
        public void xsetStrand(org.apache.xmlbeans.XmlInteger strand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STRAND$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(STRAND$4);
                }
                target.set(strand);
            }
        }
        
        /**
         * Unsets the "strand" element
         */
        public void unsetStrand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRAND$4, 0);
            }
        }
    }
}
