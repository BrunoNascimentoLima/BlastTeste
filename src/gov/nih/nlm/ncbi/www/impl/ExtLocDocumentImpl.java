/*
 * An XML document type.
 * Localname: Ext-loc
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ExtLocDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Ext-loc(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ExtLocDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ExtLocDocument
{
    
    public ExtLocDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLOC$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Ext-loc");
    
    
    /**
     * Gets the "Ext-loc" element
     */
    public gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc getExtLoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc target = null;
            target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc)get_store().find_element_user(EXTLOC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ext-loc" element
     */
    public void setExtLoc(gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc extLoc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc target = null;
            target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc)get_store().find_element_user(EXTLOC$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc)get_store().add_element_user(EXTLOC$0);
            }
            target.set(extLoc);
        }
    }
    
    /**
     * Appends and returns a new empty "Ext-loc" element
     */
    public gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc addNewExtLoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc target = null;
            target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc)get_store().add_element_user(EXTLOC$0);
            return target;
        }
    }
    /**
     * An XML Ext-loc(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ExtLocImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc
    {
        
        public ExtLocImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName LOCATION$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "location");
        
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Id target = null;
                target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Id target = null;
                target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Id)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Id target = null;
                target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Id)get_store().add_element_user(ID$0);
                return target;
            }
        }
        
        /**
         * Gets the "location" element
         */
        public gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Location getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Location target = null;
                target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Location)get_store().find_element_user(LOCATION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "location" element
         */
        public void setLocation(gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Location location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Location target = null;
                target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Location)get_store().find_element_user(LOCATION$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Location)get_store().add_element_user(LOCATION$2);
                }
                target.set(location);
            }
        }
        
        /**
         * Appends and returns a new empty "location" element
         */
        public gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Location addNewLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Location target = null;
                target = (gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Location)get_store().add_element_user(LOCATION$2);
                return target;
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Id
        {
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML location(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ExtLocDocument.ExtLoc.Location
        {
            
            public LocationImpl(org.apache.xmlbeans.SchemaType sType)
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
