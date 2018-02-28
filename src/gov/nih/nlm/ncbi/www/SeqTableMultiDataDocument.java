/*
 * An XML document type.
 * Localname: SeqTable-multi-data
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one SeqTable-multi-data(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqTableMultiDataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqTableMultiDataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqtablemultidatad8a8doctype");
    
    /**
     * Gets the "SeqTable-multi-data" element
     */
    gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData getSeqTableMultiData();
    
    /**
     * Sets the "SeqTable-multi-data" element
     */
    void setSeqTableMultiData(gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData seqTableMultiData);
    
    /**
     * Appends and returns a new empty "SeqTable-multi-data" element
     */
    gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData addNewSeqTableMultiData();
    
    /**
     * An XML SeqTable-multi-data(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqTableMultiData extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqTableMultiData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqtablemultidataf490elemtype");
        
        /**
         * Gets array of all "int" elements
         */
        java.math.BigInteger[] getIntArray();
        
        /**
         * Gets ith "int" element
         */
        java.math.BigInteger getIntArray(int i);
        
        /**
         * Gets (as xml) array of all "int" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetIntArray();
        
        /**
         * Gets (as xml) ith "int" element
         */
        org.apache.xmlbeans.XmlInteger xgetIntArray(int i);
        
        /**
         * Returns number of "int" element
         */
        int sizeOfIntArray();
        
        /**
         * Sets array of all "int" element
         */
        void setIntArray(java.math.BigInteger[] xintArray);
        
        /**
         * Sets ith "int" element
         */
        void setIntArray(int i, java.math.BigInteger xint);
        
        /**
         * Sets (as xml) array of all "int" element
         */
        void xsetIntArray(org.apache.xmlbeans.XmlInteger[] xintArray);
        
        /**
         * Sets (as xml) ith "int" element
         */
        void xsetIntArray(int i, org.apache.xmlbeans.XmlInteger xint);
        
        /**
         * Inserts the value as the ith "int" element
         */
        void insertInt(int i, java.math.BigInteger xint);
        
        /**
         * Appends the value as the last "int" element
         */
        void addInt(java.math.BigInteger xint);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "int" element
         */
        org.apache.xmlbeans.XmlInteger insertNewInt(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "int" element
         */
        org.apache.xmlbeans.XmlInteger addNewInt();
        
        /**
         * Removes the ith "int" element
         */
        void removeInt(int i);
        
        /**
         * Gets array of all "real" elements
         */
        double[] getRealArray();
        
        /**
         * Gets ith "real" element
         */
        double getRealArray(int i);
        
        /**
         * Gets (as xml) array of all "real" elements
         */
        org.apache.xmlbeans.XmlDouble[] xgetRealArray();
        
        /**
         * Gets (as xml) ith "real" element
         */
        org.apache.xmlbeans.XmlDouble xgetRealArray(int i);
        
        /**
         * Returns number of "real" element
         */
        int sizeOfRealArray();
        
        /**
         * Sets array of all "real" element
         */
        void setRealArray(double[] realArray);
        
        /**
         * Sets ith "real" element
         */
        void setRealArray(int i, double real);
        
        /**
         * Sets (as xml) array of all "real" element
         */
        void xsetRealArray(org.apache.xmlbeans.XmlDouble[] realArray);
        
        /**
         * Sets (as xml) ith "real" element
         */
        void xsetRealArray(int i, org.apache.xmlbeans.XmlDouble real);
        
        /**
         * Inserts the value as the ith "real" element
         */
        void insertReal(int i, double real);
        
        /**
         * Appends the value as the last "real" element
         */
        void addReal(double real);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "real" element
         */
        org.apache.xmlbeans.XmlDouble insertNewReal(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "real" element
         */
        org.apache.xmlbeans.XmlDouble addNewReal();
        
        /**
         * Removes the ith "real" element
         */
        void removeReal(int i);
        
        /**
         * Gets array of all "string" elements
         */
        java.lang.String[] getStringArray();
        
        /**
         * Gets ith "string" element
         */
        java.lang.String getStringArray(int i);
        
        /**
         * Gets (as xml) array of all "string" elements
         */
        org.apache.xmlbeans.XmlString[] xgetStringArray();
        
        /**
         * Gets (as xml) ith "string" element
         */
        org.apache.xmlbeans.XmlString xgetStringArray(int i);
        
        /**
         * Returns number of "string" element
         */
        int sizeOfStringArray();
        
        /**
         * Sets array of all "string" element
         */
        void setStringArray(java.lang.String[] stringArray);
        
        /**
         * Sets ith "string" element
         */
        void setStringArray(int i, java.lang.String string);
        
        /**
         * Sets (as xml) array of all "string" element
         */
        void xsetStringArray(org.apache.xmlbeans.XmlString[] stringArray);
        
        /**
         * Sets (as xml) ith "string" element
         */
        void xsetStringArray(int i, org.apache.xmlbeans.XmlString string);
        
        /**
         * Inserts the value as the ith "string" element
         */
        void insertString(int i, java.lang.String string);
        
        /**
         * Appends the value as the last "string" element
         */
        void addString(java.lang.String string);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "string" element
         */
        org.apache.xmlbeans.XmlString insertNewString(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "string" element
         */
        org.apache.xmlbeans.XmlString addNewString();
        
        /**
         * Removes the ith "string" element
         */
        void removeString(int i);
        
        /**
         * Gets array of all "bytes" elements
         */
        byte[][] getBytesArray();
        
        /**
         * Gets ith "bytes" element
         */
        byte[] getBytesArray(int i);
        
        /**
         * Gets (as xml) array of all "bytes" elements
         */
        org.apache.xmlbeans.XmlHexBinary[] xgetBytesArray();
        
        /**
         * Gets (as xml) ith "bytes" element
         */
        org.apache.xmlbeans.XmlHexBinary xgetBytesArray(int i);
        
        /**
         * Returns number of "bytes" element
         */
        int sizeOfBytesArray();
        
        /**
         * Sets array of all "bytes" element
         */
        void setBytesArray(byte[][] bytesArray);
        
        /**
         * Sets ith "bytes" element
         */
        void setBytesArray(int i, byte[] bytes);
        
        /**
         * Sets (as xml) array of all "bytes" element
         */
        void xsetBytesArray(org.apache.xmlbeans.XmlHexBinary[] bytesArray);
        
        /**
         * Sets (as xml) ith "bytes" element
         */
        void xsetBytesArray(int i, org.apache.xmlbeans.XmlHexBinary bytes);
        
        /**
         * Inserts the value as the ith "bytes" element
         */
        void insertBytes(int i, byte[] bytes);
        
        /**
         * Appends the value as the last "bytes" element
         */
        void addBytes(byte[] bytes);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "bytes" element
         */
        org.apache.xmlbeans.XmlHexBinary insertNewBytes(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "bytes" element
         */
        org.apache.xmlbeans.XmlHexBinary addNewBytes();
        
        /**
         * Removes the ith "bytes" element
         */
        void removeBytes(int i);
        
        /**
         * Gets the "common-string" element
         */
        gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString getCommonString();
        
        /**
         * True if has "common-string" element
         */
        boolean isSetCommonString();
        
        /**
         * Sets the "common-string" element
         */
        void setCommonString(gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString commonString);
        
        /**
         * Appends and returns a new empty "common-string" element
         */
        gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString addNewCommonString();
        
        /**
         * Unsets the "common-string" element
         */
        void unsetCommonString();
        
        /**
         * Gets the "common-bytes" element
         */
        gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes getCommonBytes();
        
        /**
         * True if has "common-bytes" element
         */
        boolean isSetCommonBytes();
        
        /**
         * Sets the "common-bytes" element
         */
        void setCommonBytes(gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes commonBytes);
        
        /**
         * Appends and returns a new empty "common-bytes" element
         */
        gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes addNewCommonBytes();
        
        /**
         * Unsets the "common-bytes" element
         */
        void unsetCommonBytes();
        
        /**
         * Gets the "bit" element
         */
        byte[] getBit();
        
        /**
         * Gets (as xml) the "bit" element
         */
        org.apache.xmlbeans.XmlHexBinary xgetBit();
        
        /**
         * True if has "bit" element
         */
        boolean isSetBit();
        
        /**
         * Sets the "bit" element
         */
        void setBit(byte[] bit);
        
        /**
         * Sets (as xml) the "bit" element
         */
        void xsetBit(org.apache.xmlbeans.XmlHexBinary bit);
        
        /**
         * Unsets the "bit" element
         */
        void unsetBit();
        
        /**
         * Gets the "loc" element
         */
        gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc getLoc();
        
        /**
         * True if has "loc" element
         */
        boolean isSetLoc();
        
        /**
         * Sets the "loc" element
         */
        void setLoc(gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc loc);
        
        /**
         * Appends and returns a new empty "loc" element
         */
        gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc addNewLoc();
        
        /**
         * Unsets the "loc" element
         */
        void unsetLoc();
        
        /**
         * Gets the "id" element
         */
        gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id getId();
        
        /**
         * True if has "id" element
         */
        boolean isSetId();
        
        /**
         * Sets the "id" element
         */
        void setId(gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id id);
        
        /**
         * Appends and returns a new empty "id" element
         */
        gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id addNewId();
        
        /**
         * Unsets the "id" element
         */
        void unsetId();
        
        /**
         * Gets the "interval" element
         */
        gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval getInterval();
        
        /**
         * True if has "interval" element
         */
        boolean isSetInterval();
        
        /**
         * Sets the "interval" element
         */
        void setInterval(gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval interval);
        
        /**
         * Appends and returns a new empty "interval" element
         */
        gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval addNewInterval();
        
        /**
         * Unsets the "interval" element
         */
        void unsetInterval();
        
        /**
         * An XML common-string(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface CommonString extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CommonString.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("commonstringce2felemtype");
            
            /**
             * Gets the "CommonString-table" element
             */
            gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable getCommonStringTable();
            
            /**
             * Sets the "CommonString-table" element
             */
            void setCommonStringTable(gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable commonStringTable);
            
            /**
             * Appends and returns a new empty "CommonString-table" element
             */
            gov.nih.nlm.ncbi.www.CommonStringTableDocument.CommonStringTable addNewCommonStringTable();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML common-bytes(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface CommonBytes extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CommonBytes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("commonbytes5e35elemtype");
            
            /**
             * Gets the "CommonBytes-table" element
             */
            gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable getCommonBytesTable();
            
            /**
             * Sets the "CommonBytes-table" element
             */
            void setCommonBytesTable(gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable commonBytesTable);
            
            /**
             * Appends and returns a new empty "CommonBytes-table" element
             */
            gov.nih.nlm.ncbi.www.CommonBytesTableDocument.CommonBytesTable addNewCommonBytesTable();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.CommonBytes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML loc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Loc extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Loc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("locdc3celemtype");
            
            /**
             * Gets array of all "Seq-loc" elements
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] getSeqLocArray();
            
            /**
             * Gets ith "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc getSeqLocArray(int i);
            
            /**
             * Returns number of "Seq-loc" element
             */
            int sizeOfSeqLocArray();
            
            /**
             * Sets array of all "Seq-loc" element
             */
            void setSeqLocArray(gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc[] seqLocArray);
            
            /**
             * Sets ith "Seq-loc" element
             */
            void setSeqLocArray(int i, gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc seqLoc);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc insertNewSeqLoc(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-loc" element
             */
            gov.nih.nlm.ncbi.www.SeqLocDocument.SeqLoc addNewSeqLoc();
            
            /**
             * Removes the ith "Seq-loc" element
             */
            void removeSeqLoc(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Loc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Id extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("id6547elemtype");
            
            /**
             * Gets array of all "Seq-id" elements
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] getSeqIdArray();
            
            /**
             * Gets ith "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId getSeqIdArray(int i);
            
            /**
             * Returns number of "Seq-id" element
             */
            int sizeOfSeqIdArray();
            
            /**
             * Sets array of all "Seq-id" element
             */
            void setSeqIdArray(gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId[] seqIdArray);
            
            /**
             * Sets ith "Seq-id" element
             */
            void setSeqIdArray(int i, gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId seqId);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId insertNewSeqId(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-id" element
             */
            gov.nih.nlm.ncbi.www.SeqIdDocument.SeqId addNewSeqId();
            
            /**
             * Removes the ith "Seq-id" element
             */
            void removeSeqId(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML interval(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Interval extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Interval.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("interval50f1elemtype");
            
            /**
             * Gets array of all "Seq-interval" elements
             */
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[] getSeqIntervalArray();
            
            /**
             * Gets ith "Seq-interval" element
             */
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval getSeqIntervalArray(int i);
            
            /**
             * Returns number of "Seq-interval" element
             */
            int sizeOfSeqIntervalArray();
            
            /**
             * Sets array of all "Seq-interval" element
             */
            void setSeqIntervalArray(gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval[] seqIntervalArray);
            
            /**
             * Sets ith "Seq-interval" element
             */
            void setSeqIntervalArray(int i, gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval seqInterval);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-interval" element
             */
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval insertNewSeqInterval(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-interval" element
             */
            gov.nih.nlm.ncbi.www.SeqIntervalDocument.SeqInterval addNewSeqInterval();
            
            /**
             * Removes the ith "Seq-interval" element
             */
            void removeSeqInterval(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData.Interval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument.SeqTableMultiData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqTableMultiDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
