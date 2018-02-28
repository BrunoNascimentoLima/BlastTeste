/*
 * An XML document type.
 * Localname: Seq-bond
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqBondDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-bond(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqBondDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqBondDocument
{
    
    public SeqBondDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQBOND$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-bond");
    
    
    /**
     * Gets the "Seq-bond" element
     */
    public gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond getSeqBond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond target = null;
            target = (gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond)get_store().find_element_user(SEQBOND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-bond" element
     */
    public void setSeqBond(gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond seqBond)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond target = null;
            target = (gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond)get_store().find_element_user(SEQBOND$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond)get_store().add_element_user(SEQBOND$0);
            }
            target.set(seqBond);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-bond" element
     */
    public gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond addNewSeqBond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond target = null;
            target = (gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond)get_store().add_element_user(SEQBOND$0);
            return target;
        }
    }
    /**
     * An XML Seq-bond(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqBondImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond
    {
        
        public SeqBondImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName A$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "a");
        private static final javax.xml.namespace.QName B$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "b");
        
        
        /**
         * Gets the "a" element
         */
        public gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.A getA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.A target = null;
                target = (gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.A)get_store().find_element_user(A$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "a" element
         */
        public void setA(gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.A a)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.A target = null;
                target = (gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.A)get_store().find_element_user(A$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.A)get_store().add_element_user(A$0);
                }
                target.set(a);
            }
        }
        
        /**
         * Appends and returns a new empty "a" element
         */
        public gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.A addNewA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.A target = null;
                target = (gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.A)get_store().add_element_user(A$0);
                return target;
            }
        }
        
        /**
         * Gets the "b" element
         */
        public gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.B getB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.B target = null;
                target = (gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.B)get_store().find_element_user(B$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "b" element
         */
        public boolean isSetB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(B$2) != 0;
            }
        }
        
        /**
         * Sets the "b" element
         */
        public void setB(gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.B b)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.B target = null;
                target = (gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.B)get_store().find_element_user(B$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.B)get_store().add_element_user(B$2);
                }
                target.set(b);
            }
        }
        
        /**
         * Appends and returns a new empty "b" element
         */
        public gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.B addNewB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.B target = null;
                target = (gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.B)get_store().add_element_user(B$2);
                return target;
            }
        }
        
        /**
         * Unsets the "b" element
         */
        public void unsetB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(B$2, 0);
            }
        }
        /**
         * An XML a(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class AImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.A
        {
            
            public AImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQPOINT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-point");
            
            
            /**
             * Gets the "Seq-point" element
             */
            public gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint getSeqPoint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint)get_store().find_element_user(SEQPOINT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-point" element
             */
            public void setSeqPoint(gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint seqPoint)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint)get_store().find_element_user(SEQPOINT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint)get_store().add_element_user(SEQPOINT$0);
                    }
                    target.set(seqPoint);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-point" element
             */
            public gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint addNewSeqPoint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint)get_store().add_element_user(SEQPOINT$0);
                    return target;
                }
            }
        }
        /**
         * An XML b(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond.B
        {
            
            public BImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQPOINT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-point");
            
            
            /**
             * Gets the "Seq-point" element
             */
            public gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint getSeqPoint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint)get_store().find_element_user(SEQPOINT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-point" element
             */
            public void setSeqPoint(gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint seqPoint)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint)get_store().find_element_user(SEQPOINT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint)get_store().add_element_user(SEQPOINT$0);
                    }
                    target.set(seqPoint);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-point" element
             */
            public gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint addNewSeqPoint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint)get_store().add_element_user(SEQPOINT$0);
                    return target;
                }
            }
        }
    }
}
