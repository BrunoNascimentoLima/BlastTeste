/*
 * An XML document type.
 * Localname: LoopConstraint
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.LoopConstraintDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one LoopConstraint(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class LoopConstraintDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.LoopConstraintDocument
{
    
    public LoopConstraintDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOOPCONSTRAINT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "LoopConstraint");
    
    
    /**
     * Gets the "LoopConstraint" element
     */
    public gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint getLoopConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint target = null;
            target = (gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint)get_store().find_element_user(LOOPCONSTRAINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LoopConstraint" element
     */
    public void setLoopConstraint(gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint loopConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint target = null;
            target = (gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint)get_store().find_element_user(LOOPCONSTRAINT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint)get_store().add_element_user(LOOPCONSTRAINT$0);
            }
            target.set(loopConstraint);
        }
    }
    
    /**
     * Appends and returns a new empty "LoopConstraint" element
     */
    public gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint addNewLoopConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint target = null;
            target = (gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint)get_store().add_element_user(LOOPCONSTRAINT$0);
            return target;
        }
    }
    /**
     * An XML LoopConstraint(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class LoopConstraintImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint
    {
        
        public LoopConstraintImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MINLENGTH$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "minlength");
        private static final javax.xml.namespace.QName MAXLENGTH$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "maxlength");
        
        
        /**
         * Gets the "minlength" element
         */
        public java.math.BigInteger getMinlength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINLENGTH$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "minlength" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMinlength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MINLENGTH$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "minlength" element
         */
        public void setMinlength(java.math.BigInteger minlength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINLENGTH$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINLENGTH$0);
                }
                target.setBigIntegerValue(minlength);
            }
        }
        
        /**
         * Sets (as xml) the "minlength" element
         */
        public void xsetMinlength(org.apache.xmlbeans.XmlInteger minlength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MINLENGTH$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MINLENGTH$0);
                }
                target.set(minlength);
            }
        }
        
        /**
         * Gets the "maxlength" element
         */
        public java.math.BigInteger getMaxlength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLENGTH$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "maxlength" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMaxlength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXLENGTH$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "maxlength" element
         */
        public void setMaxlength(java.math.BigInteger maxlength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLENGTH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXLENGTH$2);
                }
                target.setBigIntegerValue(maxlength);
            }
        }
        
        /**
         * Sets (as xml) the "maxlength" element
         */
        public void xsetMaxlength(org.apache.xmlbeans.XmlInteger maxlength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXLENGTH$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MAXLENGTH$2);
                }
                target.set(maxlength);
            }
        }
    }
}
