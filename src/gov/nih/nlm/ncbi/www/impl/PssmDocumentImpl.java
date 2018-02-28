/*
 * An XML document type.
 * Localname: Pssm
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PssmDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Pssm(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PssmDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmDocument
{
    
    public PssmDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PSSM$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Pssm");
    
    
    /**
     * Gets the "Pssm" element
     */
    public gov.nih.nlm.ncbi.www.PssmDocument.Pssm getPssm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PssmDocument.Pssm target = null;
            target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm)get_store().find_element_user(PSSM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Pssm" element
     */
    public void setPssm(gov.nih.nlm.ncbi.www.PssmDocument.Pssm pssm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PssmDocument.Pssm target = null;
            target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm)get_store().find_element_user(PSSM$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm)get_store().add_element_user(PSSM$0);
            }
            target.set(pssm);
        }
    }
    
    /**
     * Appends and returns a new empty "Pssm" element
     */
    public gov.nih.nlm.ncbi.www.PssmDocument.Pssm addNewPssm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PssmDocument.Pssm target = null;
            target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm)get_store().add_element_user(PSSM$0);
            return target;
        }
    }
    /**
     * An XML Pssm(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PssmImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmDocument.Pssm
    {
        
        public PssmImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ISPROTEIN$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "isProtein");
        private static final javax.xml.namespace.QName IDENTIFIER$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "identifier");
        private static final javax.xml.namespace.QName NUMROWS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "numRows");
        private static final javax.xml.namespace.QName NUMCOLUMNS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "numColumns");
        private static final javax.xml.namespace.QName ROWLABELS$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "rowLabels");
        private static final javax.xml.namespace.QName BYROW$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "byRow");
        private static final javax.xml.namespace.QName QUERY$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "query");
        private static final javax.xml.namespace.QName INTERMEDIATEDATA$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "intermediateData");
        private static final javax.xml.namespace.QName FINALDATA$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "finalData");
        
        
        /**
         * Gets the "isProtein" element
         */
        public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein getIsProtein()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein)get_store().find_element_user(ISPROTEIN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "isProtein" element
         */
        public boolean isSetIsProtein()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISPROTEIN$0) != 0;
            }
        }
        
        /**
         * Sets the "isProtein" element
         */
        public void setIsProtein(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein isProtein)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein)get_store().find_element_user(ISPROTEIN$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein)get_store().add_element_user(ISPROTEIN$0);
                }
                target.set(isProtein);
            }
        }
        
        /**
         * Appends and returns a new empty "isProtein" element
         */
        public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein addNewIsProtein()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein)get_store().add_element_user(ISPROTEIN$0);
                return target;
            }
        }
        
        /**
         * Unsets the "isProtein" element
         */
        public void unsetIsProtein()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISPROTEIN$0, 0);
            }
        }
        
        /**
         * Gets the "identifier" element
         */
        public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier getIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier)get_store().find_element_user(IDENTIFIER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "identifier" element
         */
        public boolean isSetIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFIER$2) != 0;
            }
        }
        
        /**
         * Sets the "identifier" element
         */
        public void setIdentifier(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier)get_store().find_element_user(IDENTIFIER$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier)get_store().add_element_user(IDENTIFIER$2);
                }
                target.set(identifier);
            }
        }
        
        /**
         * Appends and returns a new empty "identifier" element
         */
        public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier)get_store().add_element_user(IDENTIFIER$2);
                return target;
            }
        }
        
        /**
         * Unsets the "identifier" element
         */
        public void unsetIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFIER$2, 0);
            }
        }
        
        /**
         * Gets the "numRows" element
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
         * Gets (as xml) the "numRows" element
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
         * Sets the "numRows" element
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
         * Sets (as xml) the "numRows" element
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
         * Gets the "numColumns" element
         */
        public java.math.BigInteger getNumColumns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMCOLUMNS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "numColumns" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNumColumns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMCOLUMNS$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numColumns" element
         */
        public void setNumColumns(java.math.BigInteger numColumns)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMCOLUMNS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMCOLUMNS$6);
                }
                target.setBigIntegerValue(numColumns);
            }
        }
        
        /**
         * Sets (as xml) the "numColumns" element
         */
        public void xsetNumColumns(org.apache.xmlbeans.XmlInteger numColumns)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMCOLUMNS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMCOLUMNS$6);
                }
                target.set(numColumns);
            }
        }
        
        /**
         * Gets array of all "rowLabels" elements
         */
        public java.lang.String[] getRowLabelsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROWLABELS$8, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "rowLabels" element
         */
        public java.lang.String getRowLabelsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWLABELS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "rowLabels" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetRowLabelsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROWLABELS$8, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "rowLabels" element
         */
        public org.apache.xmlbeans.XmlString xgetRowLabelsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROWLABELS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "rowLabels" element
         */
        public int sizeOfRowLabelsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROWLABELS$8);
            }
        }
        
        /**
         * Sets array of all "rowLabels" element
         */
        public void setRowLabelsArray(java.lang.String[] rowLabelsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(rowLabelsArray, ROWLABELS$8);
            }
        }
        
        /**
         * Sets ith "rowLabels" element
         */
        public void setRowLabelsArray(int i, java.lang.String rowLabels)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWLABELS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(rowLabels);
            }
        }
        
        /**
         * Sets (as xml) array of all "rowLabels" element
         */
        public void xsetRowLabelsArray(org.apache.xmlbeans.XmlString[]rowLabelsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(rowLabelsArray, ROWLABELS$8);
            }
        }
        
        /**
         * Sets (as xml) ith "rowLabels" element
         */
        public void xsetRowLabelsArray(int i, org.apache.xmlbeans.XmlString rowLabels)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROWLABELS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(rowLabels);
            }
        }
        
        /**
         * Inserts the value as the ith "rowLabels" element
         */
        public void insertRowLabels(int i, java.lang.String rowLabels)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ROWLABELS$8, i);
                target.setStringValue(rowLabels);
            }
        }
        
        /**
         * Appends the value as the last "rowLabels" element
         */
        public void addRowLabels(java.lang.String rowLabels)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROWLABELS$8);
                target.setStringValue(rowLabels);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "rowLabels" element
         */
        public org.apache.xmlbeans.XmlString insertNewRowLabels(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ROWLABELS$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "rowLabels" element
         */
        public org.apache.xmlbeans.XmlString addNewRowLabels()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROWLABELS$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "rowLabels" element
         */
        public void removeRowLabels(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROWLABELS$8, i);
            }
        }
        
        /**
         * Gets the "byRow" element
         */
        public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow getByRow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow)get_store().find_element_user(BYROW$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "byRow" element
         */
        public boolean isSetByRow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BYROW$10) != 0;
            }
        }
        
        /**
         * Sets the "byRow" element
         */
        public void setByRow(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow byRow)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow)get_store().find_element_user(BYROW$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow)get_store().add_element_user(BYROW$10);
                }
                target.set(byRow);
            }
        }
        
        /**
         * Appends and returns a new empty "byRow" element
         */
        public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow addNewByRow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow)get_store().add_element_user(BYROW$10);
                return target;
            }
        }
        
        /**
         * Unsets the "byRow" element
         */
        public void unsetByRow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BYROW$10, 0);
            }
        }
        
        /**
         * Gets the "query" element
         */
        public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query getQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query)get_store().find_element_user(QUERY$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "query" element
         */
        public boolean isSetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERY$12) != 0;
            }
        }
        
        /**
         * Sets the "query" element
         */
        public void setQuery(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query query)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query)get_store().find_element_user(QUERY$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query)get_store().add_element_user(QUERY$12);
                }
                target.set(query);
            }
        }
        
        /**
         * Appends and returns a new empty "query" element
         */
        public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query addNewQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query)get_store().add_element_user(QUERY$12);
                return target;
            }
        }
        
        /**
         * Unsets the "query" element
         */
        public void unsetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERY$12, 0);
            }
        }
        
        /**
         * Gets the "intermediateData" element
         */
        public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData getIntermediateData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData)get_store().find_element_user(INTERMEDIATEDATA$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "intermediateData" element
         */
        public boolean isSetIntermediateData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTERMEDIATEDATA$14) != 0;
            }
        }
        
        /**
         * Sets the "intermediateData" element
         */
        public void setIntermediateData(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData intermediateData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData)get_store().find_element_user(INTERMEDIATEDATA$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData)get_store().add_element_user(INTERMEDIATEDATA$14);
                }
                target.set(intermediateData);
            }
        }
        
        /**
         * Appends and returns a new empty "intermediateData" element
         */
        public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData addNewIntermediateData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData)get_store().add_element_user(INTERMEDIATEDATA$14);
                return target;
            }
        }
        
        /**
         * Unsets the "intermediateData" element
         */
        public void unsetIntermediateData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTERMEDIATEDATA$14, 0);
            }
        }
        
        /**
         * Gets the "finalData" element
         */
        public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData getFinalData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData)get_store().find_element_user(FINALDATA$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "finalData" element
         */
        public boolean isSetFinalData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FINALDATA$16) != 0;
            }
        }
        
        /**
         * Sets the "finalData" element
         */
        public void setFinalData(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData finalData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData)get_store().find_element_user(FINALDATA$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData)get_store().add_element_user(FINALDATA$16);
                }
                target.set(finalData);
            }
        }
        
        /**
         * Appends and returns a new empty "finalData" element
         */
        public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData addNewFinalData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData target = null;
                target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData)get_store().add_element_user(FINALDATA$16);
                return target;
            }
        }
        
        /**
         * Unsets the "finalData" element
         */
        public void unsetFinalData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FINALDATA$16, 0);
            }
        }
        /**
         * An XML isProtein(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IsProteinImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein
        {
            
            public IsProteinImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PssmDocument$Pssm$IsProtein$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IsProtein.Value
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
         * An XML identifier(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Identifier
        {
            
            public IdentifierImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML byRow(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ByRowImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow
        {
            
            public ByRowImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PssmDocument$Pssm$ByRow$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.PssmDocument.Pssm.ByRow.Value
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
         * An XML query(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class QueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmDocument.Pssm.Query
        {
            
            public QueryImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQENTRY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-entry");
            
            
            /**
             * Gets the "Seq-entry" element
             */
            public gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry getSeqEntry()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry)get_store().find_element_user(SEQENTRY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-entry" element
             */
            public void setSeqEntry(gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry seqEntry)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry)get_store().find_element_user(SEQENTRY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqEntryDocument.SeqEntry)get_store().add_element_user(SEQENTRY$0);
                    }
                    target.set(seqEntry);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-entry" element
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
        }
        /**
         * An XML intermediateData(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IntermediateDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmDocument.Pssm.IntermediateData
        {
            
            public IntermediateDataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PSSMINTERMEDIATEDATA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PssmIntermediateData");
            
            
            /**
             * Gets the "PssmIntermediateData" element
             */
            public gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData getPssmIntermediateData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData)get_store().find_element_user(PSSMINTERMEDIATEDATA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PssmIntermediateData" element
             */
            public void setPssmIntermediateData(gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData pssmIntermediateData)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData)get_store().find_element_user(PSSMINTERMEDIATEDATA$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData)get_store().add_element_user(PSSMINTERMEDIATEDATA$0);
                    }
                    target.set(pssmIntermediateData);
                }
            }
            
            /**
             * Appends and returns a new empty "PssmIntermediateData" element
             */
            public gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData addNewPssmIntermediateData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmIntermediateDataDocument.PssmIntermediateData)get_store().add_element_user(PSSMINTERMEDIATEDATA$0);
                    return target;
                }
            }
        }
        /**
         * An XML finalData(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FinalDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PssmDocument.Pssm.FinalData
        {
            
            public FinalDataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PSSMFINALDATA$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PssmFinalData");
            
            
            /**
             * Gets the "PssmFinalData" element
             */
            public gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData getPssmFinalData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData)get_store().find_element_user(PSSMFINALDATA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PssmFinalData" element
             */
            public void setPssmFinalData(gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData pssmFinalData)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData)get_store().find_element_user(PSSMFINALDATA$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData)get_store().add_element_user(PSSMFINALDATA$0);
                    }
                    target.set(pssmFinalData);
                }
            }
            
            /**
             * Appends and returns a new empty "PssmFinalData" element
             */
            public gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData addNewPssmFinalData()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData target = null;
                    target = (gov.nih.nlm.ncbi.www.PssmFinalDataDocument.PssmFinalData)get_store().add_element_user(PSSMFINALDATA$0);
                    return target;
                }
            }
        }
    }
}
