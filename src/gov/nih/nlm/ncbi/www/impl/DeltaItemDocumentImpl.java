/*
 * An XML document type.
 * Localname: Delta-item
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.DeltaItemDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Delta-item(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class DeltaItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DeltaItemDocument
{
    
    public DeltaItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELTAITEM$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Delta-item");
    
    
    /**
     * Gets the "Delta-item" element
     */
    public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem getDeltaItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem target = null;
            target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem)get_store().find_element_user(DELTAITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Delta-item" element
     */
    public void setDeltaItem(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem deltaItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem target = null;
            target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem)get_store().find_element_user(DELTAITEM$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem)get_store().add_element_user(DELTAITEM$0);
            }
            target.set(deltaItem);
        }
    }
    
    /**
     * Appends and returns a new empty "Delta-item" element
     */
    public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem addNewDeltaItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem target = null;
            target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem)get_store().add_element_user(DELTAITEM$0);
            return target;
        }
    }
    /**
     * An XML Delta-item(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class DeltaItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem
    {
        
        public DeltaItemImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEQ$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seq");
        private static final javax.xml.namespace.QName MULTIPLIER$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "multiplier");
        private static final javax.xml.namespace.QName MULTIPLIERFUZZ$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "multiplier-fuzz");
        private static final javax.xml.namespace.QName ACTION$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "action");
        
        
        /**
         * Gets the "seq" element
         */
        public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq getSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq)get_store().find_element_user(SEQ$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seq" element
         */
        public boolean isSetSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEQ$0) != 0;
            }
        }
        
        /**
         * Sets the "seq" element
         */
        public void setSeq(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq seq)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq)get_store().find_element_user(SEQ$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq)get_store().add_element_user(SEQ$0);
                }
                target.set(seq);
            }
        }
        
        /**
         * Appends and returns a new empty "seq" element
         */
        public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq addNewSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq)get_store().add_element_user(SEQ$0);
                return target;
            }
        }
        
        /**
         * Unsets the "seq" element
         */
        public void unsetSeq()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEQ$0, 0);
            }
        }
        
        /**
         * Gets the "multiplier" element
         */
        public java.math.BigInteger getMultiplier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MULTIPLIER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "multiplier" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMultiplier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MULTIPLIER$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "multiplier" element
         */
        public boolean isSetMultiplier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MULTIPLIER$2) != 0;
            }
        }
        
        /**
         * Sets the "multiplier" element
         */
        public void setMultiplier(java.math.BigInteger multiplier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MULTIPLIER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MULTIPLIER$2);
                }
                target.setBigIntegerValue(multiplier);
            }
        }
        
        /**
         * Sets (as xml) the "multiplier" element
         */
        public void xsetMultiplier(org.apache.xmlbeans.XmlInteger multiplier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MULTIPLIER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MULTIPLIER$2);
                }
                target.set(multiplier);
            }
        }
        
        /**
         * Unsets the "multiplier" element
         */
        public void unsetMultiplier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MULTIPLIER$2, 0);
            }
        }
        
        /**
         * Gets the "multiplier-fuzz" element
         */
        public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz getMultiplierFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz)get_store().find_element_user(MULTIPLIERFUZZ$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "multiplier-fuzz" element
         */
        public boolean isSetMultiplierFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MULTIPLIERFUZZ$4) != 0;
            }
        }
        
        /**
         * Sets the "multiplier-fuzz" element
         */
        public void setMultiplierFuzz(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz multiplierFuzz)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz)get_store().find_element_user(MULTIPLIERFUZZ$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz)get_store().add_element_user(MULTIPLIERFUZZ$4);
                }
                target.set(multiplierFuzz);
            }
        }
        
        /**
         * Appends and returns a new empty "multiplier-fuzz" element
         */
        public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz addNewMultiplierFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz)get_store().add_element_user(MULTIPLIERFUZZ$4);
                return target;
            }
        }
        
        /**
         * Unsets the "multiplier-fuzz" element
         */
        public void unsetMultiplierFuzz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MULTIPLIERFUZZ$4, 0);
            }
        }
        
        /**
         * Gets the "action" element
         */
        public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action getAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action)get_store().find_element_user(ACTION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "action" element
         */
        public boolean isSetAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACTION$6) != 0;
            }
        }
        
        /**
         * Sets the "action" element
         */
        public void setAction(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action action)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action)get_store().find_element_user(ACTION$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action)get_store().add_element_user(ACTION$6);
                }
                target.set(action);
            }
        }
        
        /**
         * Appends and returns a new empty "action" element
         */
        public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action addNewAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action)get_store().add_element_user(ACTION$6);
                return target;
            }
        }
        
        /**
         * Unsets the "action" element
         */
        public void unsetAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACTION$6, 0);
            }
        }
        /**
         * An XML seq(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SeqImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq
        {
            
            public SeqImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName LITERAL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "literal");
            private static final javax.xml.namespace.QName LOC$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "loc");
            private static final javax.xml.namespace.QName THIS$4 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "this");
            
            
            /**
             * Gets the "literal" element
             */
            public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal getLiteral()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal)get_store().find_element_user(LITERAL$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "literal" element
             */
            public boolean isSetLiteral()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LITERAL$0) != 0;
                }
            }
            
            /**
             * Sets the "literal" element
             */
            public void setLiteral(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal literal)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal)get_store().find_element_user(LITERAL$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal)get_store().add_element_user(LITERAL$0);
                    }
                    target.set(literal);
                }
            }
            
            /**
             * Appends and returns a new empty "literal" element
             */
            public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal addNewLiteral()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal)get_store().add_element_user(LITERAL$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "literal" element
             */
            public void unsetLiteral()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LITERAL$0, 0);
                }
            }
            
            /**
             * Gets the "loc" element
             */
            public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc getLoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc)get_store().find_element_user(LOC$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "loc" element
             */
            public boolean isSetLoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LOC$2) != 0;
                }
            }
            
            /**
             * Sets the "loc" element
             */
            public void setLoc(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc loc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc)get_store().find_element_user(LOC$2, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc)get_store().add_element_user(LOC$2);
                    }
                    target.set(loc);
                }
            }
            
            /**
             * Appends and returns a new empty "loc" element
             */
            public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc addNewLoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc)get_store().add_element_user(LOC$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "loc" element
             */
            public void unsetLoc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LOC$2, 0);
                }
            }
            
            /**
             * Gets the "this" element
             */
            public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This getThis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This)get_store().find_element_user(THIS$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "this" element
             */
            public boolean isSetThis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(THIS$4) != 0;
                }
            }
            
            /**
             * Sets the "this" element
             */
            public void setThis(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This xthis)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This)get_store().find_element_user(THIS$4, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This)get_store().add_element_user(THIS$4);
                    }
                    target.set(xthis);
                }
            }
            
            /**
             * Appends and returns a new empty "this" element
             */
            public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This addNewThis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This)get_store().add_element_user(THIS$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "this" element
             */
            public void unsetThis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(THIS$4, 0);
                }
            }
            /**
             * An XML literal(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class LiteralImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Literal
            {
                
                public LiteralImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SEQLITERAL$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-literal");
                
                
                /**
                 * Gets the "Seq-literal" element
                 */
                public gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral getSeqLiteral()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral)get_store().find_element_user(SEQLITERAL$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Seq-literal" element
                 */
                public void setSeqLiteral(gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral seqLiteral)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral)get_store().find_element_user(SEQLITERAL$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral)get_store().add_element_user(SEQLITERAL$0);
                      }
                      target.set(seqLiteral);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Seq-literal" element
                 */
                public gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral addNewSeqLiteral()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqLiteralDocument.SeqLiteral)get_store().add_element_user(SEQLITERAL$0);
                      return target;
                    }
                }
            }
            /**
             * An XML loc(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class LocImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.Loc
            {
                
                public LocImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SEQLOC$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-loc");
                
                
                /**
                 * Gets the "Seq-loc" element
                 */
                public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Seq-loc" element
                 */
                public void setSeqLoc(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().add_element_user(SEQLOC$0);
                      }
                      target.set(seqLoc);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Seq-loc" element
                 */
                public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                      target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().add_element_user(SEQLOC$0);
                      return target;
                    }
                }
            }
            /**
             * An XML this(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class ThisImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Seq.This
            {
                
                public ThisImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                
            }
        }
        /**
         * An XML multiplier-fuzz(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MultiplierFuzzImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.MultiplierFuzz
        {
            
            public MultiplierFuzzImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INTFUZZ$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Int-fuzz");
            
            
            /**
             * Gets the "Int-fuzz" element
             */
            public gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz getIntFuzz()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz target = null;
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().find_element_user(INTFUZZ$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Int-fuzz" element
             */
            public void setIntFuzz(gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz intFuzz)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz target = null;
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().find_element_user(INTFUZZ$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().add_element_user(INTFUZZ$0);
                    }
                    target.set(intFuzz);
                }
            }
            
            /**
             * Appends and returns a new empty "Int-fuzz" element
             */
            public gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz addNewIntFuzz()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz target = null;
                    target = (gov.nih.nlm.ncbi.www.IntFuzzDocument.IntFuzz)get_store().add_element_user(INTFUZZ$0);
                    return target;
                }
            }
        }
        /**
         * An XML action(@http://www.ncbi.nlm.nih.gov).
         *
         * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.DeltaItemDocument$DeltaItem$Action.
         */
        public static class ActionImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action
        {
            
            public ActionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected ActionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value.Enum getValue()
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
                    return (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value)get_default_attribute_value(VALUE$0);
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
            public void setValue(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value.Enum value)
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
            public void xsetValue(gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value)get_store().add_attribute_user(VALUE$0);
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
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.DeltaItemDocument$DeltaItem$Action$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.DeltaItemDocument.DeltaItem.Action.Value
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
