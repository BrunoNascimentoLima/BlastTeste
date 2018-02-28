/*
 * An XML document type.
 * Localname: Blast4-reply
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ReplyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-reply(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4ReplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyDocument
{
    
    public Blast4ReplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4REPLY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-reply");
    
    
    /**
     * Gets the "Blast4-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply getBlast4Reply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply)get_store().find_element_user(BLAST4REPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-reply" element
     */
    public void setBlast4Reply(gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply blast4Reply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply)get_store().find_element_user(BLAST4REPLY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply)get_store().add_element_user(BLAST4REPLY$0);
            }
            target.set(blast4Reply);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-reply" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply addNewBlast4Reply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply)get_store().add_element_user(BLAST4REPLY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-reply(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4ReplyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply
    {
        
        public Blast4ReplyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ERRORS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "errors");
        private static final javax.xml.namespace.QName BODY$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "body");
        
        
        /**
         * Gets the "errors" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors getErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors)get_store().find_element_user(ERRORS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "errors" element
         */
        public boolean isSetErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ERRORS$0) != 0;
            }
        }
        
        /**
         * Sets the "errors" element
         */
        public void setErrors(gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors errors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors)get_store().find_element_user(ERRORS$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors)get_store().add_element_user(ERRORS$0);
                }
                target.set(errors);
            }
        }
        
        /**
         * Appends and returns a new empty "errors" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors addNewErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors)get_store().add_element_user(ERRORS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "errors" element
         */
        public void unsetErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ERRORS$0, 0);
            }
        }
        
        /**
         * Gets the "body" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body getBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body)get_store().find_element_user(BODY$2, 0);
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
        public void setBody(gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body body)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body)get_store().find_element_user(BODY$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body)get_store().add_element_user(BODY$2);
                }
                target.set(body);
            }
        }
        
        /**
         * Appends and returns a new empty "body" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body addNewBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body)get_store().add_element_user(BODY$2);
                return target;
            }
        }
        /**
         * An XML errors(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ErrorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Errors
        {
            
            public ErrorsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4ERROR$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-error");
            
            
            /**
             * Gets array of all "Blast4-error" elements
             */
            public gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error[] getBlast4ErrorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(BLAST4ERROR$0, targetList);
                    gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error[] result = new gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Blast4-error" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error getBlast4ErrorArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error)get_store().find_element_user(BLAST4ERROR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Blast4-error" element
             */
            public int sizeOfBlast4ErrorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BLAST4ERROR$0);
                }
            }
            
            /**
             * Sets array of all "Blast4-error" element
             */
            public void setBlast4ErrorArray(gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error[] blast4ErrorArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(blast4ErrorArray, BLAST4ERROR$0);
                }
            }
            
            /**
             * Sets ith "Blast4-error" element
             */
            public void setBlast4ErrorArray(int i, gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error blast4Error)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error)get_store().find_element_user(BLAST4ERROR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(blast4Error);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-error" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error insertNewBlast4Error(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error)get_store().insert_element_user(BLAST4ERROR$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-error" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error addNewBlast4Error()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ErrorDocument.Blast4Error)get_store().add_element_user(BLAST4ERROR$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Blast4-error" element
             */
            public void removeBlast4Error(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BLAST4ERROR$0, i);
                }
            }
        }
        /**
         * An XML body(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BodyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyDocument.Blast4Reply.Body
        {
            
            public BodyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4REPLYBODY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-reply-body");
            
            
            /**
             * Gets the "Blast4-reply-body" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody getBlast4ReplyBody()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody)get_store().find_element_user(BLAST4REPLYBODY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-reply-body" element
             */
            public void setBlast4ReplyBody(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody blast4ReplyBody)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody)get_store().find_element_user(BLAST4REPLYBODY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody)get_store().add_element_user(BLAST4REPLYBODY$0);
                    }
                    target.set(blast4ReplyBody);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-reply-body" element
             */
            public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody addNewBlast4ReplyBody()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody)get_store().add_element_user(BLAST4REPLYBODY$0);
                    return target;
                }
            }
        }
    }
}
