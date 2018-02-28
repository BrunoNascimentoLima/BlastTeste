/*
 * An XML document type.
 * Localname: Blast4-get-sequences-request
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-get-sequences-request(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4GetSequencesRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument
{
    
    public Blast4GetSequencesRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4GETSEQUENCESREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-sequences-request");
    
    
    /**
     * Gets the "Blast4-get-sequences-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest getBlast4GetSequencesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest)get_store().find_element_user(BLAST4GETSEQUENCESREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-get-sequences-request" element
     */
    public void setBlast4GetSequencesRequest(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest blast4GetSequencesRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest)get_store().find_element_user(BLAST4GETSEQUENCESREQUEST$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest)get_store().add_element_user(BLAST4GETSEQUENCESREQUEST$0);
            }
            target.set(blast4GetSequencesRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-get-sequences-request" element
     */
    public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest addNewBlast4GetSequencesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest)get_store().add_element_user(BLAST4GETSEQUENCESREQUEST$0);
            return target;
        }
    }
    /**
     * An XML Blast4-get-sequences-request(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4GetSequencesRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest
    {
        
        public Blast4GetSequencesRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATABASE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "database");
        private static final javax.xml.namespace.QName SEQIDS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-ids");
        private static final javax.xml.namespace.QName SKIPSEQDATA$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "skip-seq-data");
        private static final javax.xml.namespace.QName TARGETONLY$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "target-only");
        
        
        /**
         * Gets the "database" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database getDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database)get_store().find_element_user(DATABASE$0, 0);
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
        public void setDatabase(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database database)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database)get_store().find_element_user(DATABASE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database)get_store().add_element_user(DATABASE$0);
                }
                target.set(database);
            }
        }
        
        /**
         * Appends and returns a new empty "database" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database addNewDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database)get_store().add_element_user(DATABASE$0);
                return target;
            }
        }
        
        /**
         * Gets the "seq-ids" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds getSeqIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds)get_store().find_element_user(SEQIDS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "seq-ids" element
         */
        public void setSeqIds(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds seqIds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds)get_store().find_element_user(SEQIDS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds)get_store().add_element_user(SEQIDS$2);
                }
                target.set(seqIds);
            }
        }
        
        /**
         * Appends and returns a new empty "seq-ids" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds addNewSeqIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds)get_store().add_element_user(SEQIDS$2);
                return target;
            }
        }
        
        /**
         * Gets the "skip-seq-data" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData getSkipSeqData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData)get_store().find_element_user(SKIPSEQDATA$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "skip-seq-data" element
         */
        public boolean isSetSkipSeqData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SKIPSEQDATA$4) != 0;
            }
        }
        
        /**
         * Sets the "skip-seq-data" element
         */
        public void setSkipSeqData(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData skipSeqData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData)get_store().find_element_user(SKIPSEQDATA$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData)get_store().add_element_user(SKIPSEQDATA$4);
                }
                target.set(skipSeqData);
            }
        }
        
        /**
         * Appends and returns a new empty "skip-seq-data" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData addNewSkipSeqData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData)get_store().add_element_user(SKIPSEQDATA$4);
                return target;
            }
        }
        
        /**
         * Unsets the "skip-seq-data" element
         */
        public void unsetSkipSeqData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SKIPSEQDATA$4, 0);
            }
        }
        
        /**
         * Gets the "target-only" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly getTargetOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly)get_store().find_element_user(TARGETONLY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "target-only" element
         */
        public boolean isSetTargetOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TARGETONLY$6) != 0;
            }
        }
        
        /**
         * Sets the "target-only" element
         */
        public void setTargetOnly(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly targetOnly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly)get_store().find_element_user(TARGETONLY$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly)get_store().add_element_user(TARGETONLY$6);
                }
                target.set(targetOnly);
            }
        }
        
        /**
         * Appends and returns a new empty "target-only" element
         */
        public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly addNewTargetOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly)get_store().add_element_user(TARGETONLY$6);
                return target;
            }
        }
        
        /**
         * Unsets the "target-only" element
         */
        public void unsetTargetOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TARGETONLY$6, 0);
            }
        }
        /**
         * An XML database(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DatabaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.Database
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
         * An XML seq-ids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqIdsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SeqIds
        {
            
            public SeqIdsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-id");
            
            
            /**
             * Gets array of all "Seq-id" elements
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] getSeqIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQID$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] result = new gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqIdArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Seq-id" element
             */
            public int sizeOfSeqIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQID$0);
                }
            }
            
            /**
             * Sets array of all "Seq-id" element
             */
            public void setSeqIdArray(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] seqIdArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqIdArray, SEQID$0);
                }
            }
            
            /**
             * Sets ith "Seq-id" element
             */
            public void setSeqIdArray(int i, gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqId);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId insertNewSeqId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().insert_element_user(SEQID$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-id" element
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
            
            /**
             * Removes the ith "Seq-id" element
             */
            public void removeSeqId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQID$0, i);
                }
            }
        }
        /**
         * An XML skip-seq-data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SkipSeqDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData
        {
            
            public SkipSeqDataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VALUE$0);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value)get_default_attribute_value(VALUE$0);
                    }
                    return target;
                }
            }
            
            /**
             * True if has "value" attribute
             */
            public boolean isSetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALUE$0) != null;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            
            /**
             * Unsets the "value" attribute
             */
            public void unsetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALUE$0);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument$Blast4GetSequencesRequest$SkipSeqData$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.SkipSeqData.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML target-only(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TargetOnlyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly
        {
            
            public TargetOnlyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument$Blast4GetSequencesRequest$TargetOnly$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest.TargetOnly.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
    }
}
