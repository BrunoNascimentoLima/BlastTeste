/*
 * An XML document type.
 * Localname: Num-enum
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NumEnumDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Num-enum(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class NumEnumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumEnumDocument
{
    
    public NumEnumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMENUM$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Num-enum");
    
    
    /**
     * Gets the "Num-enum" element
     */
    public gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum getNumEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum target = null;
            target = (gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum)get_store().find_element_user(NUMENUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Num-enum" element
     */
    public void setNumEnum(gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum numEnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum target = null;
            target = (gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum)get_store().find_element_user(NUMENUM$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum)get_store().add_element_user(NUMENUM$0);
            }
            target.set(numEnum);
        }
    }
    
    /**
     * Appends and returns a new empty "Num-enum" element
     */
    public gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum addNewNumEnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum target = null;
            target = (gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum)get_store().add_element_user(NUMENUM$0);
            return target;
        }
    }
    /**
     * An XML Num-enum(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class NumEnumImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumEnumDocument.NumEnum
    {
        
        public NumEnumImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUM$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "num");
        private static final javax.xml.namespace.QName NAMES$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "names");
        
        
        /**
         * Gets the "num" element
         */
        public java.math.BigInteger getNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "num" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUM$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "num" element
         */
        public void setNum(java.math.BigInteger num)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUM$0);
                }
                target.setBigIntegerValue(num);
            }
        }
        
        /**
         * Sets (as xml) the "num" element
         */
        public void xsetNum(org.apache.xmlbeans.XmlInteger num)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUM$0);
                }
                target.set(num);
            }
        }
        
        /**
         * Gets array of all "names" elements
         */
        public java.lang.String[] getNamesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAMES$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "names" element
         */
        public java.lang.String getNamesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "names" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetNamesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAMES$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "names" element
         */
        public org.apache.xmlbeans.XmlString xgetNamesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAMES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "names" element
         */
        public int sizeOfNamesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAMES$2);
            }
        }
        
        /**
         * Sets array of all "names" element
         */
        public void setNamesArray(java.lang.String[] namesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(namesArray, NAMES$2);
            }
        }
        
        /**
         * Sets ith "names" element
         */
        public void setNamesArray(int i, java.lang.String names)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(names);
            }
        }
        
        /**
         * Sets (as xml) array of all "names" element
         */
        public void xsetNamesArray(org.apache.xmlbeans.XmlString[]namesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(namesArray, NAMES$2);
            }
        }
        
        /**
         * Sets (as xml) ith "names" element
         */
        public void xsetNamesArray(int i, org.apache.xmlbeans.XmlString names)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAMES$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(names);
            }
        }
        
        /**
         * Inserts the value as the ith "names" element
         */
        public void insertNames(int i, java.lang.String names)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NAMES$2, i);
                target.setStringValue(names);
            }
        }
        
        /**
         * Appends the value as the last "names" element
         */
        public void addNames(java.lang.String names)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAMES$2);
                target.setStringValue(names);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "names" element
         */
        public org.apache.xmlbeans.XmlString insertNewNames(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(NAMES$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "names" element
         */
        public org.apache.xmlbeans.XmlString addNewNames()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAMES$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "names" element
         */
        public void removeNames(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAMES$2, i);
            }
        }
    }
}
