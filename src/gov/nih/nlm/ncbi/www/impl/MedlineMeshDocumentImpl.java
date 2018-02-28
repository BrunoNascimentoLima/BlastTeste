/*
 * An XML document type.
 * Localname: Medline-mesh
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.MedlineMeshDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Medline-mesh(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class MedlineMeshDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineMeshDocument
{
    
    public MedlineMeshDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDLINEMESH$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Medline-mesh");
    
    
    /**
     * Gets the "Medline-mesh" element
     */
    public gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh getMedlineMesh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh)get_store().find_element_user(MEDLINEMESH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Medline-mesh" element
     */
    public void setMedlineMesh(gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh medlineMesh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh target = null;
            target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh)get_store().find_element_user(MEDLINEMESH$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh)get_store().add_element_user(MEDLINEMESH$0);
            }
            target.set(medlineMesh);
        }
    }
    
    /**
     * Appends and returns a new empty "Medline-mesh" element
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
     * An XML Medline-mesh(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class MedlineMeshImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh
    {
        
        public MedlineMeshImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MP$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mp");
        private static final javax.xml.namespace.QName TERM$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "term");
        private static final javax.xml.namespace.QName QUAL$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "qual");
        
        
        /**
         * Gets the "mp" element
         */
        public gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp getMp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp)get_store().find_element_user(MP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "mp" element
         */
        public boolean isSetMp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MP$0) != 0;
            }
        }
        
        /**
         * Sets the "mp" element
         */
        public void setMp(gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp mp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp)get_store().find_element_user(MP$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp)get_store().add_element_user(MP$0);
                }
                target.set(mp);
            }
        }
        
        /**
         * Appends and returns a new empty "mp" element
         */
        public gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp addNewMp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp)get_store().add_element_user(MP$0);
                return target;
            }
        }
        
        /**
         * Unsets the "mp" element
         */
        public void unsetMp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MP$0, 0);
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
         * Gets the "qual" element
         */
        public gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Qual getQual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Qual target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Qual)get_store().find_element_user(QUAL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "qual" element
         */
        public boolean isSetQual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUAL$4) != 0;
            }
        }
        
        /**
         * Sets the "qual" element
         */
        public void setQual(gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Qual qual)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Qual target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Qual)get_store().find_element_user(QUAL$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Qual)get_store().add_element_user(QUAL$4);
                }
                target.set(qual);
            }
        }
        
        /**
         * Appends and returns a new empty "qual" element
         */
        public gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Qual addNewQual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Qual target = null;
                target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Qual)get_store().add_element_user(QUAL$4);
                return target;
            }
        }
        
        /**
         * Unsets the "qual" element
         */
        public void unsetQual()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUAL$4, 0);
            }
        }
        /**
         * An XML mp(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MpImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp
        {
            
            public MpImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.MedlineMeshDocument$MedlineMesh$Mp$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Mp.Value
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
         * An XML qual(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class QualImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.MedlineMeshDocument.MedlineMesh.Qual
        {
            
            public QualImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MEDLINEQUAL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Medline-qual");
            
            
            /**
             * Gets array of all "Medline-qual" elements
             */
            public gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual[] getMedlineQualArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MEDLINEQUAL$0, targetList);
                    gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual[] result = new gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Medline-qual" element
             */
            public gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual getMedlineQualArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual)get_store().find_element_user(MEDLINEQUAL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Medline-qual" element
             */
            public int sizeOfMedlineQualArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MEDLINEQUAL$0);
                }
            }
            
            /**
             * Sets array of all "Medline-qual" element
             */
            public void setMedlineQualArray(gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual[] medlineQualArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(medlineQualArray, MEDLINEQUAL$0);
                }
            }
            
            /**
             * Sets ith "Medline-qual" element
             */
            public void setMedlineQualArray(int i, gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual medlineQual)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual)get_store().find_element_user(MEDLINEQUAL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(medlineQual);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Medline-qual" element
             */
            public gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual insertNewMedlineQual(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual)get_store().insert_element_user(MEDLINEQUAL$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Medline-qual" element
             */
            public gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual addNewMedlineQual()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual target = null;
                    target = (gov.nih.nlm.ncbi.www.MedlineQualDocument.MedlineQual)get_store().add_element_user(MEDLINEQUAL$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Medline-qual" element
             */
            public void removeMedlineQual(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MEDLINEQUAL$0, i);
                }
            }
        }
    }
}
