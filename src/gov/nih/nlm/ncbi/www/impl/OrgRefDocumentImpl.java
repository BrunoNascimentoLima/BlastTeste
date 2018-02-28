/*
 * An XML document type.
 * Localname: Org-ref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.OrgRefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Org-ref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class OrgRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.OrgRefDocument
{
    
    public OrgRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGREF$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Org-ref");
    
    
    /**
     * Gets the "Org-ref" element
     */
    public gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef getOrgRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef target = null;
            target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef)get_store().find_element_user(ORGREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Org-ref" element
     */
    public void setOrgRef(gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef orgRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef target = null;
            target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef)get_store().find_element_user(ORGREF$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef)get_store().add_element_user(ORGREF$0);
            }
            target.set(orgRef);
        }
    }
    
    /**
     * Appends and returns a new empty "Org-ref" element
     */
    public gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef addNewOrgRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef target = null;
            target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef)get_store().add_element_user(ORGREF$0);
            return target;
        }
    }
    /**
     * An XML Org-ref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class OrgRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef
    {
        
        public OrgRefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TAXNAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "taxname");
        private static final javax.xml.namespace.QName COMMON$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "common");
        private static final javax.xml.namespace.QName MOD$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mod");
        private static final javax.xml.namespace.QName DB$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "db");
        private static final javax.xml.namespace.QName SYN$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "syn");
        private static final javax.xml.namespace.QName ORGNAME$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "orgname");
        
        
        /**
         * Gets the "taxname" element
         */
        public java.lang.String getTaxname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "taxname" element
         */
        public org.apache.xmlbeans.XmlString xgetTaxname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAXNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "taxname" element
         */
        public boolean isSetTaxname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TAXNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "taxname" element
         */
        public void setTaxname(java.lang.String taxname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXNAME$0);
                }
                target.setStringValue(taxname);
            }
        }
        
        /**
         * Sets (as xml) the "taxname" element
         */
        public void xsetTaxname(org.apache.xmlbeans.XmlString taxname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAXNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TAXNAME$0);
                }
                target.set(taxname);
            }
        }
        
        /**
         * Unsets the "taxname" element
         */
        public void unsetTaxname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TAXNAME$0, 0);
            }
        }
        
        /**
         * Gets the "common" element
         */
        public java.lang.String getCommon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMON$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "common" element
         */
        public org.apache.xmlbeans.XmlString xgetCommon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMON$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "common" element
         */
        public boolean isSetCommon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMON$2) != 0;
            }
        }
        
        /**
         * Sets the "common" element
         */
        public void setCommon(java.lang.String common)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMON$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMON$2);
                }
                target.setStringValue(common);
            }
        }
        
        /**
         * Sets (as xml) the "common" element
         */
        public void xsetCommon(org.apache.xmlbeans.XmlString common)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMON$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMON$2);
                }
                target.set(common);
            }
        }
        
        /**
         * Unsets the "common" element
         */
        public void unsetCommon()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMON$2, 0);
            }
        }
        
        /**
         * Gets array of all "mod" elements
         */
        public java.lang.String[] getModArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MOD$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "mod" element
         */
        public java.lang.String getModArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOD$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "mod" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetModArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MOD$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "mod" element
         */
        public org.apache.xmlbeans.XmlString xgetModArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOD$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "mod" element
         */
        public int sizeOfModArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MOD$4);
            }
        }
        
        /**
         * Sets array of all "mod" element
         */
        public void setModArray(java.lang.String[] modArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(modArray, MOD$4);
            }
        }
        
        /**
         * Sets ith "mod" element
         */
        public void setModArray(int i, java.lang.String mod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOD$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(mod);
            }
        }
        
        /**
         * Sets (as xml) array of all "mod" element
         */
        public void xsetModArray(org.apache.xmlbeans.XmlString[]modArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(modArray, MOD$4);
            }
        }
        
        /**
         * Sets (as xml) ith "mod" element
         */
        public void xsetModArray(int i, org.apache.xmlbeans.XmlString mod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOD$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(mod);
            }
        }
        
        /**
         * Inserts the value as the ith "mod" element
         */
        public void insertMod(int i, java.lang.String mod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MOD$4, i);
                target.setStringValue(mod);
            }
        }
        
        /**
         * Appends the value as the last "mod" element
         */
        public void addMod(java.lang.String mod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOD$4);
                target.setStringValue(mod);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "mod" element
         */
        public org.apache.xmlbeans.XmlString insertNewMod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(MOD$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "mod" element
         */
        public org.apache.xmlbeans.XmlString addNewMod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOD$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "mod" element
         */
        public void removeMod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MOD$4, i);
            }
        }
        
        /**
         * Gets the "db" element
         */
        public gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db getDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db target = null;
                target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db)get_store().find_element_user(DB$6, 0);
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
                return get_store().count_elements(DB$6) != 0;
            }
        }
        
        /**
         * Sets the "db" element
         */
        public void setDb(gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db db)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db target = null;
                target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db)get_store().find_element_user(DB$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db)get_store().add_element_user(DB$6);
                }
                target.set(db);
            }
        }
        
        /**
         * Appends and returns a new empty "db" element
         */
        public gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db addNewDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db target = null;
                target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db)get_store().add_element_user(DB$6);
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
                get_store().remove_element(DB$6, 0);
            }
        }
        
        /**
         * Gets array of all "syn" elements
         */
        public java.lang.String[] getSynArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SYN$8, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "syn" element
         */
        public java.lang.String getSynArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYN$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "syn" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetSynArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SYN$8, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "syn" element
         */
        public org.apache.xmlbeans.XmlString xgetSynArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYN$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "syn" element
         */
        public int sizeOfSynArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SYN$8);
            }
        }
        
        /**
         * Sets array of all "syn" element
         */
        public void setSynArray(java.lang.String[] synArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(synArray, SYN$8);
            }
        }
        
        /**
         * Sets ith "syn" element
         */
        public void setSynArray(int i, java.lang.String syn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYN$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(syn);
            }
        }
        
        /**
         * Sets (as xml) array of all "syn" element
         */
        public void xsetSynArray(org.apache.xmlbeans.XmlString[]synArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(synArray, SYN$8);
            }
        }
        
        /**
         * Sets (as xml) ith "syn" element
         */
        public void xsetSynArray(int i, org.apache.xmlbeans.XmlString syn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYN$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(syn);
            }
        }
        
        /**
         * Inserts the value as the ith "syn" element
         */
        public void insertSyn(int i, java.lang.String syn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SYN$8, i);
                target.setStringValue(syn);
            }
        }
        
        /**
         * Appends the value as the last "syn" element
         */
        public void addSyn(java.lang.String syn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYN$8);
                target.setStringValue(syn);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "syn" element
         */
        public org.apache.xmlbeans.XmlString insertNewSyn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SYN$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "syn" element
         */
        public org.apache.xmlbeans.XmlString addNewSyn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SYN$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "syn" element
         */
        public void removeSyn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SYN$8, i);
            }
        }
        
        /**
         * Gets the "orgname" element
         */
        public gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname getOrgname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname target = null;
                target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname)get_store().find_element_user(ORGNAME$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "orgname" element
         */
        public boolean isSetOrgname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGNAME$10) != 0;
            }
        }
        
        /**
         * Sets the "orgname" element
         */
        public void setOrgname(gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname orgname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname target = null;
                target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname)get_store().find_element_user(ORGNAME$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname)get_store().add_element_user(ORGNAME$10);
                }
                target.set(orgname);
            }
        }
        
        /**
         * Appends and returns a new empty "orgname" element
         */
        public gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname addNewOrgname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname target = null;
                target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname)get_store().add_element_user(ORGNAME$10);
                return target;
            }
        }
        
        /**
         * Unsets the "orgname" element
         */
        public void unsetOrgname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGNAME$10, 0);
            }
        }
        /**
         * An XML db(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DbImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Db
        {
            
            public DbImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML orgname(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class OrgnameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef.Orgname
        {
            
            public OrgnameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ORGNAME$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "OrgName");
            
            
            /**
             * Gets the "OrgName" element
             */
            public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName getOrgName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName)get_store().find_element_user(ORGNAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "OrgName" element
             */
            public void setOrgName(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName orgName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName)get_store().find_element_user(ORGNAME$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName)get_store().add_element_user(ORGNAME$0);
                    }
                    target.set(orgName);
                }
            }
            
            /**
             * Appends and returns a new empty "OrgName" element
             */
            public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName addNewOrgName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName)get_store().add_element_user(ORGNAME$0);
                    return target;
                }
            }
        }
    }
}
