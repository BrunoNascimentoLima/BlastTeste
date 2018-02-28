/*
 * An XML document type.
 * Localname: Annot-id
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.AnnotIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Annot-id(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class AnnotIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotIdDocument
{
    
    public AnnotIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Annot-id");
    
    
    /**
     * Gets the "Annot-id" element
     */
    public gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId getAnnotId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId target = null;
            target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId)get_store().find_element_user(ANNOTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Annot-id" element
     */
    public void setAnnotId(gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId annotId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId target = null;
            target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId)get_store().find_element_user(ANNOTID$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId)get_store().add_element_user(ANNOTID$0);
            }
            target.set(annotId);
        }
    }
    
    /**
     * Appends and returns a new empty "Annot-id" element
     */
    public gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId addNewAnnotId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId target = null;
            target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId)get_store().add_element_user(ANNOTID$0);
            return target;
        }
    }
    /**
     * An XML Annot-id(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class AnnotIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId
    {
        
        public AnnotIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCAL$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "local");
        private static final javax.xml.namespace.QName NCBI$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbi");
        private static final javax.xml.namespace.QName GENERAL$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "general");
        private static final javax.xml.namespace.QName OTHER$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "other");
        
        
        /**
         * Gets the "local" element
         */
        public gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Local getLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Local target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Local)get_store().find_element_user(LOCAL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "local" element
         */
        public boolean isSetLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCAL$0) != 0;
            }
        }
        
        /**
         * Sets the "local" element
         */
        public void setLocal(gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Local local)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Local target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Local)get_store().find_element_user(LOCAL$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Local)get_store().add_element_user(LOCAL$0);
                }
                target.set(local);
            }
        }
        
        /**
         * Appends and returns a new empty "local" element
         */
        public gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Local addNewLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Local target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Local)get_store().add_element_user(LOCAL$0);
                return target;
            }
        }
        
        /**
         * Unsets the "local" element
         */
        public void unsetLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCAL$0, 0);
            }
        }
        
        /**
         * Gets the "ncbi" element
         */
        public java.math.BigInteger getNcbi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "ncbi" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNcbi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NCBI$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "ncbi" element
         */
        public boolean isSetNcbi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NCBI$2) != 0;
            }
        }
        
        /**
         * Sets the "ncbi" element
         */
        public void setNcbi(java.math.BigInteger ncbi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBI$2);
                }
                target.setBigIntegerValue(ncbi);
            }
        }
        
        /**
         * Sets (as xml) the "ncbi" element
         */
        public void xsetNcbi(org.apache.xmlbeans.XmlInteger ncbi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NCBI$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NCBI$2);
                }
                target.set(ncbi);
            }
        }
        
        /**
         * Unsets the "ncbi" element
         */
        public void unsetNcbi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NCBI$2, 0);
            }
        }
        
        /**
         * Gets the "general" element
         */
        public gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.General getGeneral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.General target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.General)get_store().find_element_user(GENERAL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "general" element
         */
        public boolean isSetGeneral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENERAL$4) != 0;
            }
        }
        
        /**
         * Sets the "general" element
         */
        public void setGeneral(gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.General general)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.General target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.General)get_store().find_element_user(GENERAL$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.General)get_store().add_element_user(GENERAL$4);
                }
                target.set(general);
            }
        }
        
        /**
         * Appends and returns a new empty "general" element
         */
        public gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.General addNewGeneral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.General target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.General)get_store().add_element_user(GENERAL$4);
                return target;
            }
        }
        
        /**
         * Unsets the "general" element
         */
        public void unsetGeneral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENERAL$4, 0);
            }
        }
        
        /**
         * Gets the "other" element
         */
        public gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Other getOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Other target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Other)get_store().find_element_user(OTHER$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "other" element
         */
        public boolean isSetOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OTHER$6) != 0;
            }
        }
        
        /**
         * Sets the "other" element
         */
        public void setOther(gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Other other)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Other target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Other)get_store().find_element_user(OTHER$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Other)get_store().add_element_user(OTHER$6);
                }
                target.set(other);
            }
        }
        
        /**
         * Appends and returns a new empty "other" element
         */
        public gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Other addNewOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Other target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Other)get_store().add_element_user(OTHER$6);
                return target;
            }
        }
        
        /**
         * Unsets the "other" element
         */
        public void unsetOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OTHER$6, 0);
            }
        }
        /**
         * An XML local(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LocalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Local
        {
            
            public LocalImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName OBJECTID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Object-id");
            
            
            /**
             * Gets the "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId getObjectId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().find_element_user(OBJECTID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Object-id" element
             */
            public void setObjectId(gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId objectId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().find_element_user(OBJECTID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().add_element_user(OBJECTID$0);
                    }
                    target.set(objectId);
                }
            }
            
            /**
             * Appends and returns a new empty "Object-id" element
             */
            public gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId addNewObjectId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId target = null;
                    target = (gov.nih.nlm.ncbi.www.ObjectIdDocument.ObjectId)get_store().add_element_user(OBJECTID$0);
                    return target;
                }
            }
        }
        /**
         * An XML general(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GeneralImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.General
        {
            
            public GeneralImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DBTAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
            
            
            /**
             * Gets the "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Dbtag" element
             */
            public void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    }
                    target.set(dbtag);
                }
            }
            
            /**
             * Appends and returns a new empty "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    return target;
                }
            }
        }
        /**
         * An XML other(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class OtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId.Other
        {
            
            public OtherImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TEXTANNOTID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Textannot-id");
            
            
            /**
             * Gets the "Textannot-id" element
             */
            public gov.nih.nlm.ncbi.www.TextannotIdDocument.TextannotId getTextannotId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextannotIdDocument.TextannotId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextannotIdDocument.TextannotId)get_store().find_element_user(TEXTANNOTID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Textannot-id" element
             */
            public void setTextannotId(gov.nih.nlm.ncbi.www.TextannotIdDocument.TextannotId textannotId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextannotIdDocument.TextannotId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextannotIdDocument.TextannotId)get_store().find_element_user(TEXTANNOTID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TextannotIdDocument.TextannotId)get_store().add_element_user(TEXTANNOTID$0);
                    }
                    target.set(textannotId);
                }
            }
            
            /**
             * Appends and returns a new empty "Textannot-id" element
             */
            public gov.nih.nlm.ncbi.www.TextannotIdDocument.TextannotId addNewTextannotId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TextannotIdDocument.TextannotId target = null;
                    target = (gov.nih.nlm.ncbi.www.TextannotIdDocument.TextannotId)get_store().add_element_user(TEXTANNOTID$0);
                    return target;
                }
            }
        }
    }
}
