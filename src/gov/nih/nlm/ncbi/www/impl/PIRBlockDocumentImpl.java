/*
 * An XML document type.
 * Localname: PIR-block
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PIRBlockDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PIR-block(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PIRBlockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PIRBlockDocument
{
    
    public PIRBlockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIRBLOCK$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PIR-block");
    
    
    /**
     * Gets the "PIR-block" element
     */
    public gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock getPIRBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock target = null;
            target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock)get_store().find_element_user(PIRBLOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PIR-block" element
     */
    public void setPIRBlock(gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock pirBlock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock target = null;
            target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock)get_store().find_element_user(PIRBLOCK$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock)get_store().add_element_user(PIRBLOCK$0);
            }
            target.set(pirBlock);
        }
    }
    
    /**
     * Appends and returns a new empty "PIR-block" element
     */
    public gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock addNewPIRBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock target = null;
            target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock)get_store().add_element_user(PIRBLOCK$0);
            return target;
        }
    }
    /**
     * An XML PIR-block(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PIRBlockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock
    {
        
        public PIRBlockImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HADPUNCT$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "had-punct");
        private static final javax.xml.namespace.QName HOST$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "host");
        private static final javax.xml.namespace.QName SOURCE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "source");
        private static final javax.xml.namespace.QName SUMMARY$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "summary");
        private static final javax.xml.namespace.QName GENETIC$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "genetic");
        private static final javax.xml.namespace.QName INCLUDES$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "includes");
        private static final javax.xml.namespace.QName PLACEMENT$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "placement");
        private static final javax.xml.namespace.QName SUPERFAMILY$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "superfamily");
        private static final javax.xml.namespace.QName KEYWORDS$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "keywords");
        private static final javax.xml.namespace.QName CROSSREFERENCE$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "cross-reference");
        private static final javax.xml.namespace.QName DATE$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "date");
        private static final javax.xml.namespace.QName SEQRAW$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-raw");
        private static final javax.xml.namespace.QName SEQREF$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seqref");
        
        
        /**
         * Gets the "had-punct" element
         */
        public gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct getHadPunct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct target = null;
                target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct)get_store().find_element_user(HADPUNCT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "had-punct" element
         */
        public boolean isSetHadPunct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HADPUNCT$0) != 0;
            }
        }
        
        /**
         * Sets the "had-punct" element
         */
        public void setHadPunct(gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct hadPunct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct target = null;
                target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct)get_store().find_element_user(HADPUNCT$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct)get_store().add_element_user(HADPUNCT$0);
                }
                target.set(hadPunct);
            }
        }
        
        /**
         * Appends and returns a new empty "had-punct" element
         */
        public gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct addNewHadPunct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct target = null;
                target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct)get_store().add_element_user(HADPUNCT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "had-punct" element
         */
        public void unsetHadPunct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HADPUNCT$0, 0);
            }
        }
        
        /**
         * Gets the "host" element
         */
        public java.lang.String getHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "host" element
         */
        public org.apache.xmlbeans.XmlString xgetHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "host" element
         */
        public boolean isSetHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HOST$2) != 0;
            }
        }
        
        /**
         * Sets the "host" element
         */
        public void setHost(java.lang.String host)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOST$2);
                }
                target.setStringValue(host);
            }
        }
        
        /**
         * Sets (as xml) the "host" element
         */
        public void xsetHost(org.apache.xmlbeans.XmlString host)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOST$2);
                }
                target.set(host);
            }
        }
        
        /**
         * Unsets the "host" element
         */
        public void unsetHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HOST$2, 0);
            }
        }
        
        /**
         * Gets the "source" element
         */
        public java.lang.String getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "source" element
         */
        public org.apache.xmlbeans.XmlString xgetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "source" element
         */
        public boolean isSetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCE$4) != 0;
            }
        }
        
        /**
         * Sets the "source" element
         */
        public void setSource(java.lang.String source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$4);
                }
                target.setStringValue(source);
            }
        }
        
        /**
         * Sets (as xml) the "source" element
         */
        public void xsetSource(org.apache.xmlbeans.XmlString source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$4);
                }
                target.set(source);
            }
        }
        
        /**
         * Unsets the "source" element
         */
        public void unsetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCE$4, 0);
            }
        }
        
        /**
         * Gets the "summary" element
         */
        public java.lang.String getSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUMMARY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "summary" element
         */
        public org.apache.xmlbeans.XmlString xgetSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUMMARY$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "summary" element
         */
        public boolean isSetSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUMMARY$6) != 0;
            }
        }
        
        /**
         * Sets the "summary" element
         */
        public void setSummary(java.lang.String summary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUMMARY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUMMARY$6);
                }
                target.setStringValue(summary);
            }
        }
        
        /**
         * Sets (as xml) the "summary" element
         */
        public void xsetSummary(org.apache.xmlbeans.XmlString summary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUMMARY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUMMARY$6);
                }
                target.set(summary);
            }
        }
        
        /**
         * Unsets the "summary" element
         */
        public void unsetSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUMMARY$6, 0);
            }
        }
        
        /**
         * Gets the "genetic" element
         */
        public java.lang.String getGenetic()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENETIC$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "genetic" element
         */
        public org.apache.xmlbeans.XmlString xgetGenetic()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENETIC$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "genetic" element
         */
        public boolean isSetGenetic()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENETIC$8) != 0;
            }
        }
        
        /**
         * Sets the "genetic" element
         */
        public void setGenetic(java.lang.String genetic)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENETIC$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENETIC$8);
                }
                target.setStringValue(genetic);
            }
        }
        
        /**
         * Sets (as xml) the "genetic" element
         */
        public void xsetGenetic(org.apache.xmlbeans.XmlString genetic)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENETIC$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENETIC$8);
                }
                target.set(genetic);
            }
        }
        
        /**
         * Unsets the "genetic" element
         */
        public void unsetGenetic()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENETIC$8, 0);
            }
        }
        
        /**
         * Gets the "includes" element
         */
        public java.lang.String getIncludes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDES$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "includes" element
         */
        public org.apache.xmlbeans.XmlString xgetIncludes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCLUDES$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "includes" element
         */
        public boolean isSetIncludes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCLUDES$10) != 0;
            }
        }
        
        /**
         * Sets the "includes" element
         */
        public void setIncludes(java.lang.String includes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDES$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUDES$10);
                }
                target.setStringValue(includes);
            }
        }
        
        /**
         * Sets (as xml) the "includes" element
         */
        public void xsetIncludes(org.apache.xmlbeans.XmlString includes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCLUDES$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCLUDES$10);
                }
                target.set(includes);
            }
        }
        
        /**
         * Unsets the "includes" element
         */
        public void unsetIncludes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCLUDES$10, 0);
            }
        }
        
        /**
         * Gets the "placement" element
         */
        public java.lang.String getPlacement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACEMENT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "placement" element
         */
        public org.apache.xmlbeans.XmlString xgetPlacement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLACEMENT$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "placement" element
         */
        public boolean isSetPlacement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PLACEMENT$12) != 0;
            }
        }
        
        /**
         * Sets the "placement" element
         */
        public void setPlacement(java.lang.String placement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACEMENT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLACEMENT$12);
                }
                target.setStringValue(placement);
            }
        }
        
        /**
         * Sets (as xml) the "placement" element
         */
        public void xsetPlacement(org.apache.xmlbeans.XmlString placement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLACEMENT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLACEMENT$12);
                }
                target.set(placement);
            }
        }
        
        /**
         * Unsets the "placement" element
         */
        public void unsetPlacement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PLACEMENT$12, 0);
            }
        }
        
        /**
         * Gets the "superfamily" element
         */
        public java.lang.String getSuperfamily()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPERFAMILY$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "superfamily" element
         */
        public org.apache.xmlbeans.XmlString xgetSuperfamily()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPERFAMILY$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "superfamily" element
         */
        public boolean isSetSuperfamily()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUPERFAMILY$14) != 0;
            }
        }
        
        /**
         * Sets the "superfamily" element
         */
        public void setSuperfamily(java.lang.String superfamily)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPERFAMILY$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPERFAMILY$14);
                }
                target.setStringValue(superfamily);
            }
        }
        
        /**
         * Sets (as xml) the "superfamily" element
         */
        public void xsetSuperfamily(org.apache.xmlbeans.XmlString superfamily)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPERFAMILY$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUPERFAMILY$14);
                }
                target.set(superfamily);
            }
        }
        
        /**
         * Unsets the "superfamily" element
         */
        public void unsetSuperfamily()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUPERFAMILY$14, 0);
            }
        }
        
        /**
         * Gets array of all "keywords" elements
         */
        public java.lang.String[] getKeywordsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYWORDS$16, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "keywords" element
         */
        public java.lang.String getKeywordsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "keywords" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetKeywordsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYWORDS$16, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "keywords" element
         */
        public org.apache.xmlbeans.XmlString xgetKeywordsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDS$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "keywords" element
         */
        public int sizeOfKeywordsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYWORDS$16);
            }
        }
        
        /**
         * Sets array of all "keywords" element
         */
        public void setKeywordsArray(java.lang.String[] keywordsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(keywordsArray, KEYWORDS$16);
            }
        }
        
        /**
         * Sets ith "keywords" element
         */
        public void setKeywordsArray(int i, java.lang.String keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(keywords);
            }
        }
        
        /**
         * Sets (as xml) array of all "keywords" element
         */
        public void xsetKeywordsArray(org.apache.xmlbeans.XmlString[]keywordsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(keywordsArray, KEYWORDS$16);
            }
        }
        
        /**
         * Sets (as xml) ith "keywords" element
         */
        public void xsetKeywordsArray(int i, org.apache.xmlbeans.XmlString keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDS$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(keywords);
            }
        }
        
        /**
         * Inserts the value as the ith "keywords" element
         */
        public void insertKeywords(int i, java.lang.String keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(KEYWORDS$16, i);
                target.setStringValue(keywords);
            }
        }
        
        /**
         * Appends the value as the last "keywords" element
         */
        public void addKeywords(java.lang.String keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORDS$16);
                target.setStringValue(keywords);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "keywords" element
         */
        public org.apache.xmlbeans.XmlString insertNewKeywords(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(KEYWORDS$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "keywords" element
         */
        public org.apache.xmlbeans.XmlString addNewKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYWORDS$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "keywords" element
         */
        public void removeKeywords(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYWORDS$16, i);
            }
        }
        
        /**
         * Gets the "cross-reference" element
         */
        public java.lang.String getCrossReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CROSSREFERENCE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cross-reference" element
         */
        public org.apache.xmlbeans.XmlString xgetCrossReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CROSSREFERENCE$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "cross-reference" element
         */
        public boolean isSetCrossReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CROSSREFERENCE$18) != 0;
            }
        }
        
        /**
         * Sets the "cross-reference" element
         */
        public void setCrossReference(java.lang.String crossReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CROSSREFERENCE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CROSSREFERENCE$18);
                }
                target.setStringValue(crossReference);
            }
        }
        
        /**
         * Sets (as xml) the "cross-reference" element
         */
        public void xsetCrossReference(org.apache.xmlbeans.XmlString crossReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CROSSREFERENCE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CROSSREFERENCE$18);
                }
                target.set(crossReference);
            }
        }
        
        /**
         * Unsets the "cross-reference" element
         */
        public void unsetCrossReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CROSSREFERENCE$18, 0);
            }
        }
        
        /**
         * Gets the "date" element
         */
        public java.lang.String getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "date" element
         */
        public org.apache.xmlbeans.XmlString xgetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "date" element
         */
        public boolean isSetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATE$20) != 0;
            }
        }
        
        /**
         * Sets the "date" element
         */
        public void setDate(java.lang.String date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$20);
                }
                target.setStringValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "date" element
         */
        public void xsetDate(org.apache.xmlbeans.XmlString date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATE$20);
                }
                target.set(date);
            }
        }
        
        /**
         * Unsets the "date" element
         */
        public void unsetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATE$20, 0);
            }
        }
        
        /**
         * Gets the "seq-raw" element
         */
        public java.lang.String getSeqRaw()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQRAW$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "seq-raw" element
         */
        public org.apache.xmlbeans.XmlString xgetSeqRaw()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEQRAW$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "seq-raw" element
         */
        public boolean isSetSeqRaw()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQRAW$22) != 0;
            }
        }
        
        /**
         * Sets the "seq-raw" element
         */
        public void setSeqRaw(java.lang.String seqRaw)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQRAW$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQRAW$22);
                }
                target.setStringValue(seqRaw);
            }
        }
        
        /**
         * Sets (as xml) the "seq-raw" element
         */
        public void xsetSeqRaw(org.apache.xmlbeans.XmlString seqRaw)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEQRAW$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEQRAW$22);
                }
                target.set(seqRaw);
            }
        }
        
        /**
         * Unsets the "seq-raw" element
         */
        public void unsetSeqRaw()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQRAW$22, 0);
            }
        }
        
        /**
         * Gets the "seqref" element
         */
        public gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref getSeqref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref target = null;
                target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref)get_store().find_element_user(SEQREF$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seqref" element
         */
        public boolean isSetSeqref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQREF$24) != 0;
            }
        }
        
        /**
         * Sets the "seqref" element
         */
        public void setSeqref(gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref seqref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref target = null;
                target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref)get_store().find_element_user(SEQREF$24, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref)get_store().add_element_user(SEQREF$24);
                }
                target.set(seqref);
            }
        }
        
        /**
         * Appends and returns a new empty "seqref" element
         */
        public gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref addNewSeqref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref target = null;
                target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref)get_store().add_element_user(SEQREF$24);
                return target;
            }
        }
        
        /**
         * Unsets the "seqref" element
         */
        public void unsetSeqref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQREF$24, 0);
            }
        }
        /**
         * An XML had-punct(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class HadPunctImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct
        {
            
            public HadPunctImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PIRBlockDocument$PIRBlock$HadPunct$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.HadPunct.Value
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
         * An XML seqref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock.Seqref
        {
            
            public SeqrefImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-id");
            
            
            /**
             * Gets array of all "Seq-id" elements
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] getSeqIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQID$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] result = new gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqIdArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Seq-id" element
             */
            public int sizeOfSeqIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQID$0);
                }
            }
            
            /**
             * Sets array of all "Seq-id" element
             */
            public void setSeqIdArray(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] seqIdArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqIdArray, SEQID$0);
                }
            }
            
            /**
             * Sets ith "Seq-id" element
             */
            public void setSeqIdArray(int i, gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqId);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId insertNewSeqId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().insert_element_user(SEQID$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Seq-id" element
             */
            public void removeSeqId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQID$0, i);
                }
            }
        }
    }
}
