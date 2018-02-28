/*
 * An XML document type.
 * Localname: Annotdesc
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.AnnotdescDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Annotdesc(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class AnnotdescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotdescDocument
{
    
    public AnnotdescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTDESC$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Annotdesc");
    
    
    /**
     * Gets the "Annotdesc" element
     */
    public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc getAnnotdesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc target = null;
            target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc)get_store().find_element_user(ANNOTDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Annotdesc" element
     */
    public void setAnnotdesc(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc annotdesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc target = null;
            target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc)get_store().find_element_user(ANNOTDESC$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc)get_store().add_element_user(ANNOTDESC$0);
            }
            target.set(annotdesc);
        }
    }
    
    /**
     * Appends and returns a new empty "Annotdesc" element
     */
    public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc addNewAnnotdesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc target = null;
            target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc)get_store().add_element_user(ANNOTDESC$0);
            return target;
        }
    }
    /**
     * An XML Annotdesc(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class AnnotdescImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc
    {
        
        public AnnotdescImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName TITLE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "title");
        private static final javax.xml.namespace.QName COMMENT$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "comment");
        private static final javax.xml.namespace.QName PUB$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pub");
        private static final javax.xml.namespace.QName USER$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "user");
        private static final javax.xml.namespace.QName CREATEDATE$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "create-date");
        private static final javax.xml.namespace.QName UPDATEDATE$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "update-date");
        private static final javax.xml.namespace.QName SRC$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "src");
        private static final javax.xml.namespace.QName ALIGN$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "align");
        private static final javax.xml.namespace.QName REGION$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "region");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "name" element
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$0) != 0;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" element
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$0, 0);
            }
        }
        
        /**
         * Gets the "title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" element
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "title" element
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLE$2) != 0;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$2);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" element
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$2);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "title" element
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLE$2, 0);
            }
        }
        
        /**
         * Gets the "comment" element
         */
        public java.lang.String getComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "comment" element
         */
        public org.apache.xmlbeans.XmlString xgetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "comment" element
         */
        public boolean isSetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMENT$4) != 0;
            }
        }
        
        /**
         * Sets the "comment" element
         */
        public void setComment(java.lang.String comment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENT$4);
                }
                target.setStringValue(comment);
            }
        }
        
        /**
         * Sets (as xml) the "comment" element
         */
        public void xsetComment(org.apache.xmlbeans.XmlString comment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENT$4);
                }
                target.set(comment);
            }
        }
        
        /**
         * Unsets the "comment" element
         */
        public void unsetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMENT$4, 0);
            }
        }
        
        /**
         * Gets the "pub" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub getPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub)get_store().find_element_user(PUB$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pub" element
         */
        public boolean isSetPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUB$6) != 0;
            }
        }
        
        /**
         * Sets the "pub" element
         */
        public void setPub(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub pub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub)get_store().find_element_user(PUB$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub)get_store().add_element_user(PUB$6);
                }
                target.set(pub);
            }
        }
        
        /**
         * Appends and returns a new empty "pub" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub addNewPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub)get_store().add_element_user(PUB$6);
                return target;
            }
        }
        
        /**
         * Unsets the "pub" element
         */
        public void unsetPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUB$6, 0);
            }
        }
        
        /**
         * Gets the "user" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User getUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User)get_store().find_element_user(USER$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "user" element
         */
        public boolean isSetUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USER$8) != 0;
            }
        }
        
        /**
         * Sets the "user" element
         */
        public void setUser(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User user)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User)get_store().find_element_user(USER$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User)get_store().add_element_user(USER$8);
                }
                target.set(user);
            }
        }
        
        /**
         * Appends and returns a new empty "user" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User addNewUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User)get_store().add_element_user(USER$8);
                return target;
            }
        }
        
        /**
         * Unsets the "user" element
         */
        public void unsetUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USER$8, 0);
            }
        }
        
        /**
         * Gets the "create-date" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate getCreateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate)get_store().find_element_user(CREATEDATE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "create-date" element
         */
        public boolean isSetCreateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATEDATE$10) != 0;
            }
        }
        
        /**
         * Sets the "create-date" element
         */
        public void setCreateDate(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate createDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate)get_store().find_element_user(CREATEDATE$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate)get_store().add_element_user(CREATEDATE$10);
                }
                target.set(createDate);
            }
        }
        
        /**
         * Appends and returns a new empty "create-date" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate addNewCreateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate)get_store().add_element_user(CREATEDATE$10);
                return target;
            }
        }
        
        /**
         * Unsets the "create-date" element
         */
        public void unsetCreateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATEDATE$10, 0);
            }
        }
        
        /**
         * Gets the "update-date" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate getUpdateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate)get_store().find_element_user(UPDATEDATE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "update-date" element
         */
        public boolean isSetUpdateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UPDATEDATE$12) != 0;
            }
        }
        
        /**
         * Sets the "update-date" element
         */
        public void setUpdateDate(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate updateDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate)get_store().find_element_user(UPDATEDATE$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate)get_store().add_element_user(UPDATEDATE$12);
                }
                target.set(updateDate);
            }
        }
        
        /**
         * Appends and returns a new empty "update-date" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate addNewUpdateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate)get_store().add_element_user(UPDATEDATE$12);
                return target;
            }
        }
        
        /**
         * Unsets the "update-date" element
         */
        public void unsetUpdateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UPDATEDATE$12, 0);
            }
        }
        
        /**
         * Gets the "src" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src getSrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src)get_store().find_element_user(SRC$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "src" element
         */
        public boolean isSetSrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SRC$14) != 0;
            }
        }
        
        /**
         * Sets the "src" element
         */
        public void setSrc(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src src)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src)get_store().find_element_user(SRC$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src)get_store().add_element_user(SRC$14);
                }
                target.set(src);
            }
        }
        
        /**
         * Appends and returns a new empty "src" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src addNewSrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src)get_store().add_element_user(SRC$14);
                return target;
            }
        }
        
        /**
         * Unsets the "src" element
         */
        public void unsetSrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SRC$14, 0);
            }
        }
        
        /**
         * Gets the "align" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align getAlign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align)get_store().find_element_user(ALIGN$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "align" element
         */
        public boolean isSetAlign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALIGN$16) != 0;
            }
        }
        
        /**
         * Sets the "align" element
         */
        public void setAlign(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align align)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align)get_store().find_element_user(ALIGN$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align)get_store().add_element_user(ALIGN$16);
                }
                target.set(align);
            }
        }
        
        /**
         * Appends and returns a new empty "align" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align addNewAlign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align)get_store().add_element_user(ALIGN$16);
                return target;
            }
        }
        
        /**
         * Unsets the "align" element
         */
        public void unsetAlign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALIGN$16, 0);
            }
        }
        
        /**
         * Gets the "region" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region getRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region)get_store().find_element_user(REGION$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "region" element
         */
        public boolean isSetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REGION$18) != 0;
            }
        }
        
        /**
         * Sets the "region" element
         */
        public void setRegion(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region)get_store().find_element_user(REGION$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region)get_store().add_element_user(REGION$18);
                }
                target.set(region);
            }
        }
        
        /**
         * Appends and returns a new empty "region" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region addNewRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region)get_store().add_element_user(REGION$18);
                return target;
            }
        }
        
        /**
         * Unsets the "region" element
         */
        public void unsetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REGION$18, 0);
            }
        }
        /**
         * An XML pub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PubImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub
        {
            
            public PubImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBDESC$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Pubdesc");
            
            
            /**
             * Gets the "Pubdesc" element
             */
            public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc getPubdesc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc)get_store().find_element_user(PUBDESC$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Pubdesc" element
             */
            public void setPubdesc(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc pubdesc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc)get_store().find_element_user(PUBDESC$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc)get_store().add_element_user(PUBDESC$0);
                    }
                    target.set(pubdesc);
                }
            }
            
            /**
             * Appends and returns a new empty "Pubdesc" element
             */
            public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc addNewPubdesc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc)get_store().add_element_user(PUBDESC$0);
                    return target;
                }
            }
        }
        /**
         * An XML user(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class UserImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User
        {
            
            public UserImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName USEROBJECT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "User-object");
            
            
            /**
             * Gets the "User-object" element
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "User-object" element
             */
            public void setUserObject(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().add_element_user(USEROBJECT$0);
                    }
                    target.set(userObject);
                }
            }
            
            /**
             * Appends and returns a new empty "User-object" element
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject addNewUserObject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().add_element_user(USEROBJECT$0);
                    return target;
                }
            }
        }
        /**
         * An XML create-date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CreateDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate
        {
            
            public CreateDateImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Date");
            
            
            /**
             * Gets the "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date getDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Date" element
             */
            public void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    }
                    target.set(date);
                }
            }
            
            /**
             * Appends and returns a new empty "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    return target;
                }
            }
        }
        /**
         * An XML update-date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class UpdateDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate
        {
            
            public UpdateDateImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Date");
            
            
            /**
             * Gets the "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date getDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Date" element
             */
            public void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    }
                    target.set(date);
                }
            }
            
            /**
             * Appends and returns a new empty "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    return target;
                }
            }
        }
        /**
         * An XML src(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SrcImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src
        {
            
            public SrcImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-id");
            
            
            /**
             * Gets the "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-id" element
             */
            public void setSeqId(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
                    }
                    target.set(seqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-id" element
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
        }
        /**
         * An XML align(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AlignImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align
        {
            
            public AlignImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ALIGNDEF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Align-def");
            
            
            /**
             * Gets the "Align-def" element
             */
            public gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef getAlignDef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef target = null;
                    target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef)get_store().find_element_user(ALIGNDEF$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Align-def" element
             */
            public void setAlignDef(gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef alignDef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef target = null;
                    target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef)get_store().find_element_user(ALIGNDEF$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef)get_store().add_element_user(ALIGNDEF$0);
                    }
                    target.set(alignDef);
                }
            }
            
            /**
             * Appends and returns a new empty "Align-def" element
             */
            public gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef addNewAlignDef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef target = null;
                    target = (gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef)get_store().add_element_user(ALIGNDEF$0);
                    return target;
                }
            }
        }
        /**
         * An XML region(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RegionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region
        {
            
            public RegionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQLOC$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-loc");
            
            
            /**
             * Gets the "Seq-loc" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-loc" element
             */
            public void setSeqLoc(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().add_element_user(SEQLOC$0);
                    }
                    target.set(seqLoc);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-loc" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().add_element_user(SEQLOC$0);
                    return target;
                }
            }
        }
    }
}
