/*
 * An XML document type.
 * Localname: Seq-loc
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqLocDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seq-loc(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqLocDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLocDocument
{
    
    public SeqLocDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML Seq-loc(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqLocImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc
    {
        
        public SeqLocImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NULL$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "null");
        private static final javax.xml.namespace.QName EMPTY$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "empty");
        private static final javax.xml.namespace.QName WHOLE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "whole");
        private static final javax.xml.namespace.QName INT$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "int");
        private static final javax.xml.namespace.QName PACKEDINT$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "packed-int");
        private static final javax.xml.namespace.QName PNT$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pnt");
        private static final javax.xml.namespace.QName PACKEDPNT$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "packed-pnt");
        private static final javax.xml.namespace.QName MIX$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mix");
        private static final javax.xml.namespace.QName EQUIV$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "equiv");
        private static final javax.xml.namespace.QName BOND$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "bond");
        private static final javax.xml.namespace.QName FEAT$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "feat");
        
        
        /**
         * Gets the "null" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null getNull()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null)get_store().find_element_user(NULL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "null" element
         */
        public boolean isSetNull()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NULL$0) != 0;
            }
        }
        
        /**
         * Sets the "null" element
         */
        public void setNull(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null xnull)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null)get_store().find_element_user(NULL$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null)get_store().add_element_user(NULL$0);
                }
                target.set(xnull);
            }
        }
        
        /**
         * Appends and returns a new empty "null" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null addNewNull()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null)get_store().add_element_user(NULL$0);
                return target;
            }
        }
        
        /**
         * Unsets the "null" element
         */
        public void unsetNull()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NULL$0, 0);
            }
        }
        
        /**
         * Gets the "empty" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty getEmpty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty)get_store().find_element_user(EMPTY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "empty" element
         */
        public boolean isSetEmpty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMPTY$2) != 0;
            }
        }
        
        /**
         * Sets the "empty" element
         */
        public void setEmpty(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty empty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty)get_store().find_element_user(EMPTY$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty)get_store().add_element_user(EMPTY$2);
                }
                target.set(empty);
            }
        }
        
        /**
         * Appends and returns a new empty "empty" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty addNewEmpty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty)get_store().add_element_user(EMPTY$2);
                return target;
            }
        }
        
        /**
         * Unsets the "empty" element
         */
        public void unsetEmpty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMPTY$2, 0);
            }
        }
        
        /**
         * Gets the "whole" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole getWhole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole)get_store().find_element_user(WHOLE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "whole" element
         */
        public boolean isSetWhole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WHOLE$4) != 0;
            }
        }
        
        /**
         * Sets the "whole" element
         */
        public void setWhole(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole whole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole)get_store().find_element_user(WHOLE$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole)get_store().add_element_user(WHOLE$4);
                }
                target.set(whole);
            }
        }
        
        /**
         * Appends and returns a new empty "whole" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole addNewWhole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole)get_store().add_element_user(WHOLE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "whole" element
         */
        public void unsetWhole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WHOLE$4, 0);
            }
        }
        
        /**
         * Gets the "int" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int getInt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int)get_store().find_element_user(INT$6, 0);
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
                return get_store().count_elements(INT$6) != 0;
            }
        }
        
        /**
         * Sets the "int" element
         */
        public void setInt(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int xint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int)get_store().find_element_user(INT$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int)get_store().add_element_user(INT$6);
                }
                target.set(xint);
            }
        }
        
        /**
         * Appends and returns a new empty "int" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int addNewInt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int)get_store().add_element_user(INT$6);
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
                get_store().remove_element(INT$6, 0);
            }
        }
        
        /**
         * Gets the "packed-int" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt getPackedInt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt)get_store().find_element_user(PACKEDINT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "packed-int" element
         */
        public boolean isSetPackedInt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PACKEDINT$8) != 0;
            }
        }
        
        /**
         * Sets the "packed-int" element
         */
        public void setPackedInt(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt packedInt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt)get_store().find_element_user(PACKEDINT$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt)get_store().add_element_user(PACKEDINT$8);
                }
                target.set(packedInt);
            }
        }
        
        /**
         * Appends and returns a new empty "packed-int" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt addNewPackedInt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt)get_store().add_element_user(PACKEDINT$8);
                return target;
            }
        }
        
        /**
         * Unsets the "packed-int" element
         */
        public void unsetPackedInt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PACKEDINT$8, 0);
            }
        }
        
        /**
         * Gets the "pnt" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt getPnt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt)get_store().find_element_user(PNT$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pnt" element
         */
        public boolean isSetPnt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PNT$10) != 0;
            }
        }
        
        /**
         * Sets the "pnt" element
         */
        public void setPnt(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt pnt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt)get_store().find_element_user(PNT$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt)get_store().add_element_user(PNT$10);
                }
                target.set(pnt);
            }
        }
        
        /**
         * Appends and returns a new empty "pnt" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt addNewPnt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt)get_store().add_element_user(PNT$10);
                return target;
            }
        }
        
        /**
         * Unsets the "pnt" element
         */
        public void unsetPnt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PNT$10, 0);
            }
        }
        
        /**
         * Gets the "packed-pnt" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt getPackedPnt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt)get_store().find_element_user(PACKEDPNT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "packed-pnt" element
         */
        public boolean isSetPackedPnt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PACKEDPNT$12) != 0;
            }
        }
        
        /**
         * Sets the "packed-pnt" element
         */
        public void setPackedPnt(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt packedPnt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt)get_store().find_element_user(PACKEDPNT$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt)get_store().add_element_user(PACKEDPNT$12);
                }
                target.set(packedPnt);
            }
        }
        
        /**
         * Appends and returns a new empty "packed-pnt" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt addNewPackedPnt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt)get_store().add_element_user(PACKEDPNT$12);
                return target;
            }
        }
        
        /**
         * Unsets the "packed-pnt" element
         */
        public void unsetPackedPnt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PACKEDPNT$12, 0);
            }
        }
        
        /**
         * Gets the "mix" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix getMix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix)get_store().find_element_user(MIX$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "mix" element
         */
        public boolean isSetMix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MIX$14) != 0;
            }
        }
        
        /**
         * Sets the "mix" element
         */
        public void setMix(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix mix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix)get_store().find_element_user(MIX$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix)get_store().add_element_user(MIX$14);
                }
                target.set(mix);
            }
        }
        
        /**
         * Appends and returns a new empty "mix" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix addNewMix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix)get_store().add_element_user(MIX$14);
                return target;
            }
        }
        
        /**
         * Unsets the "mix" element
         */
        public void unsetMix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MIX$14, 0);
            }
        }
        
        /**
         * Gets the "equiv" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv getEquiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv)get_store().find_element_user(EQUIV$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "equiv" element
         */
        public boolean isSetEquiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EQUIV$16) != 0;
            }
        }
        
        /**
         * Sets the "equiv" element
         */
        public void setEquiv(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv equiv)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv)get_store().find_element_user(EQUIV$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv)get_store().add_element_user(EQUIV$16);
                }
                target.set(equiv);
            }
        }
        
        /**
         * Appends and returns a new empty "equiv" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv addNewEquiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv)get_store().add_element_user(EQUIV$16);
                return target;
            }
        }
        
        /**
         * Unsets the "equiv" element
         */
        public void unsetEquiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EQUIV$16, 0);
            }
        }
        
        /**
         * Gets the "bond" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond getBond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond)get_store().find_element_user(BOND$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "bond" element
         */
        public boolean isSetBond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BOND$18) != 0;
            }
        }
        
        /**
         * Sets the "bond" element
         */
        public void setBond(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond bond)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond)get_store().find_element_user(BOND$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond)get_store().add_element_user(BOND$18);
                }
                target.set(bond);
            }
        }
        
        /**
         * Appends and returns a new empty "bond" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond addNewBond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond)get_store().add_element_user(BOND$18);
                return target;
            }
        }
        
        /**
         * Unsets the "bond" element
         */
        public void unsetBond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BOND$18, 0);
            }
        }
        
        /**
         * Gets the "feat" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat getFeat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat)get_store().find_element_user(FEAT$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "feat" element
         */
        public boolean isSetFeat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FEAT$20) != 0;
            }
        }
        
        /**
         * Sets the "feat" element
         */
        public void setFeat(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat feat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat)get_store().find_element_user(FEAT$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat)get_store().add_element_user(FEAT$20);
                }
                target.set(feat);
            }
        }
        
        /**
         * Appends and returns a new empty "feat" element
         */
        public gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat addNewFeat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat target = null;
                target = (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat)get_store().add_element_user(FEAT$20);
                return target;
            }
        }
        
        /**
         * Unsets the "feat" element
         */
        public void unsetFeat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FEAT$20, 0);
            }
        }
        /**
         * An XML null(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NullImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null
        {
            
            public NullImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML empty(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class EmptyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty
        {
            
            public EmptyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-id");
            
            
            /**
             * Gets the "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-id" element
             */
            public void setSeqId(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
                    }
                    target.set(seqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML whole(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class WholeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole
        {
            
            public WholeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-id");
            
            
            /**
             * Gets the "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-id" element
             */
            public void setSeqId(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().find_element_user(SEQID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
                    }
                    target.set(seqId);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-id" element
             */
            public gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId)get_store().add_element_user(SEQID$0);
                    return target;
                }
            }
        }
        /**
         * An XML int(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IntImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int
        {
            
            public IntImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQINTERVAL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-interval");
            
            
            /**
             * Gets the "Seq-interval" element
             */
            public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval getSeqInterval()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().find_element_user(SEQINTERVAL$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-interval" element
             */
            public void setSeqInterval(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval seqInterval)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().find_element_user(SEQINTERVAL$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().add_element_user(SEQINTERVAL$0);
                    }
                    target.set(seqInterval);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-interval" element
             */
            public gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval addNewSeqInterval()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval)get_store().add_element_user(SEQINTERVAL$0);
                    return target;
                }
            }
        }
        /**
         * An XML packed-int(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PackedIntImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt
        {
            
            public PackedIntImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PACKEDSEQINT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Packed-seqint");
            
            
            /**
             * Gets the "Packed-seqint" element
             */
            public gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint getPackedSeqint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint target = null;
                    target = (gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint)get_store().find_element_user(PACKEDSEQINT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Packed-seqint" element
             */
            public void setPackedSeqint(gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint packedSeqint)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint target = null;
                    target = (gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint)get_store().find_element_user(PACKEDSEQINT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint)get_store().add_element_user(PACKEDSEQINT$0);
                    }
                    target.set(packedSeqint);
                }
            }
            
            /**
             * Appends and returns a new empty "Packed-seqint" element
             */
            public gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint addNewPackedSeqint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint target = null;
                    target = (gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint)get_store().add_element_user(PACKEDSEQINT$0);
                    return target;
                }
            }
        }
        /**
         * An XML pnt(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PntImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt
        {
            
            public PntImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML packed-pnt(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PackedPntImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt
        {
            
            public PackedPntImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PACKEDSEQPNT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Packed-seqpnt");
            
            
            /**
             * Gets the "Packed-seqpnt" element
             */
            public gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt getPackedSeqpnt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt target = null;
                    target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt)get_store().find_element_user(PACKEDSEQPNT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Packed-seqpnt" element
             */
            public void setPackedSeqpnt(gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt packedSeqpnt)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt target = null;
                    target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt)get_store().find_element_user(PACKEDSEQPNT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt)get_store().add_element_user(PACKEDSEQPNT$0);
                    }
                    target.set(packedSeqpnt);
                }
            }
            
            /**
             * Appends and returns a new empty "Packed-seqpnt" element
             */
            public gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt addNewPackedSeqpnt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt target = null;
                    target = (gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt)get_store().add_element_user(PACKEDSEQPNT$0);
                    return target;
                }
            }
        }
        /**
         * An XML mix(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MixImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix
        {
            
            public MixImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQLOCMIX$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-loc-mix");
            
            
            /**
             * Gets the "Seq-loc-mix" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocMixDocument.SeqLocMix getSeqLocMix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocMixDocument.SeqLocMix target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocMixDocument.SeqLocMix)get_store().find_element_user(SEQLOCMIX$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-loc-mix" element
             */
            public void setSeqLocMix(gov.nih.nlm.ncbi.www.SeqLocMixDocument.SeqLocMix seqLocMix)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocMixDocument.SeqLocMix target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocMixDocument.SeqLocMix)get_store().find_element_user(SEQLOCMIX$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqLocMixDocument.SeqLocMix)get_store().add_element_user(SEQLOCMIX$0);
                    }
                    target.set(seqLocMix);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-loc-mix" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocMixDocument.SeqLocMix addNewSeqLocMix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocMixDocument.SeqLocMix target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocMixDocument.SeqLocMix)get_store().add_element_user(SEQLOCMIX$0);
                    return target;
                }
            }
        }
        /**
         * An XML equiv(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class EquivImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv
        {
            
            public EquivImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SEQLOCEQUIV$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seq-loc-equiv");
            
            
            /**
             * Gets the "Seq-loc-equiv" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocEquivDocument.SeqLocEquiv getSeqLocEquiv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocEquivDocument.SeqLocEquiv target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocEquivDocument.SeqLocEquiv)get_store().find_element_user(SEQLOCEQUIV$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Seq-loc-equiv" element
             */
            public void setSeqLocEquiv(gov.nih.nlm.ncbi.www.SeqLocEquivDocument.SeqLocEquiv seqLocEquiv)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocEquivDocument.SeqLocEquiv target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocEquivDocument.SeqLocEquiv)get_store().find_element_user(SEQLOCEQUIV$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SeqLocEquivDocument.SeqLocEquiv)get_store().add_element_user(SEQLOCEQUIV$0);
                    }
                    target.set(seqLocEquiv);
                }
            }
            
            /**
             * Appends and returns a new empty "Seq-loc-equiv" element
             */
            public gov.nih.nlm.ncbi.www.SeqLocEquivDocument.SeqLocEquiv addNewSeqLocEquiv()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SeqLocEquivDocument.SeqLocEquiv target = null;
                    target = (gov.nih.nlm.ncbi.www.SeqLocEquivDocument.SeqLocEquiv)get_store().add_element_user(SEQLOCEQUIV$0);
                    return target;
                }
            }
        }
        /**
         * An XML bond(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BondImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond
        {
            
            public BondImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
        /**
         * An XML feat(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FeatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat
        {
            
            public FeatImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FEATID$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Feat-id");
            
            
            /**
             * Gets the "Feat-id" element
             */
            public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId getFeatId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId target = null;
                    target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().find_element_user(FEATID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Feat-id" element
             */
            public void setFeatId(gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId featId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId target = null;
                    target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().find_element_user(FEATID$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().add_element_user(FEATID$0);
                    }
                    target.set(featId);
                }
            }
            
            /**
             * Appends and returns a new empty "Feat-id" element
             */
            public gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId addNewFeatId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId target = null;
                    target = (gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId)get_store().add_element_user(FEATID$0);
                    return target;
                }
            }
        }
    }
}
