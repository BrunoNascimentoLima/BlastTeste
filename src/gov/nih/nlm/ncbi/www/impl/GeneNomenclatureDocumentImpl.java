/*
 * An XML document type.
 * Localname: Gene-nomenclature
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.GeneNomenclatureDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Gene-nomenclature(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class GeneNomenclatureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GeneNomenclatureDocument
{
    
    public GeneNomenclatureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Gene-nomenclature(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class GeneNomenclatureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature
    {
        
        public GeneNomenclatureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "status");
        private static final javax.xml.namespace.QName SYMBOL$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "symbol");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName SOURCE$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "source");
        
        
        /**
         * Gets the "status" element
         */
        public gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status target = null;
                target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "status" element
         */
        public void setStatus(gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status target = null;
                target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status)get_store().find_element_user(STATUS$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status)get_store().add_element_user(STATUS$0);
                }
                target.set(status);
            }
        }
        
        /**
         * Appends and returns a new empty "status" element
         */
        public gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status addNewStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status target = null;
                target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status)get_store().add_element_user(STATUS$0);
                return target;
            }
        }
        
        /**
         * Gets the "symbol" element
         */
        public java.lang.String getSymbol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYMBOL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "symbol" element
         */
        public org.apache.xmlbeans.XmlString xgetSymbol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYMBOL$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "symbol" element
         */
        public boolean isSetSymbol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SYMBOL$2) != 0;
            }
        }
        
        /**
         * Sets the "symbol" element
         */
        public void setSymbol(java.lang.String symbol)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYMBOL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYMBOL$2);
                }
                target.setStringValue(symbol);
            }
        }
        
        /**
         * Sets (as xml) the "symbol" element
         */
        public void xsetSymbol(org.apache.xmlbeans.XmlString symbol)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYMBOL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SYMBOL$2);
                }
                target.set(symbol);
            }
        }
        
        /**
         * Unsets the "symbol" element
         */
        public void unsetSymbol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SYMBOL$2, 0);
            }
        }
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "name" element
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$4) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$4);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" element
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$4, 0);
            }
        }
        
        /**
         * Gets the "source" element
         */
        public gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Source getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Source target = null;
                target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Source)get_store().find_element_user(SOURCE$6, 0);
                if (target == null)
                {
                    return null;
                }
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
                return get_store().count_elements(SOURCE$6) != 0;
            }
        }
        
        /**
         * Sets the "source" element
         */
        public void setSource(gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Source source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Source target = null;
                target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Source)get_store().find_element_user(SOURCE$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Source)get_store().add_element_user(SOURCE$6);
                }
                target.set(source);
            }
        }
        
        /**
         * Appends and returns a new empty "source" element
         */
        public gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Source addNewSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Source target = null;
                target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Source)get_store().add_element_user(SOURCE$6);
                return target;
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
                get_store().remove_element(SOURCE$6, 0);
            }
        }
        /**
         * An XML status(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class StatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status
        {
            
            public StatusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.GeneNomenclatureDocument$GeneNomenclature$Status$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Status.Value
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
         * An XML source(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.GeneNomenclatureDocument.GeneNomenclature.Source
        {
            
            public SourceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DBTAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
            
            
            /**
             * Gets the "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Dbtag" element
             */
            public void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    }
                    target.set(dbtag);
                }
            }
            
            /**
             * Appends and returns a new empty "Dbtag" element
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
        }
    }
}
