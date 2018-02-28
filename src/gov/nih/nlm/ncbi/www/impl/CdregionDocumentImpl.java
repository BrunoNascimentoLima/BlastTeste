/*
 * An XML document type.
 * Localname: Cdregion
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CdregionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Cdregion(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CdregionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CdregionDocument
{
    
    public CdregionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDREGION$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cdregion");
    
    
    /**
     * Gets the "Cdregion" element
     */
    public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion getCdregion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion target = null;
            target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion)get_store().find_element_user(CDREGION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Cdregion" element
     */
    public void setCdregion(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion cdregion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion target = null;
            target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion)get_store().find_element_user(CDREGION$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion)get_store().add_element_user(CDREGION$0);
            }
            target.set(cdregion);
        }
    }
    
    /**
     * Appends and returns a new empty "Cdregion" element
     */
    public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion addNewCdregion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion target = null;
            target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion)get_store().add_element_user(CDREGION$0);
            return target;
        }
    }
    /**
     * An XML Cdregion(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CdregionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion
    {
        
        public CdregionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORF$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "orf");
        private static final javax.xml.namespace.QName FRAME$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "frame");
        private static final javax.xml.namespace.QName CONFLICT$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "conflict");
        private static final javax.xml.namespace.QName GAPS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gaps");
        private static final javax.xml.namespace.QName MISMATCH$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mismatch");
        private static final javax.xml.namespace.QName CODE$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "code");
        private static final javax.xml.namespace.QName CODEBREAK$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "code-break");
        private static final javax.xml.namespace.QName STOPS$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "stops");
        
        
        /**
         * Gets the "orf" element
         */
        public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf getOrf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf)get_store().find_element_user(ORF$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "orf" element
         */
        public boolean isSetOrf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORF$0) != 0;
            }
        }
        
        /**
         * Sets the "orf" element
         */
        public void setOrf(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf orf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf)get_store().find_element_user(ORF$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf)get_store().add_element_user(ORF$0);
                }
                target.set(orf);
            }
        }
        
        /**
         * Appends and returns a new empty "orf" element
         */
        public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf addNewOrf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf)get_store().add_element_user(ORF$0);
                return target;
            }
        }
        
        /**
         * Unsets the "orf" element
         */
        public void unsetOrf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORF$0, 0);
            }
        }
        
        /**
         * Gets the "frame" element
         */
        public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame getFrame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame)get_store().find_element_user(FRAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "frame" element
         */
        public boolean isSetFrame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FRAME$2) != 0;
            }
        }
        
        /**
         * Sets the "frame" element
         */
        public void setFrame(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame frame)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame)get_store().find_element_user(FRAME$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame)get_store().add_element_user(FRAME$2);
                }
                target.set(frame);
            }
        }
        
        /**
         * Appends and returns a new empty "frame" element
         */
        public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame addNewFrame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame)get_store().add_element_user(FRAME$2);
                return target;
            }
        }
        
        /**
         * Unsets the "frame" element
         */
        public void unsetFrame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FRAME$2, 0);
            }
        }
        
        /**
         * Gets the "conflict" element
         */
        public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict getConflict()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict)get_store().find_element_user(CONFLICT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "conflict" element
         */
        public boolean isSetConflict()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONFLICT$4) != 0;
            }
        }
        
        /**
         * Sets the "conflict" element
         */
        public void setConflict(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict conflict)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict)get_store().find_element_user(CONFLICT$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict)get_store().add_element_user(CONFLICT$4);
                }
                target.set(conflict);
            }
        }
        
        /**
         * Appends and returns a new empty "conflict" element
         */
        public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict addNewConflict()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict)get_store().add_element_user(CONFLICT$4);
                return target;
            }
        }
        
        /**
         * Unsets the "conflict" element
         */
        public void unsetConflict()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONFLICT$4, 0);
            }
        }
        
        /**
         * Gets the "gaps" element
         */
        public java.math.BigInteger getGaps()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAPS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "gaps" element
         */
        public org.apache.xmlbeans.XmlInteger xgetGaps()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GAPS$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "gaps" element
         */
        public boolean isSetGaps()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GAPS$6) != 0;
            }
        }
        
        /**
         * Sets the "gaps" element
         */
        public void setGaps(java.math.BigInteger gaps)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAPS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GAPS$6);
                }
                target.setBigIntegerValue(gaps);
            }
        }
        
        /**
         * Sets (as xml) the "gaps" element
         */
        public void xsetGaps(org.apache.xmlbeans.XmlInteger gaps)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GAPS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GAPS$6);
                }
                target.set(gaps);
            }
        }
        
        /**
         * Unsets the "gaps" element
         */
        public void unsetGaps()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GAPS$6, 0);
            }
        }
        
        /**
         * Gets the "mismatch" element
         */
        public java.math.BigInteger getMismatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISMATCH$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "mismatch" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMismatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MISMATCH$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "mismatch" element
         */
        public boolean isSetMismatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MISMATCH$8) != 0;
            }
        }
        
        /**
         * Sets the "mismatch" element
         */
        public void setMismatch(java.math.BigInteger mismatch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISMATCH$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MISMATCH$8);
                }
                target.setBigIntegerValue(mismatch);
            }
        }
        
        /**
         * Sets (as xml) the "mismatch" element
         */
        public void xsetMismatch(org.apache.xmlbeans.XmlInteger mismatch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MISMATCH$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MISMATCH$8);
                }
                target.set(mismatch);
            }
        }
        
        /**
         * Unsets the "mismatch" element
         */
        public void unsetMismatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MISMATCH$8, 0);
            }
        }
        
        /**
         * Gets the "code" element
         */
        public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code)get_store().find_element_user(CODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "code" element
         */
        public boolean isSetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CODE$10) != 0;
            }
        }
        
        /**
         * Sets the "code" element
         */
        public void setCode(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code)get_store().find_element_user(CODE$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code)get_store().add_element_user(CODE$10);
                }
                target.set(code);
            }
        }
        
        /**
         * Appends and returns a new empty "code" element
         */
        public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code addNewCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code)get_store().add_element_user(CODE$10);
                return target;
            }
        }
        
        /**
         * Unsets the "code" element
         */
        public void unsetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CODE$10, 0);
            }
        }
        
        /**
         * Gets the "code-break" element
         */
        public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak getCodeBreak()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak)get_store().find_element_user(CODEBREAK$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "code-break" element
         */
        public boolean isSetCodeBreak()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CODEBREAK$12) != 0;
            }
        }
        
        /**
         * Sets the "code-break" element
         */
        public void setCodeBreak(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak codeBreak)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak)get_store().find_element_user(CODEBREAK$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak)get_store().add_element_user(CODEBREAK$12);
                }
                target.set(codeBreak);
            }
        }
        
        /**
         * Appends and returns a new empty "code-break" element
         */
        public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak addNewCodeBreak()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak target = null;
                target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak)get_store().add_element_user(CODEBREAK$12);
                return target;
            }
        }
        
        /**
         * Unsets the "code-break" element
         */
        public void unsetCodeBreak()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CODEBREAK$12, 0);
            }
        }
        
        /**
         * Gets the "stops" element
         */
        public java.math.BigInteger getStops()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOPS$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "stops" element
         */
        public org.apache.xmlbeans.XmlInteger xgetStops()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STOPS$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "stops" element
         */
        public boolean isSetStops()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STOPS$14) != 0;
            }
        }
        
        /**
         * Sets the "stops" element
         */
        public void setStops(java.math.BigInteger stops)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOPS$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STOPS$14);
                }
                target.setBigIntegerValue(stops);
            }
        }
        
        /**
         * Sets (as xml) the "stops" element
         */
        public void xsetStops(org.apache.xmlbeans.XmlInteger stops)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STOPS$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(STOPS$14);
                }
                target.set(stops);
            }
        }
        
        /**
         * Unsets the "stops" element
         */
        public void unsetStops()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STOPS$14, 0);
            }
        }
        /**
         * An XML orf(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class OrfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf
        {
            
            public OrfImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CdregionDocument$Cdregion$Orf$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Orf.Value
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
         * An XML frame(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FrameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame
        {
            
            public FrameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VALUE$0);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value)get_default_attribute_value(VALUE$0);
                    }
                    return target;
                }
            }
            
            /**
             * True if has "value" attribute
             */
            public boolean isSetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALUE$0) != null;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            
            /**
             * Unsets the "value" attribute
             */
            public void unsetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALUE$0);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CdregionDocument$Cdregion$Frame$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Frame.Value
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
         * An XML conflict(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ConflictImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict
        {
            
            public ConflictImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.CdregionDocument$Cdregion$Conflict$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Conflict.Value
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
         * An XML code(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.Code
        {
            
            public CodeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GENETICCODE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Genetic-code");
            
            
            /**
             * Gets the "Genetic-code" element
             */
            public gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode getGeneticCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode)get_store().find_element_user(GENETICCODE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Genetic-code" element
             */
            public void setGeneticCode(gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode geneticCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode)get_store().find_element_user(GENETICCODE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode)get_store().add_element_user(GENETICCODE$0);
                    }
                    target.set(geneticCode);
                }
            }
            
            /**
             * Appends and returns a new empty "Genetic-code" element
             */
            public gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode addNewGeneticCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode)get_store().add_element_user(GENETICCODE$0);
                    return target;
                }
            }
        }
        /**
         * An XML code-break(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CodeBreakImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CdregionDocument.Cdregion.CodeBreak
        {
            
            public CodeBreakImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CODEBREAK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Code-break");
            
            
            /**
             * Gets array of all "Code-break" elements
             */
            public gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak[] getCodeBreakArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CODEBREAK$0, targetList);
                    gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak[] result = new gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Code-break" element
             */
            public gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak getCodeBreakArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak target = null;
                    target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak)get_store().find_element_user(CODEBREAK$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Code-break" element
             */
            public int sizeOfCodeBreakArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CODEBREAK$0);
                }
            }
            
            /**
             * Sets array of all "Code-break" element
             */
            public void setCodeBreakArray(gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak[] codeBreakArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(codeBreakArray, CODEBREAK$0);
                }
            }
            
            /**
             * Sets ith "Code-break" element
             */
            public void setCodeBreakArray(int i, gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak codeBreak)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak target = null;
                    target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak)get_store().find_element_user(CODEBREAK$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(codeBreak);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Code-break" element
             */
            public gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak insertNewCodeBreak(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak target = null;
                    target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak)get_store().insert_element_user(CODEBREAK$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Code-break" element
             */
            public gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak addNewCodeBreak()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak target = null;
                    target = (gov.nih.nlm.ncbi.www.CodeBreakDocument.CodeBreak)get_store().add_element_user(CODEBREAK$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Code-break" element
             */
            public void removeCodeBreak(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CODEBREAK$0, i);
                }
            }
        }
    }
}
