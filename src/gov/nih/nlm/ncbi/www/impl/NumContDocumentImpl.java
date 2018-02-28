/*
 * An XML document type.
 * Localname: Num-cont
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.NumContDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Num-cont(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class NumContDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumContDocument
{
    
    public NumContDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMCONT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Num-cont");
    
    
    /**
     * Gets the "Num-cont" element
     */
    public gov.nih.nlm.ncbi.www.NumContDocument.NumCont getNumCont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumContDocument.NumCont target = null;
            target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont)get_store().find_element_user(NUMCONT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Num-cont" element
     */
    public void setNumCont(gov.nih.nlm.ncbi.www.NumContDocument.NumCont numCont)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumContDocument.NumCont target = null;
            target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont)get_store().find_element_user(NUMCONT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont)get_store().add_element_user(NUMCONT$0);
            }
            target.set(numCont);
        }
    }
    
    /**
     * Appends and returns a new empty "Num-cont" element
     */
    public gov.nih.nlm.ncbi.www.NumContDocument.NumCont addNewNumCont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.NumContDocument.NumCont target = null;
            target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont)get_store().add_element_user(NUMCONT$0);
            return target;
        }
    }
    /**
     * An XML Num-cont(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class NumContImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumContDocument.NumCont
    {
        
        public NumContImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REFNUM$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "refnum");
        private static final javax.xml.namespace.QName HASZERO$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "has-zero");
        private static final javax.xml.namespace.QName ASCENDING$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ascending");
        
        
        /**
         * Gets the "refnum" element
         */
        public java.math.BigInteger getRefnum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFNUM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "refnum" element
         */
        public org.apache.xmlbeans.XmlInteger xgetRefnum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(REFNUM$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "refnum" element
         */
        public void setRefnum(java.math.BigInteger refnum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFNUM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFNUM$0);
                }
                target.setBigIntegerValue(refnum);
            }
        }
        
        /**
         * Sets (as xml) the "refnum" element
         */
        public void xsetRefnum(org.apache.xmlbeans.XmlInteger refnum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(REFNUM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(REFNUM$0);
                }
                target.set(refnum);
            }
        }
        
        /**
         * Gets the "has-zero" element
         */
        public gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero getHasZero()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero target = null;
                target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero)get_store().find_element_user(HASZERO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "has-zero" element
         */
        public boolean isSetHasZero()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HASZERO$2) != 0;
            }
        }
        
        /**
         * Sets the "has-zero" element
         */
        public void setHasZero(gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero hasZero)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero target = null;
                target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero)get_store().find_element_user(HASZERO$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero)get_store().add_element_user(HASZERO$2);
                }
                target.set(hasZero);
            }
        }
        
        /**
         * Appends and returns a new empty "has-zero" element
         */
        public gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero addNewHasZero()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero target = null;
                target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero)get_store().add_element_user(HASZERO$2);
                return target;
            }
        }
        
        /**
         * Unsets the "has-zero" element
         */
        public void unsetHasZero()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HASZERO$2, 0);
            }
        }
        
        /**
         * Gets the "ascending" element
         */
        public gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending getAscending()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending target = null;
                target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending)get_store().find_element_user(ASCENDING$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ascending" element
         */
        public boolean isSetAscending()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ASCENDING$4) != 0;
            }
        }
        
        /**
         * Sets the "ascending" element
         */
        public void setAscending(gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending ascending)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending target = null;
                target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending)get_store().find_element_user(ASCENDING$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending)get_store().add_element_user(ASCENDING$4);
                }
                target.set(ascending);
            }
        }
        
        /**
         * Appends and returns a new empty "ascending" element
         */
        public gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending addNewAscending()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending target = null;
                target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending)get_store().add_element_user(ASCENDING$4);
                return target;
            }
        }
        
        /**
         * Unsets the "ascending" element
         */
        public void unsetAscending()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ASCENDING$4, 0);
            }
        }
        /**
         * An XML has-zero(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class HasZeroImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero
        {
            
            public HasZeroImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.NumContDocument$NumCont$HasZero$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.NumContDocument.NumCont.HasZero.Value
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
         * An XML ascending(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AscendingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending
        {
            
            public AscendingImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.NumContDocument$NumCont$Ascending$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.NumContDocument.NumCont.Ascending.Value
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
