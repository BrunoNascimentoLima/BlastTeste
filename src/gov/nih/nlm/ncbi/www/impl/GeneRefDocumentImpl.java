/*
 * An XML document type.
 * Localname: Gene-ref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GeneRefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Gene-ref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class GeneRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GeneRefDocument
{
    
    public GeneRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENEREF$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Gene-ref");
    
    
    /**
     * Gets the "Gene-ref" element
     */
    public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef getGeneRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef target = null;
            target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef)get_store().find_element_user(GENEREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Gene-ref" element
     */
    public void setGeneRef(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef geneRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef target = null;
            target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef)get_store().find_element_user(GENEREF$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef)get_store().add_element_user(GENEREF$0);
            }
            target.set(geneRef);
        }
    }
    
    /**
     * Appends and returns a new empty "Gene-ref" element
     */
    public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef addNewGeneRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef target = null;
            target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef)get_store().add_element_user(GENEREF$0);
            return target;
        }
    }
    /**
     * An XML Gene-ref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class GeneRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef
    {
        
        public GeneRefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCUS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "locus");
        private static final javax.xml.namespace.QName ALLELE$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "allele");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "desc");
        private static final javax.xml.namespace.QName MAPLOC$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "maploc");
        private static final javax.xml.namespace.QName PSEUDO$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pseudo");
        private static final javax.xml.namespace.QName DB$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "db");
        private static final javax.xml.namespace.QName SYN$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "syn");
        private static final javax.xml.namespace.QName LOCUSTAG$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "locus-tag");
        private static final javax.xml.namespace.QName FORMALNAME$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "formal-name");
        
        
        /**
         * Gets the "locus" element
         */
        public java.lang.String getLocus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "locus" element
         */
        public org.apache.xmlbeans.XmlString xgetLocus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCUS$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "locus" element
         */
        public boolean isSetLocus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCUS$0) != 0;
            }
        }
        
        /**
         * Sets the "locus" element
         */
        public void setLocus(java.lang.String locus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCUS$0);
                }
                target.setStringValue(locus);
            }
        }
        
        /**
         * Sets (as xml) the "locus" element
         */
        public void xsetLocus(org.apache.xmlbeans.XmlString locus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCUS$0);
                }
                target.set(locus);
            }
        }
        
        /**
         * Unsets the "locus" element
         */
        public void unsetLocus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCUS$0, 0);
            }
        }
        
        /**
         * Gets the "allele" element
         */
        public java.lang.String getAllele()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLELE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "allele" element
         */
        public org.apache.xmlbeans.XmlString xgetAllele()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALLELE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "allele" element
         */
        public boolean isSetAllele()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALLELE$2) != 0;
            }
        }
        
        /**
         * Sets the "allele" element
         */
        public void setAllele(java.lang.String allele)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLELE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLELE$2);
                }
                target.setStringValue(allele);
            }
        }
        
        /**
         * Sets (as xml) the "allele" element
         */
        public void xsetAllele(org.apache.xmlbeans.XmlString allele)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALLELE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALLELE$2);
                }
                target.set(allele);
            }
        }
        
        /**
         * Unsets the "allele" element
         */
        public void unsetAllele()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALLELE$2, 0);
            }
        }
        
        /**
         * Gets the "desc" element
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESC$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "desc" element
         */
        public org.apache.xmlbeans.XmlString xgetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESC$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "desc" element
         */
        public boolean isSetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESC$4) != 0;
            }
        }
        
        /**
         * Sets the "desc" element
         */
        public void setDesc(java.lang.String desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESC$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESC$4);
                }
                target.setStringValue(desc);
            }
        }
        
        /**
         * Sets (as xml) the "desc" element
         */
        public void xsetDesc(org.apache.xmlbeans.XmlString desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESC$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESC$4);
                }
                target.set(desc);
            }
        }
        
        /**
         * Unsets the "desc" element
         */
        public void unsetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESC$4, 0);
            }
        }
        
        /**
         * Gets the "maploc" element
         */
        public java.lang.String getMaploc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPLOC$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "maploc" element
         */
        public org.apache.xmlbeans.XmlString xgetMaploc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPLOC$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "maploc" element
         */
        public boolean isSetMaploc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAPLOC$6) != 0;
            }
        }
        
        /**
         * Sets the "maploc" element
         */
        public void setMaploc(java.lang.String maploc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPLOC$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAPLOC$6);
                }
                target.setStringValue(maploc);
            }
        }
        
        /**
         * Sets (as xml) the "maploc" element
         */
        public void xsetMaploc(org.apache.xmlbeans.XmlString maploc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPLOC$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAPLOC$6);
                }
                target.set(maploc);
            }
        }
        
        /**
         * Unsets the "maploc" element
         */
        public void unsetMaploc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAPLOC$6, 0);
            }
        }
        
        /**
         * Gets the "pseudo" element
         */
        public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo getPseudo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo target = null;
                target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo)get_store().find_element_user(PSEUDO$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pseudo" element
         */
        public boolean isSetPseudo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PSEUDO$8) != 0;
            }
        }
        
        /**
         * Sets the "pseudo" element
         */
        public void setPseudo(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo pseudo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo target = null;
                target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo)get_store().find_element_user(PSEUDO$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo)get_store().add_element_user(PSEUDO$8);
                }
                target.set(pseudo);
            }
        }
        
        /**
         * Appends and returns a new empty "pseudo" element
         */
        public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo addNewPseudo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo target = null;
                target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo)get_store().add_element_user(PSEUDO$8);
                return target;
            }
        }
        
        /**
         * Unsets the "pseudo" element
         */
        public void unsetPseudo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PSEUDO$8, 0);
            }
        }
        
        /**
         * Gets the "db" element
         */
        public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db getDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db target = null;
                target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db)get_store().find_element_user(DB$10, 0);
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
                return get_store().count_elements(DB$10) != 0;
            }
        }
        
        /**
         * Sets the "db" element
         */
        public void setDb(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db db)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db target = null;
                target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db)get_store().find_element_user(DB$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db)get_store().add_element_user(DB$10);
                }
                target.set(db);
            }
        }
        
        /**
         * Appends and returns a new empty "db" element
         */
        public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db addNewDb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db target = null;
                target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db)get_store().add_element_user(DB$10);
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
                get_store().remove_element(DB$10, 0);
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
                get_store().find_all_element_users(SYN$12, targetList);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYN$12, i);
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
                get_store().find_all_element_users(SYN$12, targetList);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYN$12, i);
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
                return get_store().count_elements(SYN$12);
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
                arraySetterHelper(synArray, SYN$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYN$12, i);
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
                arraySetterHelper(synArray, SYN$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYN$12, i);
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
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SYN$12, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYN$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SYN$12, i);
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
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SYN$12);
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
                get_store().remove_element(SYN$12, i);
            }
        }
        
        /**
         * Gets the "locus-tag" element
         */
        public java.lang.String getLocusTag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCUSTAG$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "locus-tag" element
         */
        public org.apache.xmlbeans.XmlString xgetLocusTag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCUSTAG$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "locus-tag" element
         */
        public boolean isSetLocusTag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCUSTAG$14) != 0;
            }
        }
        
        /**
         * Sets the "locus-tag" element
         */
        public void setLocusTag(java.lang.String locusTag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCUSTAG$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCUSTAG$14);
                }
                target.setStringValue(locusTag);
            }
        }
        
        /**
         * Sets (as xml) the "locus-tag" element
         */
        public void xsetLocusTag(org.apache.xmlbeans.XmlString locusTag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCUSTAG$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCUSTAG$14);
                }
                target.set(locusTag);
            }
        }
        
        /**
         * Unsets the "locus-tag" element
         */
        public void unsetLocusTag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCUSTAG$14, 0);
            }
        }
        
        /**
         * Gets the "formal-name" element
         */
        public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName getFormalName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName target = null;
                target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName)get_store().find_element_user(FORMALNAME$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "formal-name" element
         */
        public boolean isSetFormalName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FORMALNAME$16) != 0;
            }
        }
        
        /**
         * Sets the "formal-name" element
         */
        public void setFormalName(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName formalName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName target = null;
                target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName)get_store().find_element_user(FORMALNAME$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName)get_store().add_element_user(FORMALNAME$16);
                }
                target.set(formalName);
            }
        }
        
        /**
         * Appends and returns a new empty "formal-name" element
         */
        public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName addNewFormalName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName target = null;
                target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName)get_store().add_element_user(FORMALNAME$16);
                return target;
            }
        }
        
        /**
         * Unsets the "formal-name" element
         */
        public void unsetFormalName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FORMALNAME$16, 0);
            }
        }
        /**
         * An XML pseudo(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PseudoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo
        {
            
            public PseudoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.GeneRefDocument$GeneRef$Pseudo$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Pseudo.Value
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
         * An XML db(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DbImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.Db
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
         * An XML formal-name(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FormalNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef.FormalName
        {
            
            public FormalNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GENENOMENCLATURE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Gene-nomenclature");
            
            
            /**
             * Gets the "Gene-nomenclature" element
             */
            public gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature getGeneNomenclature()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature)get_store().find_element_user(GENENOMENCLATURE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Gene-nomenclature" element
             */
            public void setGeneNomenclature(gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature geneNomenclature)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature)get_store().find_element_user(GENENOMENCLATURE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature)get_store().add_element_user(GENENOMENCLATURE$0);
                    }
                    target.set(geneNomenclature);
                }
            }
            
            /**
             * Appends and returns a new empty "Gene-nomenclature" element
             */
            public gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature addNewGeneNomenclature()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature)get_store().add_element_user(GENENOMENCLATURE$0);
                    return target;
                }
            }
        }
    }
}
