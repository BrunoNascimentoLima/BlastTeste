/*
 * An XML document type.
 * Localname: Seq-loc
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqLocDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Seq-loc(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqLocDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqLocDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqlocad5edoctype");
    
    /**
     * Gets the "Seq-loc" element
     */
    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLoc();
    
    /**
     * Sets the "Seq-loc" element
     */
    void setSeqLoc(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc);
    
    /**
     * Appends and returns a new empty "Seq-loc" element
     */
    gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc();
    
    /**
     * An XML Seq-loc(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqLoc extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqLoc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqloca7fcelemtype");
        
        /**
         * Gets the "null" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null getNull();
        
        /**
         * True if has "null" element
         */
        boolean isSetNull();
        
        /**
         * Sets the "null" element
         */
        void setNull(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null xnull);
        
        /**
         * Appends and returns a new empty "null" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null addNewNull();
        
        /**
         * Unsets the "null" element
         */
        void unsetNull();
        
        /**
         * Gets the "empty" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty getEmpty();
        
        /**
         * True if has "empty" element
         */
        boolean isSetEmpty();
        
        /**
         * Sets the "empty" element
         */
        void setEmpty(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty empty);
        
        /**
         * Appends and returns a new empty "empty" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty addNewEmpty();
        
        /**
         * Unsets the "empty" element
         */
        void unsetEmpty();
        
        /**
         * Gets the "whole" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole getWhole();
        
        /**
         * True if has "whole" element
         */
        boolean isSetWhole();
        
        /**
         * Sets the "whole" element
         */
        void setWhole(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole whole);
        
        /**
         * Appends and returns a new empty "whole" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole addNewWhole();
        
        /**
         * Unsets the "whole" element
         */
        void unsetWhole();
        
        /**
         * Gets the "int" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int getInt();
        
        /**
         * True if has "int" element
         */
        boolean isSetInt();
        
        /**
         * Sets the "int" element
         */
        void setInt(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int xint);
        
        /**
         * Appends and returns a new empty "int" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int addNewInt();
        
        /**
         * Unsets the "int" element
         */
        void unsetInt();
        
        /**
         * Gets the "packed-int" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt getPackedInt();
        
        /**
         * True if has "packed-int" element
         */
        boolean isSetPackedInt();
        
        /**
         * Sets the "packed-int" element
         */
        void setPackedInt(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt packedInt);
        
        /**
         * Appends and returns a new empty "packed-int" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt addNewPackedInt();
        
        /**
         * Unsets the "packed-int" element
         */
        void unsetPackedInt();
        
        /**
         * Gets the "pnt" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt getPnt();
        
        /**
         * True if has "pnt" element
         */
        boolean isSetPnt();
        
        /**
         * Sets the "pnt" element
         */
        void setPnt(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt pnt);
        
        /**
         * Appends and returns a new empty "pnt" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt addNewPnt();
        
        /**
         * Unsets the "pnt" element
         */
        void unsetPnt();
        
        /**
         * Gets the "packed-pnt" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt getPackedPnt();
        
        /**
         * True if has "packed-pnt" element
         */
        boolean isSetPackedPnt();
        
        /**
         * Sets the "packed-pnt" element
         */
        void setPackedPnt(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt packedPnt);
        
        /**
         * Appends and returns a new empty "packed-pnt" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt addNewPackedPnt();
        
        /**
         * Unsets the "packed-pnt" element
         */
        void unsetPackedPnt();
        
        /**
         * Gets the "mix" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix getMix();
        
        /**
         * True if has "mix" element
         */
        boolean isSetMix();
        
        /**
         * Sets the "mix" element
         */
        void setMix(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix mix);
        
        /**
         * Appends and returns a new empty "mix" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix addNewMix();
        
        /**
         * Unsets the "mix" element
         */
        void unsetMix();
        
        /**
         * Gets the "equiv" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv getEquiv();
        
        /**
         * True if has "equiv" element
         */
        boolean isSetEquiv();
        
        /**
         * Sets the "equiv" element
         */
        void setEquiv(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv equiv);
        
        /**
         * Appends and returns a new empty "equiv" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv addNewEquiv();
        
        /**
         * Unsets the "equiv" element
         */
        void unsetEquiv();
        
        /**
         * Gets the "bond" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond getBond();
        
        /**
         * True if has "bond" element
         */
        boolean isSetBond();
        
        /**
         * Sets the "bond" element
         */
        void setBond(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond bond);
        
        /**
         * Appends and returns a new empty "bond" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond addNewBond();
        
        /**
         * Unsets the "bond" element
         */
        void unsetBond();
        
        /**
         * Gets the "feat" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat getFeat();
        
        /**
         * True if has "feat" element
         */
        boolean isSetFeat();
        
        /**
         * Sets the "feat" element
         */
        void setFeat(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat feat);
        
        /**
         * Appends and returns a new empty "feat" element
         */
        gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat addNewFeat();
        
        /**
         * Unsets the "feat" element
         */
        void unsetFeat();
        
        /**
         * An XML null(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Null extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Null.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("null781felemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Null) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML empty(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Empty extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Empty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("empty0db5elemtype");
            
            /**
             * Gets the "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqId();
            
            /**
             * Sets the "Seq-id" element
             */
            void setSeqId(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId);
            
            /**
             * Appends and returns a new empty "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Empty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML whole(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Whole extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Whole.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("whole2e1felemtype");
            
            /**
             * Gets the "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqId();
            
            /**
             * Sets the "Seq-id" element
             */
            void setSeqId(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId);
            
            /**
             * Appends and returns a new empty "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Whole) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML int(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Int extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Int.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("int0e57elemtype");
            
            /**
             * Gets the "Seq-interval" element
             */
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval getSeqInterval();
            
            /**
             * Sets the "Seq-interval" element
             */
            void setSeqInterval(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval seqInterval);
            
            /**
             * Appends and returns a new empty "Seq-interval" element
             */
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval addNewSeqInterval();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Int) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML packed-int(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface PackedInt extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PackedInt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("packedintabb2elemtype");
            
            /**
             * Gets the "Packed-seqint" element
             */
            gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint getPackedSeqint();
            
            /**
             * Sets the "Packed-seqint" element
             */
            void setPackedSeqint(gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint packedSeqint);
            
            /**
             * Appends and returns a new empty "Packed-seqint" element
             */
            gov.nih.nlm.ncbi.www.PackedSeqintDocument.PackedSeqint addNewPackedSeqint();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedInt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pnt(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pnt extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pnt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pntde9eelemtype");
            
            /**
             * Gets the "Seq-point" element
             */
            gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint getSeqPoint();
            
            /**
             * Sets the "Seq-point" element
             */
            void setSeqPoint(gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint seqPoint);
            
            /**
             * Appends and returns a new empty "Seq-point" element
             */
            gov.nih.nlm.ncbi.www.SeqPointDocument.SeqPoint addNewSeqPoint();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Pnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML packed-pnt(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface PackedPnt extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PackedPnt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("packedpnt7bf9elemtype");
            
            /**
             * Gets the "Packed-seqpnt" element
             */
            gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt getPackedSeqpnt();
            
            /**
             * Sets the "Packed-seqpnt" element
             */
            void setPackedSeqpnt(gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt packedSeqpnt);
            
            /**
             * Appends and returns a new empty "Packed-seqpnt" element
             */
            gov.nih.nlm.ncbi.www.PackedSeqpntDocument.PackedSeqpnt addNewPackedSeqpnt();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.PackedPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML mix(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Mix extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mix.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("mixaec4elemtype");
            
            /**
             * Gets the "Seq-loc-mix" element
             */
            gov.nih.nlm.ncbi.www.SeqLocMixDocument.SeqLocMix getSeqLocMix();
            
            /**
             * Sets the "Seq-loc-mix" element
             */
            void setSeqLocMix(gov.nih.nlm.ncbi.www.SeqLocMixDocument.SeqLocMix seqLocMix);
            
            /**
             * Appends and returns a new empty "Seq-loc-mix" element
             */
            gov.nih.nlm.ncbi.www.SeqLocMixDocument.SeqLocMix addNewSeqLocMix();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Mix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML equiv(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Equiv extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Equiv.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("equiv1a9eelemtype");
            
            /**
             * Gets the "Seq-loc-equiv" element
             */
            gov.nih.nlm.ncbi.www.SeqLocEquivDocument.SeqLocEquiv getSeqLocEquiv();
            
            /**
             * Sets the "Seq-loc-equiv" element
             */
            void setSeqLocEquiv(gov.nih.nlm.ncbi.www.SeqLocEquivDocument.SeqLocEquiv seqLocEquiv);
            
            /**
             * Appends and returns a new empty "Seq-loc-equiv" element
             */
            gov.nih.nlm.ncbi.www.SeqLocEquivDocument.SeqLocEquiv addNewSeqLocEquiv();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Equiv) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML bond(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Bond extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bond.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bond055belemtype");
            
            /**
             * Gets the "Seq-bond" element
             */
            gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond getSeqBond();
            
            /**
             * Sets the "Seq-bond" element
             */
            void setSeqBond(gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond seqBond);
            
            /**
             * Appends and returns a new empty "Seq-bond" element
             */
            gov.nih.nlm.ncbi.www.SeqBondDocument.SeqBond addNewSeqBond();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Bond) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML feat(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Feat extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Feat.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("feat75caelemtype");
            
            /**
             * Gets the "Feat-id" element
             */
            gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId getFeatId();
            
            /**
             * Sets the "Feat-id" element
             */
            void setFeatId(gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId featId);
            
            /**
             * Appends and returns a new empty "Feat-id" element
             */
            gov.nih.nlm.ncbi.www.FeatIdDocument.FeatId addNewFeatId();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc.Feat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqLocDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLocDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqLocDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqLocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
