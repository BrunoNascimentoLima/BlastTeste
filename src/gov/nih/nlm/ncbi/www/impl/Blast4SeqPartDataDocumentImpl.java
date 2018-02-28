/*
 * An XML document type.
 * Localname: Blast4-seq-part-data
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-seq-part-data(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4SeqPartDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument
{
    
    public Blast4SeqPartDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4SEQPARTDATA$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-seq-part-data");
    
    
    /**
     * Gets the "Blast4-seq-part-data" element
     */
    public gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData getBlast4SeqPartData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData)get_store().find_element_user(BLAST4SEQPARTDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-seq-part-data" element
     */
    public void setBlast4SeqPartData(gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData blast4SeqPartData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData)get_store().find_element_user(BLAST4SEQPARTDATA$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData)get_store().add_element_user(BLAST4SEQPARTDATA$0);
            }
            target.set(blast4SeqPartData);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-seq-part-data" element
     */
    public gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData addNewBlast4SeqPartData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData)get_store().add_element_user(BLAST4SEQPARTDATA$0);
            return target;
        }
    }
    /**
     * An XML Blast4-seq-part-data(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4SeqPartDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData
    {
        
        public Blast4SeqPartDataImpl(org.apache.xmlbeans.SchemaType sType)
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
        public gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Id target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Id)get_store().find_element_user(ID$0, 0);
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
        public void setId(gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Id target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Id)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Id target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Id)get_store().add_element_user(ID$0);
                return target;
            }
        }
        
        /**
         * Gets the "data" element
         */
        public gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Data getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Data target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Data)get_store().find_element_user(DATA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "data" element
         */
        public void setData(gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Data data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Data target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Data)get_store().find_element_user(DATA$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Data)get_store().add_element_user(DATA$2);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Data addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Data target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Data)get_store().add_element_user(DATA$2);
                return target;
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Id
        {
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4SeqPartDataDocument.Blast4SeqPartData.Data
        {
            
            public DataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQDATA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-data");
            
            
            /**
             * Gets the "Seq-data" element
             */
            public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData getSeqData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData)get_store().find_element_user(SEQDATA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-data" element
             */
            public void setSeqData(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData seqData)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData)get_store().find_element_user(SEQDATA$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData)get_store().add_element_user(SEQDATA$0);
                    }
                    target.set(seqData);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-data" element
             */
            public gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData addNewSeqData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData)get_store().add_element_user(SEQDATA$0);
                    return target;
                }
            }
        }
    }
}
