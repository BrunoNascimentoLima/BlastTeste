/*
 * An XML document type.
 * Localname: Title
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.TitleDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Title(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class TitleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TitleDocument
{
    
    public TitleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Title");
    
    
    /**
     * Gets the "Title" element
     */
    public gov.nih.nlm.ncbi.www.TitleDocument.Title getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TitleDocument.Title target = null;
            target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Title" element
     */
    public void setTitle(gov.nih.nlm.ncbi.www.TitleDocument.Title title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TitleDocument.Title target = null;
            target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().add_element_user(TITLE$0);
            }
            target.set(title);
        }
    }
    
    /**
     * Appends and returns a new empty "Title" element
     */
    public gov.nih.nlm.ncbi.www.TitleDocument.Title addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TitleDocument.Title target = null;
            target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().add_element_user(TITLE$0);
            return target;
        }
    }
    /**
     * An XML Title(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class TitleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TitleDocument.Title
    {
        
        public TitleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName TSUB$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "tsub");
        private static final javax.xml.namespace.QName TRANS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "trans");
        private static final javax.xml.namespace.QName JTA$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "jta");
        private static final javax.xml.namespace.QName ISOJTA$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "iso-jta");
        private static final javax.xml.namespace.QName MLJTA$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ml-jta");
        private static final javax.xml.namespace.QName CODEN$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "coden");
        private static final javax.xml.namespace.QName ISSN$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "issn");
        private static final javax.xml.namespace.QName ABR$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "abr");
        private static final javax.xml.namespace.QName ISBN$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "isbn");
        
        
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
         * Gets array of all "tsub" elements
         */
        public java.lang.String[] getTsubArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TSUB$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "tsub" element
         */
        public java.lang.String getTsubArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TSUB$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "tsub" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetTsubArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TSUB$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "tsub" element
         */
        public org.apache.xmlbeans.XmlString xgetTsubArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TSUB$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "tsub" element
         */
        public int sizeOfTsubArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TSUB$2);
            }
        }
        
        /**
         * Sets array of all "tsub" element
         */
        public void setTsubArray(java.lang.String[] tsubArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(tsubArray, TSUB$2);
            }
        }
        
        /**
         * Sets ith "tsub" element
         */
        public void setTsubArray(int i, java.lang.String tsub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TSUB$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(tsub);
            }
        }
        
        /**
         * Sets (as xml) array of all "tsub" element
         */
        public void xsetTsubArray(org.apache.xmlbeans.XmlString[]tsubArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(tsubArray, TSUB$2);
            }
        }
        
        /**
         * Sets (as xml) ith "tsub" element
         */
        public void xsetTsubArray(int i, org.apache.xmlbeans.XmlString tsub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TSUB$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(tsub);
            }
        }
        
        /**
         * Inserts the value as the ith "tsub" element
         */
        public void insertTsub(int i, java.lang.String tsub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TSUB$2, i);
                target.setStringValue(tsub);
            }
        }
        
        /**
         * Appends the value as the last "tsub" element
         */
        public void addTsub(java.lang.String tsub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TSUB$2);
                target.setStringValue(tsub);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tsub" element
         */
        public org.apache.xmlbeans.XmlString insertNewTsub(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(TSUB$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tsub" element
         */
        public org.apache.xmlbeans.XmlString addNewTsub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TSUB$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "tsub" element
         */
        public void removeTsub(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TSUB$2, i);
            }
        }
        
        /**
         * Gets array of all "trans" elements
         */
        public java.lang.String[] getTransArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TRANS$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "trans" element
         */
        public java.lang.String getTransArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "trans" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetTransArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TRANS$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "trans" element
         */
        public org.apache.xmlbeans.XmlString xgetTransArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "trans" element
         */
        public int sizeOfTransArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRANS$4);
            }
        }
        
        /**
         * Sets array of all "trans" element
         */
        public void setTransArray(java.lang.String[] transArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(transArray, TRANS$4);
            }
        }
        
        /**
         * Sets ith "trans" element
         */
        public void setTransArray(int i, java.lang.String trans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(trans);
            }
        }
        
        /**
         * Sets (as xml) array of all "trans" element
         */
        public void xsetTransArray(org.apache.xmlbeans.XmlString[]transArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(transArray, TRANS$4);
            }
        }
        
        /**
         * Sets (as xml) ith "trans" element
         */
        public void xsetTransArray(int i, org.apache.xmlbeans.XmlString trans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(trans);
            }
        }
        
        /**
         * Inserts the value as the ith "trans" element
         */
        public void insertTrans(int i, java.lang.String trans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TRANS$4, i);
                target.setStringValue(trans);
            }
        }
        
        /**
         * Appends the value as the last "trans" element
         */
        public void addTrans(java.lang.String trans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANS$4);
                target.setStringValue(trans);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "trans" element
         */
        public org.apache.xmlbeans.XmlString insertNewTrans(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(TRANS$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "trans" element
         */
        public org.apache.xmlbeans.XmlString addNewTrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRANS$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "trans" element
         */
        public void removeTrans(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRANS$4, i);
            }
        }
        
        /**
         * Gets array of all "jta" elements
         */
        public java.lang.String[] getJtaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(JTA$6, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "jta" element
         */
        public java.lang.String getJtaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JTA$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "jta" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetJtaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(JTA$6, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "jta" element
         */
        public org.apache.xmlbeans.XmlString xgetJtaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JTA$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "jta" element
         */
        public int sizeOfJtaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(JTA$6);
            }
        }
        
        /**
         * Sets array of all "jta" element
         */
        public void setJtaArray(java.lang.String[] jtaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(jtaArray, JTA$6);
            }
        }
        
        /**
         * Sets ith "jta" element
         */
        public void setJtaArray(int i, java.lang.String jta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JTA$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(jta);
            }
        }
        
        /**
         * Sets (as xml) array of all "jta" element
         */
        public void xsetJtaArray(org.apache.xmlbeans.XmlString[]jtaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(jtaArray, JTA$6);
            }
        }
        
        /**
         * Sets (as xml) ith "jta" element
         */
        public void xsetJtaArray(int i, org.apache.xmlbeans.XmlString jta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JTA$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(jta);
            }
        }
        
        /**
         * Inserts the value as the ith "jta" element
         */
        public void insertJta(int i, java.lang.String jta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(JTA$6, i);
                target.setStringValue(jta);
            }
        }
        
        /**
         * Appends the value as the last "jta" element
         */
        public void addJta(java.lang.String jta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JTA$6);
                target.setStringValue(jta);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "jta" element
         */
        public org.apache.xmlbeans.XmlString insertNewJta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(JTA$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "jta" element
         */
        public org.apache.xmlbeans.XmlString addNewJta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JTA$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "jta" element
         */
        public void removeJta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(JTA$6, i);
            }
        }
        
        /**
         * Gets array of all "iso-jta" elements
         */
        public java.lang.String[] getIsoJtaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ISOJTA$8, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "iso-jta" element
         */
        public java.lang.String getIsoJtaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOJTA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "iso-jta" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetIsoJtaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ISOJTA$8, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "iso-jta" element
         */
        public org.apache.xmlbeans.XmlString xgetIsoJtaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISOJTA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "iso-jta" element
         */
        public int sizeOfIsoJtaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISOJTA$8);
            }
        }
        
        /**
         * Sets array of all "iso-jta" element
         */
        public void setIsoJtaArray(java.lang.String[] isoJtaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(isoJtaArray, ISOJTA$8);
            }
        }
        
        /**
         * Sets ith "iso-jta" element
         */
        public void setIsoJtaArray(int i, java.lang.String isoJta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOJTA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(isoJta);
            }
        }
        
        /**
         * Sets (as xml) array of all "iso-jta" element
         */
        public void xsetIsoJtaArray(org.apache.xmlbeans.XmlString[]isoJtaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(isoJtaArray, ISOJTA$8);
            }
        }
        
        /**
         * Sets (as xml) ith "iso-jta" element
         */
        public void xsetIsoJtaArray(int i, org.apache.xmlbeans.XmlString isoJta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISOJTA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(isoJta);
            }
        }
        
        /**
         * Inserts the value as the ith "iso-jta" element
         */
        public void insertIsoJta(int i, java.lang.String isoJta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ISOJTA$8, i);
                target.setStringValue(isoJta);
            }
        }
        
        /**
         * Appends the value as the last "iso-jta" element
         */
        public void addIsoJta(java.lang.String isoJta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISOJTA$8);
                target.setStringValue(isoJta);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "iso-jta" element
         */
        public org.apache.xmlbeans.XmlString insertNewIsoJta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ISOJTA$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "iso-jta" element
         */
        public org.apache.xmlbeans.XmlString addNewIsoJta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISOJTA$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "iso-jta" element
         */
        public void removeIsoJta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISOJTA$8, i);
            }
        }
        
        /**
         * Gets array of all "ml-jta" elements
         */
        public java.lang.String[] getMlJtaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MLJTA$10, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "ml-jta" element
         */
        public java.lang.String getMlJtaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MLJTA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "ml-jta" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetMlJtaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MLJTA$10, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "ml-jta" element
         */
        public org.apache.xmlbeans.XmlString xgetMlJtaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MLJTA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "ml-jta" element
         */
        public int sizeOfMlJtaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MLJTA$10);
            }
        }
        
        /**
         * Sets array of all "ml-jta" element
         */
        public void setMlJtaArray(java.lang.String[] mlJtaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(mlJtaArray, MLJTA$10);
            }
        }
        
        /**
         * Sets ith "ml-jta" element
         */
        public void setMlJtaArray(int i, java.lang.String mlJta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MLJTA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(mlJta);
            }
        }
        
        /**
         * Sets (as xml) array of all "ml-jta" element
         */
        public void xsetMlJtaArray(org.apache.xmlbeans.XmlString[]mlJtaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(mlJtaArray, MLJTA$10);
            }
        }
        
        /**
         * Sets (as xml) ith "ml-jta" element
         */
        public void xsetMlJtaArray(int i, org.apache.xmlbeans.XmlString mlJta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MLJTA$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(mlJta);
            }
        }
        
        /**
         * Inserts the value as the ith "ml-jta" element
         */
        public void insertMlJta(int i, java.lang.String mlJta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MLJTA$10, i);
                target.setStringValue(mlJta);
            }
        }
        
        /**
         * Appends the value as the last "ml-jta" element
         */
        public void addMlJta(java.lang.String mlJta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MLJTA$10);
                target.setStringValue(mlJta);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ml-jta" element
         */
        public org.apache.xmlbeans.XmlString insertNewMlJta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(MLJTA$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ml-jta" element
         */
        public org.apache.xmlbeans.XmlString addNewMlJta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MLJTA$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "ml-jta" element
         */
        public void removeMlJta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MLJTA$10, i);
            }
        }
        
        /**
         * Gets array of all "coden" elements
         */
        public java.lang.String[] getCodenArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CODEN$12, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "coden" element
         */
        public java.lang.String getCodenArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODEN$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "coden" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetCodenArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CODEN$12, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "coden" element
         */
        public org.apache.xmlbeans.XmlString xgetCodenArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODEN$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "coden" element
         */
        public int sizeOfCodenArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CODEN$12);
            }
        }
        
        /**
         * Sets array of all "coden" element
         */
        public void setCodenArray(java.lang.String[] codenArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(codenArray, CODEN$12);
            }
        }
        
        /**
         * Sets ith "coden" element
         */
        public void setCodenArray(int i, java.lang.String coden)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODEN$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(coden);
            }
        }
        
        /**
         * Sets (as xml) array of all "coden" element
         */
        public void xsetCodenArray(org.apache.xmlbeans.XmlString[]codenArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(codenArray, CODEN$12);
            }
        }
        
        /**
         * Sets (as xml) ith "coden" element
         */
        public void xsetCodenArray(int i, org.apache.xmlbeans.XmlString coden)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODEN$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(coden);
            }
        }
        
        /**
         * Inserts the value as the ith "coden" element
         */
        public void insertCoden(int i, java.lang.String coden)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CODEN$12, i);
                target.setStringValue(coden);
            }
        }
        
        /**
         * Appends the value as the last "coden" element
         */
        public void addCoden(java.lang.String coden)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODEN$12);
                target.setStringValue(coden);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "coden" element
         */
        public org.apache.xmlbeans.XmlString insertNewCoden(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CODEN$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "coden" element
         */
        public org.apache.xmlbeans.XmlString addNewCoden()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODEN$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "coden" element
         */
        public void removeCoden(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CODEN$12, i);
            }
        }
        
        /**
         * Gets array of all "issn" elements
         */
        public java.lang.String[] getIssnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ISSN$14, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "issn" element
         */
        public java.lang.String getIssnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSN$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "issn" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetIssnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ISSN$14, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "issn" element
         */
        public org.apache.xmlbeans.XmlString xgetIssnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSN$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "issn" element
         */
        public int sizeOfIssnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISSN$14);
            }
        }
        
        /**
         * Sets array of all "issn" element
         */
        public void setIssnArray(java.lang.String[] issnArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(issnArray, ISSN$14);
            }
        }
        
        /**
         * Sets ith "issn" element
         */
        public void setIssnArray(int i, java.lang.String issn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSN$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(issn);
            }
        }
        
        /**
         * Sets (as xml) array of all "issn" element
         */
        public void xsetIssnArray(org.apache.xmlbeans.XmlString[]issnArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(issnArray, ISSN$14);
            }
        }
        
        /**
         * Sets (as xml) ith "issn" element
         */
        public void xsetIssnArray(int i, org.apache.xmlbeans.XmlString issn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSN$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(issn);
            }
        }
        
        /**
         * Inserts the value as the ith "issn" element
         */
        public void insertIssn(int i, java.lang.String issn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ISSN$14, i);
                target.setStringValue(issn);
            }
        }
        
        /**
         * Appends the value as the last "issn" element
         */
        public void addIssn(java.lang.String issn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSN$14);
                target.setStringValue(issn);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "issn" element
         */
        public org.apache.xmlbeans.XmlString insertNewIssn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ISSN$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "issn" element
         */
        public org.apache.xmlbeans.XmlString addNewIssn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISSN$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "issn" element
         */
        public void removeIssn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISSN$14, i);
            }
        }
        
        /**
         * Gets array of all "abr" elements
         */
        public java.lang.String[] getAbrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ABR$16, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "abr" element
         */
        public java.lang.String getAbrArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABR$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "abr" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetAbrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ABR$16, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "abr" element
         */
        public org.apache.xmlbeans.XmlString xgetAbrArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABR$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "abr" element
         */
        public int sizeOfAbrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ABR$16);
            }
        }
        
        /**
         * Sets array of all "abr" element
         */
        public void setAbrArray(java.lang.String[] abrArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(abrArray, ABR$16);
            }
        }
        
        /**
         * Sets ith "abr" element
         */
        public void setAbrArray(int i, java.lang.String abr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABR$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(abr);
            }
        }
        
        /**
         * Sets (as xml) array of all "abr" element
         */
        public void xsetAbrArray(org.apache.xmlbeans.XmlString[]abrArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(abrArray, ABR$16);
            }
        }
        
        /**
         * Sets (as xml) ith "abr" element
         */
        public void xsetAbrArray(int i, org.apache.xmlbeans.XmlString abr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABR$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(abr);
            }
        }
        
        /**
         * Inserts the value as the ith "abr" element
         */
        public void insertAbr(int i, java.lang.String abr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ABR$16, i);
                target.setStringValue(abr);
            }
        }
        
        /**
         * Appends the value as the last "abr" element
         */
        public void addAbr(java.lang.String abr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABR$16);
                target.setStringValue(abr);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "abr" element
         */
        public org.apache.xmlbeans.XmlString insertNewAbr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ABR$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "abr" element
         */
        public org.apache.xmlbeans.XmlString addNewAbr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ABR$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "abr" element
         */
        public void removeAbr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ABR$16, i);
            }
        }
        
        /**
         * Gets array of all "isbn" elements
         */
        public java.lang.String[] getIsbnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ISBN$18, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "isbn" element
         */
        public java.lang.String getIsbnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBN$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "isbn" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetIsbnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ISBN$18, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "isbn" element
         */
        public org.apache.xmlbeans.XmlString xgetIsbnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISBN$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "isbn" element
         */
        public int sizeOfIsbnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISBN$18);
            }
        }
        
        /**
         * Sets array of all "isbn" element
         */
        public void setIsbnArray(java.lang.String[] isbnArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(isbnArray, ISBN$18);
            }
        }
        
        /**
         * Sets ith "isbn" element
         */
        public void setIsbnArray(int i, java.lang.String isbn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBN$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(isbn);
            }
        }
        
        /**
         * Sets (as xml) array of all "isbn" element
         */
        public void xsetIsbnArray(org.apache.xmlbeans.XmlString[]isbnArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(isbnArray, ISBN$18);
            }
        }
        
        /**
         * Sets (as xml) ith "isbn" element
         */
        public void xsetIsbnArray(int i, org.apache.xmlbeans.XmlString isbn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISBN$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(isbn);
            }
        }
        
        /**
         * Inserts the value as the ith "isbn" element
         */
        public void insertIsbn(int i, java.lang.String isbn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ISBN$18, i);
                target.setStringValue(isbn);
            }
        }
        
        /**
         * Appends the value as the last "isbn" element
         */
        public void addIsbn(java.lang.String isbn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISBN$18);
                target.setStringValue(isbn);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "isbn" element
         */
        public org.apache.xmlbeans.XmlString insertNewIsbn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ISBN$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "isbn" element
         */
        public org.apache.xmlbeans.XmlString addNewIsbn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISBN$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "isbn" element
         */
        public void removeIsbn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISBN$18, i);
            }
        }
    }
}
