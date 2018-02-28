/*
 * An XML document type.
 * Localname: Blast4-simple-alignment
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-simple-alignment(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4SimpleAlignmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument
{
    
    public Blast4SimpleAlignmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4SIMPLEALIGNMENT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-simple-alignment");
    
    
    /**
     * Gets the "Blast4-simple-alignment" element
     */
    public gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment getBlast4SimpleAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment)get_store().find_element_user(BLAST4SIMPLEALIGNMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-simple-alignment" element
     */
    public void setBlast4SimpleAlignment(gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment blast4SimpleAlignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment)get_store().find_element_user(BLAST4SIMPLEALIGNMENT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment)get_store().add_element_user(BLAST4SIMPLEALIGNMENT$0);
            }
            target.set(blast4SimpleAlignment);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-simple-alignment" element
     */
    public gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment addNewBlast4SimpleAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment)get_store().add_element_user(BLAST4SIMPLEALIGNMENT$0);
            return target;
        }
    }
    /**
     * An XML Blast4-simple-alignment(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4SimpleAlignmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment
    {
        
        public Blast4SimpleAlignmentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBJECTID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "subject-id");
        private static final javax.xml.namespace.QName EVALUE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "e-value");
        private static final javax.xml.namespace.QName BITSCORE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bit-score");
        private static final javax.xml.namespace.QName NUMIDENTITIES$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "num-identities");
        private static final javax.xml.namespace.QName NUMINDELS$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "num-indels");
        private static final javax.xml.namespace.QName FULLQUERYRANGE$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "full-query-range");
        private static final javax.xml.namespace.QName FULLSUBJECTRANGE$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "full-subject-range");
        
        
        /**
         * Gets the "subject-id" element
         */
        public java.lang.String getSubjectId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subject-id" element
         */
        public org.apache.xmlbeans.XmlString xgetSubjectId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECTID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "subject-id" element
         */
        public void setSubjectId(java.lang.String subjectId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECTID$0);
                }
                target.setStringValue(subjectId);
            }
        }
        
        /**
         * Sets (as xml) the "subject-id" element
         */
        public void xsetSubjectId(org.apache.xmlbeans.XmlString subjectId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBJECTID$0);
                }
                target.set(subjectId);
            }
        }
        
        /**
         * Gets the "e-value" element
         */
        public double getEValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVALUE$2, 0);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EVALUE$2, 0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVALUE$2);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EVALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(EVALUE$2);
                }
                target.set(eValue);
            }
        }
        
        /**
         * Gets the "bit-score" element
         */
        public double getBitScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BITSCORE$4, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "bit-score" element
         */
        public org.apache.xmlbeans.XmlDouble xgetBitScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BITSCORE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "bit-score" element
         */
        public void setBitScore(double bitScore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BITSCORE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BITSCORE$4);
                }
                target.setDoubleValue(bitScore);
            }
        }
        
        /**
         * Sets (as xml) the "bit-score" element
         */
        public void xsetBitScore(org.apache.xmlbeans.XmlDouble bitScore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BITSCORE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(BITSCORE$4);
                }
                target.set(bitScore);
            }
        }
        
        /**
         * Gets the "num-identities" element
         */
        public java.math.BigInteger getNumIdentities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMIDENTITIES$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "num-identities" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNumIdentities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMIDENTITIES$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "num-identities" element
         */
        public boolean isSetNumIdentities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMIDENTITIES$6) != 0;
            }
        }
        
        /**
         * Sets the "num-identities" element
         */
        public void setNumIdentities(java.math.BigInteger numIdentities)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMIDENTITIES$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMIDENTITIES$6);
                }
                target.setBigIntegerValue(numIdentities);
            }
        }
        
        /**
         * Sets (as xml) the "num-identities" element
         */
        public void xsetNumIdentities(org.apache.xmlbeans.XmlInteger numIdentities)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMIDENTITIES$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMIDENTITIES$6);
                }
                target.set(numIdentities);
            }
        }
        
        /**
         * Unsets the "num-identities" element
         */
        public void unsetNumIdentities()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMIDENTITIES$6, 0);
            }
        }
        
        /**
         * Gets the "num-indels" element
         */
        public java.math.BigInteger getNumIndels()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMINDELS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "num-indels" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNumIndels()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMINDELS$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "num-indels" element
         */
        public boolean isSetNumIndels()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUMINDELS$8) != 0;
            }
        }
        
        /**
         * Sets the "num-indels" element
         */
        public void setNumIndels(java.math.BigInteger numIndels)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMINDELS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMINDELS$8);
                }
                target.setBigIntegerValue(numIndels);
            }
        }
        
        /**
         * Sets (as xml) the "num-indels" element
         */
        public void xsetNumIndels(org.apache.xmlbeans.XmlInteger numIndels)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMINDELS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMINDELS$8);
                }
                target.set(numIndels);
            }
        }
        
        /**
         * Unsets the "num-indels" element
         */
        public void unsetNumIndels()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUMINDELS$8, 0);
            }
        }
        
        /**
         * Gets the "full-query-range" element
         */
        public gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange getFullQueryRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange)get_store().find_element_user(FULLQUERYRANGE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "full-query-range" element
         */
        public void setFullQueryRange(gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange fullQueryRange)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange)get_store().find_element_user(FULLQUERYRANGE$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange)get_store().add_element_user(FULLQUERYRANGE$10);
                }
                target.set(fullQueryRange);
            }
        }
        
        /**
         * Appends and returns a new empty "full-query-range" element
         */
        public gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange addNewFullQueryRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange)get_store().add_element_user(FULLQUERYRANGE$10);
                return target;
            }
        }
        
        /**
         * Gets the "full-subject-range" element
         */
        public gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange getFullSubjectRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange)get_store().find_element_user(FULLSUBJECTRANGE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "full-subject-range" element
         */
        public void setFullSubjectRange(gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange fullSubjectRange)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange)get_store().find_element_user(FULLSUBJECTRANGE$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange)get_store().add_element_user(FULLSUBJECTRANGE$12);
                }
                target.set(fullSubjectRange);
            }
        }
        
        /**
         * Appends and returns a new empty "full-subject-range" element
         */
        public gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange addNewFullSubjectRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange)get_store().add_element_user(FULLSUBJECTRANGE$12);
                return target;
            }
        }
        /**
         * An XML full-query-range(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FullQueryRangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullQueryRange
        {
            
            public FullQueryRangeImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
        /**
         * An XML full-subject-range(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FullSubjectRangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SimpleAlignmentDocument.Blast4SimpleAlignment.FullSubjectRange
        {
            
            public FullSubjectRangeImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
    }
}
