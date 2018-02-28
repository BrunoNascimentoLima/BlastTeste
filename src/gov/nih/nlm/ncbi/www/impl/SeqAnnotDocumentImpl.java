/*
 * An XML document type.
 * Localname: Seq-annot
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqAnnotDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-annot(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqAnnotDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAnnotDocument
{
    
    public SeqAnnotDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQANNOT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-annot");
    
    
    /**
     * Gets the "Seq-annot" element
     */
    public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot getSeqAnnot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot target = null;
            target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot)get_store().find_element_user(SEQANNOT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-annot" element
     */
    public void setSeqAnnot(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot seqAnnot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot target = null;
            target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot)get_store().find_element_user(SEQANNOT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot)get_store().add_element_user(SEQANNOT$0);
            }
            target.set(seqAnnot);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-annot" element
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
     * An XML Seq-annot(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqAnnotImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot
    {
        
        public SeqAnnotImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName DB$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "db");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName DESC$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "desc");
        private static final javax.xml.namespace.QName DATA$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "data");
        
        
        /**
         * Gets the "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id)get_store().find_element_user(ID$0, 0);
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
        public void setId(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "id" element
         */
        public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id)get_store().add_element_user(ID$0);
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
         * Gets the "db" element
         */
        public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db getDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db)get_store().find_element_user(DB$2, 0);
                if (target == null)
                {
                    return null;
                }
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
        public void setDb(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db db)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db)get_store().find_element_user(DB$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db)get_store().add_element_user(DB$2);
                }
                target.set(db);
            }
        }
        
        /**
         * Appends and returns a new empty "db" element
         */
        public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db addNewDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db)get_store().add_element_user(DB$2);
                return target;
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
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "name" element
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$4) != 0;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$4);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" element
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$4, 0);
            }
        }
        
        /**
         * Gets the "desc" element
         */
        public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc)get_store().find_element_user(DESC$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "desc" element
         */
        public boolean isSetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESC$6) != 0;
            }
        }
        
        /**
         * Sets the "desc" element
         */
        public void setDesc(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc)get_store().find_element_user(DESC$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc)get_store().add_element_user(DESC$6);
                }
                target.set(desc);
            }
        }
        
        /**
         * Appends and returns a new empty "desc" element
         */
        public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc addNewDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc)get_store().add_element_user(DESC$6);
                return target;
            }
        }
        
        /**
         * Unsets the "desc" element
         */
        public void unsetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESC$6, 0);
            }
        }
        
        /**
         * Gets the "data" element
         */
        public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data)get_store().find_element_user(DATA$8, 0);
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
        public void setData(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data)get_store().find_element_user(DATA$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data)get_store().add_element_user(DATA$8);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data target = null;
                target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data)get_store().add_element_user(DATA$8);
                return target;
            }
        }
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Id
        {
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ANNOTID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Annot-id");
            
            
            /**
             * Gets array of all "Annot-id" elements
             */
            public gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId[] getAnnotIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ANNOTID$0, targetList);
                    gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId[] result = new gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Annot-id" element
             */
            public gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId getAnnotIdArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId target = null;
                    target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId)get_store().find_element_user(ANNOTID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Annot-id" element
             */
            public int sizeOfAnnotIdArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ANNOTID$0);
                }
            }
            
            /**
             * Sets array of all "Annot-id" element
             */
            public void setAnnotIdArray(gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId[] annotIdArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(annotIdArray, ANNOTID$0);
                }
            }
            
            /**
             * Sets ith "Annot-id" element
             */
            public void setAnnotIdArray(int i, gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId annotId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId target = null;
                    target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId)get_store().find_element_user(ANNOTID$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(annotId);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Annot-id" element
             */
            public gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId insertNewAnnotId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId target = null;
                    target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId)get_store().insert_element_user(ANNOTID$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Annot-id" element
             */
            public gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId addNewAnnotId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId target = null;
                    target = (gov.nih.nlm.ncbi.www.AnnotIdDocument.AnnotId)get_store().add_element_user(ANNOTID$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Annot-id" element
             */
            public void removeAnnotId(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ANNOTID$0, i);
                }
            }
        }
        /**
         * An XML db(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqAnnotDocument$SeqAnnot$Db.
         */
        public static class DbImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db
        {
            
            public DbImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected DbImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SeqAnnotDocument$SeqAnnot$Db$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Db.Value
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
         * An XML desc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DescImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Desc
        {
            
            public DescImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ANNOTDESCR$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Annot-descr");
            
            
            /**
             * Gets the "Annot-descr" element
             */
            public gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr getAnnotDescr()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr target = null;
                    target = (gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr)get_store().find_element_user(ANNOTDESCR$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Annot-descr" element
             */
            public void setAnnotDescr(gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr annotDescr)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr target = null;
                    target = (gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr)get_store().find_element_user(ANNOTDESCR$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr)get_store().add_element_user(ANNOTDESCR$0);
                    }
                    target.set(annotDescr);
                }
            }
            
            /**
             * Appends and returns a new empty "Annot-descr" element
             */
            public gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr addNewAnnotDescr()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr target = null;
                    target = (gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr)get_store().add_element_user(ANNOTDESCR$0);
                    return target;
                }
            }
        }
        /**
         * An XML data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data
        {
            
            public DataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FTABLE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ftable");
            private static final javax.xml.namespace.QName ALIGN$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "align");
            private static final javax.xml.namespace.QName GRAPH$4 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "graph");
            private static final javax.xml.namespace.QName IDS$6 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ids");
            private static final javax.xml.namespace.QName LOCS$8 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "locs");
            private static final javax.xml.namespace.QName SEQTABLE$10 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq-table");
            
            
            /**
             * Gets the "ftable" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable getFtable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable)get_store().find_element_user(FTABLE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "ftable" element
             */
            public boolean isSetFtable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FTABLE$0) != 0;
                }
            }
            
            /**
             * Sets the "ftable" element
             */
            public void setFtable(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable ftable)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable)get_store().find_element_user(FTABLE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable)get_store().add_element_user(FTABLE$0);
                    }
                    target.set(ftable);
                }
            }
            
            /**
             * Appends and returns a new empty "ftable" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable addNewFtable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable)get_store().add_element_user(FTABLE$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "ftable" element
             */
            public void unsetFtable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FTABLE$0, 0);
                }
            }
            
            /**
             * Gets the "align" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align getAlign()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align)get_store().find_element_user(ALIGN$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "align" element
             */
            public boolean isSetAlign()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ALIGN$2) != 0;
                }
            }
            
            /**
             * Sets the "align" element
             */
            public void setAlign(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align align)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align)get_store().find_element_user(ALIGN$2, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align)get_store().add_element_user(ALIGN$2);
                    }
                    target.set(align);
                }
            }
            
            /**
             * Appends and returns a new empty "align" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align addNewAlign()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align)get_store().add_element_user(ALIGN$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "align" element
             */
            public void unsetAlign()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ALIGN$2, 0);
                }
            }
            
            /**
             * Gets the "graph" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph getGraph()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph)get_store().find_element_user(GRAPH$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "graph" element
             */
            public boolean isSetGraph()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(GRAPH$4) != 0;
                }
            }
            
            /**
             * Sets the "graph" element
             */
            public void setGraph(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph graph)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph)get_store().find_element_user(GRAPH$4, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph)get_store().add_element_user(GRAPH$4);
                    }
                    target.set(graph);
                }
            }
            
            /**
             * Appends and returns a new empty "graph" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph addNewGraph()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph)get_store().add_element_user(GRAPH$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "graph" element
             */
            public void unsetGraph()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(GRAPH$4, 0);
                }
            }
            
            /**
             * Gets the "ids" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids getIds()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids)get_store().find_element_user(IDS$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "ids" element
             */
            public boolean isSetIds()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(IDS$6) != 0;
                }
            }
            
            /**
             * Sets the "ids" element
             */
            public void setIds(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids ids)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids)get_store().find_element_user(IDS$6, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids)get_store().add_element_user(IDS$6);
                    }
                    target.set(ids);
                }
            }
            
            /**
             * Appends and returns a new empty "ids" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids addNewIds()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids)get_store().add_element_user(IDS$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "ids" element
             */
            public void unsetIds()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(IDS$6, 0);
                }
            }
            
            /**
             * Gets the "locs" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs getLocs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs)get_store().find_element_user(LOCS$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "locs" element
             */
            public boolean isSetLocs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LOCS$8) != 0;
                }
            }
            
            /**
             * Sets the "locs" element
             */
            public void setLocs(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs locs)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs)get_store().find_element_user(LOCS$8, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs)get_store().add_element_user(LOCS$8);
                    }
                    target.set(locs);
                }
            }
            
            /**
             * Appends and returns a new empty "locs" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs addNewLocs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs)get_store().add_element_user(LOCS$8);
                    return target;
                }
            }
            
            /**
             * Unsets the "locs" element
             */
            public void unsetLocs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LOCS$8, 0);
                }
            }
            
            /**
             * Gets the "seq-table" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable getSeqTable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable)get_store().find_element_user(SEQTABLE$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "seq-table" element
             */
            public boolean isSetSeqTable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQTABLE$10) != 0;
                }
            }
            
            /**
             * Sets the "seq-table" element
             */
            public void setSeqTable(gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable seqTable)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable)get_store().find_element_user(SEQTABLE$10, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable)get_store().add_element_user(SEQTABLE$10);
                    }
                    target.set(seqTable);
                }
            }
            
            /**
             * Appends and returns a new empty "seq-table" element
             */
            public gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable addNewSeqTable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable)get_store().add_element_user(SEQTABLE$10);
                    return target;
                }
            }
            
            /**
             * Unsets the "seq-table" element
             */
            public void unsetSeqTable()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQTABLE$10, 0);
                }
            }
            /**
             * An XML ftable(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class FtableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ftable
            {
                
                public FtableImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SEQFEAT$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-feat");
                
                
                /**
                 * Gets array of all "Seq-feat" elements
                 */
                public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat[] getSeqFeatArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(SEQFEAT$0, targetList);
                      gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat[] result = new gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Seq-feat" element
                 */
                public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat getSeqFeatArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat)get_store().find_element_user(SEQFEAT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "Seq-feat" element
                 */
                public int sizeOfSeqFeatArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SEQFEAT$0);
                    }
                }
                
                /**
                 * Sets array of all "Seq-feat" element
                 */
                public void setSeqFeatArray(gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat[] seqFeatArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(seqFeatArray, SEQFEAT$0);
                    }
                }
                
                /**
                 * Sets ith "Seq-feat" element
                 */
                public void setSeqFeatArray(int i, gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat seqFeat)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat)get_store().find_element_user(SEQFEAT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(seqFeat);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Seq-feat" element
                 */
                public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat insertNewSeqFeat(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat)get_store().insert_element_user(SEQFEAT$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Seq-feat" element
                 */
                public gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat addNewSeqFeat()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqFeatDocument.SeqFeat)get_store().add_element_user(SEQFEAT$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "Seq-feat" element
                 */
                public void removeSeqFeat(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SEQFEAT$0, i);
                    }
                }
            }
            /**
             * An XML align(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class AlignImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Align
            {
                
                public AlignImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SEQALIGN$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-align");
                
                
                /**
                 * Gets array of all "Seq-align" elements
                 */
                public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] getSeqAlignArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(SEQALIGN$0, targetList);
                      gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] result = new gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Seq-align" element
                 */
                public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign getSeqAlignArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().find_element_user(SEQALIGN$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "Seq-align" element
                 */
                public int sizeOfSeqAlignArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SEQALIGN$0);
                    }
                }
                
                /**
                 * Sets array of all "Seq-align" element
                 */
                public void setSeqAlignArray(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] seqAlignArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(seqAlignArray, SEQALIGN$0);
                    }
                }
                
                /**
                 * Sets ith "Seq-align" element
                 */
                public void setSeqAlignArray(int i, gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign seqAlign)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().find_element_user(SEQALIGN$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(seqAlign);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Seq-align" element
                 */
                public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign insertNewSeqAlign(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().insert_element_user(SEQALIGN$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Seq-align" element
                 */
                public gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign addNewSeqAlign()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign)get_store().add_element_user(SEQALIGN$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "Seq-align" element
                 */
                public void removeSeqAlign(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SEQALIGN$0, i);
                    }
                }
            }
            /**
             * An XML graph(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class GraphImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Graph
            {
                
                public GraphImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SEQGRAPH$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-graph");
                
                
                /**
                 * Gets array of all "Seq-graph" elements
                 */
                public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph[] getSeqGraphArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(SEQGRAPH$0, targetList);
                      gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph[] result = new gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Seq-graph" element
                 */
                public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph getSeqGraphArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph)get_store().find_element_user(SEQGRAPH$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "Seq-graph" element
                 */
                public int sizeOfSeqGraphArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SEQGRAPH$0);
                    }
                }
                
                /**
                 * Sets array of all "Seq-graph" element
                 */
                public void setSeqGraphArray(gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph[] seqGraphArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(seqGraphArray, SEQGRAPH$0);
                    }
                }
                
                /**
                 * Sets ith "Seq-graph" element
                 */
                public void setSeqGraphArray(int i, gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph seqGraph)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph)get_store().find_element_user(SEQGRAPH$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(seqGraph);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Seq-graph" element
                 */
                public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph insertNewSeqGraph(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph)get_store().insert_element_user(SEQGRAPH$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Seq-graph" element
                 */
                public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph addNewSeqGraph()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph)get_store().add_element_user(SEQGRAPH$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "Seq-graph" element
                 */
                public void removeSeqGraph(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SEQGRAPH$0, i);
                    }
                }
            }
            /**
             * An XML ids(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class IdsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Ids
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
            /**
             * An XML locs(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class LocsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.Locs
            {
                
                public LocsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SEQLOC$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-loc");
                
                
                /**
                 * Gets array of all "Seq-loc" elements
                 */
                public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] getSeqLocArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(SEQLOC$0, targetList);
                      gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] result = new gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Seq-loc" element
                 */
                public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLocArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "Seq-loc" element
                 */
                public int sizeOfSeqLocArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SEQLOC$0);
                    }
                }
                
                /**
                 * Sets array of all "Seq-loc" element
                 */
                public void setSeqLocArray(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] seqLocArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(seqLocArray, SEQLOC$0);
                    }
                }
                
                /**
                 * Sets ith "Seq-loc" element
                 */
                public void setSeqLocArray(int i, gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(seqLoc);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Seq-loc" element
                 */
                public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc insertNewSeqLoc(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().insert_element_user(SEQLOC$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Seq-loc" element
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
                
                /**
                 * Removes the ith "Seq-loc" element
                 */
                public void removeSeqLoc(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SEQLOC$0, i);
                    }
                }
            }
            /**
             * An XML seq-table(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class SeqTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqAnnotDocument.SeqAnnot.Data.SeqTable
            {
                
                public SeqTableImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SEQTABLE$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-table");
                
                
                /**
                 * Gets the "Seq-table" element
                 */
                public gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable getSeqTable()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable)get_store().find_element_user(SEQTABLE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Seq-table" element
                 */
                public void setSeqTable(gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable seqTable)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable)get_store().find_element_user(SEQTABLE$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable)get_store().add_element_user(SEQTABLE$0);
                      }
                      target.set(seqTable);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Seq-table" element
                 */
                public gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable addNewSeqTable()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable)get_store().add_element_user(SEQTABLE$0);
                      return target;
                    }
                }
            }
        }
    }
}
