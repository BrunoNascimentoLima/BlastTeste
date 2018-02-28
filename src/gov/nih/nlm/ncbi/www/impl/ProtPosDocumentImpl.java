/*
 * An XML document type.
 * Localname: Prot-pos
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ProtPosDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Prot-pos(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ProtPosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ProtPosDocument
{
    
    public ProtPosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROTPOS$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Prot-pos");
    
    
    /**
     * Gets the "Prot-pos" element
     */
    public gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos getProtPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos target = null;
            target = (gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos)get_store().find_element_user(PROTPOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Prot-pos" element
     */
    public void setProtPos(gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos protPos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos target = null;
            target = (gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos)get_store().find_element_user(PROTPOS$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos)get_store().add_element_user(PROTPOS$0);
            }
            target.set(protPos);
        }
    }
    
    /**
     * Appends and returns a new empty "Prot-pos" element
     */
    public gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos addNewProtPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos target = null;
            target = (gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos)get_store().add_element_user(PROTPOS$0);
            return target;
        }
    }
    /**
     * An XML Prot-pos(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ProtPosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ProtPosDocument.ProtPos
    {
        
        public ProtPosImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AMIN$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "amin");
        private static final javax.xml.namespace.QName FRAME$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "frame");
        
        
        /**
         * Gets the "amin" element
         */
        public java.math.BigInteger getAmin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMIN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "amin" element
         */
        public org.apache.xmlbeans.XmlInteger xgetAmin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AMIN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "amin" element
         */
        public void setAmin(java.math.BigInteger amin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMIN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMIN$0);
                }
                target.setBigIntegerValue(amin);
            }
        }
        
        /**
         * Sets (as xml) the "amin" element
         */
        public void xsetAmin(org.apache.xmlbeans.XmlInteger amin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AMIN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(AMIN$0);
                }
                target.set(amin);
            }
        }
        
        /**
         * Gets the "frame" element
         */
        public java.math.BigInteger getFrame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "frame" element
         */
        public org.apache.xmlbeans.XmlInteger xgetFrame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FRAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "frame" element
         */
        public void setFrame(java.math.BigInteger frame)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FRAME$2);
                }
                target.setBigIntegerValue(frame);
            }
        }
        
        /**
         * Sets (as xml) the "frame" element
         */
        public void xsetFrame(org.apache.xmlbeans.XmlInteger frame)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FRAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FRAME$2);
                }
                target.set(frame);
            }
        }
    }
}
