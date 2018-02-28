/*
 * An XML document type.
 * Localname: Genetic-code
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GeneticCodeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Genetic-code(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class GeneticCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GeneticCodeDocument
{
    
    public GeneticCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENETICCODE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Genetic-code");
    
    
    /**
     * Gets the "Genetic-code" element
     */
    public gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode getGeneticCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode target = null;
            target = (gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode)get_store().find_element_user(GENETICCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Genetic-code" element
     */
    public void setGeneticCode(gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode geneticCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode target = null;
            target = (gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode)get_store().find_element_user(GENETICCODE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode)get_store().add_element_user(GENETICCODE$0);
            }
            target.set(geneticCode);
        }
    }
    
    /**
     * Appends and returns a new empty "Genetic-code" element
     */
    public gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode addNewGeneticCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode target = null;
            target = (gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode)get_store().add_element_user(GENETICCODE$0);
            return target;
        }
    }
    /**
     * An XML Genetic-code(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class GeneticCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GeneticCodeDocument.GeneticCode
    {
        
        public GeneticCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "id");
        private static final javax.xml.namespace.QName NCBIEAA$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbieaa");
        private static final javax.xml.namespace.QName NCBI8AA$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbi8aa");
        private static final javax.xml.namespace.QName NCBISTDAA$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ncbistdaa");
        private static final javax.xml.namespace.QName SNCBIEAA$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "sncbieaa");
        private static final javax.xml.namespace.QName SNCBI8AA$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "sncbi8aa");
        private static final javax.xml.namespace.QName SNCBISTDAA$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "sncbistdaa");
        
        
        /**
         * Gets array of all "name" elements
         */
        public java.lang.String[] getNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "name" element
         */
        public java.lang.String getNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "name" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "name" element
         */
        public org.apache.xmlbeans.XmlString xgetNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "name" element
         */
        public int sizeOfNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$0);
            }
        }
        
        /**
         * Sets array of all "name" element
         */
        public void setNameArray(java.lang.String[] nameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$0);
            }
        }
        
        /**
         * Sets ith "name" element
         */
        public void setNameArray(int i, java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) array of all "name" element
         */
        public void xsetNameArray(org.apache.xmlbeans.XmlString[]nameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$0);
            }
        }
        
        /**
         * Sets (as xml) ith "name" element
         */
        public void xsetNameArray(int i, org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(name);
            }
        }
        
        /**
         * Inserts the value as the ith "name" element
         */
        public void insertName(int i, java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NAME$0, i);
                target.setStringValue(name);
            }
        }
        
        /**
         * Appends the value as the last "name" element
         */
        public void addName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                target.setStringValue(name);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        public org.apache.xmlbeans.XmlString insertNewName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(NAME$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        public org.apache.xmlbeans.XmlString addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "name" element
         */
        public void removeName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$0, i);
            }
        }
        
        /**
         * Gets array of all "id" elements
         */
        public java.math.BigInteger[] getIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ID$2, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "id" element
         */
        public java.math.BigInteger getIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "id" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ID$2, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "id" element
         */
        public org.apache.xmlbeans.XmlInteger xgetIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ID$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "id" element
         */
        public int sizeOfIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ID$2);
            }
        }
        
        /**
         * Sets array of all "id" element
         */
        public void setIdArray(java.math.BigInteger[] idArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(idArray, ID$2);
            }
        }
        
        /**
         * Sets ith "id" element
         */
        public void setIdArray(int i, java.math.BigInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(id);
            }
        }
        
        /**
         * Sets (as xml) array of all "id" element
         */
        public void xsetIdArray(org.apache.xmlbeans.XmlInteger[]idArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(idArray, ID$2);
            }
        }
        
        /**
         * Sets (as xml) ith "id" element
         */
        public void xsetIdArray(int i, org.apache.xmlbeans.XmlInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ID$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(id);
            }
        }
        
        /**
         * Inserts the value as the ith "id" element
         */
        public void insertId(int i, java.math.BigInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ID$2, i);
                target.setBigIntegerValue(id);
            }
        }
        
        /**
         * Appends the value as the last "id" element
         */
        public void addId(java.math.BigInteger id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$2);
                target.setBigIntegerValue(id);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "id" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(ID$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "id" element
         */
        public org.apache.xmlbeans.XmlInteger addNewId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ID$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "id" element
         */
        public void removeId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ID$2, i);
            }
        }
        
        /**
         * Gets array of all "ncbieaa" elements
         */
        public java.lang.String[] getNcbieaaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NCBIEAA$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "ncbieaa" element
         */
        public java.lang.String getNcbieaaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBIEAA$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "ncbieaa" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetNcbieaaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NCBIEAA$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "ncbieaa" element
         */
        public org.apache.xmlbeans.XmlString xgetNcbieaaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NCBIEAA$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "ncbieaa" element
         */
        public int sizeOfNcbieaaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NCBIEAA$4);
            }
        }
        
        /**
         * Sets array of all "ncbieaa" element
         */
        public void setNcbieaaArray(java.lang.String[] ncbieaaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ncbieaaArray, NCBIEAA$4);
            }
        }
        
        /**
         * Sets ith "ncbieaa" element
         */
        public void setNcbieaaArray(int i, java.lang.String ncbieaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBIEAA$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(ncbieaa);
            }
        }
        
        /**
         * Sets (as xml) array of all "ncbieaa" element
         */
        public void xsetNcbieaaArray(org.apache.xmlbeans.XmlString[]ncbieaaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ncbieaaArray, NCBIEAA$4);
            }
        }
        
        /**
         * Sets (as xml) ith "ncbieaa" element
         */
        public void xsetNcbieaaArray(int i, org.apache.xmlbeans.XmlString ncbieaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NCBIEAA$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ncbieaa);
            }
        }
        
        /**
         * Inserts the value as the ith "ncbieaa" element
         */
        public void insertNcbieaa(int i, java.lang.String ncbieaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NCBIEAA$4, i);
                target.setStringValue(ncbieaa);
            }
        }
        
        /**
         * Appends the value as the last "ncbieaa" element
         */
        public void addNcbieaa(java.lang.String ncbieaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBIEAA$4);
                target.setStringValue(ncbieaa);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ncbieaa" element
         */
        public org.apache.xmlbeans.XmlString insertNewNcbieaa(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(NCBIEAA$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ncbieaa" element
         */
        public org.apache.xmlbeans.XmlString addNewNcbieaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NCBIEAA$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "ncbieaa" element
         */
        public void removeNcbieaa(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NCBIEAA$4, i);
            }
        }
        
        /**
         * Gets array of all "ncbi8aa" elements
         */
        public byte[][] getNcbi8AaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NCBI8AA$6, targetList);
                byte[][] result = new byte[targetList.size()][];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getByteArrayValue();
                return result;
            }
        }
        
        /**
         * Gets ith "ncbi8aa" element
         */
        public byte[] getNcbi8AaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI8AA$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "ncbi8aa" elements
         */
        public org.apache.xmlbeans.XmlHexBinary[] xgetNcbi8AaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NCBI8AA$6, targetList);
                org.apache.xmlbeans.XmlHexBinary[] result = new org.apache.xmlbeans.XmlHexBinary[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "ncbi8aa" element
         */
        public org.apache.xmlbeans.XmlHexBinary xgetNcbi8AaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI8AA$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlHexBinary)target;
            }
        }
        
        /**
         * Returns number of "ncbi8aa" element
         */
        public int sizeOfNcbi8AaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NCBI8AA$6);
            }
        }
        
        /**
         * Sets array of all "ncbi8aa" element
         */
        public void setNcbi8AaArray(byte[][] ncbi8AaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ncbi8AaArray, NCBI8AA$6);
            }
        }
        
        /**
         * Sets ith "ncbi8aa" element
         */
        public void setNcbi8AaArray(int i, byte[] ncbi8Aa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBI8AA$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setByteArrayValue(ncbi8Aa);
            }
        }
        
        /**
         * Sets (as xml) array of all "ncbi8aa" element
         */
        public void xsetNcbi8AaArray(org.apache.xmlbeans.XmlHexBinary[]ncbi8AaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ncbi8AaArray, NCBI8AA$6);
            }
        }
        
        /**
         * Sets (as xml) ith "ncbi8aa" element
         */
        public void xsetNcbi8AaArray(int i, org.apache.xmlbeans.XmlHexBinary ncbi8Aa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBI8AA$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ncbi8Aa);
            }
        }
        
        /**
         * Inserts the value as the ith "ncbi8aa" element
         */
        public void insertNcbi8Aa(int i, byte[] ncbi8Aa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NCBI8AA$6, i);
                target.setByteArrayValue(ncbi8Aa);
            }
        }
        
        /**
         * Appends the value as the last "ncbi8aa" element
         */
        public void addNcbi8Aa(byte[] ncbi8Aa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBI8AA$6);
                target.setByteArrayValue(ncbi8Aa);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ncbi8aa" element
         */
        public org.apache.xmlbeans.XmlHexBinary insertNewNcbi8Aa(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().insert_element_user(NCBI8AA$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ncbi8aa" element
         */
        public org.apache.xmlbeans.XmlHexBinary addNewNcbi8Aa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBI8AA$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "ncbi8aa" element
         */
        public void removeNcbi8Aa(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NCBI8AA$6, i);
            }
        }
        
        /**
         * Gets array of all "ncbistdaa" elements
         */
        public byte[][] getNcbistdaaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NCBISTDAA$8, targetList);
                byte[][] result = new byte[targetList.size()][];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getByteArrayValue();
                return result;
            }
        }
        
        /**
         * Gets ith "ncbistdaa" element
         */
        public byte[] getNcbistdaaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBISTDAA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "ncbistdaa" elements
         */
        public org.apache.xmlbeans.XmlHexBinary[] xgetNcbistdaaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NCBISTDAA$8, targetList);
                org.apache.xmlbeans.XmlHexBinary[] result = new org.apache.xmlbeans.XmlHexBinary[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "ncbistdaa" element
         */
        public org.apache.xmlbeans.XmlHexBinary xgetNcbistdaaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBISTDAA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlHexBinary)target;
            }
        }
        
        /**
         * Returns number of "ncbistdaa" element
         */
        public int sizeOfNcbistdaaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NCBISTDAA$8);
            }
        }
        
        /**
         * Sets array of all "ncbistdaa" element
         */
        public void setNcbistdaaArray(byte[][] ncbistdaaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ncbistdaaArray, NCBISTDAA$8);
            }
        }
        
        /**
         * Sets ith "ncbistdaa" element
         */
        public void setNcbistdaaArray(int i, byte[] ncbistdaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NCBISTDAA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setByteArrayValue(ncbistdaa);
            }
        }
        
        /**
         * Sets (as xml) array of all "ncbistdaa" element
         */
        public void xsetNcbistdaaArray(org.apache.xmlbeans.XmlHexBinary[]ncbistdaaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ncbistdaaArray, NCBISTDAA$8);
            }
        }
        
        /**
         * Sets (as xml) ith "ncbistdaa" element
         */
        public void xsetNcbistdaaArray(int i, org.apache.xmlbeans.XmlHexBinary ncbistdaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(NCBISTDAA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ncbistdaa);
            }
        }
        
        /**
         * Inserts the value as the ith "ncbistdaa" element
         */
        public void insertNcbistdaa(int i, byte[] ncbistdaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NCBISTDAA$8, i);
                target.setByteArrayValue(ncbistdaa);
            }
        }
        
        /**
         * Appends the value as the last "ncbistdaa" element
         */
        public void addNcbistdaa(byte[] ncbistdaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NCBISTDAA$8);
                target.setByteArrayValue(ncbistdaa);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ncbistdaa" element
         */
        public org.apache.xmlbeans.XmlHexBinary insertNewNcbistdaa(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().insert_element_user(NCBISTDAA$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ncbistdaa" element
         */
        public org.apache.xmlbeans.XmlHexBinary addNewNcbistdaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(NCBISTDAA$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "ncbistdaa" element
         */
        public void removeNcbistdaa(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NCBISTDAA$8, i);
            }
        }
        
        /**
         * Gets array of all "sncbieaa" elements
         */
        public java.lang.String[] getSncbieaaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SNCBIEAA$10, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "sncbieaa" element
         */
        public java.lang.String getSncbieaaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNCBIEAA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "sncbieaa" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetSncbieaaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SNCBIEAA$10, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "sncbieaa" element
         */
        public org.apache.xmlbeans.XmlString xgetSncbieaaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SNCBIEAA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "sncbieaa" element
         */
        public int sizeOfSncbieaaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SNCBIEAA$10);
            }
        }
        
        /**
         * Sets array of all "sncbieaa" element
         */
        public void setSncbieaaArray(java.lang.String[] sncbieaaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sncbieaaArray, SNCBIEAA$10);
            }
        }
        
        /**
         * Sets ith "sncbieaa" element
         */
        public void setSncbieaaArray(int i, java.lang.String sncbieaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNCBIEAA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(sncbieaa);
            }
        }
        
        /**
         * Sets (as xml) array of all "sncbieaa" element
         */
        public void xsetSncbieaaArray(org.apache.xmlbeans.XmlString[]sncbieaaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sncbieaaArray, SNCBIEAA$10);
            }
        }
        
        /**
         * Sets (as xml) ith "sncbieaa" element
         */
        public void xsetSncbieaaArray(int i, org.apache.xmlbeans.XmlString sncbieaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SNCBIEAA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sncbieaa);
            }
        }
        
        /**
         * Inserts the value as the ith "sncbieaa" element
         */
        public void insertSncbieaa(int i, java.lang.String sncbieaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SNCBIEAA$10, i);
                target.setStringValue(sncbieaa);
            }
        }
        
        /**
         * Appends the value as the last "sncbieaa" element
         */
        public void addSncbieaa(java.lang.String sncbieaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SNCBIEAA$10);
                target.setStringValue(sncbieaa);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sncbieaa" element
         */
        public org.apache.xmlbeans.XmlString insertNewSncbieaa(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SNCBIEAA$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sncbieaa" element
         */
        public org.apache.xmlbeans.XmlString addNewSncbieaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SNCBIEAA$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "sncbieaa" element
         */
        public void removeSncbieaa(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SNCBIEAA$10, i);
            }
        }
        
        /**
         * Gets array of all "sncbi8aa" elements
         */
        public byte[][] getSncbi8AaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SNCBI8AA$12, targetList);
                byte[][] result = new byte[targetList.size()][];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getByteArrayValue();
                return result;
            }
        }
        
        /**
         * Gets ith "sncbi8aa" element
         */
        public byte[] getSncbi8AaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNCBI8AA$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "sncbi8aa" elements
         */
        public org.apache.xmlbeans.XmlHexBinary[] xgetSncbi8AaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SNCBI8AA$12, targetList);
                org.apache.xmlbeans.XmlHexBinary[] result = new org.apache.xmlbeans.XmlHexBinary[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "sncbi8aa" element
         */
        public org.apache.xmlbeans.XmlHexBinary xgetSncbi8AaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(SNCBI8AA$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlHexBinary)target;
            }
        }
        
        /**
         * Returns number of "sncbi8aa" element
         */
        public int sizeOfSncbi8AaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SNCBI8AA$12);
            }
        }
        
        /**
         * Sets array of all "sncbi8aa" element
         */
        public void setSncbi8AaArray(byte[][] sncbi8AaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sncbi8AaArray, SNCBI8AA$12);
            }
        }
        
        /**
         * Sets ith "sncbi8aa" element
         */
        public void setSncbi8AaArray(int i, byte[] sncbi8Aa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNCBI8AA$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setByteArrayValue(sncbi8Aa);
            }
        }
        
        /**
         * Sets (as xml) array of all "sncbi8aa" element
         */
        public void xsetSncbi8AaArray(org.apache.xmlbeans.XmlHexBinary[]sncbi8AaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sncbi8AaArray, SNCBI8AA$12);
            }
        }
        
        /**
         * Sets (as xml) ith "sncbi8aa" element
         */
        public void xsetSncbi8AaArray(int i, org.apache.xmlbeans.XmlHexBinary sncbi8Aa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(SNCBI8AA$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sncbi8Aa);
            }
        }
        
        /**
         * Inserts the value as the ith "sncbi8aa" element
         */
        public void insertSncbi8Aa(int i, byte[] sncbi8Aa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SNCBI8AA$12, i);
                target.setByteArrayValue(sncbi8Aa);
            }
        }
        
        /**
         * Appends the value as the last "sncbi8aa" element
         */
        public void addSncbi8Aa(byte[] sncbi8Aa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SNCBI8AA$12);
                target.setByteArrayValue(sncbi8Aa);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sncbi8aa" element
         */
        public org.apache.xmlbeans.XmlHexBinary insertNewSncbi8Aa(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().insert_element_user(SNCBI8AA$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sncbi8aa" element
         */
        public org.apache.xmlbeans.XmlHexBinary addNewSncbi8Aa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(SNCBI8AA$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "sncbi8aa" element
         */
        public void removeSncbi8Aa(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SNCBI8AA$12, i);
            }
        }
        
        /**
         * Gets array of all "sncbistdaa" elements
         */
        public byte[][] getSncbistdaaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SNCBISTDAA$14, targetList);
                byte[][] result = new byte[targetList.size()][];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getByteArrayValue();
                return result;
            }
        }
        
        /**
         * Gets ith "sncbistdaa" element
         */
        public byte[] getSncbistdaaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNCBISTDAA$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "sncbistdaa" elements
         */
        public org.apache.xmlbeans.XmlHexBinary[] xgetSncbistdaaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SNCBISTDAA$14, targetList);
                org.apache.xmlbeans.XmlHexBinary[] result = new org.apache.xmlbeans.XmlHexBinary[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "sncbistdaa" element
         */
        public org.apache.xmlbeans.XmlHexBinary xgetSncbistdaaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(SNCBISTDAA$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlHexBinary)target;
            }
        }
        
        /**
         * Returns number of "sncbistdaa" element
         */
        public int sizeOfSncbistdaaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SNCBISTDAA$14);
            }
        }
        
        /**
         * Sets array of all "sncbistdaa" element
         */
        public void setSncbistdaaArray(byte[][] sncbistdaaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sncbistdaaArray, SNCBISTDAA$14);
            }
        }
        
        /**
         * Sets ith "sncbistdaa" element
         */
        public void setSncbistdaaArray(int i, byte[] sncbistdaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNCBISTDAA$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setByteArrayValue(sncbistdaa);
            }
        }
        
        /**
         * Sets (as xml) array of all "sncbistdaa" element
         */
        public void xsetSncbistdaaArray(org.apache.xmlbeans.XmlHexBinary[]sncbistdaaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sncbistdaaArray, SNCBISTDAA$14);
            }
        }
        
        /**
         * Sets (as xml) ith "sncbistdaa" element
         */
        public void xsetSncbistdaaArray(int i, org.apache.xmlbeans.XmlHexBinary sncbistdaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(SNCBISTDAA$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sncbistdaa);
            }
        }
        
        /**
         * Inserts the value as the ith "sncbistdaa" element
         */
        public void insertSncbistdaa(int i, byte[] sncbistdaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SNCBISTDAA$14, i);
                target.setByteArrayValue(sncbistdaa);
            }
        }
        
        /**
         * Appends the value as the last "sncbistdaa" element
         */
        public void addSncbistdaa(byte[] sncbistdaa)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SNCBISTDAA$14);
                target.setByteArrayValue(sncbistdaa);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sncbistdaa" element
         */
        public org.apache.xmlbeans.XmlHexBinary insertNewSncbistdaa(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().insert_element_user(SNCBISTDAA$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sncbistdaa" element
         */
        public org.apache.xmlbeans.XmlHexBinary addNewSncbistdaa()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlHexBinary target = null;
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(SNCBISTDAA$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "sncbistdaa" element
         */
        public void removeSncbistdaa(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SNCBISTDAA$14, i);
            }
        }
    }
}
