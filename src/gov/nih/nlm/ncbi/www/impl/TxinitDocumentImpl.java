/*
 * An XML document type.
 * Localname: Txinit
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.TxinitDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Txinit(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class TxinitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxinitDocument
{
    
    public TxinitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TXINIT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Txinit");
    
    
    /**
     * Gets the "Txinit" element
     */
    public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit getTxinit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TxinitDocument.Txinit target = null;
            target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit)get_store().find_element_user(TXINIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Txinit" element
     */
    public void setTxinit(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit txinit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TxinitDocument.Txinit target = null;
            target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit)get_store().find_element_user(TXINIT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit)get_store().add_element_user(TXINIT$0);
            }
            target.set(txinit);
        }
    }
    
    /**
     * Appends and returns a new empty "Txinit" element
     */
    public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit addNewTxinit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TxinitDocument.Txinit target = null;
            target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit)get_store().add_element_user(TXINIT$0);
            return target;
        }
    }
    /**
     * An XML Txinit(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class TxinitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxinitDocument.Txinit
    {
        
        public TxinitImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName SYN$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "syn");
        private static final javax.xml.namespace.QName GENE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gene");
        private static final javax.xml.namespace.QName PROTEIN$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "protein");
        private static final javax.xml.namespace.QName RNA$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "rna");
        private static final javax.xml.namespace.QName EXPRESSION$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "expression");
        private static final javax.xml.namespace.QName TXSYSTEM$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "txsystem");
        private static final javax.xml.namespace.QName TXDESCR$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "txdescr");
        private static final javax.xml.namespace.QName TXORG$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "txorg");
        private static final javax.xml.namespace.QName MAPPINGPRECISE$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mapping-precise");
        private static final javax.xml.namespace.QName LOCATIONACCURATE$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "location-accurate");
        private static final javax.xml.namespace.QName INITTYPE$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "inittype");
        private static final javax.xml.namespace.QName EVIDENCE$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "evidence");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
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
                get_store().find_all_element_users(SYN$2, targetList);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYN$2, i);
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
                get_store().find_all_element_users(SYN$2, targetList);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYN$2, i);
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
                return get_store().count_elements(SYN$2);
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
                arraySetterHelper(synArray, SYN$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYN$2, i);
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
                arraySetterHelper(synArray, SYN$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYN$2, i);
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
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SYN$2, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYN$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SYN$2, i);
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
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SYN$2);
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
                get_store().remove_element(SYN$2, i);
            }
        }
        
        /**
         * Gets the "gene" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene getGene()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene)get_store().find_element_user(GENE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "gene" element
         */
        public boolean isSetGene()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENE$4) != 0;
            }
        }
        
        /**
         * Sets the "gene" element
         */
        public void setGene(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene gene)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene)get_store().find_element_user(GENE$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene)get_store().add_element_user(GENE$4);
                }
                target.set(gene);
            }
        }
        
        /**
         * Appends and returns a new empty "gene" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene addNewGene()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene)get_store().add_element_user(GENE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "gene" element
         */
        public void unsetGene()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENE$4, 0);
            }
        }
        
        /**
         * Gets the "protein" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein getProtein()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein)get_store().find_element_user(PROTEIN$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "protein" element
         */
        public boolean isSetProtein()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROTEIN$6) != 0;
            }
        }
        
        /**
         * Sets the "protein" element
         */
        public void setProtein(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein protein)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein)get_store().find_element_user(PROTEIN$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein)get_store().add_element_user(PROTEIN$6);
                }
                target.set(protein);
            }
        }
        
        /**
         * Appends and returns a new empty "protein" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein addNewProtein()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein)get_store().add_element_user(PROTEIN$6);
                return target;
            }
        }
        
        /**
         * Unsets the "protein" element
         */
        public void unsetProtein()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROTEIN$6, 0);
            }
        }
        
        /**
         * Gets array of all "rna" elements
         */
        public java.lang.String[] getRnaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RNA$8, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "rna" element
         */
        public java.lang.String getRnaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RNA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "rna" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetRnaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RNA$8, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "rna" element
         */
        public org.apache.xmlbeans.XmlString xgetRnaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RNA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "rna" element
         */
        public int sizeOfRnaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RNA$8);
            }
        }
        
        /**
         * Sets array of all "rna" element
         */
        public void setRnaArray(java.lang.String[] rnaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(rnaArray, RNA$8);
            }
        }
        
        /**
         * Sets ith "rna" element
         */
        public void setRnaArray(int i, java.lang.String rna)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RNA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(rna);
            }
        }
        
        /**
         * Sets (as xml) array of all "rna" element
         */
        public void xsetRnaArray(org.apache.xmlbeans.XmlString[]rnaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(rnaArray, RNA$8);
            }
        }
        
        /**
         * Sets (as xml) ith "rna" element
         */
        public void xsetRnaArray(int i, org.apache.xmlbeans.XmlString rna)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RNA$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(rna);
            }
        }
        
        /**
         * Inserts the value as the ith "rna" element
         */
        public void insertRna(int i, java.lang.String rna)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RNA$8, i);
                target.setStringValue(rna);
            }
        }
        
        /**
         * Appends the value as the last "rna" element
         */
        public void addRna(java.lang.String rna)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RNA$8);
                target.setStringValue(rna);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "rna" element
         */
        public org.apache.xmlbeans.XmlString insertNewRna(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(RNA$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "rna" element
         */
        public org.apache.xmlbeans.XmlString addNewRna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RNA$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "rna" element
         */
        public void removeRna(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RNA$8, i);
            }
        }
        
        /**
         * Gets the "expression" element
         */
        public java.lang.String getExpression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPRESSION$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "expression" element
         */
        public org.apache.xmlbeans.XmlString xgetExpression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPRESSION$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "expression" element
         */
        public boolean isSetExpression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXPRESSION$10) != 0;
            }
        }
        
        /**
         * Sets the "expression" element
         */
        public void setExpression(java.lang.String expression)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPRESSION$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPRESSION$10);
                }
                target.setStringValue(expression);
            }
        }
        
        /**
         * Sets (as xml) the "expression" element
         */
        public void xsetExpression(org.apache.xmlbeans.XmlString expression)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPRESSION$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPRESSION$10);
                }
                target.set(expression);
            }
        }
        
        /**
         * Unsets the "expression" element
         */
        public void unsetExpression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXPRESSION$10, 0);
            }
        }
        
        /**
         * Gets the "txsystem" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem getTxsystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem)get_store().find_element_user(TXSYSTEM$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "txsystem" element
         */
        public void setTxsystem(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem txsystem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem)get_store().find_element_user(TXSYSTEM$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem)get_store().add_element_user(TXSYSTEM$12);
                }
                target.set(txsystem);
            }
        }
        
        /**
         * Appends and returns a new empty "txsystem" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem addNewTxsystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem)get_store().add_element_user(TXSYSTEM$12);
                return target;
            }
        }
        
        /**
         * Gets the "txdescr" element
         */
        public java.lang.String getTxdescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TXDESCR$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "txdescr" element
         */
        public org.apache.xmlbeans.XmlString xgetTxdescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TXDESCR$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "txdescr" element
         */
        public boolean isSetTxdescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TXDESCR$14) != 0;
            }
        }
        
        /**
         * Sets the "txdescr" element
         */
        public void setTxdescr(java.lang.String txdescr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TXDESCR$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TXDESCR$14);
                }
                target.setStringValue(txdescr);
            }
        }
        
        /**
         * Sets (as xml) the "txdescr" element
         */
        public void xsetTxdescr(org.apache.xmlbeans.XmlString txdescr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TXDESCR$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TXDESCR$14);
                }
                target.set(txdescr);
            }
        }
        
        /**
         * Unsets the "txdescr" element
         */
        public void unsetTxdescr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TXDESCR$14, 0);
            }
        }
        
        /**
         * Gets the "txorg" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg getTxorg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg)get_store().find_element_user(TXORG$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "txorg" element
         */
        public boolean isSetTxorg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TXORG$16) != 0;
            }
        }
        
        /**
         * Sets the "txorg" element
         */
        public void setTxorg(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg txorg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg)get_store().find_element_user(TXORG$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg)get_store().add_element_user(TXORG$16);
                }
                target.set(txorg);
            }
        }
        
        /**
         * Appends and returns a new empty "txorg" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg addNewTxorg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg)get_store().add_element_user(TXORG$16);
                return target;
            }
        }
        
        /**
         * Unsets the "txorg" element
         */
        public void unsetTxorg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TXORG$16, 0);
            }
        }
        
        /**
         * Gets the "mapping-precise" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise getMappingPrecise()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise)get_store().find_element_user(MAPPINGPRECISE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "mapping-precise" element
         */
        public boolean isSetMappingPrecise()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAPPINGPRECISE$18) != 0;
            }
        }
        
        /**
         * Sets the "mapping-precise" element
         */
        public void setMappingPrecise(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise mappingPrecise)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise)get_store().find_element_user(MAPPINGPRECISE$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise)get_store().add_element_user(MAPPINGPRECISE$18);
                }
                target.set(mappingPrecise);
            }
        }
        
        /**
         * Appends and returns a new empty "mapping-precise" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise addNewMappingPrecise()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise)get_store().add_element_user(MAPPINGPRECISE$18);
                return target;
            }
        }
        
        /**
         * Unsets the "mapping-precise" element
         */
        public void unsetMappingPrecise()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAPPINGPRECISE$18, 0);
            }
        }
        
        /**
         * Gets the "location-accurate" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate getLocationAccurate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate)get_store().find_element_user(LOCATIONACCURATE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "location-accurate" element
         */
        public boolean isSetLocationAccurate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCATIONACCURATE$20) != 0;
            }
        }
        
        /**
         * Sets the "location-accurate" element
         */
        public void setLocationAccurate(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate locationAccurate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate)get_store().find_element_user(LOCATIONACCURATE$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate)get_store().add_element_user(LOCATIONACCURATE$20);
                }
                target.set(locationAccurate);
            }
        }
        
        /**
         * Appends and returns a new empty "location-accurate" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate addNewLocationAccurate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate)get_store().add_element_user(LOCATIONACCURATE$20);
                return target;
            }
        }
        
        /**
         * Unsets the "location-accurate" element
         */
        public void unsetLocationAccurate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCATIONACCURATE$20, 0);
            }
        }
        
        /**
         * Gets the "inittype" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype getInittype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype)get_store().find_element_user(INITTYPE$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "inittype" element
         */
        public boolean isSetInittype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INITTYPE$22) != 0;
            }
        }
        
        /**
         * Sets the "inittype" element
         */
        public void setInittype(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype inittype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype)get_store().find_element_user(INITTYPE$22, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype)get_store().add_element_user(INITTYPE$22);
                }
                target.set(inittype);
            }
        }
        
        /**
         * Appends and returns a new empty "inittype" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype addNewInittype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype)get_store().add_element_user(INITTYPE$22);
                return target;
            }
        }
        
        /**
         * Unsets the "inittype" element
         */
        public void unsetInittype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INITTYPE$22, 0);
            }
        }
        
        /**
         * Gets the "evidence" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence getEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence)get_store().find_element_user(EVIDENCE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "evidence" element
         */
        public boolean isSetEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVIDENCE$24) != 0;
            }
        }
        
        /**
         * Sets the "evidence" element
         */
        public void setEvidence(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence evidence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence)get_store().find_element_user(EVIDENCE$24, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence)get_store().add_element_user(EVIDENCE$24);
                }
                target.set(evidence);
            }
        }
        
        /**
         * Appends and returns a new empty "evidence" element
         */
        public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence addNewEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence target = null;
                target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence)get_store().add_element_user(EVIDENCE$24);
                return target;
            }
        }
        
        /**
         * Unsets the "evidence" element
         */
        public void unsetEvidence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVIDENCE$24, 0);
            }
        }
        /**
         * An XML gene(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GeneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Gene
        {
            
            public GeneImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GENEREF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Gene-ref");
            
            
            /**
             * Gets array of all "Gene-ref" elements
             */
            public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef[] getGeneRefArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(GENEREF$0, targetList);
                    gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef[] result = new gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Gene-ref" element
             */
            public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef getGeneRefArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef)get_store().find_element_user(GENEREF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Gene-ref" element
             */
            public int sizeOfGeneRefArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(GENEREF$0);
                }
            }
            
            /**
             * Sets array of all "Gene-ref" element
             */
            public void setGeneRefArray(gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef[] geneRefArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(geneRefArray, GENEREF$0);
                }
            }
            
            /**
             * Sets ith "Gene-ref" element
             */
            public void setGeneRefArray(int i, gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef geneRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef)get_store().find_element_user(GENEREF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(geneRef);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Gene-ref" element
             */
            public gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef insertNewGeneRef(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneRefDocument.GeneRef)get_store().insert_element_user(GENEREF$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Gene-ref" element
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
             * Removes the ith "Gene-ref" element
             */
            public void removeGeneRef(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(GENEREF$0, i);
                }
            }
        }
        /**
         * An XML protein(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProteinImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Protein
        {
            
            public ProteinImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PROTREF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Prot-ref");
            
            
            /**
             * Gets array of all "Prot-ref" elements
             */
            public gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef[] getProtRefArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PROTREF$0, targetList);
                    gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef[] result = new gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Prot-ref" element
             */
            public gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef getProtRefArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef target = null;
                    target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef)get_store().find_element_user(PROTREF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Prot-ref" element
             */
            public int sizeOfProtRefArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PROTREF$0);
                }
            }
            
            /**
             * Sets array of all "Prot-ref" element
             */
            public void setProtRefArray(gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef[] protRefArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(protRefArray, PROTREF$0);
                }
            }
            
            /**
             * Sets ith "Prot-ref" element
             */
            public void setProtRefArray(int i, gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef protRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef target = null;
                    target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef)get_store().find_element_user(PROTREF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(protRef);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Prot-ref" element
             */
            public gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef insertNewProtRef(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef target = null;
                    target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef)get_store().insert_element_user(PROTREF$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Prot-ref" element
             */
            public gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef addNewProtRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef target = null;
                    target = (gov.nih.nlm.ncbi.www.ProtRefDocument.ProtRef)get_store().add_element_user(PROTREF$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Prot-ref" element
             */
            public void removeProtRef(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PROTREF$0, i);
                }
            }
        }
        /**
         * An XML txsystem(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TxsystemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem
        {
            
            public TxsystemImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxinitDocument$Txinit$Txsystem$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txsystem.Value
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
         * An XML txorg(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TxorgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Txorg
        {
            
            public TxorgImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
        /**
         * An XML mapping-precise(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MappingPreciseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise
        {
            
            public MappingPreciseImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxinitDocument$Txinit$MappingPrecise$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.MappingPrecise.Value
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
         * An XML location-accurate(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LocationAccurateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate
        {
            
            public LocationAccurateImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxinitDocument$Txinit$LocationAccurate$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.LocationAccurate.Value
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
         * An XML inittype(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class InittypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype
        {
            
            public InittypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.TxinitDocument$Txinit$Inittype$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Inittype.Value
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
         * An XML evidence(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class EvidenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TxinitDocument.Txinit.Evidence
        {
            
            public EvidenceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TXEVIDENCE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Tx-evidence");
            
            
            /**
             * Gets array of all "Tx-evidence" elements
             */
            public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence[] getTxEvidenceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(TXEVIDENCE$0, targetList);
                    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence[] result = new gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Tx-evidence" element
             */
            public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence getTxEvidenceArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence target = null;
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence)get_store().find_element_user(TXEVIDENCE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Tx-evidence" element
             */
            public int sizeOfTxEvidenceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TXEVIDENCE$0);
                }
            }
            
            /**
             * Sets array of all "Tx-evidence" element
             */
            public void setTxEvidenceArray(gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence[] txEvidenceArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(txEvidenceArray, TXEVIDENCE$0);
                }
            }
            
            /**
             * Sets ith "Tx-evidence" element
             */
            public void setTxEvidenceArray(int i, gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence txEvidence)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence target = null;
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence)get_store().find_element_user(TXEVIDENCE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(txEvidence);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Tx-evidence" element
             */
            public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence insertNewTxEvidence(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence target = null;
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence)get_store().insert_element_user(TXEVIDENCE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Tx-evidence" element
             */
            public gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence addNewTxEvidence()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence target = null;
                    target = (gov.nih.nlm.ncbi.www.TxEvidenceDocument.TxEvidence)get_store().add_element_user(TXEVIDENCE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Tx-evidence" element
             */
            public void removeTxEvidence(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TXEVIDENCE$0, i);
                }
            }
        }
    }
}
