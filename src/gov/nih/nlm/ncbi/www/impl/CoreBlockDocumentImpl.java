/*
 * An XML document type.
 * Localname: CoreBlock
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CoreBlockDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one CoreBlock(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CoreBlockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CoreBlockDocument
{
    
    public CoreBlockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COREBLOCK$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "CoreBlock");
    
    
    /**
     * Gets the "CoreBlock" element
     */
    public gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock getCoreBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock target = null;
            target = (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock)get_store().find_element_user(COREBLOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CoreBlock" element
     */
    public void setCoreBlock(gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock coreBlock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock target = null;
            target = (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock)get_store().find_element_user(COREBLOCK$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock)get_store().add_element_user(COREBLOCK$0);
            }
            target.set(coreBlock);
        }
    }
    
    /**
     * Appends and returns a new empty "CoreBlock" element
     */
    public gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock addNewCoreBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock target = null;
            target = (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock)get_store().add_element_user(COREBLOCK$0);
            return target;
        }
    }
    /**
     * An XML CoreBlock(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CoreBlockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock
    {
        
        public CoreBlockImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName START$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "start");
        private static final javax.xml.namespace.QName STOP$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "stop");
        private static final javax.xml.namespace.QName MINSTART$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "minstart");
        private static final javax.xml.namespace.QName MAXSTOP$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "maxstop");
        private static final javax.xml.namespace.QName PROPERTY$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "property");
        
        
        /**
         * Gets the "start" element
         */
        public java.math.BigInteger getStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "start" element
         */
        public org.apache.xmlbeans.XmlInteger xgetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(START$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "start" element
         */
        public void setStart(java.math.BigInteger start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(START$0);
                }
                target.setBigIntegerValue(start);
            }
        }
        
        /**
         * Sets (as xml) the "start" element
         */
        public void xsetStart(org.apache.xmlbeans.XmlInteger start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(START$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(START$0);
                }
                target.set(start);
            }
        }
        
        /**
         * Gets the "stop" element
         */
        public java.math.BigInteger getStop()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "stop" element
         */
        public org.apache.xmlbeans.XmlInteger xgetStop()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STOP$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "stop" element
         */
        public void setStop(java.math.BigInteger stop)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOP$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STOP$2);
                }
                target.setBigIntegerValue(stop);
            }
        }
        
        /**
         * Sets (as xml) the "stop" element
         */
        public void xsetStop(org.apache.xmlbeans.XmlInteger stop)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(STOP$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(STOP$2);
                }
                target.set(stop);
            }
        }
        
        /**
         * Gets the "minstart" element
         */
        public java.math.BigInteger getMinstart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINSTART$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "minstart" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMinstart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MINSTART$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "minstart" element
         */
        public boolean isSetMinstart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MINSTART$4) != 0;
            }
        }
        
        /**
         * Sets the "minstart" element
         */
        public void setMinstart(java.math.BigInteger minstart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINSTART$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINSTART$4);
                }
                target.setBigIntegerValue(minstart);
            }
        }
        
        /**
         * Sets (as xml) the "minstart" element
         */
        public void xsetMinstart(org.apache.xmlbeans.XmlInteger minstart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MINSTART$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MINSTART$4);
                }
                target.set(minstart);
            }
        }
        
        /**
         * Unsets the "minstart" element
         */
        public void unsetMinstart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MINSTART$4, 0);
            }
        }
        
        /**
         * Gets the "maxstop" element
         */
        public java.math.BigInteger getMaxstop()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXSTOP$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "maxstop" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMaxstop()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXSTOP$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "maxstop" element
         */
        public boolean isSetMaxstop()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAXSTOP$6) != 0;
            }
        }
        
        /**
         * Sets the "maxstop" element
         */
        public void setMaxstop(java.math.BigInteger maxstop)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXSTOP$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXSTOP$6);
                }
                target.setBigIntegerValue(maxstop);
            }
        }
        
        /**
         * Sets (as xml) the "maxstop" element
         */
        public void xsetMaxstop(org.apache.xmlbeans.XmlInteger maxstop)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MAXSTOP$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MAXSTOP$6);
                }
                target.set(maxstop);
            }
        }
        
        /**
         * Unsets the "maxstop" element
         */
        public void unsetMaxstop()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAXSTOP$6, 0);
            }
        }
        
        /**
         * Gets the "property" element
         */
        public gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property getProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property target = null;
                target = (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property)get_store().find_element_user(PROPERTY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "property" element
         */
        public boolean isSetProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTY$8) != 0;
            }
        }
        
        /**
         * Sets the "property" element
         */
        public void setProperty(gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property target = null;
                target = (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property)get_store().find_element_user(PROPERTY$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property)get_store().add_element_user(PROPERTY$8);
                }
                target.set(property);
            }
        }
        
        /**
         * Appends and returns a new empty "property" element
         */
        public gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property addNewProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property target = null;
                target = (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property)get_store().add_element_user(PROPERTY$8);
                return target;
            }
        }
        
        /**
         * Unsets the "property" element
         */
        public void unsetProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTY$8, 0);
            }
        }
        /**
         * An XML property(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock.Property
        {
            
            public PropertyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLOCKPROPERTY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "BlockProperty");
            
            
            /**
             * Gets array of all "BlockProperty" elements
             */
            public gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty[] getBlockPropertyArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(BLOCKPROPERTY$0, targetList);
                    gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty[] result = new gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "BlockProperty" element
             */
            public gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty getBlockPropertyArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty target = null;
                    target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty)get_store().find_element_user(BLOCKPROPERTY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "BlockProperty" element
             */
            public int sizeOfBlockPropertyArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BLOCKPROPERTY$0);
                }
            }
            
            /**
             * Sets array of all "BlockProperty" element
             */
            public void setBlockPropertyArray(gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty[] blockPropertyArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(blockPropertyArray, BLOCKPROPERTY$0);
                }
            }
            
            /**
             * Sets ith "BlockProperty" element
             */
            public void setBlockPropertyArray(int i, gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty blockProperty)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty target = null;
                    target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty)get_store().find_element_user(BLOCKPROPERTY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(blockProperty);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "BlockProperty" element
             */
            public gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty insertNewBlockProperty(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty target = null;
                    target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty)get_store().insert_element_user(BLOCKPROPERTY$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "BlockProperty" element
             */
            public gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty addNewBlockProperty()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty target = null;
                    target = (gov.nih.nlm.ncbi.www.BlockPropertyDocument.BlockProperty)get_store().add_element_user(BLOCKPROPERTY$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "BlockProperty" element
             */
            public void removeBlockProperty(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BLOCKPROPERTY$0, i);
                }
            }
        }
    }
}
