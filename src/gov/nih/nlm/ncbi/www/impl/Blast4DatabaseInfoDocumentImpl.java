/*
 * An XML document type.
 * Localname: Blast4-database-info
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-database-info(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4DatabaseInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument
{
    
    public Blast4DatabaseInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4DATABASEINFO$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-database-info");
    
    
    /**
     * Gets the "Blast4-database-info" element
     */
    public gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo getBlast4DatabaseInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo)get_store().find_element_user(BLAST4DATABASEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-database-info" element
     */
    public void setBlast4DatabaseInfo(gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo blast4DatabaseInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo)get_store().find_element_user(BLAST4DATABASEINFO$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo)get_store().add_element_user(BLAST4DATABASEINFO$0);
            }
            target.set(blast4DatabaseInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-database-info" element
     */
    public gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo addNewBlast4DatabaseInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo)get_store().add_element_user(BLAST4DATABASEINFO$0);
            return target;
        }
    }
    /**
     * An XML Blast4-database-info(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4DatabaseInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo
    {
        
        public Blast4DatabaseInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATABASE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "database");
        private static final javax.xml.namespace.QName DESCRIPTION$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "description");
        private static final javax.xml.namespace.QName LASTUPDATED$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "last-updated");
        private static final javax.xml.namespace.QName TOTALLENGTH$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "total-length");
        private static final javax.xml.namespace.QName NUMSEQUENCES$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "num-sequences");
        private static final javax.xml.namespace.QName SEQTECH$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seqtech");
        private static final javax.xml.namespace.QName TAXID$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "taxid");
        
        
        /**
         * Gets the "database" element
         */
        public gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database getDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database)get_store().find_element_user(DATABASE$0, 0);
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
        public void setDatabase(gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database database)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database)get_store().find_element_user(DATABASE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database)get_store().add_element_user(DATABASE$0);
                }
                target.set(database);
            }
        }
        
        /**
         * Appends and returns a new empty "database" element
         */
        public gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database addNewDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database)get_store().add_element_user(DATABASE$0);
                return target;
            }
        }
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
                }
                target.set(description);
            }
        }
        
        /**
         * Gets the "last-updated" element
         */
        public java.lang.String getLastUpdated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATED$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "last-updated" element
         */
        public org.apache.xmlbeans.XmlString xgetLastUpdated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTUPDATED$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "last-updated" element
         */
        public void setLastUpdated(java.lang.String lastUpdated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTUPDATED$4);
                }
                target.setStringValue(lastUpdated);
            }
        }
        
        /**
         * Sets (as xml) the "last-updated" element
         */
        public void xsetLastUpdated(org.apache.xmlbeans.XmlString lastUpdated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTUPDATED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTUPDATED$4);
                }
                target.set(lastUpdated);
            }
        }
        
        /**
         * Gets the "total-length" element
         */
        public long getTotalLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALLENGTH$6, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "total-length" element
         */
        public org.apache.xmlbeans.XmlLong xgetTotalLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(TOTALLENGTH$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "total-length" element
         */
        public void setTotalLength(long totalLength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALLENGTH$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALLENGTH$6);
                }
                target.setLongValue(totalLength);
            }
        }
        
        /**
         * Sets (as xml) the "total-length" element
         */
        public void xsetTotalLength(org.apache.xmlbeans.XmlLong totalLength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(TOTALLENGTH$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(TOTALLENGTH$6);
                }
                target.set(totalLength);
            }
        }
        
        /**
         * Gets the "num-sequences" element
         */
        public long getNumSequences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMSEQUENCES$8, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "num-sequences" element
         */
        public org.apache.xmlbeans.XmlLong xgetNumSequences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUMSEQUENCES$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "num-sequences" element
         */
        public void setNumSequences(long numSequences)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMSEQUENCES$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMSEQUENCES$8);
                }
                target.setLongValue(numSequences);
            }
        }
        
        /**
         * Sets (as xml) the "num-sequences" element
         */
        public void xsetNumSequences(org.apache.xmlbeans.XmlLong numSequences)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(NUMSEQUENCES$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(NUMSEQUENCES$8);
                }
                target.set(numSequences);
            }
        }
        
        /**
         * Gets the "seqtech" element
         */
        public gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech getSeqtech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech)get_store().find_element_user(SEQTECH$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "seqtech" element
         */
        public void setSeqtech(gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech seqtech)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech)get_store().find_element_user(SEQTECH$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech)get_store().add_element_user(SEQTECH$10);
                }
                target.set(seqtech);
            }
        }
        
        /**
         * Appends and returns a new empty "seqtech" element
         */
        public gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech addNewSeqtech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech)get_store().add_element_user(SEQTECH$10);
                return target;
            }
        }
        
        /**
         * Gets the "taxid" element
         */
        public java.math.BigInteger getTaxid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXID$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "taxid" element
         */
        public org.apache.xmlbeans.XmlInteger xgetTaxid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TAXID$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "taxid" element
         */
        public void setTaxid(java.math.BigInteger taxid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXID$12);
                }
                target.setBigIntegerValue(taxid);
            }
        }
        
        /**
         * Sets (as xml) the "taxid" element
         */
        public void xsetTaxid(org.apache.xmlbeans.XmlInteger taxid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TAXID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TAXID$12);
                }
                target.set(taxid);
            }
        }
        /**
         * An XML database(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DatabaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Database
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
         * An XML seqtech(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqtechImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4DatabaseInfoDocument.Blast4DatabaseInfo.Seqtech
        {
            
            public SeqtechImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4SEQTECH$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-seqtech");
            
            
            /**
             * Gets the "Blast4-seqtech" element
             */
            public gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech getBlast4Seqtech()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech)get_store().find_element_user(BLAST4SEQTECH$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-seqtech" element
             */
            public void setBlast4Seqtech(gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech blast4Seqtech)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech)get_store().find_element_user(BLAST4SEQTECH$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech)get_store().add_element_user(BLAST4SEQTECH$0);
                    }
                    target.set(blast4Seqtech);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-seqtech" element
             */
            public gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech addNewBlast4Seqtech()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4SeqtechDocument.Blast4Seqtech)get_store().add_element_user(BLAST4SEQTECH$0);
                    return target;
                }
            }
        }
    }
}
