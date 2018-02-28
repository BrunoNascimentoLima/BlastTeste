/*
 * An XML document type.
 * Localname: Blast4-cutoff
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CutoffDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-cutoff(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4CutoffDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CutoffDocument
{
    
    public Blast4CutoffDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4CUTOFF$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-cutoff");
    
    
    /**
     * Gets the "Blast4-cutoff" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff getBlast4Cutoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff)get_store().find_element_user(BLAST4CUTOFF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-cutoff" element
     */
    public void setBlast4Cutoff(gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff blast4Cutoff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff)get_store().find_element_user(BLAST4CUTOFF$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff)get_store().add_element_user(BLAST4CUTOFF$0);
            }
            target.set(blast4Cutoff);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-cutoff" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff addNewBlast4Cutoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff)get_store().add_element_user(BLAST4CUTOFF$0);
            return target;
        }
    }
    /**
     * An XML Blast4-cutoff(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4CutoffImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff
    {
        
        public Blast4CutoffImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVALUE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "e-value");
        private static final javax.xml.namespace.QName RAWSCORE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "raw-score");
        
        
        /**
         * Gets the "e-value" element
         */
        public double getEValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVALUE$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "e-value" element
         */
        public org.apache.xmlbeans.XmlDouble xgetEValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EVALUE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "e-value" element
         */
        public boolean isSetEValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVALUE$0) != 0;
            }
        }
        
        /**
         * Sets the "e-value" element
         */
        public void setEValue(double eValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVALUE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVALUE$0);
                }
                target.setDoubleValue(eValue);
            }
        }
        
        /**
         * Sets (as xml) the "e-value" element
         */
        public void xsetEValue(org.apache.xmlbeans.XmlDouble eValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EVALUE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(EVALUE$0);
                }
                target.set(eValue);
            }
        }
        
        /**
         * Unsets the "e-value" element
         */
        public void unsetEValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVALUE$0, 0);
            }
        }
        
        /**
         * Gets the "raw-score" element
         */
        public java.math.BigInteger getRawScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RAWSCORE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "raw-score" element
         */
        public org.apache.xmlbeans.XmlInteger xgetRawScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(RAWSCORE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "raw-score" element
         */
        public boolean isSetRawScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RAWSCORE$2) != 0;
            }
        }
        
        /**
         * Sets the "raw-score" element
         */
        public void setRawScore(java.math.BigInteger rawScore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RAWSCORE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RAWSCORE$2);
                }
                target.setBigIntegerValue(rawScore);
            }
        }
        
        /**
         * Sets (as xml) the "raw-score" element
         */
        public void xsetRawScore(org.apache.xmlbeans.XmlInteger rawScore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(RAWSCORE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(RAWSCORE$2);
                }
                target.set(rawScore);
            }
        }
        
        /**
         * Unsets the "raw-score" element
         */
        public void unsetRawScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RAWSCORE$2, 0);
            }
        }
    }
}
