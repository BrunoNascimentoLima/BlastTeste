/*
 * An XML document type.
 * Localname: SP-block
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SPBlockDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one SP-block(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SPBlockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SPBlockDocument
{
    
    public SPBlockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPBLOCK$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SP-block");
    
    
    /**
     * Gets the "SP-block" element
     */
    public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock getSPBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock target = null;
            target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock)get_store().find_element_user(SPBLOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SP-block" element
     */
    public void setSPBlock(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock spBlock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock target = null;
            target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock)get_store().find_element_user(SPBLOCK$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock)get_store().add_element_user(SPBLOCK$0);
            }
            target.set(spBlock);
        }
    }
    
    /**
     * Appends and returns a new empty "SP-block" element
     */
    public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock addNewSPBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock target = null;
            target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock)get_store().add_element_user(SPBLOCK$0);
            return target;
        }
    }
    /**
     * An XML SP-block(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SPBlockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock
    {
        
        public SPBlockImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLASS1$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "class");
        private static final javax.xml.namespace.QName EXTRAACC$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "extra-acc");
        private static final javax.xml.namespace.QName IMETH$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "imeth");
        private static final javax.xml.namespace.QName PLASNM$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "plasnm");
        private static final javax.xml.namespace.QName SEQREF$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seqref");
        private static final javax.xml.namespace.QName DBREF$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "dbref");
        private static final javax.xml.namespace.QName KEYWORDS$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "keywords");
        private static final javax.xml.namespace.QName CREATED$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "created");
        private static final javax.xml.namespace.QName SEQUPD$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "sequpd");
        private static final javax.xml.namespace.QName ANNOTUPD$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "annotupd");
        
        
        /**
         * Gets the "class" element
         */
        public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class)get_store().find_element_user(CLASS1$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "class" element
         */
        public void setClass1(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class)get_store().find_element_user(CLASS1$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class)get_store().add_element_user(CLASS1$0);
                }
                target.set(class1);
            }
        }
        
        /**
         * Appends and returns a new empty "class" element
         */
        public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class addNewClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class)get_store().add_element_user(CLASS1$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "extra-acc" elements
         */
        public java.lang.String[] getExtraAccArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXTRAACC$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "extra-acc" element
         */
        public java.lang.String getExtraAccArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAACC$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "extra-acc" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetExtraAccArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXTRAACC$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "extra-acc" element
         */
        public org.apache.xmlbeans.XmlString xgetExtraAccArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAACC$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "extra-acc" element
         */
        public int sizeOfExtraAccArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTRAACC$2);
            }
        }
        
        /**
         * Sets array of all "extra-acc" element
         */
        public void setExtraAccArray(java.lang.String[] extraAccArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extraAccArray, EXTRAACC$2);
            }
        }
        
        /**
         * Sets ith "extra-acc" element
         */
        public void setExtraAccArray(int i, java.lang.String extraAcc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRAACC$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(extraAcc);
            }
        }
        
        /**
         * Sets (as xml) array of all "extra-acc" element
         */
        public void xsetExtraAccArray(org.apache.xmlbeans.XmlString[]extraAccArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extraAccArray, EXTRAACC$2);
            }
        }
        
        /**
         * Sets (as xml) ith "extra-acc" element
         */
        public void xsetExtraAccArray(int i, org.apache.xmlbeans.XmlString extraAcc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTRAACC$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(extraAcc);
            }
        }
        
        /**
         * Inserts the value as the ith "extra-acc" element
         */
        public void insertExtraAcc(int i, java.lang.String extraAcc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EXTRAACC$2, i);
                target.setStringValue(extraAcc);
            }
        }
        
        /**
         * Appends the value as the last "extra-acc" element
         */
        public void addExtraAcc(java.lang.String extraAcc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRAACC$2);
                target.setStringValue(extraAcc);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extra-acc" element
         */
        public org.apache.xmlbeans.XmlString insertNewExtraAcc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(EXTRAACC$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extra-acc" element
         */
        public org.apache.xmlbeans.XmlString addNewExtraAcc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTRAACC$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "extra-acc" element
         */
        public void removeExtraAcc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTRAACC$2, i);
            }
        }
        
        /**
         * Gets the "imeth" element
         */
        public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth getImeth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth)get_store().find_element_user(IMETH$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "imeth" element
         */
        public boolean isSetImeth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMETH$4) != 0;
            }
        }
        
        /**
         * Sets the "imeth" element
         */
        public void setImeth(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth imeth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth)get_store().find_element_user(IMETH$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth)get_store().add_element_user(IMETH$4);
                }
                target.set(imeth);
            }
        }
        
        /**
         * Appends and returns a new empty "imeth" element
         */
        public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth addNewImeth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth)get_store().add_element_user(IMETH$4);
                return target;
            }
        }
        
        /**
         * Unsets the "imeth" element
         */
        public void unsetImeth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMETH$4, 0);
            }
        }
        
        /**
         * Gets array of all "plasnm" elements
         */
        public java.lang.String[] getPlasnmArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PLASNM$6, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "plasnm" element
         */
        public java.lang.String getPlasnmArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLASNM$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "plasnm" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetPlasnmArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PLASNM$6, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "plasnm" element
         */
        public org.apache.xmlbeans.XmlString xgetPlasnmArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLASNM$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "plasnm" element
         */
        public int sizeOfPlasnmArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PLASNM$6);
            }
        }
        
        /**
         * Sets array of all "plasnm" element
         */
        public void setPlasnmArray(java.lang.String[] plasnmArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(plasnmArray, PLASNM$6);
            }
        }
        
        /**
         * Sets ith "plasnm" element
         */
        public void setPlasnmArray(int i, java.lang.String plasnm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLASNM$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(plasnm);
            }
        }
        
        /**
         * Sets (as xml) array of all "plasnm" element
         */
        public void xsetPlasnmArray(org.apache.xmlbeans.XmlString[]plasnmArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(plasnmArray, PLASNM$6);
            }
        }
        
        /**
         * Sets (as xml) ith "plasnm" element
         */
        public void xsetPlasnmArray(int i, org.apache.xmlbeans.XmlString plasnm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLASNM$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(plasnm);
            }
        }
        
        /**
         * Inserts the value as the ith "plasnm" element
         */
        public void insertPlasnm(int i, java.lang.String plasnm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PLASNM$6, i);
                target.setStringValue(plasnm);
            }
        }
        
        /**
         * Appends the value as the last "plasnm" element
         */
        public void addPlasnm(java.lang.String plasnm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLASNM$6);
                target.setStringValue(plasnm);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "plasnm" element
         */
        public org.apache.xmlbeans.XmlString insertNewPlasnm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PLASNM$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "plasnm" element
         */
        public org.apache.xmlbeans.XmlString addNewPlasnm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLASNM$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "plasnm" element
         */
        public void removePlasnm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PLASNM$6, i);
            }
        }
        
        /**
         * Gets the "seqref" element
         */
        public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref getSeqref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref)get_store().find_element_user(SEQREF$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seqref" element
         */
        public boolean isSetSeqref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQREF$8) != 0;
            }
        }
        
        /**
         * Sets the "seqref" element
         */
        public void setSeqref(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref seqref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref)get_store().find_element_user(SEQREF$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref)get_store().add_element_user(SEQREF$8);
                }
                target.set(seqref);
            }
        }
        
        /**
         * Appends and returns a new empty "seqref" element
         */
        public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref addNewSeqref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref)get_store().add_element_user(SEQREF$8);
                return target;
            }
        }
        
        /**
         * Unsets the "seqref" element
         */
        public void unsetSeqref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQREF$8, 0);
            }
        }
        
        /**
         * Gets the "dbref" element
         */
        public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref getDbref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref)get_store().find_element_user(DBREF$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dbref" element
         */
        public boolean isSetDbref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DBREF$10) != 0;
            }
        }
        
        /**
         * Sets the "dbref" element
         */
        public void setDbref(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref dbref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref)get_store().find_element_user(DBREF$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref)get_store().add_element_user(DBREF$10);
                }
                target.set(dbref);
            }
        }
        
        /**
         * Appends and returns a new empty "dbref" element
         */
        public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref addNewDbref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref)get_store().add_element_user(DBREF$10);
                return target;
            }
        }
        
        /**
         * Unsets the "dbref" element
         */
        public void unsetDbref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DBREF$10, 0);
            }
        }
        
        /**
         * Gets array of all "keywords" elements
         */
        public java.lang.String[] getKeywordsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYWORDS$12, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "keywords" element
         */
        public java.lang.String getKeywordsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "keywords" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetKeywordsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYWORDS$12, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "keywords" element
         */
        public org.apache.xmlbeans.XmlString xgetKeywordsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDS$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "keywords" element
         */
        public int sizeOfKeywordsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYWORDS$12);
            }
        }
        
        /**
         * Sets array of all "keywords" element
         */
        public void setKeywordsArray(java.lang.String[] keywordsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(keywordsArray, KEYWORDS$12);
            }
        }
        
        /**
         * Sets ith "keywords" element
         */
        public void setKeywordsArray(int i, java.lang.String keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(keywords);
            }
        }
        
        /**
         * Sets (as xml) array of all "keywords" element
         */
        public void xsetKeywordsArray(org.apache.xmlbeans.XmlString[]keywordsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(keywordsArray, KEYWORDS$12);
            }
        }
        
        /**
         * Sets (as xml) ith "keywords" element
         */
        public void xsetKeywordsArray(int i, org.apache.xmlbeans.XmlString keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDS$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(keywords);
            }
        }
        
        /**
         * Inserts the value as the ith "keywords" element
         */
        public void insertKeywords(int i, java.lang.String keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(KEYWORDS$12, i);
                target.setStringValue(keywords);
            }
        }
        
        /**
         * Appends the value as the last "keywords" element
         */
        public void addKeywords(java.lang.String keywords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORDS$12);
                target.setStringValue(keywords);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "keywords" element
         */
        public org.apache.xmlbeans.XmlString insertNewKeywords(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(KEYWORDS$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "keywords" element
         */
        public org.apache.xmlbeans.XmlString addNewKeywords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYWORDS$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "keywords" element
         */
        public void removeKeywords(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYWORDS$12, i);
            }
        }
        
        /**
         * Gets the "created" element
         */
        public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created getCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created)get_store().find_element_user(CREATED$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "created" element
         */
        public boolean isSetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATED$14) != 0;
            }
        }
        
        /**
         * Sets the "created" element
         */
        public void setCreated(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created)get_store().find_element_user(CREATED$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created)get_store().add_element_user(CREATED$14);
                }
                target.set(created);
            }
        }
        
        /**
         * Appends and returns a new empty "created" element
         */
        public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created addNewCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created)get_store().add_element_user(CREATED$14);
                return target;
            }
        }
        
        /**
         * Unsets the "created" element
         */
        public void unsetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATED$14, 0);
            }
        }
        
        /**
         * Gets the "sequpd" element
         */
        public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd getSequpd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd)get_store().find_element_user(SEQUPD$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "sequpd" element
         */
        public boolean isSetSequpd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQUPD$16) != 0;
            }
        }
        
        /**
         * Sets the "sequpd" element
         */
        public void setSequpd(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd sequpd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd)get_store().find_element_user(SEQUPD$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd)get_store().add_element_user(SEQUPD$16);
                }
                target.set(sequpd);
            }
        }
        
        /**
         * Appends and returns a new empty "sequpd" element
         */
        public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd addNewSequpd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd)get_store().add_element_user(SEQUPD$16);
                return target;
            }
        }
        
        /**
         * Unsets the "sequpd" element
         */
        public void unsetSequpd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQUPD$16, 0);
            }
        }
        
        /**
         * Gets the "annotupd" element
         */
        public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd getAnnotupd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd)get_store().find_element_user(ANNOTUPD$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "annotupd" element
         */
        public boolean isSetAnnotupd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ANNOTUPD$18) != 0;
            }
        }
        
        /**
         * Sets the "annotupd" element
         */
        public void setAnnotupd(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd annotupd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd)get_store().find_element_user(ANNOTUPD$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd)get_store().add_element_user(ANNOTUPD$18);
                }
                target.set(annotupd);
            }
        }
        
        /**
         * Appends and returns a new empty "annotupd" element
         */
        public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd addNewAnnotupd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd target = null;
                target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd)get_store().add_element_user(ANNOTUPD$18);
                return target;
            }
        }
        
        /**
         * Unsets the "annotupd" element
         */
        public void unsetAnnotupd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ANNOTUPD$18, 0);
            }
        }
        /**
         * An XML class(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ClassImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class
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
            public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SPBlockDocument$SPBlock$Class$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Class.Value
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
         * An XML imeth(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ImethImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth
        {
            
            public ImethImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SPBlockDocument$SPBlock$Imeth$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Imeth.Value
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
         * An XML seqref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Seqref
        {
            
            public SeqrefImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML dbref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DbrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Dbref
        {
            
            public DbrefImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DBTAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
            
            
            /**
             * Gets array of all "Dbtag" elements
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] getDbtagArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DBTAG$0, targetList);
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] result = new gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtagArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Dbtag" element
             */
            public int sizeOfDbtagArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DBTAG$0);
                }
            }
            
            /**
             * Sets array of all "Dbtag" element
             */
            public void setDbtagArray(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] dbtagArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(dbtagArray, DBTAG$0);
                }
            }
            
            /**
             * Sets ith "Dbtag" element
             */
            public void setDbtagArray(int i, gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(dbtag);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag insertNewDbtag(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().insert_element_user(DBTAG$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Dbtag" element
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
            
            /**
             * Removes the ith "Dbtag" element
             */
            public void removeDbtag(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DBTAG$0, i);
                }
            }
        }
        /**
         * An XML created(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CreatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Created
        {
            
            public CreatedImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML sequpd(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SequpdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Sequpd
        {
            
            public SequpdImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML annotupd(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AnnotupdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock.Annotupd
        {
            
            public AnnotupdImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
