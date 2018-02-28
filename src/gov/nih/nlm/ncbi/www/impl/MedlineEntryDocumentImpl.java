/*
 * An XML document type.
 * Localname: Medline-entry
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.MedlineEntryDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Medline-entry(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class MedlineEntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineEntryDocument
{
    
    public MedlineEntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDLINEENTRY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Medline-entry");
    
    
    /**
     * Gets the "Medline-entry" element
     */
    public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry getMedlineEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry)get_store().find_element_user(MEDLINEENTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Medline-entry" element
     */
    public void setMedlineEntry(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry medlineEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry)get_store().find_element_user(MEDLINEENTRY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry)get_store().add_element_user(MEDLINEENTRY$0);
            }
            target.set(medlineEntry);
        }
    }
    
    /**
     * Appends and returns a new empty "Medline-entry" element
     */
    public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry addNewMedlineEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry)get_store().add_element_user(MEDLINEENTRY$0);
            return target;
        }
    }
    /**
     * An XML Medline-entry(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class MedlineEntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry
    {
        
        public MedlineEntryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UID$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "uid");
        private static final javax.xml.namespace.QName EM$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "em");
        private static final javax.xml.namespace.QName CIT$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "cit");
        private static final javax.xml.namespace.QName ABSTRACT$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "abstract");
        private static final javax.xml.namespace.QName MESH$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mesh");
        private static final javax.xml.namespace.QName SUBSTANCE$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "substance");
        private static final javax.xml.namespace.QName XREF$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "xref");
        private static final javax.xml.namespace.QName IDNUM$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "idnum");
        private static final javax.xml.namespace.QName GENE$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gene");
        private static final javax.xml.namespace.QName PMID$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pmid");
        private static final javax.xml.namespace.QName PUBTYPE$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pub-type");
        private static final javax.xml.namespace.QName MLFIELD$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mlfield");
        private static final javax.xml.namespace.QName STATUS$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "status");
        
        
        /**
         * Gets the "uid" element
         */
        public java.math.BigInteger getUid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "uid" element
         */
        public org.apache.xmlbeans.XmlInteger xgetUid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(UID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "uid" element
         */
        public boolean isSetUid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UID$0) != 0;
            }
        }
        
        /**
         * Sets the "uid" element
         */
        public void setUid(java.math.BigInteger uid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UID$0);
                }
                target.setBigIntegerValue(uid);
            }
        }
        
        /**
         * Sets (as xml) the "uid" element
         */
        public void xsetUid(org.apache.xmlbeans.XmlInteger uid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(UID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(UID$0);
                }
                target.set(uid);
            }
        }
        
        /**
         * Unsets the "uid" element
         */
        public void unsetUid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UID$0, 0);
            }
        }
        
        /**
         * Gets the "em" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em getEm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em)get_store().find_element_user(EM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "em" element
         */
        public void setEm(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em em)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em)get_store().find_element_user(EM$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em)get_store().add_element_user(EM$2);
                }
                target.set(em);
            }
        }
        
        /**
         * Appends and returns a new empty "em" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em addNewEm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em)get_store().add_element_user(EM$2);
                return target;
            }
        }
        
        /**
         * Gets the "cit" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit getCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit)get_store().find_element_user(CIT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "cit" element
         */
        public void setCit(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit cit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit)get_store().find_element_user(CIT$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit)get_store().add_element_user(CIT$4);
                }
                target.set(cit);
            }
        }
        
        /**
         * Appends and returns a new empty "cit" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit addNewCit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit)get_store().add_element_user(CIT$4);
                return target;
            }
        }
        
        /**
         * Gets the "abstract" element
         */
        public java.lang.String getAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABSTRACT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "abstract" element
         */
        public org.apache.xmlbeans.XmlString xgetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABSTRACT$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "abstract" element
         */
        public boolean isSetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ABSTRACT$6) != 0;
            }
        }
        
        /**
         * Sets the "abstract" element
         */
        public void setAbstract(java.lang.String xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABSTRACT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABSTRACT$6);
                }
                target.setStringValue(xabstract);
            }
        }
        
        /**
         * Sets (as xml) the "abstract" element
         */
        public void xsetAbstract(org.apache.xmlbeans.XmlString xabstract)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABSTRACT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ABSTRACT$6);
                }
                target.set(xabstract);
            }
        }
        
        /**
         * Unsets the "abstract" element
         */
        public void unsetAbstract()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ABSTRACT$6, 0);
            }
        }
        
        /**
         * Gets the "mesh" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh getMesh()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh)get_store().find_element_user(MESH$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "mesh" element
         */
        public boolean isSetMesh()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MESH$8) != 0;
            }
        }
        
        /**
         * Sets the "mesh" element
         */
        public void setMesh(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh mesh)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh)get_store().find_element_user(MESH$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh)get_store().add_element_user(MESH$8);
                }
                target.set(mesh);
            }
        }
        
        /**
         * Appends and returns a new empty "mesh" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh addNewMesh()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh)get_store().add_element_user(MESH$8);
                return target;
            }
        }
        
        /**
         * Unsets the "mesh" element
         */
        public void unsetMesh()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MESH$8, 0);
            }
        }
        
        /**
         * Gets the "substance" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance getSubstance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance)get_store().find_element_user(SUBSTANCE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "substance" element
         */
        public boolean isSetSubstance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBSTANCE$10) != 0;
            }
        }
        
        /**
         * Sets the "substance" element
         */
        public void setSubstance(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance substance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance)get_store().find_element_user(SUBSTANCE$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance)get_store().add_element_user(SUBSTANCE$10);
                }
                target.set(substance);
            }
        }
        
        /**
         * Appends and returns a new empty "substance" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance addNewSubstance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance)get_store().add_element_user(SUBSTANCE$10);
                return target;
            }
        }
        
        /**
         * Unsets the "substance" element
         */
        public void unsetSubstance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBSTANCE$10, 0);
            }
        }
        
        /**
         * Gets the "xref" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref getXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref)get_store().find_element_user(XREF$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "xref" element
         */
        public boolean isSetXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(XREF$12) != 0;
            }
        }
        
        /**
         * Sets the "xref" element
         */
        public void setXref(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref xref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref)get_store().find_element_user(XREF$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref)get_store().add_element_user(XREF$12);
                }
                target.set(xref);
            }
        }
        
        /**
         * Appends and returns a new empty "xref" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref addNewXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref)get_store().add_element_user(XREF$12);
                return target;
            }
        }
        
        /**
         * Unsets the "xref" element
         */
        public void unsetXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(XREF$12, 0);
            }
        }
        
        /**
         * Gets array of all "idnum" elements
         */
        public java.lang.String[] getIdnumArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDNUM$14, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "idnum" element
         */
        public java.lang.String getIdnumArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDNUM$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "idnum" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetIdnumArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDNUM$14, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "idnum" element
         */
        public org.apache.xmlbeans.XmlString xgetIdnumArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDNUM$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "idnum" element
         */
        public int sizeOfIdnumArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDNUM$14);
            }
        }
        
        /**
         * Sets array of all "idnum" element
         */
        public void setIdnumArray(java.lang.String[] idnumArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(idnumArray, IDNUM$14);
            }
        }
        
        /**
         * Sets ith "idnum" element
         */
        public void setIdnumArray(int i, java.lang.String idnum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDNUM$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(idnum);
            }
        }
        
        /**
         * Sets (as xml) array of all "idnum" element
         */
        public void xsetIdnumArray(org.apache.xmlbeans.XmlString[]idnumArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(idnumArray, IDNUM$14);
            }
        }
        
        /**
         * Sets (as xml) ith "idnum" element
         */
        public void xsetIdnumArray(int i, org.apache.xmlbeans.XmlString idnum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDNUM$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(idnum);
            }
        }
        
        /**
         * Inserts the value as the ith "idnum" element
         */
        public void insertIdnum(int i, java.lang.String idnum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IDNUM$14, i);
                target.setStringValue(idnum);
            }
        }
        
        /**
         * Appends the value as the last "idnum" element
         */
        public void addIdnum(java.lang.String idnum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDNUM$14);
                target.setStringValue(idnum);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "idnum" element
         */
        public org.apache.xmlbeans.XmlString insertNewIdnum(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(IDNUM$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "idnum" element
         */
        public org.apache.xmlbeans.XmlString addNewIdnum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDNUM$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "idnum" element
         */
        public void removeIdnum(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDNUM$14, i);
            }
        }
        
        /**
         * Gets array of all "gene" elements
         */
        public java.lang.String[] getGeneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GENE$16, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "gene" element
         */
        public java.lang.String getGeneArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENE$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "gene" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetGeneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GENE$16, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "gene" element
         */
        public org.apache.xmlbeans.XmlString xgetGeneArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENE$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "gene" element
         */
        public int sizeOfGeneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENE$16);
            }
        }
        
        /**
         * Sets array of all "gene" element
         */
        public void setGeneArray(java.lang.String[] geneArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(geneArray, GENE$16);
            }
        }
        
        /**
         * Sets ith "gene" element
         */
        public void setGeneArray(int i, java.lang.String gene)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENE$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(gene);
            }
        }
        
        /**
         * Sets (as xml) array of all "gene" element
         */
        public void xsetGeneArray(org.apache.xmlbeans.XmlString[]geneArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(geneArray, GENE$16);
            }
        }
        
        /**
         * Sets (as xml) ith "gene" element
         */
        public void xsetGeneArray(int i, org.apache.xmlbeans.XmlString gene)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENE$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(gene);
            }
        }
        
        /**
         * Inserts the value as the ith "gene" element
         */
        public void insertGene(int i, java.lang.String gene)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(GENE$16, i);
                target.setStringValue(gene);
            }
        }
        
        /**
         * Appends the value as the last "gene" element
         */
        public void addGene(java.lang.String gene)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENE$16);
                target.setStringValue(gene);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "gene" element
         */
        public org.apache.xmlbeans.XmlString insertNewGene(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(GENE$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "gene" element
         */
        public org.apache.xmlbeans.XmlString addNewGene()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENE$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "gene" element
         */
        public void removeGene(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENE$16, i);
            }
        }
        
        /**
         * Gets the "pmid" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid getPmid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid)get_store().find_element_user(PMID$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pmid" element
         */
        public boolean isSetPmid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PMID$18) != 0;
            }
        }
        
        /**
         * Sets the "pmid" element
         */
        public void setPmid(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid pmid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid)get_store().find_element_user(PMID$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid)get_store().add_element_user(PMID$18);
                }
                target.set(pmid);
            }
        }
        
        /**
         * Appends and returns a new empty "pmid" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid addNewPmid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid)get_store().add_element_user(PMID$18);
                return target;
            }
        }
        
        /**
         * Unsets the "pmid" element
         */
        public void unsetPmid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PMID$18, 0);
            }
        }
        
        /**
         * Gets array of all "pub-type" elements
         */
        public java.lang.String[] getPubTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PUBTYPE$20, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "pub-type" element
         */
        public java.lang.String getPubTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBTYPE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "pub-type" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetPubTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PUBTYPE$20, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "pub-type" element
         */
        public org.apache.xmlbeans.XmlString xgetPubTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBTYPE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "pub-type" element
         */
        public int sizeOfPubTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUBTYPE$20);
            }
        }
        
        /**
         * Sets array of all "pub-type" element
         */
        public void setPubTypeArray(java.lang.String[] pubTypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pubTypeArray, PUBTYPE$20);
            }
        }
        
        /**
         * Sets ith "pub-type" element
         */
        public void setPubTypeArray(int i, java.lang.String pubType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBTYPE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(pubType);
            }
        }
        
        /**
         * Sets (as xml) array of all "pub-type" element
         */
        public void xsetPubTypeArray(org.apache.xmlbeans.XmlString[]pubTypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pubTypeArray, PUBTYPE$20);
            }
        }
        
        /**
         * Sets (as xml) ith "pub-type" element
         */
        public void xsetPubTypeArray(int i, org.apache.xmlbeans.XmlString pubType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBTYPE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pubType);
            }
        }
        
        /**
         * Inserts the value as the ith "pub-type" element
         */
        public void insertPubType(int i, java.lang.String pubType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PUBTYPE$20, i);
                target.setStringValue(pubType);
            }
        }
        
        /**
         * Appends the value as the last "pub-type" element
         */
        public void addPubType(java.lang.String pubType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBTYPE$20);
                target.setStringValue(pubType);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pub-type" element
         */
        public org.apache.xmlbeans.XmlString insertNewPubType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PUBTYPE$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pub-type" element
         */
        public org.apache.xmlbeans.XmlString addNewPubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBTYPE$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "pub-type" element
         */
        public void removePubType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUBTYPE$20, i);
            }
        }
        
        /**
         * Gets the "mlfield" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield getMlfield()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield)get_store().find_element_user(MLFIELD$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "mlfield" element
         */
        public boolean isSetMlfield()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MLFIELD$22) != 0;
            }
        }
        
        /**
         * Sets the "mlfield" element
         */
        public void setMlfield(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield mlfield)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield)get_store().find_element_user(MLFIELD$22, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield)get_store().add_element_user(MLFIELD$22);
                }
                target.set(mlfield);
            }
        }
        
        /**
         * Appends and returns a new empty "mlfield" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield addNewMlfield()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield)get_store().add_element_user(MLFIELD$22);
                return target;
            }
        }
        
        /**
         * Unsets the "mlfield" element
         */
        public void unsetMlfield()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MLFIELD$22, 0);
            }
        }
        
        /**
         * Gets the "status" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status)get_store().find_element_user(STATUS$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "status" element
         */
        public boolean isSetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUS$24) != 0;
            }
        }
        
        /**
         * Sets the "status" element
         */
        public void setStatus(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status)get_store().find_element_user(STATUS$24, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status)get_store().add_element_user(STATUS$24);
                }
                target.set(status);
            }
        }
        
        /**
         * Appends and returns a new empty "status" element
         */
        public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status addNewStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status)get_store().add_element_user(STATUS$24);
                return target;
            }
        }
        
        /**
         * Unsets the "status" element
         */
        public void unsetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUS$24, 0);
            }
        }
        /**
         * An XML em(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class EmImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Em
        {
            
            public EmImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML cit(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Cit
        {
            
            public CitImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CITART$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-art");
            
            
            /**
             * Gets the "Cit-art" element
             */
            public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt getCitArt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt)get_store().find_element_user(CITART$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Cit-art" element
             */
            public void setCitArt(gov.nih.nlm.ncbi.www.CitArtDocument.CitArt citArt)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt)get_store().find_element_user(CITART$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt)get_store().add_element_user(CITART$0);
                    }
                    target.set(citArt);
                }
            }
            
            /**
             * Appends and returns a new empty "Cit-art" element
             */
            public gov.nih.nlm.ncbi.www.CitArtDocument.CitArt addNewCitArt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CitArtDocument.CitArt target = null;
                    target = (gov.nih.nlm.ncbi.www.CitArtDocument.CitArt)get_store().add_element_user(CITART$0);
                    return target;
                }
            }
        }
        /**
         * An XML mesh(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MeshImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mesh
        {
            
            public MeshImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MEDLINEMESH$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Medline-mesh");
            
            
            /**
             * Gets array of all "Medline-mesh" elements
             */
            public gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh[] getMedlineMeshArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MEDLINEMESH$0, targetList);
                    gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh[] result = new gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Medline-mesh" element
             */
            public gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh getMedlineMeshArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh)get_store().find_element_user(MEDLINEMESH$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Medline-mesh" element
             */
            public int sizeOfMedlineMeshArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MEDLINEMESH$0);
                }
            }
            
            /**
             * Sets array of all "Medline-mesh" element
             */
            public void setMedlineMeshArray(gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh[] medlineMeshArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(medlineMeshArray, MEDLINEMESH$0);
                }
            }
            
            /**
             * Sets ith "Medline-mesh" element
             */
            public void setMedlineMeshArray(int i, gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh medlineMesh)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh)get_store().find_element_user(MEDLINEMESH$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(medlineMesh);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Medline-mesh" element
             */
            public gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh insertNewMedlineMesh(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh)get_store().insert_element_user(MEDLINEMESH$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Medline-mesh" element
             */
            public gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh addNewMedlineMesh()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh)get_store().add_element_user(MEDLINEMESH$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Medline-mesh" element
             */
            public void removeMedlineMesh(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MEDLINEMESH$0, i);
                }
            }
        }
        /**
         * An XML substance(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SubstanceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Substance
        {
            
            public SubstanceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MEDLINERN$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Medline-rn");
            
            
            /**
             * Gets array of all "Medline-rn" elements
             */
            public gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn[] getMedlineRnArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MEDLINERN$0, targetList);
                    gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn[] result = new gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Medline-rn" element
             */
            public gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn getMedlineRnArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn)get_store().find_element_user(MEDLINERN$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Medline-rn" element
             */
            public int sizeOfMedlineRnArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MEDLINERN$0);
                }
            }
            
            /**
             * Sets array of all "Medline-rn" element
             */
            public void setMedlineRnArray(gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn[] medlineRnArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(medlineRnArray, MEDLINERN$0);
                }
            }
            
            /**
             * Sets ith "Medline-rn" element
             */
            public void setMedlineRnArray(int i, gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn medlineRn)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn)get_store().find_element_user(MEDLINERN$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(medlineRn);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Medline-rn" element
             */
            public gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn insertNewMedlineRn(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn)get_store().insert_element_user(MEDLINERN$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Medline-rn" element
             */
            public gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn addNewMedlineRn()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineRnDocument.MedlineRn)get_store().add_element_user(MEDLINERN$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Medline-rn" element
             */
            public void removeMedlineRn(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MEDLINERN$0, i);
                }
            }
        }
        /**
         * An XML xref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class XrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Xref
        {
            
            public XrefImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MEDLINESI$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Medline-si");
            
            
            /**
             * Gets array of all "Medline-si" elements
             */
            public gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi[] getMedlineSiArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MEDLINESI$0, targetList);
                    gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi[] result = new gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Medline-si" element
             */
            public gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi getMedlineSiArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi)get_store().find_element_user(MEDLINESI$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Medline-si" element
             */
            public int sizeOfMedlineSiArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MEDLINESI$0);
                }
            }
            
            /**
             * Sets array of all "Medline-si" element
             */
            public void setMedlineSiArray(gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi[] medlineSiArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(medlineSiArray, MEDLINESI$0);
                }
            }
            
            /**
             * Sets ith "Medline-si" element
             */
            public void setMedlineSiArray(int i, gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi medlineSi)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi)get_store().find_element_user(MEDLINESI$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(medlineSi);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Medline-si" element
             */
            public gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi insertNewMedlineSi(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi)get_store().insert_element_user(MEDLINESI$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Medline-si" element
             */
            public gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi addNewMedlineSi()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineSiDocument.MedlineSi)get_store().add_element_user(MEDLINESI$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Medline-si" element
             */
            public void removeMedlineSi(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MEDLINESI$0, i);
                }
            }
        }
        /**
         * An XML pmid(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PmidImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Pmid
        {
            
            public PmidImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBMEDID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PubMedId");
            
            
            /**
             * Gets the "PubMedId" element
             */
            public java.math.BigInteger getPubMedId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBMEDID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "PubMedId" element
             */
            public org.apache.xmlbeans.XmlInteger xgetPubMedId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PUBMEDID$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "PubMedId" element
             */
            public void setPubMedId(java.math.BigInteger pubMedId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBMEDID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBMEDID$0);
                    }
                    target.setBigIntegerValue(pubMedId);
                }
            }
            
            /**
             * Sets (as xml) the "PubMedId" element
             */
            public void xsetPubMedId(org.apache.xmlbeans.XmlInteger pubMedId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PUBMEDID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PUBMEDID$0);
                    }
                    target.set(pubMedId);
                }
            }
        }
        /**
         * An XML mlfield(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MlfieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Mlfield
        {
            
            public MlfieldImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MEDLINEFIELD$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Medline-field");
            
            
            /**
             * Gets array of all "Medline-field" elements
             */
            public gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField[] getMedlineFieldArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MEDLINEFIELD$0, targetList);
                    gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField[] result = new gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Medline-field" element
             */
            public gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField getMedlineFieldArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField)get_store().find_element_user(MEDLINEFIELD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Medline-field" element
             */
            public int sizeOfMedlineFieldArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MEDLINEFIELD$0);
                }
            }
            
            /**
             * Sets array of all "Medline-field" element
             */
            public void setMedlineFieldArray(gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField[] medlineFieldArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(medlineFieldArray, MEDLINEFIELD$0);
                }
            }
            
            /**
             * Sets ith "Medline-field" element
             */
            public void setMedlineFieldArray(int i, gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField medlineField)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField)get_store().find_element_user(MEDLINEFIELD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(medlineField);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Medline-field" element
             */
            public gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField insertNewMedlineField(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField)get_store().insert_element_user(MEDLINEFIELD$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Medline-field" element
             */
            public gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField addNewMedlineField()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineFieldDocument.MedlineField)get_store().add_element_user(MEDLINEFIELD$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Medline-field" element
             */
            public void removeMedlineField(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MEDLINEFIELD$0, i);
                }
            }
        }
        /**
         * An XML status(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MedlineEntryDocument$MedlineEntry$Status.
         */
        public static class StatusImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status
        {
            
            public StatusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected StatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MedlineEntryDocument$MedlineEntry$Status$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.MedlineEntryDocument.MedlineEntry.Status.Value
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
    }
}
