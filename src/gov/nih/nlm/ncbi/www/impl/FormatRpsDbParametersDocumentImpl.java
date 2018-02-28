/*
 * An XML document type.
 * Localname: FormatRpsDbParameters
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one FormatRpsDbParameters(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class FormatRpsDbParametersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument
{
    
    public FormatRpsDbParametersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMATRPSDBPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "FormatRpsDbParameters");
    
    
    /**
     * Gets the "FormatRpsDbParameters" element
     */
    public gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters getFormatRpsDbParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters target = null;
            target = (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters)get_store().find_element_user(FORMATRPSDBPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FormatRpsDbParameters" element
     */
    public void setFormatRpsDbParameters(gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters formatRpsDbParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters target = null;
            target = (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters)get_store().find_element_user(FORMATRPSDBPARAMETERS$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters)get_store().add_element_user(FORMATRPSDBPARAMETERS$0);
            }
            target.set(formatRpsDbParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "FormatRpsDbParameters" element
     */
    public gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters addNewFormatRpsDbParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters target = null;
            target = (gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters)get_store().add_element_user(FORMATRPSDBPARAMETERS$0);
            return target;
        }
    }
    /**
     * An XML FormatRpsDbParameters(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class FormatRpsDbParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.FormatRpsDbParametersDocument.FormatRpsDbParameters
    {
        
        public FormatRpsDbParametersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MATRIXNAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "matrixName");
        private static final javax.xml.namespace.QName GAPOPEN$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gapOpen");
        private static final javax.xml.namespace.QName GAPEXTEND$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gapExtend");
        
        
        /**
         * Gets the "matrixName" element
         */
        public java.lang.String getMatrixName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATRIXNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "matrixName" element
         */
        public org.apache.xmlbeans.XmlString xgetMatrixName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATRIXNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "matrixName" element
         */
        public void setMatrixName(java.lang.String matrixName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATRIXNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATRIXNAME$0);
                }
                target.setStringValue(matrixName);
            }
        }
        
        /**
         * Sets (as xml) the "matrixName" element
         */
        public void xsetMatrixName(org.apache.xmlbeans.XmlString matrixName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATRIXNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MATRIXNAME$0);
                }
                target.set(matrixName);
            }
        }
        
        /**
         * Gets the "gapOpen" element
         */
        public java.math.BigInteger getGapOpen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAPOPEN$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "gapOpen" element
         */
        public org.apache.xmlbeans.XmlInteger xgetGapOpen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GAPOPEN$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "gapOpen" element
         */
        public boolean isSetGapOpen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GAPOPEN$2) != 0;
            }
        }
        
        /**
         * Sets the "gapOpen" element
         */
        public void setGapOpen(java.math.BigInteger gapOpen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAPOPEN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GAPOPEN$2);
                }
                target.setBigIntegerValue(gapOpen);
            }
        }
        
        /**
         * Sets (as xml) the "gapOpen" element
         */
        public void xsetGapOpen(org.apache.xmlbeans.XmlInteger gapOpen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GAPOPEN$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GAPOPEN$2);
                }
                target.set(gapOpen);
            }
        }
        
        /**
         * Unsets the "gapOpen" element
         */
        public void unsetGapOpen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GAPOPEN$2, 0);
            }
        }
        
        /**
         * Gets the "gapExtend" element
         */
        public java.math.BigInteger getGapExtend()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAPEXTEND$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "gapExtend" element
         */
        public org.apache.xmlbeans.XmlInteger xgetGapExtend()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GAPEXTEND$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "gapExtend" element
         */
        public boolean isSetGapExtend()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GAPEXTEND$4) != 0;
            }
        }
        
        /**
         * Sets the "gapExtend" element
         */
        public void setGapExtend(java.math.BigInteger gapExtend)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GAPEXTEND$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GAPEXTEND$4);
                }
                target.setBigIntegerValue(gapExtend);
            }
        }
        
        /**
         * Sets (as xml) the "gapExtend" element
         */
        public void xsetGapExtend(org.apache.xmlbeans.XmlInteger gapExtend)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GAPEXTEND$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GAPEXTEND$4);
                }
                target.set(gapExtend);
            }
        }
        
        /**
         * Unsets the "gapExtend" element
         */
        public void unsetGapExtend()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GAPEXTEND$4, 0);
            }
        }
    }
}
