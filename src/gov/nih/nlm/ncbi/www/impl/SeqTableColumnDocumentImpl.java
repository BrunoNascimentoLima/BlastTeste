/*
 * An XML document type.
 * Localname: SeqTable-column
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqTableColumnDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one SeqTable-column(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqTableColumnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableColumnDocument
{
    
    public SeqTableColumnDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQTABLECOLUMN$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqTable-column");
    
    
    /**
     * Gets the "SeqTable-column" element
     */
    public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn getSeqTableColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn target = null;
            target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn)get_store().find_element_user(SEQTABLECOLUMN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SeqTable-column" element
     */
    public void setSeqTableColumn(gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn seqTableColumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn target = null;
            target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn)get_store().find_element_user(SEQTABLECOLUMN$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn)get_store().add_element_user(SEQTABLECOLUMN$0);
            }
            target.set(seqTableColumn);
        }
    }
    
    /**
     * Appends and returns a new empty "SeqTable-column" element
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
     * An XML SeqTable-column(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqTableColumnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn
    {
        
        public SeqTableColumnImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADER$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "header");
        private static final javax.xml.namespace.QName DATA$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "data");
        private static final javax.xml.namespace.QName SPARSE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "sparse");
        private static final javax.xml.namespace.QName DEFAULT$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "default");
        private static final javax.xml.namespace.QName SPARSEOTHER$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "sparse-other");
        
        
        /**
         * Gets the "header" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header getHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header)get_store().find_element_user(HEADER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "header" element
         */
        public void setHeader(gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header header)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header)get_store().find_element_user(HEADER$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header)get_store().add_element_user(HEADER$0);
                }
                target.set(header);
            }
        }
        
        /**
         * Appends and returns a new empty "header" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header addNewHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header)get_store().add_element_user(HEADER$0);
                return target;
            }
        }
        
        /**
         * Gets the "data" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data)get_store().find_element_user(DATA$2, 0);
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
        public void setData(gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data)get_store().find_element_user(DATA$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data)get_store().add_element_user(DATA$2);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data)get_store().add_element_user(DATA$2);
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
         * Gets the "sparse" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse getSparse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse)get_store().find_element_user(SPARSE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "sparse" element
         */
        public boolean isSetSparse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SPARSE$4) != 0;
            }
        }
        
        /**
         * Sets the "sparse" element
         */
        public void setSparse(gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse sparse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse)get_store().find_element_user(SPARSE$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse)get_store().add_element_user(SPARSE$4);
                }
                target.set(sparse);
            }
        }
        
        /**
         * Appends and returns a new empty "sparse" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse addNewSparse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse)get_store().add_element_user(SPARSE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "sparse" element
         */
        public void unsetSparse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SPARSE$4, 0);
            }
        }
        
        /**
         * Gets the "default" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default getDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default)get_store().find_element_user(DEFAULT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "default" element
         */
        public boolean isSetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEFAULT$6) != 0;
            }
        }
        
        /**
         * Sets the "default" element
         */
        public void setDefault(gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default xdefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default)get_store().find_element_user(DEFAULT$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default)get_store().add_element_user(DEFAULT$6);
                }
                target.set(xdefault);
            }
        }
        
        /**
         * Appends and returns a new empty "default" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default addNewDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default)get_store().add_element_user(DEFAULT$6);
                return target;
            }
        }
        
        /**
         * Unsets the "default" element
         */
        public void unsetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEFAULT$6, 0);
            }
        }
        
        /**
         * Gets the "sparse-other" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther getSparseOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther)get_store().find_element_user(SPARSEOTHER$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "sparse-other" element
         */
        public boolean isSetSparseOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SPARSEOTHER$8) != 0;
            }
        }
        
        /**
         * Sets the "sparse-other" element
         */
        public void setSparseOther(gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther sparseOther)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther)get_store().find_element_user(SPARSEOTHER$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther)get_store().add_element_user(SPARSEOTHER$8);
                }
                target.set(sparseOther);
            }
        }
        
        /**
         * Appends and returns a new empty "sparse-other" element
         */
        public gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther addNewSparseOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther target = null;
                target = (gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther)get_store().add_element_user(SPARSEOTHER$8);
                return target;
            }
        }
        
        /**
         * Unsets the "sparse-other" element
         */
        public void unsetSparseOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SPARSEOTHER$8, 0);
            }
        }
        /**
         * An XML header(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class HeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Header
        {
            
            public HeaderImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQTABLECOLUMNINFO$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqTable-column-info");
            
            
            /**
             * Gets the "SeqTable-column-info" element
             */
            public gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo getSeqTableColumnInfo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo)get_store().find_element_user(SEQTABLECOLUMNINFO$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "SeqTable-column-info" element
             */
            public void setSeqTableColumnInfo(gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo seqTableColumnInfo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo)get_store().find_element_user(SEQTABLECOLUMNINFO$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo)get_store().add_element_user(SEQTABLECOLUMNINFO$0);
                    }
                    target.set(seqTableColumnInfo);
                }
            }
            
            /**
             * Appends and returns a new empty "SeqTable-column-info" element
             */
            public gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo addNewSeqTableColumnInfo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableColumnInfoDocument.SeqTableColumnInfo)get_store().add_element_user(SEQTABLECOLUMNINFO$0);
                    return target;
                }
            }
        }
        /**
         * An XML data(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Data
        {
            
            public DataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQTABLEMULTIDATA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqTable-multi-data");
            
            
            /**
             * Gets the "SeqTable-multi-data" element
             */
            public gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData getSeqTableMultiData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData)get_store().find_element_user(SEQTABLEMULTIDATA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "SeqTable-multi-data" element
             */
            public void setSeqTableMultiData(gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData seqTableMultiData)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData)get_store().find_element_user(SEQTABLEMULTIDATA$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData)get_store().add_element_user(SEQTABLEMULTIDATA$0);
                    }
                    target.set(seqTableMultiData);
                }
            }
            
            /**
             * Appends and returns a new empty "SeqTable-multi-data" element
             */
            public gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData addNewSeqTableMultiData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData)get_store().add_element_user(SEQTABLEMULTIDATA$0);
                    return target;
                }
            }
        }
        /**
         * An XML sparse(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SparseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Sparse
        {
            
            public SparseImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQTABLESPARSEINDEX$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqTable-sparse-index");
            
            
            /**
             * Gets the "SeqTable-sparse-index" element
             */
            public gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex getSeqTableSparseIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex)get_store().find_element_user(SEQTABLESPARSEINDEX$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "SeqTable-sparse-index" element
             */
            public void setSeqTableSparseIndex(gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex seqTableSparseIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex)get_store().find_element_user(SEQTABLESPARSEINDEX$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex)get_store().add_element_user(SEQTABLESPARSEINDEX$0);
                    }
                    target.set(seqTableSparseIndex);
                }
            }
            
            /**
             * Appends and returns a new empty "SeqTable-sparse-index" element
             */
            public gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex addNewSeqTableSparseIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableSparseIndexDocument.SeqTableSparseIndex)get_store().add_element_user(SEQTABLESPARSEINDEX$0);
                    return target;
                }
            }
        }
        /**
         * An XML default(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DefaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.Default
        {
            
            public DefaultImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQTABLESINGLEDATA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqTable-single-data");
            
            
            /**
             * Gets the "SeqTable-single-data" element
             */
            public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData getSeqTableSingleData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData)get_store().find_element_user(SEQTABLESINGLEDATA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "SeqTable-single-data" element
             */
            public void setSeqTableSingleData(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData seqTableSingleData)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData)get_store().find_element_user(SEQTABLESINGLEDATA$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData)get_store().add_element_user(SEQTABLESINGLEDATA$0);
                    }
                    target.set(seqTableSingleData);
                }
            }
            
            /**
             * Appends and returns a new empty "SeqTable-single-data" element
             */
            public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData addNewSeqTableSingleData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData)get_store().add_element_user(SEQTABLESINGLEDATA$0);
                    return target;
                }
            }
        }
        /**
         * An XML sparse-other(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SparseOtherImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqTableColumnDocument.SeqTableColumn.SparseOther
        {
            
            public SparseOtherImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQTABLESINGLEDATA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SeqTable-single-data");
            
            
            /**
             * Gets the "SeqTable-single-data" element
             */
            public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData getSeqTableSingleData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData)get_store().find_element_user(SEQTABLESINGLEDATA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "SeqTable-single-data" element
             */
            public void setSeqTableSingleData(gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData seqTableSingleData)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData)get_store().find_element_user(SEQTABLESINGLEDATA$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData)get_store().add_element_user(SEQTABLESINGLEDATA$0);
                    }
                    target.set(seqTableSingleData);
                }
            }
            
            /**
             * Appends and returns a new empty "SeqTable-single-data" element
             */
            public gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData addNewSeqTableSingleData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqTableSingleDataDocument.SeqTableSingleData)get_store().add_element_user(SEQTABLESINGLEDATA$0);
                    return target;
                }
            }
        }
    }
}
