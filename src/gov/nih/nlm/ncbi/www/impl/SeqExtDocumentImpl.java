/*
 * An XML document type.
 * Localname: Seq-ext
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqExtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-ext(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqExtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqExtDocument
{
    
    public SeqExtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQEXT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-ext");
    
    
    /**
     * Gets the "Seq-ext" element
     */
    public gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt getSeqExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt target = null;
            target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt)get_store().find_element_user(SEQEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seq-ext" element
     */
    public void setSeqExt(gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt seqExt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt target = null;
            target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt)get_store().find_element_user(SEQEXT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt)get_store().add_element_user(SEQEXT$0);
            }
            target.set(seqExt);
        }
    }
    
    /**
     * Appends and returns a new empty "Seq-ext" element
     */
    public gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt addNewSeqExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt target = null;
            target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt)get_store().add_element_user(SEQEXT$0);
            return target;
        }
    }
    /**
     * An XML Seq-ext(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt
    {
        
        public SeqExtImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEG$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "seg");
        private static final javax.xml.namespace.QName REF$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ref");
        private static final javax.xml.namespace.QName MAP$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "map");
        private static final javax.xml.namespace.QName DELTA$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "delta");
        
        
        /**
         * Gets the "seg" element
         */
        public gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg getSeg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg target = null;
                target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg)get_store().find_element_user(SEG$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "seg" element
         */
        public boolean isSetSeg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEG$0) != 0;
            }
        }
        
        /**
         * Sets the "seg" element
         */
        public void setSeg(gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg seg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg target = null;
                target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg)get_store().find_element_user(SEG$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg)get_store().add_element_user(SEG$0);
                }
                target.set(seg);
            }
        }
        
        /**
         * Appends and returns a new empty "seg" element
         */
        public gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg addNewSeg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg target = null;
                target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg)get_store().add_element_user(SEG$0);
                return target;
            }
        }
        
        /**
         * Unsets the "seg" element
         */
        public void unsetSeg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEG$0, 0);
            }
        }
        
        /**
         * Gets the "ref" element
         */
        public gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref getRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref target = null;
                target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref)get_store().find_element_user(REF$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ref" element
         */
        public boolean isSetRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REF$2) != 0;
            }
        }
        
        /**
         * Sets the "ref" element
         */
        public void setRef(gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref target = null;
                target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref)get_store().find_element_user(REF$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref)get_store().add_element_user(REF$2);
                }
                target.set(ref);
            }
        }
        
        /**
         * Appends and returns a new empty "ref" element
         */
        public gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref addNewRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref target = null;
                target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref)get_store().add_element_user(REF$2);
                return target;
            }
        }
        
        /**
         * Unsets the "ref" element
         */
        public void unsetRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REF$2, 0);
            }
        }
        
        /**
         * Gets the "map" element
         */
        public gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map getMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map target = null;
                target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map)get_store().find_element_user(MAP$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "map" element
         */
        public boolean isSetMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAP$4) != 0;
            }
        }
        
        /**
         * Sets the "map" element
         */
        public void setMap(gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map map)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map target = null;
                target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map)get_store().find_element_user(MAP$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map)get_store().add_element_user(MAP$4);
                }
                target.set(map);
            }
        }
        
        /**
         * Appends and returns a new empty "map" element
         */
        public gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map addNewMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map target = null;
                target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map)get_store().add_element_user(MAP$4);
                return target;
            }
        }
        
        /**
         * Unsets the "map" element
         */
        public void unsetMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAP$4, 0);
            }
        }
        
        /**
         * Gets the "delta" element
         */
        public gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta getDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta target = null;
                target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta)get_store().find_element_user(DELTA$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "delta" element
         */
        public boolean isSetDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELTA$6) != 0;
            }
        }
        
        /**
         * Sets the "delta" element
         */
        public void setDelta(gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta delta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta target = null;
                target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta)get_store().find_element_user(DELTA$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta)get_store().add_element_user(DELTA$6);
                }
                target.set(delta);
            }
        }
        
        /**
         * Appends and returns a new empty "delta" element
         */
        public gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta addNewDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta target = null;
                target = (gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta)get_store().add_element_user(DELTA$6);
                return target;
            }
        }
        
        /**
         * Unsets the "delta" element
         */
        public void unsetDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELTA$6, 0);
            }
        }
        /**
         * An XML seg(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SegImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Seg
        {
            
            public SegImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEGEXT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seg-ext");
            
            
            /**
             * Gets the "Seg-ext" element
             */
            public gov.nih.nlm.ncbi.www.SegExtDocument.SegExt getSegExt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SegExtDocument.SegExt target = null;
                    target = (gov.nih.nlm.ncbi.www.SegExtDocument.SegExt)get_store().find_element_user(SEGEXT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seg-ext" element
             */
            public void setSegExt(gov.nih.nlm.ncbi.www.SegExtDocument.SegExt segExt)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SegExtDocument.SegExt target = null;
                    target = (gov.nih.nlm.ncbi.www.SegExtDocument.SegExt)get_store().find_element_user(SEGEXT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SegExtDocument.SegExt)get_store().add_element_user(SEGEXT$0);
                    }
                    target.set(segExt);
                }
            }
            
            /**
             * Appends and returns a new empty "Seg-ext" element
             */
            public gov.nih.nlm.ncbi.www.SegExtDocument.SegExt addNewSegExt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SegExtDocument.SegExt target = null;
                    target = (gov.nih.nlm.ncbi.www.SegExtDocument.SegExt)get_store().add_element_user(SEGEXT$0);
                    return target;
                }
            }
        }
        /**
         * An XML ref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class RefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Ref
        {
            
            public RefImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName REFEXT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Ref-ext");
            
            
            /**
             * Gets the "Ref-ext" element
             */
            public gov.nih.nlm.ncbi.www.RefExtDocument.RefExt getRefExt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RefExtDocument.RefExt target = null;
                    target = (gov.nih.nlm.ncbi.www.RefExtDocument.RefExt)get_store().find_element_user(REFEXT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Ref-ext" element
             */
            public void setRefExt(gov.nih.nlm.ncbi.www.RefExtDocument.RefExt refExt)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RefExtDocument.RefExt target = null;
                    target = (gov.nih.nlm.ncbi.www.RefExtDocument.RefExt)get_store().find_element_user(REFEXT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.RefExtDocument.RefExt)get_store().add_element_user(REFEXT$0);
                    }
                    target.set(refExt);
                }
            }
            
            /**
             * Appends and returns a new empty "Ref-ext" element
             */
            public gov.nih.nlm.ncbi.www.RefExtDocument.RefExt addNewRefExt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.RefExtDocument.RefExt target = null;
                    target = (gov.nih.nlm.ncbi.www.RefExtDocument.RefExt)get_store().add_element_user(REFEXT$0);
                    return target;
                }
            }
        }
        /**
         * An XML map(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Map
        {
            
            public MapImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MAPEXT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Map-ext");
            
            
            /**
             * Gets the "Map-ext" element
             */
            public gov.nih.nlm.ncbi.www.MapExtDocument.MapExt getMapExt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MapExtDocument.MapExt target = null;
                    target = (gov.nih.nlm.ncbi.www.MapExtDocument.MapExt)get_store().find_element_user(MAPEXT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Map-ext" element
             */
            public void setMapExt(gov.nih.nlm.ncbi.www.MapExtDocument.MapExt mapExt)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MapExtDocument.MapExt target = null;
                    target = (gov.nih.nlm.ncbi.www.MapExtDocument.MapExt)get_store().find_element_user(MAPEXT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MapExtDocument.MapExt)get_store().add_element_user(MAPEXT$0);
                    }
                    target.set(mapExt);
                }
            }
            
            /**
             * Appends and returns a new empty "Map-ext" element
             */
            public gov.nih.nlm.ncbi.www.MapExtDocument.MapExt addNewMapExt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MapExtDocument.MapExt target = null;
                    target = (gov.nih.nlm.ncbi.www.MapExtDocument.MapExt)get_store().add_element_user(MAPEXT$0);
                    return target;
                }
            }
        }
        /**
         * An XML delta(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DeltaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqExtDocument.SeqExt.Delta
        {
            
            public DeltaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DELTAEXT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Delta-ext");
            
            
            /**
             * Gets the "Delta-ext" element
             */
            public gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt getDeltaExt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt)get_store().find_element_user(DELTAEXT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Delta-ext" element
             */
            public void setDeltaExt(gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt deltaExt)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt)get_store().find_element_user(DELTAEXT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt)get_store().add_element_user(DELTAEXT$0);
                    }
                    target.set(deltaExt);
                }
            }
            
            /**
             * Appends and returns a new empty "Delta-ext" element
             */
            public gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt addNewDeltaExt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt target = null;
                    target = (gov.nih.nlm.ncbi.www.DeltaExtDocument.DeltaExt)get_store().add_element_user(DELTAEXT$0);
                    return target;
                }
            }
        }
    }
}
