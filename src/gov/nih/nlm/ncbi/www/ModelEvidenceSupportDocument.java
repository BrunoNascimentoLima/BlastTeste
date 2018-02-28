/*
 * An XML document type.
 * Localname: ModelEvidenceSupport
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one ModelEvidenceSupport(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface ModelEvidenceSupportDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ModelEvidenceSupportDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("modelevidencesupport63eddoctype");
    
    /**
     * Gets the "ModelEvidenceSupport" element
     */
    gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport getModelEvidenceSupport();
    
    /**
     * Sets the "ModelEvidenceSupport" element
     */
    void setModelEvidenceSupport(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport modelEvidenceSupport);
    
    /**
     * Appends and returns a new empty "ModelEvidenceSupport" element
     */
    gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport addNewModelEvidenceSupport();
    
    /**
     * An XML ModelEvidenceSupport(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface ModelEvidenceSupport extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ModelEvidenceSupport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("modelevidencesupport8e42elemtype");
        
        /**
         * Gets the "method" element
         */
        java.lang.String getMethod();
        
        /**
         * Gets (as xml) the "method" element
         */
        org.apache.xmlbeans.XmlString xgetMethod();
        
        /**
         * True if has "method" element
         */
        boolean isSetMethod();
        
        /**
         * Sets the "method" element
         */
        void setMethod(java.lang.String method);
        
        /**
         * Sets (as xml) the "method" element
         */
        void xsetMethod(org.apache.xmlbeans.XmlString method);
        
        /**
         * Unsets the "method" element
         */
        void unsetMethod();
        
        /**
         * Gets the "mrna" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna getMrna();
        
        /**
         * True if has "mrna" element
         */
        boolean isSetMrna();
        
        /**
         * Sets the "mrna" element
         */
        void setMrna(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna mrna);
        
        /**
         * Appends and returns a new empty "mrna" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna addNewMrna();
        
        /**
         * Unsets the "mrna" element
         */
        void unsetMrna();
        
        /**
         * Gets the "est" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est getEst();
        
        /**
         * True if has "est" element
         */
        boolean isSetEst();
        
        /**
         * Sets the "est" element
         */
        void setEst(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est est);
        
        /**
         * Appends and returns a new empty "est" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est addNewEst();
        
        /**
         * Unsets the "est" element
         */
        void unsetEst();
        
        /**
         * Gets the "protein" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein getProtein();
        
        /**
         * True if has "protein" element
         */
        boolean isSetProtein();
        
        /**
         * Sets the "protein" element
         */
        void setProtein(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein protein);
        
        /**
         * Appends and returns a new empty "protein" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein addNewProtein();
        
        /**
         * Unsets the "protein" element
         */
        void unsetProtein();
        
        /**
         * Gets the "identification" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification getIdentification();
        
        /**
         * True if has "identification" element
         */
        boolean isSetIdentification();
        
        /**
         * Sets the "identification" element
         */
        void setIdentification(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification identification);
        
        /**
         * Appends and returns a new empty "identification" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification addNewIdentification();
        
        /**
         * Unsets the "identification" element
         */
        void unsetIdentification();
        
        /**
         * Gets the "dbxref" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref getDbxref();
        
        /**
         * True if has "dbxref" element
         */
        boolean isSetDbxref();
        
        /**
         * Sets the "dbxref" element
         */
        void setDbxref(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref dbxref);
        
        /**
         * Appends and returns a new empty "dbxref" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref addNewDbxref();
        
        /**
         * Unsets the "dbxref" element
         */
        void unsetDbxref();
        
        /**
         * Gets the "exon-count" element
         */
        java.math.BigInteger getExonCount();
        
        /**
         * Gets (as xml) the "exon-count" element
         */
        org.apache.xmlbeans.XmlInteger xgetExonCount();
        
        /**
         * True if has "exon-count" element
         */
        boolean isSetExonCount();
        
        /**
         * Sets the "exon-count" element
         */
        void setExonCount(java.math.BigInteger exonCount);
        
        /**
         * Sets (as xml) the "exon-count" element
         */
        void xsetExonCount(org.apache.xmlbeans.XmlInteger exonCount);
        
        /**
         * Unsets the "exon-count" element
         */
        void unsetExonCount();
        
        /**
         * Gets the "exon-length" element
         */
        java.math.BigInteger getExonLength();
        
        /**
         * Gets (as xml) the "exon-length" element
         */
        org.apache.xmlbeans.XmlInteger xgetExonLength();
        
        /**
         * True if has "exon-length" element
         */
        boolean isSetExonLength();
        
        /**
         * Sets the "exon-length" element
         */
        void setExonLength(java.math.BigInteger exonLength);
        
        /**
         * Sets (as xml) the "exon-length" element
         */
        void xsetExonLength(org.apache.xmlbeans.XmlInteger exonLength);
        
        /**
         * Unsets the "exon-length" element
         */
        void unsetExonLength();
        
        /**
         * Gets the "full-length" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength getFullLength();
        
        /**
         * True if has "full-length" element
         */
        boolean isSetFullLength();
        
        /**
         * Sets the "full-length" element
         */
        void setFullLength(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength fullLength);
        
        /**
         * Appends and returns a new empty "full-length" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength addNewFullLength();
        
        /**
         * Unsets the "full-length" element
         */
        void unsetFullLength();
        
        /**
         * Gets the "supports-all-exon-combo" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo getSupportsAllExonCombo();
        
        /**
         * True if has "supports-all-exon-combo" element
         */
        boolean isSetSupportsAllExonCombo();
        
        /**
         * Sets the "supports-all-exon-combo" element
         */
        void setSupportsAllExonCombo(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo supportsAllExonCombo);
        
        /**
         * Appends and returns a new empty "supports-all-exon-combo" element
         */
        gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo addNewSupportsAllExonCombo();
        
        /**
         * Unsets the "supports-all-exon-combo" element
         */
        void unsetSupportsAllExonCombo();
        
        /**
         * An XML mrna(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Mrna extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mrna.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("mrna5ff6elemtype");
            
            /**
             * Gets array of all "ModelEvidenceItem" elements
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] getModelEvidenceItemArray();
            
            /**
             * Gets ith "ModelEvidenceItem" element
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem getModelEvidenceItemArray(int i);
            
            /**
             * Returns number of "ModelEvidenceItem" element
             */
            int sizeOfModelEvidenceItemArray();
            
            /**
             * Sets array of all "ModelEvidenceItem" element
             */
            void setModelEvidenceItemArray(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] modelEvidenceItemArray);
            
            /**
             * Sets ith "ModelEvidenceItem" element
             */
            void setModelEvidenceItemArray(int i, gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem modelEvidenceItem);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ModelEvidenceItem" element
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem insertNewModelEvidenceItem(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ModelEvidenceItem" element
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem addNewModelEvidenceItem();
            
            /**
             * Removes the ith "ModelEvidenceItem" element
             */
            void removeModelEvidenceItem(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna newInstance() {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML est(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Est extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Est.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("est51b4elemtype");
            
            /**
             * Gets array of all "ModelEvidenceItem" elements
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] getModelEvidenceItemArray();
            
            /**
             * Gets ith "ModelEvidenceItem" element
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem getModelEvidenceItemArray(int i);
            
            /**
             * Returns number of "ModelEvidenceItem" element
             */
            int sizeOfModelEvidenceItemArray();
            
            /**
             * Sets array of all "ModelEvidenceItem" element
             */
            void setModelEvidenceItemArray(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] modelEvidenceItemArray);
            
            /**
             * Sets ith "ModelEvidenceItem" element
             */
            void setModelEvidenceItemArray(int i, gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem modelEvidenceItem);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ModelEvidenceItem" element
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem insertNewModelEvidenceItem(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ModelEvidenceItem" element
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem addNewModelEvidenceItem();
            
            /**
             * Removes the ith "ModelEvidenceItem" element
             */
            void removeModelEvidenceItem(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est newInstance() {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML protein(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Protein extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Protein.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("protein2b71elemtype");
            
            /**
             * Gets array of all "ModelEvidenceItem" elements
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] getModelEvidenceItemArray();
            
            /**
             * Gets ith "ModelEvidenceItem" element
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem getModelEvidenceItemArray(int i);
            
            /**
             * Returns number of "ModelEvidenceItem" element
             */
            int sizeOfModelEvidenceItemArray();
            
            /**
             * Sets array of all "ModelEvidenceItem" element
             */
            void setModelEvidenceItemArray(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] modelEvidenceItemArray);
            
            /**
             * Sets ith "ModelEvidenceItem" element
             */
            void setModelEvidenceItemArray(int i, gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem modelEvidenceItem);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ModelEvidenceItem" element
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem insertNewModelEvidenceItem(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ModelEvidenceItem" element
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem addNewModelEvidenceItem();
            
            /**
             * Removes the ith "ModelEvidenceItem" element
             */
            void removeModelEvidenceItem(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein newInstance() {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML identification(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Identification extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Identification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("identification5accelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification newInstance() {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML dbxref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Dbxref extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dbxref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("dbxref4137elemtype");
            
            /**
             * Gets array of all "Dbtag" elements
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] getDbtagArray();
            
            /**
             * Gets ith "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtagArray(int i);
            
            /**
             * Returns number of "Dbtag" element
             */
            int sizeOfDbtagArray();
            
            /**
             * Sets array of all "Dbtag" element
             */
            void setDbtagArray(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] dbtagArray);
            
            /**
             * Sets ith "Dbtag" element
             */
            void setDbtagArray(int i, gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag insertNewDbtag(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag();
            
            /**
             * Removes the ith "Dbtag" element
             */
            void removeDbtag(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref newInstance() {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML full-length(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface FullLength extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FullLength.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("fulllength6692elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument$ModelEvidenceSupport$FullLength$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value9e6battrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument$ModelEvidenceSupport$FullLength$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_TRUE
                 * Enum.forString(s); // returns the enum value for a string
                 * Enum.forInt(i); // returns the enum value for an int
                 * </pre>
                 * Enumeration objects are immutable singleton objects that
                 * can be compared using == object equality. They have no
                 * public constructor. See the constants defined within this
                 * class for all the valid values.
                 */
                static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
                {
                    /**
                     * Returns the enum value for a string, or null if none.
                     */
                    public static Enum forString(java.lang.String s)
                        { return (Enum)table.forString(s); }
                    /**
                     * Returns the enum value corresponding to an int, or null if none.
                     */
                    public static Enum forInt(int i)
                        { return (Enum)table.forInt(i); }
                    
                    private Enum(java.lang.String s, int i)
                        { super(s, i); }
                    
                    static final int INT_TRUE = 1;
                    static final int INT_FALSE = 2;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("true", INT_TRUE),
                        new Enum("false", INT_FALSE),
                      }
                    );
                    private static final long serialVersionUID = 1L;
                    private java.lang.Object readResolve() { return forInt(intValue()); } 
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength newInstance() {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML supports-all-exon-combo(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SupportsAllExonCombo extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SupportsAllExonCombo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("supportsallexoncomboe996elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument$ModelEvidenceSupport$SupportsAllExonCombo$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("value23efattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument$ModelEvidenceSupport$SupportsAllExonCombo$Value.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_TRUE
                 * Enum.forString(s); // returns the enum value for a string
                 * Enum.forInt(i); // returns the enum value for an int
                 * </pre>
                 * Enumeration objects are immutable singleton objects that
                 * can be compared using == object equality. They have no
                 * public constructor. See the constants defined within this
                 * class for all the valid values.
                 */
                static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
                {
                    /**
                     * Returns the enum value for a string, or null if none.
                     */
                    public static Enum forString(java.lang.String s)
                        { return (Enum)table.forString(s); }
                    /**
                     * Returns the enum value corresponding to an int, or null if none.
                     */
                    public static Enum forInt(int i)
                        { return (Enum)table.forInt(i); }
                    
                    private Enum(java.lang.String s, int i)
                        { super(s, i); }
                    
                    static final int INT_TRUE = 1;
                    static final int INT_FALSE = 2;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("true", INT_TRUE),
                        new Enum("false", INT_FALSE),
                      }
                    );
                    private static final long serialVersionUID = 1L;
                    private java.lang.Object readResolve() { return forInt(intValue()); } 
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo newInstance() {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport newInstance() {
              return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
