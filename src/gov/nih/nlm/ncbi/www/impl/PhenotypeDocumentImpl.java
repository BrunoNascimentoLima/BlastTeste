/*
 * An XML document type.
 * Localname: Phenotype
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PhenotypeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Phenotype(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PhenotypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PhenotypeDocument
{
    
    public PhenotypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHENOTYPE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Phenotype");
    
    
    /**
     * Gets the "Phenotype" element
     */
    public gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype getPhenotype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype target = null;
            target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype)get_store().find_element_user(PHENOTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Phenotype" element
     */
    public void setPhenotype(gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype phenotype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype target = null;
            target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype)get_store().find_element_user(PHENOTYPE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype)get_store().add_element_user(PHENOTYPE$0);
            }
            target.set(phenotype);
        }
    }
    
    /**
     * Appends and returns a new empty "Phenotype" element
     */
    public gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype addNewPhenotype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype target = null;
            target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype)get_store().add_element_user(PHENOTYPE$0);
            return target;
        }
    }
    /**
     * An XML Phenotype(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PhenotypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype
    {
        
        public PhenotypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "source");
        private static final javax.xml.namespace.QName TERM$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "term");
        private static final javax.xml.namespace.QName XREF$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "xref");
        private static final javax.xml.namespace.QName CLINICALSIGNIFICANCE$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "clinical-significance");
        
        
        /**
         * Gets the "source" element
         */
        public java.lang.String getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "source" element
         */
        public org.apache.xmlbeans.XmlString xgetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "source" element
         */
        public boolean isSetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCE$0) != 0;
            }
        }
        
        /**
         * Sets the "source" element
         */
        public void setSource(java.lang.String source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$0);
                }
                target.setStringValue(source);
            }
        }
        
        /**
         * Sets (as xml) the "source" element
         */
        public void xsetSource(org.apache.xmlbeans.XmlString source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$0);
                }
                target.set(source);
            }
        }
        
        /**
         * Unsets the "source" element
         */
        public void unsetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCE$0, 0);
            }
        }
        
        /**
         * Gets the "term" element
         */
        public java.lang.String getTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "term" element
         */
        public org.apache.xmlbeans.XmlString xgetTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERM$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "term" element
         */
        public boolean isSetTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TERM$2) != 0;
            }
        }
        
        /**
         * Sets the "term" element
         */
        public void setTerm(java.lang.String term)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERM$2);
                }
                target.setStringValue(term);
            }
        }
        
        /**
         * Sets (as xml) the "term" element
         */
        public void xsetTerm(org.apache.xmlbeans.XmlString term)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERM$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TERM$2);
                }
                target.set(term);
            }
        }
        
        /**
         * Unsets the "term" element
         */
        public void unsetTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TERM$2, 0);
            }
        }
        
        /**
         * Gets the "xref" element
         */
        public gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref getXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref target = null;
                target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref)get_store().find_element_user(XREF$4, 0);
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
                return get_store().count_elements(XREF$4) != 0;
            }
        }
        
        /**
         * Sets the "xref" element
         */
        public void setXref(gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref xref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref target = null;
                target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref)get_store().find_element_user(XREF$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref)get_store().add_element_user(XREF$4);
                }
                target.set(xref);
            }
        }
        
        /**
         * Appends and returns a new empty "xref" element
         */
        public gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref addNewXref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref target = null;
                target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref)get_store().add_element_user(XREF$4);
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
                get_store().remove_element(XREF$4, 0);
            }
        }
        
        /**
         * Gets the "clinical-significance" element
         */
        public gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance getClinicalSignificance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance target = null;
                target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance)get_store().find_element_user(CLINICALSIGNIFICANCE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "clinical-significance" element
         */
        public boolean isSetClinicalSignificance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLINICALSIGNIFICANCE$6) != 0;
            }
        }
        
        /**
         * Sets the "clinical-significance" element
         */
        public void setClinicalSignificance(gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance clinicalSignificance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance target = null;
                target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance)get_store().find_element_user(CLINICALSIGNIFICANCE$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance)get_store().add_element_user(CLINICALSIGNIFICANCE$6);
                }
                target.set(clinicalSignificance);
            }
        }
        
        /**
         * Appends and returns a new empty "clinical-significance" element
         */
        public gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance addNewClinicalSignificance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance target = null;
                target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance)get_store().add_element_user(CLINICALSIGNIFICANCE$6);
                return target;
            }
        }
        
        /**
         * Unsets the "clinical-significance" element
         */
        public void unsetClinicalSignificance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLINICALSIGNIFICANCE$6, 0);
            }
        }
        /**
         * An XML xref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class XrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.Xref
        {
            
            public XrefImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML clinical-significance(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PhenotypeDocument$Phenotype$ClinicalSignificance.
         */
        public static class ClinicalSignificanceImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance
        {
            
            public ClinicalSignificanceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected ClinicalSignificanceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value)get_store().find_attribute_user(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.PhenotypeDocument$Phenotype$ClinicalSignificance$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.PhenotypeDocument.Phenotype.ClinicalSignificance.Value
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
