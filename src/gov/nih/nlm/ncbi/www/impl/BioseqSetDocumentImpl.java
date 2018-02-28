/*
 * An XML document type.
 * Localname: Bioseq-set
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.BioseqSetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Bioseq-set(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class BioseqSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqSetDocument
{
    
    public BioseqSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BIOSEQSET$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Bioseq-set");
    
    
    /**
     * Gets the "Bioseq-set" element
     */
    public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet getBioseqSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet target = null;
            target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet)get_store().find_element_user(BIOSEQSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Bioseq-set" element
     */
    public void setBioseqSet(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet bioseqSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet target = null;
            target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet)get_store().find_element_user(BIOSEQSET$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet)get_store().add_element_user(BIOSEQSET$0);
            }
            target.set(bioseqSet);
        }
    }
    
    /**
     * Appends and returns a new empty "Bioseq-set" element
     */
    public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet addNewBioseqSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet target = null;
            target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet)get_store().add_element_user(BIOSEQSET$0);
            return target;
        }
    }
    /**
     * An XML Bioseq-set(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class BioseqSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet
    {
        
        public BioseqSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName COLL$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "coll");
        private static final javax.xml.namespace.QName LEVEL$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "level");
        private static final javax.xml.namespace.QName CLASS1$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "class");
        private static final javax.xml.namespace.QName RELEASE$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "release");
        private static final javax.xml.namespace.QName DATE$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "date");
        private static final javax.xml.namespace.QName DESCR$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "descr");
        private static final javax.xml.namespace.QName SEQSET$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-set");
        private static final javax.xml.namespace.QName ANNOT$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "annot");
        
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id)get_store().find_element_user(ID$0, 0);
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
        public void setId(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id)get_store().add_element_user(ID$0);
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
         * Gets the "coll" element
         */
        public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll getColl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll)get_store().find_element_user(COLL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "coll" element
         */
        public boolean isSetColl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COLL$2) != 0;
            }
        }
        
        /**
         * Sets the "coll" element
         */
        public void setColl(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll coll)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll)get_store().find_element_user(COLL$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll)get_store().add_element_user(COLL$2);
                }
                target.set(coll);
            }
        }
        
        /**
         * Appends and returns a new empty "coll" element
         */
        public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll addNewColl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll)get_store().add_element_user(COLL$2);
                return target;
            }
        }
        
        /**
         * Unsets the "coll" element
         */
        public void unsetColl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COLL$2, 0);
            }
        }
        
        /**
         * Gets the "level" element
         */
        public java.math.BigInteger getLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEVEL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "level" element
         */
        public org.apache.xmlbeans.XmlInteger xgetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LEVEL$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "level" element
         */
        public boolean isSetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LEVEL$4) != 0;
            }
        }
        
        /**
         * Sets the "level" element
         */
        public void setLevel(java.math.BigInteger level)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEVEL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEVEL$4);
                }
                target.setBigIntegerValue(level);
            }
        }
        
        /**
         * Sets (as xml) the "level" element
         */
        public void xsetLevel(org.apache.xmlbeans.XmlInteger level)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LEVEL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(LEVEL$4);
                }
                target.set(level);
            }
        }
        
        /**
         * Unsets the "level" element
         */
        public void unsetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LEVEL$4, 0);
            }
        }
        
        /**
         * Gets the "class" element
         */
        public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class)get_store().find_element_user(CLASS1$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "class" element
         */
        public boolean isSetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASS1$6) != 0;
            }
        }
        
        /**
         * Sets the "class" element
         */
        public void setClass1(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class)get_store().find_element_user(CLASS1$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class)get_store().add_element_user(CLASS1$6);
                }
                target.set(class1);
            }
        }
        
        /**
         * Appends and returns a new empty "class" element
         */
        public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class addNewClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class)get_store().add_element_user(CLASS1$6);
                return target;
            }
        }
        
        /**
         * Unsets the "class" element
         */
        public void unsetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASS1$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEASE$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELEASE$8, 0);
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
                return get_store().count_elements(RELEASE$8) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEASE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELEASE$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELEASE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELEASE$8);
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
                get_store().remove_element(RELEASE$8, 0);
            }
        }
        
        /**
         * Gets the "date" element
         */
        public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date)get_store().find_element_user(DATE$10, 0);
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
                return get_store().count_elements(DATE$10) != 0;
            }
        }
        
        /**
         * Sets the "date" element
         */
        public void setDate(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date)get_store().find_element_user(DATE$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date)get_store().add_element_user(DATE$10);
                }
                target.set(date);
            }
        }
        
        /**
         * Appends and returns a new empty "date" element
         */
        public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date addNewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date)get_store().add_element_user(DATE$10);
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
                get_store().remove_element(DATE$10, 0);
            }
        }
        
        /**
         * Gets the "descr" element
         */
        public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr getDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr)get_store().find_element_user(DESCR$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "descr" element
         */
        public boolean isSetDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCR$12) != 0;
            }
        }
        
        /**
         * Sets the "descr" element
         */
        public void setDescr(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr descr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr)get_store().find_element_user(DESCR$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr)get_store().add_element_user(DESCR$12);
                }
                target.set(descr);
            }
        }
        
        /**
         * Appends and returns a new empty "descr" element
         */
        public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr addNewDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr)get_store().add_element_user(DESCR$12);
                return target;
            }
        }
        
        /**
         * Unsets the "descr" element
         */
        public void unsetDescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCR$12, 0);
            }
        }
        
        /**
         * Gets the "seq-set" element
         */
        public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet getSeqSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet)get_store().find_element_user(SEQSET$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "seq-set" element
         */
        public void setSeqSet(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet seqSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet)get_store().find_element_user(SEQSET$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet)get_store().add_element_user(SEQSET$14);
                }
                target.set(seqSet);
            }
        }
        
        /**
         * Appends and returns a new empty "seq-set" element
         */
        public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet addNewSeqSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet)get_store().add_element_user(SEQSET$14);
                return target;
            }
        }
        
        /**
         * Gets the "annot" element
         */
        public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot getAnnot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot)get_store().find_element_user(ANNOT$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "annot" element
         */
        public boolean isSetAnnot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ANNOT$16) != 0;
            }
        }
        
        /**
         * Sets the "annot" element
         */
        public void setAnnot(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot annot)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot)get_store().find_element_user(ANNOT$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot)get_store().add_element_user(ANNOT$16);
                }
                target.set(annot);
            }
        }
        
        /**
         * Appends and returns a new empty "annot" element
         */
        public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot addNewAnnot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot target = null;
                target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot)get_store().add_element_user(ANNOT$16);
                return target;
            }
        }
        
        /**
         * Unsets the "annot" element
         */
        public void unsetAnnot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ANNOT$16, 0);
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Id
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
         * An XML coll(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CollImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Coll
        {
            
            public CollImpl(org.apache.xmlbeans.SchemaType sType)
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
        /**
         * An XML class(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ClassImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class
        {
            
            public ClassImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.BioseqSetDocument$BioseqSet$Class$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Class.Value
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
         * An XML date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Date
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
         * An XML descr(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DescrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Descr
        {
            
            public DescrImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQDESCR$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-descr");
            
            
            /**
             * Gets the "Seq-descr" element
             */
            public gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr getSeqDescr()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr)get_store().find_element_user(SEQDESCR$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-descr" element
             */
            public void setSeqDescr(gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr seqDescr)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr)get_store().find_element_user(SEQDESCR$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr)get_store().add_element_user(SEQDESCR$0);
                    }
                    target.set(seqDescr);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-descr" element
             */
            public gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr addNewSeqDescr()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqDescrDocument.SeqDescr)get_store().add_element_user(SEQDESCR$0);
                    return target;
                }
            }
        }
        /**
         * An XML seq-set(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.SeqSet
        {
            
            public SeqSetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQENTRY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-entry");
            
            
            /**
             * Gets array of all "Seq-entry" elements
             */
            public gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry[] getSeqEntryArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQENTRY$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry[] result = new gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Seq-entry" element
             */
            public gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry getSeqEntryArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry)get_store().find_element_user(SEQENTRY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Seq-entry" element
             */
            public int sizeOfSeqEntryArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQENTRY$0);
                }
            }
            
            /**
             * Sets array of all "Seq-entry" element
             */
            public void setSeqEntryArray(gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry[] seqEntryArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqEntryArray, SEQENTRY$0);
                }
            }
            
            /**
             * Sets ith "Seq-entry" element
             */
            public void setSeqEntryArray(int i, gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry seqEntry)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry)get_store().find_element_user(SEQENTRY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqEntry);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-entry" element
             */
            public gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry insertNewSeqEntry(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry)get_store().insert_element_user(SEQENTRY$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-entry" element
             */
            public gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry addNewSeqEntry()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry)get_store().add_element_user(SEQENTRY$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Seq-entry" element
             */
            public void removeSeqEntry(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQENTRY$0, i);
                }
            }
        }
        /**
         * An XML annot(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AnnotImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet.Annot
        {
            
            public AnnotImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQANNOT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-annot");
            
            
            /**
             * Gets array of all "Seq-annot" elements
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot[] getSeqAnnotArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQANNOT$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot[] result = new gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Seq-annot" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot getSeqAnnotArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot)get_store().find_element_user(SEQANNOT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Seq-annot" element
             */
            public int sizeOfSeqAnnotArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQANNOT$0);
                }
            }
            
            /**
             * Sets array of all "Seq-annot" element
             */
            public void setSeqAnnotArray(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot[] seqAnnotArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqAnnotArray, SEQANNOT$0);
                }
            }
            
            /**
             * Sets ith "Seq-annot" element
             */
            public void setSeqAnnotArray(int i, gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot seqAnnot)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot)get_store().find_element_user(SEQANNOT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqAnnot);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-annot" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot insertNewSeqAnnot(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot)get_store().insert_element_user(SEQANNOT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-annot" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot addNewSeqAnnot()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot)get_store().add_element_user(SEQANNOT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Seq-annot" element
             */
            public void removeSeqAnnot(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQANNOT$0, i);
                }
            }
        }
    }
}
