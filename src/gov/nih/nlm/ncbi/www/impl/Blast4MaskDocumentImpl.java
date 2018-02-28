/*
 * An XML document type.
 * Localname: Blast4-mask
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4MaskDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-mask(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4MaskDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4MaskDocument
{
    
    public Blast4MaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4MASK$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-mask");
    
    
    /**
     * Gets the "Blast4-mask" element
     */
    public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask getBlast4Mask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().find_element_user(BLAST4MASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-mask" element
     */
    public void setBlast4Mask(gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask blast4Mask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().find_element_user(BLAST4MASK$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().add_element_user(BLAST4MASK$0);
            }
            target.set(blast4Mask);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-mask" element
     */
    public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask addNewBlast4Mask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask)get_store().add_element_user(BLAST4MASK$0);
            return target;
        }
    }
    /**
     * An XML Blast4-mask(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4MaskImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask
    {
        
        public Blast4MaskImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCATIONS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "locations");
        private static final javax.xml.namespace.QName FRAME$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "frame");
        
        
        /**
         * Gets the "locations" element
         */
        public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Locations getLocations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Locations target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Locations)get_store().find_element_user(LOCATIONS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "locations" element
         */
        public void setLocations(gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Locations locations)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Locations target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Locations)get_store().find_element_user(LOCATIONS$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Locations)get_store().add_element_user(LOCATIONS$0);
                }
                target.set(locations);
            }
        }
        
        /**
         * Appends and returns a new empty "locations" element
         */
        public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Locations addNewLocations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Locations target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Locations)get_store().add_element_user(LOCATIONS$0);
                return target;
            }
        }
        
        /**
         * Gets the "frame" element
         */
        public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Frame getFrame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Frame target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Frame)get_store().find_element_user(FRAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "frame" element
         */
        public void setFrame(gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Frame frame)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Frame target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Frame)get_store().find_element_user(FRAME$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Frame)get_store().add_element_user(FRAME$2);
                }
                target.set(frame);
            }
        }
        
        /**
         * Appends and returns a new empty "frame" element
         */
        public gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Frame addNewFrame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Frame target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Frame)get_store().add_element_user(FRAME$2);
                return target;
            }
        }
        /**
         * An XML locations(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LocationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Locations
        {
            
            public LocationsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQLOC$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-loc");
            
            
            /**
             * Gets array of all "Seq-loc" elements
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] getSeqLocArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SEQLOC$0, targetList);
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] result = new gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Seq-loc" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLocArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Seq-loc" element
             */
            public int sizeOfSeqLocArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEQLOC$0);
                }
            }
            
            /**
             * Sets array of all "Seq-loc" element
             */
            public void setSeqLocArray(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] seqLocArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(seqLocArray, SEQLOC$0);
                }
            }
            
            /**
             * Sets ith "Seq-loc" element
             */
            public void setSeqLocArray(int i, gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().find_element_user(SEQLOC$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(seqLoc);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-loc" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc insertNewSeqLoc(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc)get_store().insert_element_user(SEQLOC$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-loc" element
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
            
            /**
             * Removes the ith "Seq-loc" element
             */
            public void removeSeqLoc(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEQLOC$0, i);
                }
            }
        }
        /**
         * An XML frame(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FrameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask.Frame
        {
            
            public FrameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4FRAMETYPE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-frame-type");
            
            
            /**
             * Gets the "Blast4-frame-type" element
             */
            public gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType getBlast4FrameType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType)get_store().find_element_user(BLAST4FRAMETYPE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-frame-type" element
             */
            public void setBlast4FrameType(gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType blast4FrameType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType)get_store().find_element_user(BLAST4FRAMETYPE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType)get_store().add_element_user(BLAST4FRAMETYPE$0);
                    }
                    target.set(blast4FrameType);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-frame-type" element
             */
            public gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType addNewBlast4FrameType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4FrameTypeDocument.Blast4FrameType)get_store().add_element_user(BLAST4FRAMETYPE$0);
                    return target;
                }
            }
        }
    }
}
