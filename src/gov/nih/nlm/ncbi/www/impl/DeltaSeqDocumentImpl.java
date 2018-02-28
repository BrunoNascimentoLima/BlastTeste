/*
 * An XML document type.
 * Localname: Delta-seq
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.DeltaSeqDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Delta-seq(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class DeltaSeqDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DeltaSeqDocument
{
    
    public DeltaSeqDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELTASEQ$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Delta-seq");
    
    
    /**
     * Gets the "Delta-seq" element
     */
    public gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq getDeltaSeq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq target = null;
            target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq)get_store().find_element_user(DELTASEQ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Delta-seq" element
     */
    public void setDeltaSeq(gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq deltaSeq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq target = null;
            target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq)get_store().find_element_user(DELTASEQ$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq)get_store().add_element_user(DELTASEQ$0);
            }
            target.set(deltaSeq);
        }
    }
    
    /**
     * Appends and returns a new empty "Delta-seq" element
     */
    public gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq addNewDeltaSeq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq target = null;
            target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq)get_store().add_element_user(DELTASEQ$0);
            return target;
        }
    }
    /**
     * An XML Delta-seq(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class DeltaSeqImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq
    {
        
        public DeltaSeqImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOC$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "loc");
        private static final javax.xml.namespace.QName LITERAL$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "literal");
        
        
        /**
         * Gets the "loc" element
         */
        public gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Loc getLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Loc)get_store().find_element_user(LOC$0, 0);
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
                return get_store().count_elements(LOC$0) != 0;
            }
        }
        
        /**
         * Sets the "loc" element
         */
        public void setLoc(gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Loc loc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Loc)get_store().find_element_user(LOC$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Loc)get_store().add_element_user(LOC$0);
                }
                target.set(loc);
            }
        }
        
        /**
         * Appends and returns a new empty "loc" element
         */
        public gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Loc addNewLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Loc)get_store().add_element_user(LOC$0);
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
                get_store().remove_element(LOC$0, 0);
            }
        }
        
        /**
         * Gets the "literal" element
         */
        public gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Literal getLiteral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Literal target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Literal)get_store().find_element_user(LITERAL$2, 0);
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
                return get_store().count_elements(LITERAL$2) != 0;
            }
        }
        
        /**
         * Sets the "literal" element
         */
        public void setLiteral(gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Literal literal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Literal target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Literal)get_store().find_element_user(LITERAL$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Literal)get_store().add_element_user(LITERAL$2);
                }
                target.set(literal);
            }
        }
        
        /**
         * Appends and returns a new empty "literal" element
         */
        public gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Literal addNewLiteral()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Literal target = null;
                target = (gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Literal)get_store().add_element_user(LITERAL$2);
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
                get_store().remove_element(LITERAL$2, 0);
            }
        }
        /**
         * An XML loc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LocImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Loc
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
         * An XML literal(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LiteralImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.DeltaSeqDocument.DeltaSeq.Literal
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
    }
}
