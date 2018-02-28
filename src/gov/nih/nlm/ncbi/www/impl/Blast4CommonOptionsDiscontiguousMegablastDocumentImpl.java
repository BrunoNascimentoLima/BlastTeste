/*
 * An XML document type.
 * Localname: Blast4-common-options-discontiguous-megablast
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-common-options-discontiguous-megablast(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4CommonOptionsDiscontiguousMegablastDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument
{
    
    public Blast4CommonOptionsDiscontiguousMegablastDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4COMMONOPTIONSDISCONTIGUOUSMEGABLAST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-common-options-discontiguous-megablast");
    
    
    /**
     * Gets the "Blast4-common-options-discontiguous-megablast" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast getBlast4CommonOptionsDiscontiguousMegablast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast)get_store().find_element_user(BLAST4COMMONOPTIONSDISCONTIGUOUSMEGABLAST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-common-options-discontiguous-megablast" element
     */
    public void setBlast4CommonOptionsDiscontiguousMegablast(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast blast4CommonOptionsDiscontiguousMegablast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast)get_store().find_element_user(BLAST4COMMONOPTIONSDISCONTIGUOUSMEGABLAST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast)get_store().add_element_user(BLAST4COMMONOPTIONSDISCONTIGUOUSMEGABLAST$0);
            }
            target.set(blast4CommonOptionsDiscontiguousMegablast);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-common-options-discontiguous-megablast" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast addNewBlast4CommonOptionsDiscontiguousMegablast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast)get_store().add_element_user(BLAST4COMMONOPTIONSDISCONTIGUOUSMEGABLAST$0);
            return target;
        }
    }
    /**
     * An XML Blast4-common-options-discontiguous-megablast(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4CommonOptionsDiscontiguousMegablastImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast
    {
        
        public Blast4CommonOptionsDiscontiguousMegablastImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TEMPLATETYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "template-type");
        private static final javax.xml.namespace.QName TEMPLATELENGTH$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "template-length");
        
        
        /**
         * Gets the "template-type" element
         */
        public java.math.BigInteger getTemplateType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATETYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "template-type" element
         */
        public org.apache.xmlbeans.XmlInteger xgetTemplateType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TEMPLATETYPE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "template-type" element
         */
        public void setTemplateType(java.math.BigInteger templateType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATETYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPLATETYPE$0);
                }
                target.setBigIntegerValue(templateType);
            }
        }
        
        /**
         * Sets (as xml) the "template-type" element
         */
        public void xsetTemplateType(org.apache.xmlbeans.XmlInteger templateType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TEMPLATETYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TEMPLATETYPE$0);
                }
                target.set(templateType);
            }
        }
        
        /**
         * Gets the "template-length" element
         */
        public java.math.BigInteger getTemplateLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATELENGTH$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "template-length" element
         */
        public org.apache.xmlbeans.XmlInteger xgetTemplateLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TEMPLATELENGTH$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "template-length" element
         */
        public void setTemplateLength(java.math.BigInteger templateLength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATELENGTH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPLATELENGTH$2);
                }
                target.setBigIntegerValue(templateLength);
            }
        }
        
        /**
         * Sets (as xml) the "template-length" element
         */
        public void xsetTemplateLength(org.apache.xmlbeans.XmlInteger templateLength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TEMPLATELENGTH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TEMPLATELENGTH$2);
                }
                target.set(templateLength);
            }
        }
    }
}
