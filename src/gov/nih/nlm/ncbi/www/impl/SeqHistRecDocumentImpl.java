/*
 * An XML document type.
 * Localname: Seq-hist-rec
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqHistRecDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-hist-rec(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqHistRecDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqHistRecDocument
{
    
    public SeqHistRecDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQHISTREC$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-hist-rec");
    
    
    /**
     * Gets the "Seq-hist-rec" element
     */
    public gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec getSeqHistRec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec target = null;
            target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec)get_store().find_element_user(SEQHISTREC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-hist-rec" element
     */
    public void setSeqHistRec(gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec seqHistRec)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec target = null;
            target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec)get_store().find_element_user(SEQHISTREC$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec)get_store().add_element_user(SEQHISTREC$0);
            }
            target.set(seqHistRec);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-hist-rec" element
     */
    public gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec addNewSeqHistRec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec target = null;
            target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec)get_store().add_element_user(SEQHISTREC$0);
            return target;
        }
    }
    /**
     * An XML Seq-hist-rec(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqHistRecImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec
    {
        
        public SeqHistRecImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "date");
        private static final javax.xml.namespace.QName IDS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ids");
        
        
        /**
         * Gets the "date" element
         */
        public gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Date getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Date target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Date)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "date" element
         */
        public boolean isSetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATE$0) != 0;
            }
        }
        
        /**
         * Sets the "date" element
         */
        public void setDate(gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Date date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Date target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Date)get_store().find_element_user(DATE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Date)get_store().add_element_user(DATE$0);
                }
                target.set(date);
            }
        }
        
        /**
         * Appends and returns a new empty "date" element
         */
        public gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Date addNewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Date target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Date)get_store().add_element_user(DATE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "date" element
         */
        public void unsetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATE$0, 0);
            }
        }
        
        /**
         * Gets the "ids" element
         */
        public gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Ids getIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Ids)get_store().find_element_user(IDS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ids" element
         */
        public void setIds(gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Ids ids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Ids)get_store().find_element_user(IDS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Ids)get_store().add_element_user(IDS$2);
                }
                target.set(ids);
            }
        }
        
        /**
         * Appends and returns a new empty "ids" element
         */
        public gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Ids addNewIds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Ids target = null;
                target = (gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Ids)get_store().add_element_user(IDS$2);
                return target;
            }
        }
        /**
         * An XML date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Date
        {
            
            public DateImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML ids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqHistRecDocument.SeqHistRec.Ids
        {
            
            public IdsImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
