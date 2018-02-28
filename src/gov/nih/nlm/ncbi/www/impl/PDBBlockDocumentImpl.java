/*
 * An XML document type.
 * Localname: PDB-block
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PDBBlockDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one PDB-block(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PDBBlockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PDBBlockDocument
{
    
    public PDBBlockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PDBBLOCK$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PDB-block");
    
    
    /**
     * Gets the "PDB-block" element
     */
    public gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock getPDBBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock target = null;
            target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock)get_store().find_element_user(PDBBLOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PDB-block" element
     */
    public void setPDBBlock(gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock pdbBlock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock target = null;
            target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock)get_store().find_element_user(PDBBLOCK$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock)get_store().add_element_user(PDBBLOCK$0);
            }
            target.set(pdbBlock);
        }
    }
    
    /**
     * Appends and returns a new empty "PDB-block" element
     */
    public gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock addNewPDBBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock target = null;
            target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock)get_store().add_element_user(PDBBLOCK$0);
            return target;
        }
    }
    /**
     * An XML PDB-block(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PDBBlockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock
    {
        
        public PDBBlockImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DEPOSITION$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "deposition");
        private static final javax.xml.namespace.QName CLASS1$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "class");
        private static final javax.xml.namespace.QName COMPOUND$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "compound");
        private static final javax.xml.namespace.QName SOURCE$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "source");
        private static final javax.xml.namespace.QName EXPMETHOD$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "exp-method");
        private static final javax.xml.namespace.QName REPLACE$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "replace");
        
        
        /**
         * Gets the "deposition" element
         */
        public gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition getDeposition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition target = null;
                target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition)get_store().find_element_user(DEPOSITION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "deposition" element
         */
        public void setDeposition(gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition deposition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition target = null;
                target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition)get_store().find_element_user(DEPOSITION$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition)get_store().add_element_user(DEPOSITION$0);
                }
                target.set(deposition);
            }
        }
        
        /**
         * Appends and returns a new empty "deposition" element
         */
        public gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition addNewDeposition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition target = null;
                target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition)get_store().add_element_user(DEPOSITION$0);
                return target;
            }
        }
        
        /**
         * Gets the "class" element
         */
        public java.lang.String getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASS1$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "class" element
         */
        public org.apache.xmlbeans.XmlString xgetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASS1$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "class" element
         */
        public void setClass1(java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASS1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASS1$2);
                }
                target.setStringValue(class1);
            }
        }
        
        /**
         * Sets (as xml) the "class" element
         */
        public void xsetClass1(org.apache.xmlbeans.XmlString class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASS1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASS1$2);
                }
                target.set(class1);
            }
        }
        
        /**
         * Gets array of all "compound" elements
         */
        public java.lang.String[] getCompoundArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPOUND$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "compound" element
         */
        public java.lang.String getCompoundArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPOUND$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "compound" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetCompoundArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPOUND$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "compound" element
         */
        public org.apache.xmlbeans.XmlString xgetCompoundArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPOUND$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "compound" element
         */
        public int sizeOfCompoundArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPOUND$4);
            }
        }
        
        /**
         * Sets array of all "compound" element
         */
        public void setCompoundArray(java.lang.String[] compoundArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(compoundArray, COMPOUND$4);
            }
        }
        
        /**
         * Sets ith "compound" element
         */
        public void setCompoundArray(int i, java.lang.String compound)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPOUND$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(compound);
            }
        }
        
        /**
         * Sets (as xml) array of all "compound" element
         */
        public void xsetCompoundArray(org.apache.xmlbeans.XmlString[]compoundArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(compoundArray, COMPOUND$4);
            }
        }
        
        /**
         * Sets (as xml) ith "compound" element
         */
        public void xsetCompoundArray(int i, org.apache.xmlbeans.XmlString compound)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPOUND$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(compound);
            }
        }
        
        /**
         * Inserts the value as the ith "compound" element
         */
        public void insertCompound(int i, java.lang.String compound)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COMPOUND$4, i);
                target.setStringValue(compound);
            }
        }
        
        /**
         * Appends the value as the last "compound" element
         */
        public void addCompound(java.lang.String compound)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPOUND$4);
                target.setStringValue(compound);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "compound" element
         */
        public org.apache.xmlbeans.XmlString insertNewCompound(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(COMPOUND$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "compound" element
         */
        public org.apache.xmlbeans.XmlString addNewCompound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPOUND$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "compound" element
         */
        public void removeCompound(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPOUND$4, i);
            }
        }
        
        /**
         * Gets array of all "source" elements
         */
        public java.lang.String[] getSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SOURCE$6, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "source" element
         */
        public java.lang.String getSourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "source" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SOURCE$6, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "source" element
         */
        public org.apache.xmlbeans.XmlString xgetSourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "source" element
         */
        public int sizeOfSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCE$6);
            }
        }
        
        /**
         * Sets array of all "source" element
         */
        public void setSourceArray(java.lang.String[] sourceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourceArray, SOURCE$6);
            }
        }
        
        /**
         * Sets ith "source" element
         */
        public void setSourceArray(int i, java.lang.String source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(source);
            }
        }
        
        /**
         * Sets (as xml) array of all "source" element
         */
        public void xsetSourceArray(org.apache.xmlbeans.XmlString[]sourceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourceArray, SOURCE$6);
            }
        }
        
        /**
         * Sets (as xml) ith "source" element
         */
        public void xsetSourceArray(int i, org.apache.xmlbeans.XmlString source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(source);
            }
        }
        
        /**
         * Inserts the value as the ith "source" element
         */
        public void insertSource(int i, java.lang.String source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SOURCE$6, i);
                target.setStringValue(source);
            }
        }
        
        /**
         * Appends the value as the last "source" element
         */
        public void addSource(java.lang.String source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$6);
                target.setStringValue(source);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "source" element
         */
        public org.apache.xmlbeans.XmlString insertNewSource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SOURCE$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "source" element
         */
        public org.apache.xmlbeans.XmlString addNewSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "source" element
         */
        public void removeSource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCE$6, i);
            }
        }
        
        /**
         * Gets the "exp-method" element
         */
        public java.lang.String getExpMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPMETHOD$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "exp-method" element
         */
        public org.apache.xmlbeans.XmlString xgetExpMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPMETHOD$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "exp-method" element
         */
        public boolean isSetExpMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXPMETHOD$8) != 0;
            }
        }
        
        /**
         * Sets the "exp-method" element
         */
        public void setExpMethod(java.lang.String expMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPMETHOD$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPMETHOD$8);
                }
                target.setStringValue(expMethod);
            }
        }
        
        /**
         * Sets (as xml) the "exp-method" element
         */
        public void xsetExpMethod(org.apache.xmlbeans.XmlString expMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPMETHOD$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPMETHOD$8);
                }
                target.set(expMethod);
            }
        }
        
        /**
         * Unsets the "exp-method" element
         */
        public void unsetExpMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXPMETHOD$8, 0);
            }
        }
        
        /**
         * Gets the "replace" element
         */
        public gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace getReplace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace target = null;
                target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace)get_store().find_element_user(REPLACE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "replace" element
         */
        public boolean isSetReplace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPLACE$10) != 0;
            }
        }
        
        /**
         * Sets the "replace" element
         */
        public void setReplace(gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace replace)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace target = null;
                target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace)get_store().find_element_user(REPLACE$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace)get_store().add_element_user(REPLACE$10);
                }
                target.set(replace);
            }
        }
        
        /**
         * Appends and returns a new empty "replace" element
         */
        public gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace addNewReplace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace target = null;
                target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace)get_store().add_element_user(REPLACE$10);
                return target;
            }
        }
        
        /**
         * Unsets the "replace" element
         */
        public void unsetReplace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPLACE$10, 0);
            }
        }
        /**
         * An XML deposition(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DepositionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Deposition
        {
            
            public DepositionImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML replace(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ReplaceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock.Replace
        {
            
            public ReplaceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PDBREPLACE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PDB-replace");
            
            
            /**
             * Gets the "PDB-replace" element
             */
            public gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace getPDBReplace()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace target = null;
                    target = (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace)get_store().find_element_user(PDBREPLACE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PDB-replace" element
             */
            public void setPDBReplace(gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace pdbReplace)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace target = null;
                    target = (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace)get_store().find_element_user(PDBREPLACE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace)get_store().add_element_user(PDBREPLACE$0);
                    }
                    target.set(pdbReplace);
                }
            }
            
            /**
             * Appends and returns a new empty "PDB-replace" element
             */
            public gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace addNewPDBReplace()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace target = null;
                    target = (gov.nih.nlm.ncbi.www.PDBReplaceDocument.PDBReplace)get_store().add_element_user(PDBREPLACE$0);
                    return target;
                }
            }
        }
    }
}
