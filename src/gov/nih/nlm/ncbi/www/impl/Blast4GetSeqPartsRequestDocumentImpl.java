/*
 * An XML document type.
 * Localname: Blast4-get-seq-parts-request
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-seq-parts-request(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetSeqPartsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument
{
    
    public Blast4GetSeqPartsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETSEQPARTSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-seq-parts-request");
    
    
    /**
     * Gets the "Blast4-get-seq-parts-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest getBlast4GetSeqPartsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest)get_store().find_element_user(BLAST4GETSEQPARTSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-seq-parts-request" element
     */
    public void setBlast4GetSeqPartsRequest(gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest blast4GetSeqPartsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest)get_store().find_element_user(BLAST4GETSEQPARTSREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest)get_store().add_element_user(BLAST4GETSEQPARTSREQUEST$0);
            }
            target.set(blast4GetSeqPartsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-seq-parts-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest addNewBlast4GetSeqPartsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest)get_store().add_element_user(BLAST4GETSEQPARTSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-seq-parts-request(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetSeqPartsRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest
    {
        
        public Blast4GetSeqPartsRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATABASE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "database");
        private static final javax.xml.namespace.QName SEQLOCATIONS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-locations");
        
        
        /**
         * Gets the "database" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database getDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database)get_store().find_element_user(DATABASE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "database" element
         */
        public void setDatabase(gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database database)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database)get_store().find_element_user(DATABASE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database)get_store().add_element_user(DATABASE$0);
                }
                target.set(database);
            }
        }
        
        /**
         * Appends and returns a new empty "database" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database addNewDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database)get_store().add_element_user(DATABASE$0);
                return target;
            }
        }
        
        /**
         * Gets the "seq-locations" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations getSeqLocations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations)get_store().find_element_user(SEQLOCATIONS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "seq-locations" element
         */
        public void setSeqLocations(gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations seqLocations)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations)get_store().find_element_user(SEQLOCATIONS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations)get_store().add_element_user(SEQLOCATIONS$2);
                }
                target.set(seqLocations);
            }
        }
        
        /**
         * Appends and returns a new empty "seq-locations" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations addNewSeqLocations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations)get_store().add_element_user(SEQLOCATIONS$2);
                return target;
            }
        }
        /**
         * An XML database(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DatabaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.Database
        {
            
            public DatabaseImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4DATABASE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-database");
            
            
            /**
             * Gets the "Blast4-database" element
             */
            public gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database getBlast4Database()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database)get_store().find_element_user(BLAST4DATABASE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-database" element
             */
            public void setBlast4Database(gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database blast4Database)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database)get_store().find_element_user(BLAST4DATABASE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database)get_store().add_element_user(BLAST4DATABASE$0);
                    }
                    target.set(blast4Database);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-database" element
             */
            public gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database addNewBlast4Database()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4DatabaseDocument.Blast4Database)get_store().add_element_user(BLAST4DATABASE$0);
                    return target;
                }
            }
        }
        /**
         * An XML seq-locations(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqLocationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest.SeqLocations
        {
            
            public SeqLocationsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQINTERVAL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-interval");
            
            
            /**
             * Gets array of all "Seq-interval" elements
             */
            public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[] getSeqIntervalArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQINTERVAL$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[] result = new gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Seq-interval" element
             */
            public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval getSeqIntervalArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().find_element_user(SEQINTERVAL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Seq-interval" element
             */
            public int sizeOfSeqIntervalArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQINTERVAL$0);
                }
            }
            
            /**
             * Sets array of all "Seq-interval" element
             */
            public void setSeqIntervalArray(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[] seqIntervalArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqIntervalArray, SEQINTERVAL$0);
                }
            }
            
            /**
             * Sets ith "Seq-interval" element
             */
            public void setSeqIntervalArray(int i, gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval seqInterval)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().find_element_user(SEQINTERVAL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqInterval);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-interval" element
             */
            public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval insertNewSeqInterval(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().insert_element_user(SEQINTERVAL$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-interval" element
             */
            public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval addNewSeqInterval()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().add_element_user(SEQINTERVAL$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Seq-interval" element
             */
            public void removeSeqInterval(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQINTERVAL$0, i);
                }
            }
        }
    }
}
