/*
 * An XML document type.
 * Localname: Seq-table
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqTableDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-table(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqTableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableDocument
{
    
    public SeqTableDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Seq-table(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable
    {
        
        public SeqTableImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FEATTYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "feat-type");
        private static final javax.xml.namespace.QName FEATSUBTYPE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "feat-subtype");
        private static final javax.xml.namespace.QName NUMROWS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "num-rows");
        private static final javax.xml.namespace.QName COLUMNS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "columns");
        
        
        /**
         * Gets the "feat-type" element
         */
        public java.math.BigInteger getFeatType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATTYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "feat-type" element
         */
        public org.apache.xmlbeans.XmlInteger xgetFeatType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FEATTYPE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "feat-type" element
         */
        public void setFeatType(java.math.BigInteger featType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEATTYPE$0);
                }
                target.setBigIntegerValue(featType);
            }
        }
        
        /**
         * Sets (as xml) the "feat-type" element
         */
        public void xsetFeatType(org.apache.xmlbeans.XmlInteger featType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FEATTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FEATTYPE$0);
                }
                target.set(featType);
            }
        }
        
        /**
         * Gets the "feat-subtype" element
         */
        public java.math.BigInteger getFeatSubtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATSUBTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "feat-subtype" element
         */
        public org.apache.xmlbeans.XmlInteger xgetFeatSubtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FEATSUBTYPE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "feat-subtype" element
         */
        public boolean isSetFeatSubtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FEATSUBTYPE$2) != 0;
            }
        }
        
        /**
         * Sets the "feat-subtype" element
         */
        public void setFeatSubtype(java.math.BigInteger featSubtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATSUBTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEATSUBTYPE$2);
                }
                target.setBigIntegerValue(featSubtype);
            }
        }
        
        /**
         * Sets (as xml) the "feat-subtype" element
         */
        public void xsetFeatSubtype(org.apache.xmlbeans.XmlInteger featSubtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FEATSUBTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FEATSUBTYPE$2);
                }
                target.set(featSubtype);
            }
        }
        
        /**
         * Unsets the "feat-subtype" element
         */
        public void unsetFeatSubtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FEATSUBTYPE$2, 0);
            }
        }
        
        /**
         * Gets the "num-rows" element
         */
        public java.math.BigInteger getNumRows()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMROWS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "num-rows" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNumRows()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMROWS$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "num-rows" element
         */
        public void setNumRows(java.math.BigInteger numRows)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMROWS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMROWS$4);
                }
                target.setBigIntegerValue(numRows);
            }
        }
        
        /**
         * Sets (as xml) the "num-rows" element
         */
        public void xsetNumRows(org.apache.xmlbeans.XmlInteger numRows)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMROWS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMROWS$4);
                }
                target.set(numRows);
            }
        }
        
        /**
         * Gets the "columns" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns getColumns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns)get_store().find_element_user(COLUMNS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "columns" element
         */
        public void setColumns(gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns columns)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns)get_store().find_element_user(COLUMNS$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns)get_store().add_element_user(COLUMNS$6);
                }
                target.set(columns);
            }
        }
        
        /**
         * Appends and returns a new empty "columns" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns addNewColumns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns)get_store().add_element_user(COLUMNS$6);
                return target;
            }
        }
        /**
         * An XML columns(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ColumnsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableDocument.SeqTable.Columns
        {
            
            public ColumnsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQTABLECOLUMN$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqTable-column");
            
            
            /**
             * Gets array of all "SeqTable-column" elements
             */
            public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn[] getSeqTableColumnArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQTABLECOLUMN$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn[] result = new gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "SeqTable-column" element
             */
            public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn getSeqTableColumnArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn)get_store().find_element_user(SEQTABLECOLUMN$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "SeqTable-column" element
             */
            public int sizeOfSeqTableColumnArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQTABLECOLUMN$0);
                }
            }
            
            /**
             * Sets array of all "SeqTable-column" element
             */
            public void setSeqTableColumnArray(gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn[] seqTableColumnArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqTableColumnArray, SEQTABLECOLUMN$0);
                }
            }
            
            /**
             * Sets ith "SeqTable-column" element
             */
            public void setSeqTableColumnArray(int i, gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn seqTableColumn)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn)get_store().find_element_user(SEQTABLECOLUMN$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqTableColumn);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "SeqTable-column" element
             */
            public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn insertNewSeqTableColumn(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn)get_store().insert_element_user(SEQTABLECOLUMN$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "SeqTable-column" element
             */
            public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn addNewSeqTableColumn()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn)get_store().add_element_user(SEQTABLECOLUMN$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "SeqTable-column" element
             */
            public void removeSeqTableColumn(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQTABLECOLUMN$0, i);
                }
            }
        }
    }
}
