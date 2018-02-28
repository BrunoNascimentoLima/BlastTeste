/*
 * An XML document type.
 * Localname: BioSource
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.BioSourceDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one BioSource(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class BioSourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioSourceDocument
{
    
    public BioSourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BIOSOURCE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "BioSource");
    
    
    /**
     * Gets the "BioSource" element
     */
    public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource getBioSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource target = null;
            target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource)get_store().find_element_user(BIOSOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BioSource" element
     */
    public void setBioSource(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource bioSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource target = null;
            target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource)get_store().find_element_user(BIOSOURCE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource)get_store().add_element_user(BIOSOURCE$0);
            }
            target.set(bioSource);
        }
    }
    
    /**
     * Appends and returns a new empty "BioSource" element
     */
    public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource addNewBioSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource target = null;
            target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource)get_store().add_element_user(BIOSOURCE$0);
            return target;
        }
    }
    /**
     * An XML BioSource(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class BioSourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource
    {
        
        public BioSourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GENOME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "genome");
        private static final javax.xml.namespace.QName ORIGIN$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "origin");
        private static final javax.xml.namespace.QName ORG$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "org");
        private static final javax.xml.namespace.QName SUBTYPE$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "subtype");
        private static final javax.xml.namespace.QName ISFOCUS$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "is-focus");
        private static final javax.xml.namespace.QName PCRPRIMERS$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pcr-primers");
        
        
        /**
         * Gets the "genome" element
         */
        public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome getGenome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome)get_store().find_element_user(GENOME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "genome" element
         */
        public boolean isSetGenome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENOME$0) != 0;
            }
        }
        
        /**
         * Sets the "genome" element
         */
        public void setGenome(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome genome)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome)get_store().find_element_user(GENOME$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome)get_store().add_element_user(GENOME$0);
                }
                target.set(genome);
            }
        }
        
        /**
         * Appends and returns a new empty "genome" element
         */
        public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome addNewGenome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome)get_store().add_element_user(GENOME$0);
                return target;
            }
        }
        
        /**
         * Unsets the "genome" element
         */
        public void unsetGenome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENOME$0, 0);
            }
        }
        
        /**
         * Gets the "origin" element
         */
        public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin getOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin)get_store().find_element_user(ORIGIN$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "origin" element
         */
        public boolean isSetOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORIGIN$2) != 0;
            }
        }
        
        /**
         * Sets the "origin" element
         */
        public void setOrigin(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin origin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin)get_store().find_element_user(ORIGIN$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin)get_store().add_element_user(ORIGIN$2);
                }
                target.set(origin);
            }
        }
        
        /**
         * Appends and returns a new empty "origin" element
         */
        public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin addNewOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin)get_store().add_element_user(ORIGIN$2);
                return target;
            }
        }
        
        /**
         * Unsets the "origin" element
         */
        public void unsetOrigin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORIGIN$2, 0);
            }
        }
        
        /**
         * Gets the "org" element
         */
        public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org getOrg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org)get_store().find_element_user(ORG$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "org" element
         */
        public void setOrg(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org org)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org)get_store().find_element_user(ORG$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org)get_store().add_element_user(ORG$4);
                }
                target.set(org);
            }
        }
        
        /**
         * Appends and returns a new empty "org" element
         */
        public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org addNewOrg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org)get_store().add_element_user(ORG$4);
                return target;
            }
        }
        
        /**
         * Gets the "subtype" element
         */
        public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype getSubtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype)get_store().find_element_user(SUBTYPE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "subtype" element
         */
        public boolean isSetSubtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBTYPE$6) != 0;
            }
        }
        
        /**
         * Sets the "subtype" element
         */
        public void setSubtype(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype subtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype)get_store().find_element_user(SUBTYPE$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype)get_store().add_element_user(SUBTYPE$6);
                }
                target.set(subtype);
            }
        }
        
        /**
         * Appends and returns a new empty "subtype" element
         */
        public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype addNewSubtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype)get_store().add_element_user(SUBTYPE$6);
                return target;
            }
        }
        
        /**
         * Unsets the "subtype" element
         */
        public void unsetSubtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBTYPE$6, 0);
            }
        }
        
        /**
         * Gets the "is-focus" element
         */
        public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus getIsFocus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus)get_store().find_element_user(ISFOCUS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "is-focus" element
         */
        public boolean isSetIsFocus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ISFOCUS$8) != 0;
            }
        }
        
        /**
         * Sets the "is-focus" element
         */
        public void setIsFocus(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus isFocus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus)get_store().find_element_user(ISFOCUS$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus)get_store().add_element_user(ISFOCUS$8);
                }
                target.set(isFocus);
            }
        }
        
        /**
         * Appends and returns a new empty "is-focus" element
         */
        public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus addNewIsFocus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus)get_store().add_element_user(ISFOCUS$8);
                return target;
            }
        }
        
        /**
         * Unsets the "is-focus" element
         */
        public void unsetIsFocus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ISFOCUS$8, 0);
            }
        }
        
        /**
         * Gets the "pcr-primers" element
         */
        public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers getPcrPrimers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers)get_store().find_element_user(PCRPRIMERS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pcr-primers" element
         */
        public boolean isSetPcrPrimers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PCRPRIMERS$10) != 0;
            }
        }
        
        /**
         * Sets the "pcr-primers" element
         */
        public void setPcrPrimers(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers pcrPrimers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers)get_store().find_element_user(PCRPRIMERS$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers)get_store().add_element_user(PCRPRIMERS$10);
                }
                target.set(pcrPrimers);
            }
        }
        
        /**
         * Appends and returns a new empty "pcr-primers" element
         */
        public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers addNewPcrPrimers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers target = null;
                target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers)get_store().add_element_user(PCRPRIMERS$10);
                return target;
            }
        }
        
        /**
         * Unsets the "pcr-primers" element
         */
        public void unsetPcrPrimers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PCRPRIMERS$10, 0);
            }
        }
        /**
         * An XML genome(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.BioSourceDocument$BioSource$Genome.
         */
        public static class GenomeImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome
        {
            
            public GenomeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected GenomeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.BioSourceDocument$BioSource$Genome$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Genome.Value
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
         * An XML origin(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.BioSourceDocument$BioSource$Origin.
         */
        public static class OriginImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin
        {
            
            public OriginImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected OriginImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.BioSourceDocument$BioSource$Origin$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Origin.Value
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
         * An XML org(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class OrgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Org
        {
            
            public OrgImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML subtype(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SubtypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.Subtype
        {
            
            public SubtypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SUBSOURCE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SubSource");
            
            
            /**
             * Gets array of all "SubSource" elements
             */
            public gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource[] getSubSourceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SUBSOURCE$0, targetList);
                    gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource[] result = new gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "SubSource" element
             */
            public gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource getSubSourceArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource target = null;
                    target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource)get_store().find_element_user(SUBSOURCE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "SubSource" element
             */
            public int sizeOfSubSourceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SUBSOURCE$0);
                }
            }
            
            /**
             * Sets array of all "SubSource" element
             */
            public void setSubSourceArray(gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource[] subSourceArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(subSourceArray, SUBSOURCE$0);
                }
            }
            
            /**
             * Sets ith "SubSource" element
             */
            public void setSubSourceArray(int i, gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource subSource)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource target = null;
                    target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource)get_store().find_element_user(SUBSOURCE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(subSource);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "SubSource" element
             */
            public gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource insertNewSubSource(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource target = null;
                    target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource)get_store().insert_element_user(SUBSOURCE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "SubSource" element
             */
            public gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource addNewSubSource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource target = null;
                    target = (gov.nih.nlm.ncbi.www.SubSourceDocument.SubSource)get_store().add_element_user(SUBSOURCE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "SubSource" element
             */
            public void removeSubSource(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SUBSOURCE$0, i);
                }
            }
        }
        /**
         * An XML is-focus(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IsFocusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.IsFocus
        {
            
            public IsFocusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML pcr-primers(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PcrPrimersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource.PcrPrimers
        {
            
            public PcrPrimersImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PCRREACTIONSET$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PCRReactionSet");
            
            
            /**
             * Gets the "PCRReactionSet" element
             */
            public gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet getPCRReactionSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet)get_store().find_element_user(PCRREACTIONSET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PCRReactionSet" element
             */
            public void setPCRReactionSet(gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet pcrReactionSet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet)get_store().find_element_user(PCRREACTIONSET$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet)get_store().add_element_user(PCRREACTIONSET$0);
                    }
                    target.set(pcrReactionSet);
                }
            }
            
            /**
             * Appends and returns a new empty "PCRReactionSet" element
             */
            public gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet addNewPCRReactionSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet target = null;
                    target = (gov.nih.nlm.ncbi.www.PCRReactionSetDocument.PCRReactionSet)get_store().add_element_user(PCRREACTIONSET$0);
                    return target;
                }
            }
        }
    }
}
