/*
 * An XML document type.
 * Localname: Blast4-request
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4RequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-request(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4RequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestDocument
{
    
    public Blast4RequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4REQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-request");
    
    
    /**
     * Gets the "Blast4-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request getBlast4Request()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request)get_store().find_element_user(BLAST4REQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-request" element
     */
    public void setBlast4Request(gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request blast4Request)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request)get_store().find_element_user(BLAST4REQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request)get_store().add_element_user(BLAST4REQUEST$0);
            }
            target.set(blast4Request);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request addNewBlast4Request()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request)get_store().add_element_user(BLAST4REQUEST$0);
            return target;
        }
    }
    /**
     * An XML Blast4-request(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request
    {
        
        public Blast4RequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENT$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ident");
        private static final javax.xml.namespace.QName BODY$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "body");
        
        
        /**
         * Gets the "ident" element
         */
        public java.lang.String getIdent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ident" element
         */
        public org.apache.xmlbeans.XmlString xgetIdent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "ident" element
         */
        public boolean isSetIdent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENT$0) != 0;
            }
        }
        
        /**
         * Sets the "ident" element
         */
        public void setIdent(java.lang.String ident)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENT$0);
                }
                target.setStringValue(ident);
            }
        }
        
        /**
         * Sets (as xml) the "ident" element
         */
        public void xsetIdent(org.apache.xmlbeans.XmlString ident)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENT$0);
                }
                target.set(ident);
            }
        }
        
        /**
         * Unsets the "ident" element
         */
        public void unsetIdent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENT$0, 0);
            }
        }
        
        /**
         * Gets the "body" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request.Body getBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request.Body target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request.Body)get_store().find_element_user(BODY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "body" element
         */
        public void setBody(gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request.Body body)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request.Body target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request.Body)get_store().find_element_user(BODY$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request.Body)get_store().add_element_user(BODY$2);
                }
                target.set(body);
            }
        }
        
        /**
         * Appends and returns a new empty "body" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request.Body addNewBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request.Body target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request.Body)get_store().add_element_user(BODY$2);
                return target;
            }
        }
        /**
         * An XML body(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BodyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestDocument.Blast4Request.Body
        {
            
            public BodyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4REQUESTBODY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-request-body");
            
            
            /**
             * Gets the "Blast4-request-body" element
             */
            public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody getBlast4RequestBody()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody)get_store().find_element_user(BLAST4REQUESTBODY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-request-body" element
             */
            public void setBlast4RequestBody(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody blast4RequestBody)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody)get_store().find_element_user(BLAST4REQUESTBODY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody)get_store().add_element_user(BLAST4REQUESTBODY$0);
                    }
                    target.set(blast4RequestBody);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-request-body" element
             */
            public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody addNewBlast4RequestBody()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody)get_store().add_element_user(BLAST4REQUESTBODY$0);
                    return target;
                }
            }
        }
    }
}
