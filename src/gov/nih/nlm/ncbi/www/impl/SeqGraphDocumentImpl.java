/*
 * An XML document type.
 * Localname: Seq-graph
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqGraphDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-graph(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqGraphDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqGraphDocument
{
    
    public SeqGraphDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQGRAPH$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-graph");
    
    
    /**
     * Gets the "Seq-graph" element
     */
    public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph getSeqGraph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph target = null;
            target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph)get_store().find_element_user(SEQGRAPH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-graph" element
     */
    public void setSeqGraph(gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph seqGraph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph target = null;
            target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph)get_store().find_element_user(SEQGRAPH$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph)get_store().add_element_user(SEQGRAPH$0);
            }
            target.set(seqGraph);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-graph" element
     */
    public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph addNewSeqGraph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph target = null;
            target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph)get_store().add_element_user(SEQGRAPH$0);
            return target;
        }
    }
    /**
     * An XML Seq-graph(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqGraphImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph
    {
        
        public SeqGraphImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "title");
        private static final javax.xml.namespace.QName COMMENT$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "comment");
        private static final javax.xml.namespace.QName LOC$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "loc");
        private static final javax.xml.namespace.QName TITLEX$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "title-x");
        private static final javax.xml.namespace.QName TITLEY$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "title-y");
        private static final javax.xml.namespace.QName COMP$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "comp");
        private static final javax.xml.namespace.QName A$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "a");
        private static final javax.xml.namespace.QName B$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "b");
        private static final javax.xml.namespace.QName NUMVAL$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "numval");
        private static final javax.xml.namespace.QName GRAPH$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "graph");
        
        
        /**
         * Gets the "title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" element
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "title" element
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLE$0) != 0;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$0);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" element
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$0);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "title" element
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLE$0, 0);
            }
        }
        
        /**
         * Gets the "comment" element
         */
        public java.lang.String getComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "comment" element
         */
        public org.apache.xmlbeans.XmlString xgetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "comment" element
         */
        public boolean isSetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMENT$2) != 0;
            }
        }
        
        /**
         * Sets the "comment" element
         */
        public void setComment(java.lang.String comment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENT$2);
                }
                target.setStringValue(comment);
            }
        }
        
        /**
         * Sets (as xml) the "comment" element
         */
        public void xsetComment(org.apache.xmlbeans.XmlString comment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENT$2);
                }
                target.set(comment);
            }
        }
        
        /**
         * Unsets the "comment" element
         */
        public void unsetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMENT$2, 0);
            }
        }
        
        /**
         * Gets the "loc" element
         */
        public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc getLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc)get_store().find_element_user(LOC$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "loc" element
         */
        public void setLoc(gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc loc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc)get_store().find_element_user(LOC$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc)get_store().add_element_user(LOC$4);
                }
                target.set(loc);
            }
        }
        
        /**
         * Appends and returns a new empty "loc" element
         */
        public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc addNewLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc)get_store().add_element_user(LOC$4);
                return target;
            }
        }
        
        /**
         * Gets the "title-x" element
         */
        public java.lang.String getTitleX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLEX$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title-x" element
         */
        public org.apache.xmlbeans.XmlString xgetTitleX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLEX$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "title-x" element
         */
        public boolean isSetTitleX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLEX$6) != 0;
            }
        }
        
        /**
         * Sets the "title-x" element
         */
        public void setTitleX(java.lang.String titleX)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLEX$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLEX$6);
                }
                target.setStringValue(titleX);
            }
        }
        
        /**
         * Sets (as xml) the "title-x" element
         */
        public void xsetTitleX(org.apache.xmlbeans.XmlString titleX)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLEX$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLEX$6);
                }
                target.set(titleX);
            }
        }
        
        /**
         * Unsets the "title-x" element
         */
        public void unsetTitleX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLEX$6, 0);
            }
        }
        
        /**
         * Gets the "title-y" element
         */
        public java.lang.String getTitleY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLEY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title-y" element
         */
        public org.apache.xmlbeans.XmlString xgetTitleY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLEY$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "title-y" element
         */
        public boolean isSetTitleY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLEY$8) != 0;
            }
        }
        
        /**
         * Sets the "title-y" element
         */
        public void setTitleY(java.lang.String titleY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLEY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLEY$8);
                }
                target.setStringValue(titleY);
            }
        }
        
        /**
         * Sets (as xml) the "title-y" element
         */
        public void xsetTitleY(org.apache.xmlbeans.XmlString titleY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLEY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLEY$8);
                }
                target.set(titleY);
            }
        }
        
        /**
         * Unsets the "title-y" element
         */
        public void unsetTitleY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLEY$8, 0);
            }
        }
        
        /**
         * Gets the "comp" element
         */
        public java.math.BigInteger getComp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMP$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "comp" element
         */
        public org.apache.xmlbeans.XmlInteger xgetComp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COMP$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "comp" element
         */
        public boolean isSetComp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMP$10) != 0;
            }
        }
        
        /**
         * Sets the "comp" element
         */
        public void setComp(java.math.BigInteger comp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMP$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMP$10);
                }
                target.setBigIntegerValue(comp);
            }
        }
        
        /**
         * Sets (as xml) the "comp" element
         */
        public void xsetComp(org.apache.xmlbeans.XmlInteger comp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COMP$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(COMP$10);
                }
                target.set(comp);
            }
        }
        
        /**
         * Unsets the "comp" element
         */
        public void unsetComp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMP$10, 0);
            }
        }
        
        /**
         * Gets the "a" element
         */
        public double getA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(A$12, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "a" element
         */
        public org.apache.xmlbeans.XmlDouble xgetA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(A$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "a" element
         */
        public boolean isSetA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(A$12) != 0;
            }
        }
        
        /**
         * Sets the "a" element
         */
        public void setA(double a)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(A$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(A$12);
                }
                target.setDoubleValue(a);
            }
        }
        
        /**
         * Sets (as xml) the "a" element
         */
        public void xsetA(org.apache.xmlbeans.XmlDouble a)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(A$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(A$12);
                }
                target.set(a);
            }
        }
        
        /**
         * Unsets the "a" element
         */
        public void unsetA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(A$12, 0);
            }
        }
        
        /**
         * Gets the "b" element
         */
        public double getB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(B$14, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "b" element
         */
        public org.apache.xmlbeans.XmlDouble xgetB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(B$14, 0);
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
                return get_store().count_elements(B$14) != 0;
            }
        }
        
        /**
         * Sets the "b" element
         */
        public void setB(double b)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(B$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(B$14);
                }
                target.setDoubleValue(b);
            }
        }
        
        /**
         * Sets (as xml) the "b" element
         */
        public void xsetB(org.apache.xmlbeans.XmlDouble b)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(B$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(B$14);
                }
                target.set(b);
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
                get_store().remove_element(B$14, 0);
            }
        }
        
        /**
         * Gets the "numval" element
         */
        public java.math.BigInteger getNumval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMVAL$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "numval" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNumval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMVAL$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numval" element
         */
        public void setNumval(java.math.BigInteger numval)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMVAL$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMVAL$16);
                }
                target.setBigIntegerValue(numval);
            }
        }
        
        /**
         * Sets (as xml) the "numval" element
         */
        public void xsetNumval(org.apache.xmlbeans.XmlInteger numval)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMVAL$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMVAL$16);
                }
                target.set(numval);
            }
        }
        
        /**
         * Gets the "graph" element
         */
        public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph getGraph()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph target = null;
                target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph)get_store().find_element_user(GRAPH$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "graph" element
         */
        public void setGraph(gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph graph)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph target = null;
                target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph)get_store().find_element_user(GRAPH$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph)get_store().add_element_user(GRAPH$18);
                }
                target.set(graph);
            }
        }
        
        /**
         * Appends and returns a new empty "graph" element
         */
        public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph addNewGraph()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph target = null;
                target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph)get_store().add_element_user(GRAPH$18);
                return target;
            }
        }
        /**
         * An XML loc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LocImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Loc
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
         * An XML graph(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GraphImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph
        {
            
            public GraphImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName REAL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "real");
            private static final javax.xml.namespace.QName INT$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "int");
            private static final javax.xml.namespace.QName BYTE$4 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "byte");
            
            
            /**
             * Gets the "real" element
             */
            public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real getReal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real)get_store().find_element_user(REAL$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "real" element
             */
            public boolean isSetReal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REAL$0) != 0;
                }
            }
            
            /**
             * Sets the "real" element
             */
            public void setReal(gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real real)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real)get_store().find_element_user(REAL$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real)get_store().add_element_user(REAL$0);
                    }
                    target.set(real);
                }
            }
            
            /**
             * Appends and returns a new empty "real" element
             */
            public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real addNewReal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real)get_store().add_element_user(REAL$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "real" element
             */
            public void unsetReal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REAL$0, 0);
                }
            }
            
            /**
             * Gets the "int" element
             */
            public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int getInt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int)get_store().find_element_user(INT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "int" element
             */
            public boolean isSetInt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INT$2) != 0;
                }
            }
            
            /**
             * Sets the "int" element
             */
            public void setInt(gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int xint)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int)get_store().find_element_user(INT$2, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int)get_store().add_element_user(INT$2);
                    }
                    target.set(xint);
                }
            }
            
            /**
             * Appends and returns a new empty "int" element
             */
            public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int addNewInt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int)get_store().add_element_user(INT$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "int" element
             */
            public void unsetInt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INT$2, 0);
                }
            }
            
            /**
             * Gets the "byte" element
             */
            public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte getByte()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte)get_store().find_element_user(BYTE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "byte" element
             */
            public boolean isSetByte()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BYTE$4) != 0;
                }
            }
            
            /**
             * Sets the "byte" element
             */
            public void setByte(gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte xbyte)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte)get_store().find_element_user(BYTE$4, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte)get_store().add_element_user(BYTE$4);
                    }
                    target.set(xbyte);
                }
            }
            
            /**
             * Appends and returns a new empty "byte" element
             */
            public gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte addNewByte()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte)get_store().add_element_user(BYTE$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "byte" element
             */
            public void unsetByte()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BYTE$4, 0);
                }
            }
            /**
             * An XML real(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class RealImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Real
            {
                
                public RealImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName REALGRAPH$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Real-graph");
                
                
                /**
                 * Gets the "Real-graph" element
                 */
                public gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph getRealGraph()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph target = null;
                      target = (gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph)get_store().find_element_user(REALGRAPH$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Real-graph" element
                 */
                public void setRealGraph(gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph realGraph)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph target = null;
                      target = (gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph)get_store().find_element_user(REALGRAPH$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph)get_store().add_element_user(REALGRAPH$0);
                      }
                      target.set(realGraph);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Real-graph" element
                 */
                public gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph addNewRealGraph()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph target = null;
                      target = (gov.nih.nlm.ncbi.www.RealGraphDocument.RealGraph)get_store().add_element_user(REALGRAPH$0);
                      return target;
                    }
                }
            }
            /**
             * An XML int(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class IntImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Int
            {
                
                public IntImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName INTGRAPH$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Int-graph");
                
                
                /**
                 * Gets the "Int-graph" element
                 */
                public gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph getIntGraph()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph target = null;
                      target = (gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph)get_store().find_element_user(INTGRAPH$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Int-graph" element
                 */
                public void setIntGraph(gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph intGraph)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph target = null;
                      target = (gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph)get_store().find_element_user(INTGRAPH$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph)get_store().add_element_user(INTGRAPH$0);
                      }
                      target.set(intGraph);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Int-graph" element
                 */
                public gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph addNewIntGraph()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph target = null;
                      target = (gov.nih.nlm.ncbi.www.IntGraphDocument.IntGraph)get_store().add_element_user(INTGRAPH$0);
                      return target;
                    }
                }
            }
            /**
             * An XML byte(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class ByteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqGraphDocument.SeqGraph.Graph.Byte
            {
                
                public ByteImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName BYTEGRAPH$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Byte-graph");
                
                
                /**
                 * Gets the "Byte-graph" element
                 */
                public gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph getByteGraph()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph target = null;
                      target = (gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph)get_store().find_element_user(BYTEGRAPH$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Byte-graph" element
                 */
                public void setByteGraph(gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph byteGraph)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph target = null;
                      target = (gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph)get_store().find_element_user(BYTEGRAPH$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph)get_store().add_element_user(BYTEGRAPH$0);
                      }
                      target.set(byteGraph);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Byte-graph" element
                 */
                public gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph addNewByteGraph()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph target = null;
                      target = (gov.nih.nlm.ncbi.www.ByteGraphDocument.ByteGraph)get_store().add_element_user(BYTEGRAPH$0);
                      return target;
                    }
                }
            }
        }
    }
}
