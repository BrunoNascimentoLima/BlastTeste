/*
 * An XML document type.
 * Localname: Giimport-id
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GiimportIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Giimport-id(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class GiimportIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GiimportIdDocument
{
    
    public GiimportIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GIIMPORTID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Giimport-id");
    
    
    /**
     * Gets the "Giimport-id" element
     */
    public gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId getGiimportId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId target = null;
            target = (gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId)get_store().find_element_user(GIIMPORTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Giimport-id" element
     */
    public void setGiimportId(gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId giimportId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId target = null;
            target = (gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId)get_store().find_element_user(GIIMPORTID$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId)get_store().add_element_user(GIIMPORTID$0);
            }
            target.set(giimportId);
        }
    }
    
    /**
     * Appends and returns a new empty "Giimport-id" element
     */
    public gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId addNewGiimportId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId target = null;
            target = (gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId)get_store().add_element_user(GIIMPORTID$0);
            return target;
        }
    }
    /**
     * An XML Giimport-id(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class GiimportIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GiimportIdDocument.GiimportId
    {
        
        public GiimportIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName DB$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "db");
        private static final javax.xml.namespace.QName RELEASE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "release");
        
        
        /**
         * Gets the "id" element
         */
        public java.math.BigInteger getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public org.apache.xmlbeans.XmlInteger xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(java.math.BigInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                }
                target.setBigIntegerValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(org.apache.xmlbeans.XmlInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "db" element
         */
        public java.lang.String getDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DB$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "db" element
         */
        public org.apache.xmlbeans.XmlString xgetDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DB$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "db" element
         */
        public boolean isSetDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DB$2) != 0;
            }
        }
        
        /**
         * Sets the "db" element
         */
        public void setDb(java.lang.String db)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DB$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DB$2);
                }
                target.setStringValue(db);
            }
        }
        
        /**
         * Sets (as xml) the "db" element
         */
        public void xsetDb(org.apache.xmlbeans.XmlString db)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DB$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DB$2);
                }
                target.set(db);
            }
        }
        
        /**
         * Unsets the "db" element
         */
        public void unsetDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DB$2, 0);
            }
        }
        
        /**
         * Gets the "release" element
         */
        public java.lang.String getRelease()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEASE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "release" element
         */
        public org.apache.xmlbeans.XmlString xgetRelease()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELEASE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "release" element
         */
        public boolean isSetRelease()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELEASE$4) != 0;
            }
        }
        
        /**
         * Sets the "release" element
         */
        public void setRelease(java.lang.String release)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEASE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELEASE$4);
                }
                target.setStringValue(release);
            }
        }
        
        /**
         * Sets (as xml) the "release" element
         */
        public void xsetRelease(org.apache.xmlbeans.XmlString release)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELEASE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELEASE$4);
                }
                target.set(release);
            }
        }
        
        /**
         * Unsets the "release" element
         */
        public void unsetRelease()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELEASE$4, 0);
            }
        }
    }
}
