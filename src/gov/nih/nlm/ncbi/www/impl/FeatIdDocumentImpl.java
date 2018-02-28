/*
 * An XML document type.
 * Localname: Feat-id
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.FeatIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Feat-id(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class FeatIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.FeatIdDocument
{
    
    public FeatIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Feat-id");
    
    
    /**
     * Gets the "Feat-id" element
     */
    public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId getFeatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId target = null;
            target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().find_element_user(FEATID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Feat-id" element
     */
    public void setFeatId(gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId featId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId target = null;
            target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().find_element_user(FEATID$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().add_element_user(FEATID$0);
            }
            target.set(featId);
        }
    }
    
    /**
     * Appends and returns a new empty "Feat-id" element
     */
    public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId addNewFeatId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId target = null;
            target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().add_element_user(FEATID$0);
            return target;
        }
    }
    /**
     * An XML Feat-id(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class FeatIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId
    {
        
        public FeatIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GIBB$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gibb");
        private static final javax.xml.namespace.QName GIIM$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "giim");
        private static final javax.xml.namespace.QName LOCAL$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "local");
        private static final javax.xml.namespace.QName GENERAL$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "general");
        
        
        /**
         * Gets the "gibb" element
         */
        public java.math.BigInteger getGibb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIBB$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "gibb" element
         */
        public org.apache.xmlbeans.XmlInteger xgetGibb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GIBB$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "gibb" element
         */
        public boolean isSetGibb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GIBB$0) != 0;
            }
        }
        
        /**
         * Sets the "gibb" element
         */
        public void setGibb(java.math.BigInteger gibb)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIBB$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GIBB$0);
                }
                target.setBigIntegerValue(gibb);
            }
        }
        
        /**
         * Sets (as xml) the "gibb" element
         */
        public void xsetGibb(org.apache.xmlbeans.XmlInteger gibb)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GIBB$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GIBB$0);
                }
                target.set(gibb);
            }
        }
        
        /**
         * Unsets the "gibb" element
         */
        public void unsetGibb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GIBB$0, 0);
            }
        }
        
        /**
         * Gets the "giim" element
         */
        public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim getGiim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim target = null;
                target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim)get_store().find_element_user(GIIM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "giim" element
         */
        public boolean isSetGiim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GIIM$2) != 0;
            }
        }
        
        /**
         * Sets the "giim" element
         */
        public void setGiim(gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim giim)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim target = null;
                target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim)get_store().find_element_user(GIIM$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim)get_store().add_element_user(GIIM$2);
                }
                target.set(giim);
            }
        }
        
        /**
         * Appends and returns a new empty "giim" element
         */
        public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim addNewGiim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim target = null;
                target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim)get_store().add_element_user(GIIM$2);
                return target;
            }
        }
        
        /**
         * Unsets the "giim" element
         */
        public void unsetGiim()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GIIM$2, 0);
            }
        }
        
        /**
         * Gets the "local" element
         */
        public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local getLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local target = null;
                target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local)get_store().find_element_user(LOCAL$4, 0);
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
                return get_store().count_elements(LOCAL$4) != 0;
            }
        }
        
        /**
         * Sets the "local" element
         */
        public void setLocal(gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local local)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local target = null;
                target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local)get_store().find_element_user(LOCAL$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local)get_store().add_element_user(LOCAL$4);
                }
                target.set(local);
            }
        }
        
        /**
         * Appends and returns a new empty "local" element
         */
        public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local addNewLocal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local target = null;
                target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local)get_store().add_element_user(LOCAL$4);
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
                get_store().remove_element(LOCAL$4, 0);
            }
        }
        
        /**
         * Gets the "general" element
         */
        public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General getGeneral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General target = null;
                target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General)get_store().find_element_user(GENERAL$6, 0);
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
                return get_store().count_elements(GENERAL$6) != 0;
            }
        }
        
        /**
         * Sets the "general" element
         */
        public void setGeneral(gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General general)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General target = null;
                target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General)get_store().find_element_user(GENERAL$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General)get_store().add_element_user(GENERAL$6);
                }
                target.set(general);
            }
        }
        
        /**
         * Appends and returns a new empty "general" element
         */
        public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General addNewGeneral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General target = null;
                target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General)get_store().add_element_user(GENERAL$6);
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
                get_store().remove_element(GENERAL$6, 0);
            }
        }
        /**
         * An XML giim(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GiimImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Giim
        {
            
            public GiimImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
        /**
         * An XML local(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LocalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.Local
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
        public static class GeneralImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId.General
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
    }
}
