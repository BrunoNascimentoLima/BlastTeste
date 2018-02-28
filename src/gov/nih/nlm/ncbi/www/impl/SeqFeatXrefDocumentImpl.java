/*
 * An XML document type.
 * Localname: SeqFeatXref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqFeatXrefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one SeqFeatXref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqFeatXrefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatXrefDocument
{
    
    public SeqFeatXrefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQFEATXREF$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqFeatXref");
    
    
    /**
     * Gets the "SeqFeatXref" element
     */
    public gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref getSeqFeatXref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref target = null;
            target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref)get_store().find_element_user(SEQFEATXREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SeqFeatXref" element
     */
    public void setSeqFeatXref(gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref seqFeatXref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref target = null;
            target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref)get_store().find_element_user(SEQFEATXREF$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref)get_store().add_element_user(SEQFEATXREF$0);
            }
            target.set(seqFeatXref);
        }
    }
    
    /**
     * Appends and returns a new empty "SeqFeatXref" element
     */
    public gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref addNewSeqFeatXref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref target = null;
            target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref)get_store().add_element_user(SEQFEATXREF$0);
            return target;
        }
    }
    /**
     * An XML SeqFeatXref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqFeatXrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref
    {
        
        public SeqFeatXrefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName DATA$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "data");
        
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "id" element
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ID$0) != 0;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Id)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Id)get_store().add_element_user(ID$0);
                return target;
            }
        }
        
        /**
         * Unsets the "id" element
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ID$0, 0);
            }
        }
        
        /**
         * Gets the "data" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Data getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Data target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Data)get_store().find_element_user(DATA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "data" element
         */
        public boolean isSetData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATA$2) != 0;
            }
        }
        
        /**
         * Sets the "data" element
         */
        public void setData(gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Data data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Data target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Data)get_store().find_element_user(DATA$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Data)get_store().add_element_user(DATA$2);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Data addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Data target = null;
                target = (gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Data)get_store().add_element_user(DATA$2);
                return target;
            }
        }
        
        /**
         * Unsets the "data" element
         */
        public void unsetData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATA$2, 0);
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Id
        {
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
        /**
         * An XML data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqFeatXrefDocument.SeqFeatXref.Data
        {
            
            public DataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQFEATDATA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqFeatData");
            
            
            /**
             * Gets the "SeqFeatData" element
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData getSeqFeatData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData)get_store().find_element_user(SEQFEATDATA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "SeqFeatData" element
             */
            public void setSeqFeatData(gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData seqFeatData)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData)get_store().find_element_user(SEQFEATDATA$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData)get_store().add_element_user(SEQFEATDATA$0);
                    }
                    target.set(seqFeatData);
                }
            }
            
            /**
             * Appends and returns a new empty "SeqFeatData" element
             */
            public gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData addNewSeqFeatData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqFeatDataDocument.SeqFeatData)get_store().add_element_user(SEQFEATDATA$0);
                    return target;
                }
            }
        }
    }
}
