/*
 * An XML document type.
 * Localname: RNA-ref
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.RNARefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one RNA-ref(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class RNARefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RNARefDocument
{
    
    public RNARefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RNAREF$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "RNA-ref");
    
    
    /**
     * Gets the "RNA-ref" element
     */
    public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef getRNARef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RNARefDocument.RNARef target = null;
            target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef)get_store().find_element_user(RNAREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RNA-ref" element
     */
    public void setRNARef(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef rnaRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RNARefDocument.RNARef target = null;
            target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef)get_store().find_element_user(RNAREF$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef)get_store().add_element_user(RNAREF$0);
            }
            target.set(rnaRef);
        }
    }
    
    /**
     * Appends and returns a new empty "RNA-ref" element
     */
    public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef addNewRNARef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.RNARefDocument.RNARef target = null;
            target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef)get_store().add_element_user(RNAREF$0);
            return target;
        }
    }
    /**
     * An XML RNA-ref(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class RNARefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RNARefDocument.RNARef
    {
        
        public RNARefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "type");
        private static final javax.xml.namespace.QName PSEUDO$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pseudo");
        private static final javax.xml.namespace.QName EXT$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ext");
        
        
        /**
         * Gets the "type" element
         */
        public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type target = null;
                target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type target = null;
                target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Appends and returns a new empty "type" element
         */
        public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type target = null;
                target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Gets the "pseudo" element
         */
        public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo getPseudo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo target = null;
                target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo)get_store().find_element_user(PSEUDO$2, 0);
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
                return get_store().count_elements(PSEUDO$2) != 0;
            }
        }
        
        /**
         * Sets the "pseudo" element
         */
        public void setPseudo(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo pseudo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo target = null;
                target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo)get_store().find_element_user(PSEUDO$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo)get_store().add_element_user(PSEUDO$2);
                }
                target.set(pseudo);
            }
        }
        
        /**
         * Appends and returns a new empty "pseudo" element
         */
        public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo addNewPseudo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo target = null;
                target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo)get_store().add_element_user(PSEUDO$2);
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
                get_store().remove_element(PSEUDO$2, 0);
            }
        }
        
        /**
         * Gets the "ext" element
         */
        public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext getExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext)get_store().find_element_user(EXT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ext" element
         */
        public boolean isSetExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXT$4) != 0;
            }
        }
        
        /**
         * Sets the "ext" element
         */
        public void setExt(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext ext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext)get_store().find_element_user(EXT$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext)get_store().add_element_user(EXT$4);
                }
                target.set(ext);
            }
        }
        
        /**
         * Appends and returns a new empty "ext" element
         */
        public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext addNewExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext target = null;
                target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext)get_store().add_element_user(EXT$4);
                return target;
            }
        }
        
        /**
         * Unsets the "ext" element
         */
        public void unsetExt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXT$4, 0);
            }
        }
        /**
         * An XML type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type
        {
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.RNARefDocument$RNARef$Type$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Type.Value
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
         * An XML pseudo(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PseudoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo
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
            public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.RNARefDocument$RNARef$Pseudo$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Pseudo.Value
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
         * An XML ext(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext
        {
            
            public ExtImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NAME$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
            private static final javax.xml.namespace.QName TRNA$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "tRNA");
            private static final javax.xml.namespace.QName GEN$4 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gen");
            
            
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
             * True if has "name" element
             */
            public boolean isSetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NAME$0) != 0;
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
             * Unsets the "name" element
             */
            public void unsetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NAME$0, 0);
                }
            }
            
            /**
             * Gets the "tRNA" element
             */
            public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA getTRNA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA target = null;
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA)get_store().find_element_user(TRNA$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "tRNA" element
             */
            public boolean isSetTRNA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TRNA$2) != 0;
                }
            }
            
            /**
             * Sets the "tRNA" element
             */
            public void setTRNA(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA trna)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA target = null;
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA)get_store().find_element_user(TRNA$2, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA)get_store().add_element_user(TRNA$2);
                    }
                    target.set(trna);
                }
            }
            
            /**
             * Appends and returns a new empty "tRNA" element
             */
            public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA addNewTRNA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA target = null;
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA)get_store().add_element_user(TRNA$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "tRNA" element
             */
            public void unsetTRNA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TRNA$2, 0);
                }
            }
            
            /**
             * Gets the "gen" element
             */
            public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen getGen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen target = null;
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen)get_store().find_element_user(GEN$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "gen" element
             */
            public boolean isSetGen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(GEN$4) != 0;
                }
            }
            
            /**
             * Sets the "gen" element
             */
            public void setGen(gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen gen)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen target = null;
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen)get_store().find_element_user(GEN$4, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen)get_store().add_element_user(GEN$4);
                    }
                    target.set(gen);
                }
            }
            
            /**
             * Appends and returns a new empty "gen" element
             */
            public gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen addNewGen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen target = null;
                    target = (gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen)get_store().add_element_user(GEN$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "gen" element
             */
            public void unsetGen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(GEN$4, 0);
                }
            }
            /**
             * An XML tRNA(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class TRNAImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.TRNA
            {
                
                public TRNAImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TRNAEXT$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Trna-ext");
                
                
                /**
                 * Gets the "Trna-ext" element
                 */
                public gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt getTrnaExt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt target = null;
                      target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt)get_store().find_element_user(TRNAEXT$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Trna-ext" element
                 */
                public void setTrnaExt(gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt trnaExt)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt target = null;
                      target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt)get_store().find_element_user(TRNAEXT$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt)get_store().add_element_user(TRNAEXT$0);
                      }
                      target.set(trnaExt);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Trna-ext" element
                 */
                public gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt addNewTrnaExt()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt target = null;
                      target = (gov.nih.nlm.ncbi.www.TrnaExtDocument.TrnaExt)get_store().add_element_user(TRNAEXT$0);
                      return target;
                    }
                }
            }
            /**
             * An XML gen(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class GenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.RNARefDocument.RNARef.Ext.Gen
            {
                
                public GenImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName RNAGEN$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "RNA-gen");
                
                
                /**
                 * Gets the "RNA-gen" element
                 */
                public gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen getRNAGen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen target = null;
                      target = (gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen)get_store().find_element_user(RNAGEN$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "RNA-gen" element
                 */
                public void setRNAGen(gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen rnaGen)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen target = null;
                      target = (gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen)get_store().find_element_user(RNAGEN$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen)get_store().add_element_user(RNAGEN$0);
                      }
                      target.set(rnaGen);
                    }
                }
                
                /**
                 * Appends and returns a new empty "RNA-gen" element
                 */
                public gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen addNewRNAGen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen target = null;
                      target = (gov.nih.nlm.ncbi.www.RNAGenDocument.RNAGen)get_store().add_element_user(RNAGEN$0);
                      return target;
                    }
                }
            }
        }
    }
}
