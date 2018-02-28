/*
 * An XML document type.
 * Localname: Spliced-seg-modifier
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SplicedSegModifierDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Spliced-seg-modifier(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SplicedSegModifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedSegModifierDocument
{
    
    public SplicedSegModifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPLICEDSEGMODIFIER$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Spliced-seg-modifier");
    
    
    /**
     * Gets the "Spliced-seg-modifier" element
     */
    public gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier getSplicedSegModifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier target = null;
            target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier)get_store().find_element_user(SPLICEDSEGMODIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Spliced-seg-modifier" element
     */
    public void setSplicedSegModifier(gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier splicedSegModifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier target = null;
            target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier)get_store().find_element_user(SPLICEDSEGMODIFIER$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier)get_store().add_element_user(SPLICEDSEGMODIFIER$0);
            }
            target.set(splicedSegModifier);
        }
    }
    
    /**
     * Appends and returns a new empty "Spliced-seg-modifier" element
     */
    public gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier addNewSplicedSegModifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier target = null;
            target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier)get_store().add_element_user(SPLICEDSEGMODIFIER$0);
            return target;
        }
    }
    /**
     * An XML Spliced-seg-modifier(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SplicedSegModifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier
    {
        
        public SplicedSegModifierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STARTCODONFOUND$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "start-codon-found");
        private static final javax.xml.namespace.QName STOPCODONFOUND$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "stop-codon-found");
        
        
        /**
         * Gets the "start-codon-found" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound getStartCodonFound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound)get_store().find_element_user(STARTCODONFOUND$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "start-codon-found" element
         */
        public boolean isSetStartCodonFound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTCODONFOUND$0) != 0;
            }
        }
        
        /**
         * Sets the "start-codon-found" element
         */
        public void setStartCodonFound(gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound startCodonFound)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound)get_store().find_element_user(STARTCODONFOUND$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound)get_store().add_element_user(STARTCODONFOUND$0);
                }
                target.set(startCodonFound);
            }
        }
        
        /**
         * Appends and returns a new empty "start-codon-found" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound addNewStartCodonFound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound)get_store().add_element_user(STARTCODONFOUND$0);
                return target;
            }
        }
        
        /**
         * Unsets the "start-codon-found" element
         */
        public void unsetStartCodonFound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTCODONFOUND$0, 0);
            }
        }
        
        /**
         * Gets the "stop-codon-found" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound getStopCodonFound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound)get_store().find_element_user(STOPCODONFOUND$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "stop-codon-found" element
         */
        public boolean isSetStopCodonFound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STOPCODONFOUND$2) != 0;
            }
        }
        
        /**
         * Sets the "stop-codon-found" element
         */
        public void setStopCodonFound(gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound stopCodonFound)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound)get_store().find_element_user(STOPCODONFOUND$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound)get_store().add_element_user(STOPCODONFOUND$2);
                }
                target.set(stopCodonFound);
            }
        }
        
        /**
         * Appends and returns a new empty "stop-codon-found" element
         */
        public gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound addNewStopCodonFound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound target = null;
                target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound)get_store().add_element_user(STOPCODONFOUND$2);
                return target;
            }
        }
        
        /**
         * Unsets the "stop-codon-found" element
         */
        public void unsetStopCodonFound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STOPCODONFOUND$2, 0);
            }
        }
        /**
         * An XML start-codon-found(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class StartCodonFoundImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound
        {
            
            public StartCodonFoundImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SplicedSegModifierDocument$SplicedSegModifier$StartCodonFound$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StartCodonFound.Value
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
         * An XML stop-codon-found(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class StopCodonFoundImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound
        {
            
            public StopCodonFoundImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound.Value)get_store().find_attribute_user(VALUE$0);
                    return target;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.SplicedSegModifierDocument$SplicedSegModifier$StopCodonFound$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.SplicedSegModifierDocument.SplicedSegModifier.StopCodonFound.Value
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
