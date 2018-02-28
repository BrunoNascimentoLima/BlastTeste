/*
 * An XML document type.
 * Localname: Blast4-value
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ValueDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Blast4-value(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface Blast4ValueDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4ValueDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4value0ffedoctype");
    
    /**
     * Gets the "Blast4-value" element
     */
    gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value getBlast4Value();
    
    /**
     * Sets the "Blast4-value" element
     */
    void setBlast4Value(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value blast4Value);
    
    /**
     * Appends and returns a new empty "Blast4-value" element
     */
    gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value addNewBlast4Value();
    
    /**
     * An XML Blast4-value(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Blast4Value extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Blast4Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("blast4value8022elemtype");
        
        /**
         * Gets the "big-integer" element
         */
        long getBigInteger();
        
        /**
         * Gets (as xml) the "big-integer" element
         */
        org.apache.xmlbeans.XmlLong xgetBigInteger();
        
        /**
         * True if has "big-integer" element
         */
        boolean isSetBigInteger();
        
        /**
         * Sets the "big-integer" element
         */
        void setBigInteger(long bigInteger);
        
        /**
         * Sets (as xml) the "big-integer" element
         */
        void xsetBigInteger(org.apache.xmlbeans.XmlLong bigInteger);
        
        /**
         * Unsets the "big-integer" element
         */
        void unsetBigInteger();
        
        /**
         * Gets the "bioseq" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq getBioseq();
        
        /**
         * True if has "bioseq" element
         */
        boolean isSetBioseq();
        
        /**
         * Sets the "bioseq" element
         */
        void setBioseq(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq bioseq);
        
        /**
         * Appends and returns a new empty "bioseq" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq addNewBioseq();
        
        /**
         * Unsets the "bioseq" element
         */
        void unsetBioseq();
        
        /**
         * Gets the "boolean" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean getBoolean();
        
        /**
         * True if has "boolean" element
         */
        boolean isSetBoolean();
        
        /**
         * Sets the "boolean" element
         */
        void setBoolean(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean xboolean);
        
        /**
         * Appends and returns a new empty "boolean" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean addNewBoolean();
        
        /**
         * Unsets the "boolean" element
         */
        void unsetBoolean();
        
        /**
         * Gets the "cutoff" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff getCutoff();
        
        /**
         * True if has "cutoff" element
         */
        boolean isSetCutoff();
        
        /**
         * Sets the "cutoff" element
         */
        void setCutoff(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff cutoff);
        
        /**
         * Appends and returns a new empty "cutoff" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff addNewCutoff();
        
        /**
         * Unsets the "cutoff" element
         */
        void unsetCutoff();
        
        /**
         * Gets the "integer" element
         */
        java.math.BigInteger getInteger();
        
        /**
         * Gets (as xml) the "integer" element
         */
        org.apache.xmlbeans.XmlInteger xgetInteger();
        
        /**
         * True if has "integer" element
         */
        boolean isSetInteger();
        
        /**
         * Sets the "integer" element
         */
        void setInteger(java.math.BigInteger integer);
        
        /**
         * Sets (as xml) the "integer" element
         */
        void xsetInteger(org.apache.xmlbeans.XmlInteger integer);
        
        /**
         * Unsets the "integer" element
         */
        void unsetInteger();
        
        /**
         * Gets the "matrix" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix getMatrix();
        
        /**
         * True if has "matrix" element
         */
        boolean isSetMatrix();
        
        /**
         * Sets the "matrix" element
         */
        void setMatrix(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix matrix);
        
        /**
         * Appends and returns a new empty "matrix" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix addNewMatrix();
        
        /**
         * Unsets the "matrix" element
         */
        void unsetMatrix();
        
        /**
         * Gets the "real" element
         */
        double getReal();
        
        /**
         * Gets (as xml) the "real" element
         */
        org.apache.xmlbeans.XmlDouble xgetReal();
        
        /**
         * True if has "real" element
         */
        boolean isSetReal();
        
        /**
         * Sets the "real" element
         */
        void setReal(double real);
        
        /**
         * Sets (as xml) the "real" element
         */
        void xsetReal(org.apache.xmlbeans.XmlDouble real);
        
        /**
         * Unsets the "real" element
         */
        void unsetReal();
        
        /**
         * Gets the "seq-align" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign getSeqAlign();
        
        /**
         * True if has "seq-align" element
         */
        boolean isSetSeqAlign();
        
        /**
         * Sets the "seq-align" element
         */
        void setSeqAlign(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign seqAlign);
        
        /**
         * Appends and returns a new empty "seq-align" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign addNewSeqAlign();
        
        /**
         * Unsets the "seq-align" element
         */
        void unsetSeqAlign();
        
        /**
         * Gets the "seq-id" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId getSeqId();
        
        /**
         * True if has "seq-id" element
         */
        boolean isSetSeqId();
        
        /**
         * Sets the "seq-id" element
         */
        void setSeqId(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId seqId);
        
        /**
         * Appends and returns a new empty "seq-id" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId addNewSeqId();
        
        /**
         * Unsets the "seq-id" element
         */
        void unsetSeqId();
        
        /**
         * Gets the "seq-loc" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc getSeqLoc();
        
        /**
         * True if has "seq-loc" element
         */
        boolean isSetSeqLoc();
        
        /**
         * Sets the "seq-loc" element
         */
        void setSeqLoc(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc seqLoc);
        
        /**
         * Appends and returns a new empty "seq-loc" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc addNewSeqLoc();
        
        /**
         * Unsets the "seq-loc" element
         */
        void unsetSeqLoc();
        
        /**
         * Gets the "strand-type" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType getStrandType();
        
        /**
         * True if has "strand-type" element
         */
        boolean isSetStrandType();
        
        /**
         * Sets the "strand-type" element
         */
        void setStrandType(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType strandType);
        
        /**
         * Appends and returns a new empty "strand-type" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType addNewStrandType();
        
        /**
         * Unsets the "strand-type" element
         */
        void unsetStrandType();
        
        /**
         * Gets the "string" element
         */
        java.lang.String getString();
        
        /**
         * Gets (as xml) the "string" element
         */
        org.apache.xmlbeans.XmlString xgetString();
        
        /**
         * True if has "string" element
         */
        boolean isSetString();
        
        /**
         * Sets the "string" element
         */
        void setString(java.lang.String string);
        
        /**
         * Sets (as xml) the "string" element
         */
        void xsetString(org.apache.xmlbeans.XmlString string);
        
        /**
         * Unsets the "string" element
         */
        void unsetString();
        
        /**
         * Gets array of all "big-integer-list" elements
         */
        long[] getBigIntegerListArray();
        
        /**
         * Gets ith "big-integer-list" element
         */
        long getBigIntegerListArray(int i);
        
        /**
         * Gets (as xml) array of all "big-integer-list" elements
         */
        org.apache.xmlbeans.XmlLong[] xgetBigIntegerListArray();
        
        /**
         * Gets (as xml) ith "big-integer-list" element
         */
        org.apache.xmlbeans.XmlLong xgetBigIntegerListArray(int i);
        
        /**
         * Returns number of "big-integer-list" element
         */
        int sizeOfBigIntegerListArray();
        
        /**
         * Sets array of all "big-integer-list" element
         */
        void setBigIntegerListArray(long[] bigIntegerListArray);
        
        /**
         * Sets ith "big-integer-list" element
         */
        void setBigIntegerListArray(int i, long bigIntegerList);
        
        /**
         * Sets (as xml) array of all "big-integer-list" element
         */
        void xsetBigIntegerListArray(org.apache.xmlbeans.XmlLong[] bigIntegerListArray);
        
        /**
         * Sets (as xml) ith "big-integer-list" element
         */
        void xsetBigIntegerListArray(int i, org.apache.xmlbeans.XmlLong bigIntegerList);
        
        /**
         * Inserts the value as the ith "big-integer-list" element
         */
        void insertBigIntegerList(int i, long bigIntegerList);
        
        /**
         * Appends the value as the last "big-integer-list" element
         */
        void addBigIntegerList(long bigIntegerList);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "big-integer-list" element
         */
        org.apache.xmlbeans.XmlLong insertNewBigIntegerList(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "big-integer-list" element
         */
        org.apache.xmlbeans.XmlLong addNewBigIntegerList();
        
        /**
         * Removes the ith "big-integer-list" element
         */
        void removeBigIntegerList(int i);
        
        /**
         * Gets the "bioseq-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList getBioseqList();
        
        /**
         * True if has "bioseq-list" element
         */
        boolean isSetBioseqList();
        
        /**
         * Sets the "bioseq-list" element
         */
        void setBioseqList(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList bioseqList);
        
        /**
         * Appends and returns a new empty "bioseq-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList addNewBioseqList();
        
        /**
         * Unsets the "bioseq-list" element
         */
        void unsetBioseqList();
        
        /**
         * Gets array of all "boolean-list" elements
         */
        org.apache.xmlbeans.XmlObject[] getBooleanListArray();
        
        /**
         * Gets ith "boolean-list" element
         */
        org.apache.xmlbeans.XmlObject getBooleanListArray(int i);
        
        /**
         * Returns number of "boolean-list" element
         */
        int sizeOfBooleanListArray();
        
        /**
         * Sets array of all "boolean-list" element
         */
        void setBooleanListArray(org.apache.xmlbeans.XmlObject[] booleanListArray);
        
        /**
         * Sets ith "boolean-list" element
         */
        void setBooleanListArray(int i, org.apache.xmlbeans.XmlObject booleanList);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "boolean-list" element
         */
        org.apache.xmlbeans.XmlObject insertNewBooleanList(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "boolean-list" element
         */
        org.apache.xmlbeans.XmlObject addNewBooleanList();
        
        /**
         * Removes the ith "boolean-list" element
         */
        void removeBooleanList(int i);
        
        /**
         * Gets the "cutoff-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList getCutoffList();
        
        /**
         * True if has "cutoff-list" element
         */
        boolean isSetCutoffList();
        
        /**
         * Sets the "cutoff-list" element
         */
        void setCutoffList(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList cutoffList);
        
        /**
         * Appends and returns a new empty "cutoff-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList addNewCutoffList();
        
        /**
         * Unsets the "cutoff-list" element
         */
        void unsetCutoffList();
        
        /**
         * Gets array of all "integer-list" elements
         */
        java.math.BigInteger[] getIntegerListArray();
        
        /**
         * Gets ith "integer-list" element
         */
        java.math.BigInteger getIntegerListArray(int i);
        
        /**
         * Gets (as xml) array of all "integer-list" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetIntegerListArray();
        
        /**
         * Gets (as xml) ith "integer-list" element
         */
        org.apache.xmlbeans.XmlInteger xgetIntegerListArray(int i);
        
        /**
         * Returns number of "integer-list" element
         */
        int sizeOfIntegerListArray();
        
        /**
         * Sets array of all "integer-list" element
         */
        void setIntegerListArray(java.math.BigInteger[] integerListArray);
        
        /**
         * Sets ith "integer-list" element
         */
        void setIntegerListArray(int i, java.math.BigInteger integerList);
        
        /**
         * Sets (as xml) array of all "integer-list" element
         */
        void xsetIntegerListArray(org.apache.xmlbeans.XmlInteger[] integerListArray);
        
        /**
         * Sets (as xml) ith "integer-list" element
         */
        void xsetIntegerListArray(int i, org.apache.xmlbeans.XmlInteger integerList);
        
        /**
         * Inserts the value as the ith "integer-list" element
         */
        void insertIntegerList(int i, java.math.BigInteger integerList);
        
        /**
         * Appends the value as the last "integer-list" element
         */
        void addIntegerList(java.math.BigInteger integerList);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "integer-list" element
         */
        org.apache.xmlbeans.XmlInteger insertNewIntegerList(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "integer-list" element
         */
        org.apache.xmlbeans.XmlInteger addNewIntegerList();
        
        /**
         * Removes the ith "integer-list" element
         */
        void removeIntegerList(int i);
        
        /**
         * Gets the "matrix-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList getMatrixList();
        
        /**
         * True if has "matrix-list" element
         */
        boolean isSetMatrixList();
        
        /**
         * Sets the "matrix-list" element
         */
        void setMatrixList(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList matrixList);
        
        /**
         * Appends and returns a new empty "matrix-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList addNewMatrixList();
        
        /**
         * Unsets the "matrix-list" element
         */
        void unsetMatrixList();
        
        /**
         * Gets array of all "real-list" elements
         */
        double[] getRealListArray();
        
        /**
         * Gets ith "real-list" element
         */
        double getRealListArray(int i);
        
        /**
         * Gets (as xml) array of all "real-list" elements
         */
        org.apache.xmlbeans.XmlDouble[] xgetRealListArray();
        
        /**
         * Gets (as xml) ith "real-list" element
         */
        org.apache.xmlbeans.XmlDouble xgetRealListArray(int i);
        
        /**
         * Returns number of "real-list" element
         */
        int sizeOfRealListArray();
        
        /**
         * Sets array of all "real-list" element
         */
        void setRealListArray(double[] realListArray);
        
        /**
         * Sets ith "real-list" element
         */
        void setRealListArray(int i, double realList);
        
        /**
         * Sets (as xml) array of all "real-list" element
         */
        void xsetRealListArray(org.apache.xmlbeans.XmlDouble[] realListArray);
        
        /**
         * Sets (as xml) ith "real-list" element
         */
        void xsetRealListArray(int i, org.apache.xmlbeans.XmlDouble realList);
        
        /**
         * Inserts the value as the ith "real-list" element
         */
        void insertRealList(int i, double realList);
        
        /**
         * Appends the value as the last "real-list" element
         */
        void addRealList(double realList);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "real-list" element
         */
        org.apache.xmlbeans.XmlDouble insertNewRealList(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "real-list" element
         */
        org.apache.xmlbeans.XmlDouble addNewRealList();
        
        /**
         * Removes the ith "real-list" element
         */
        void removeRealList(int i);
        
        /**
         * Gets the "seq-align-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList getSeqAlignList();
        
        /**
         * True if has "seq-align-list" element
         */
        boolean isSetSeqAlignList();
        
        /**
         * Sets the "seq-align-list" element
         */
        void setSeqAlignList(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList seqAlignList);
        
        /**
         * Appends and returns a new empty "seq-align-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList addNewSeqAlignList();
        
        /**
         * Unsets the "seq-align-list" element
         */
        void unsetSeqAlignList();
        
        /**
         * Gets the "seq-id-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList getSeqIdList();
        
        /**
         * True if has "seq-id-list" element
         */
        boolean isSetSeqIdList();
        
        /**
         * Sets the "seq-id-list" element
         */
        void setSeqIdList(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList seqIdList);
        
        /**
         * Appends and returns a new empty "seq-id-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList addNewSeqIdList();
        
        /**
         * Unsets the "seq-id-list" element
         */
        void unsetSeqIdList();
        
        /**
         * Gets the "seq-loc-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList getSeqLocList();
        
        /**
         * True if has "seq-loc-list" element
         */
        boolean isSetSeqLocList();
        
        /**
         * Sets the "seq-loc-list" element
         */
        void setSeqLocList(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList seqLocList);
        
        /**
         * Appends and returns a new empty "seq-loc-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList addNewSeqLocList();
        
        /**
         * Unsets the "seq-loc-list" element
         */
        void unsetSeqLocList();
        
        /**
         * Gets the "strand-type-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList getStrandTypeList();
        
        /**
         * True if has "strand-type-list" element
         */
        boolean isSetStrandTypeList();
        
        /**
         * Sets the "strand-type-list" element
         */
        void setStrandTypeList(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList strandTypeList);
        
        /**
         * Appends and returns a new empty "strand-type-list" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList addNewStrandTypeList();
        
        /**
         * Unsets the "strand-type-list" element
         */
        void unsetStrandTypeList();
        
        /**
         * Gets array of all "string-list" elements
         */
        java.lang.String[] getStringListArray();
        
        /**
         * Gets ith "string-list" element
         */
        java.lang.String getStringListArray(int i);
        
        /**
         * Gets (as xml) array of all "string-list" elements
         */
        org.apache.xmlbeans.XmlString[] xgetStringListArray();
        
        /**
         * Gets (as xml) ith "string-list" element
         */
        org.apache.xmlbeans.XmlString xgetStringListArray(int i);
        
        /**
         * Returns number of "string-list" element
         */
        int sizeOfStringListArray();
        
        /**
         * Sets array of all "string-list" element
         */
        void setStringListArray(java.lang.String[] stringListArray);
        
        /**
         * Sets ith "string-list" element
         */
        void setStringListArray(int i, java.lang.String stringList);
        
        /**
         * Sets (as xml) array of all "string-list" element
         */
        void xsetStringListArray(org.apache.xmlbeans.XmlString[] stringListArray);
        
        /**
         * Sets (as xml) ith "string-list" element
         */
        void xsetStringListArray(int i, org.apache.xmlbeans.XmlString stringList);
        
        /**
         * Inserts the value as the ith "string-list" element
         */
        void insertStringList(int i, java.lang.String stringList);
        
        /**
         * Appends the value as the last "string-list" element
         */
        void addStringList(java.lang.String stringList);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "string-list" element
         */
        org.apache.xmlbeans.XmlString insertNewStringList(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "string-list" element
         */
        org.apache.xmlbeans.XmlString addNewStringList();
        
        /**
         * Removes the ith "string-list" element
         */
        void removeStringList(int i);
        
        /**
         * Gets the "bioseq-set" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet getBioseqSet();
        
        /**
         * True if has "bioseq-set" element
         */
        boolean isSetBioseqSet();
        
        /**
         * Sets the "bioseq-set" element
         */
        void setBioseqSet(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet bioseqSet);
        
        /**
         * Appends and returns a new empty "bioseq-set" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet addNewBioseqSet();
        
        /**
         * Unsets the "bioseq-set" element
         */
        void unsetBioseqSet();
        
        /**
         * Gets the "seq-align-set" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet getSeqAlignSet();
        
        /**
         * True if has "seq-align-set" element
         */
        boolean isSetSeqAlignSet();
        
        /**
         * Sets the "seq-align-set" element
         */
        void setSeqAlignSet(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet seqAlignSet);
        
        /**
         * Appends and returns a new empty "seq-align-set" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet addNewSeqAlignSet();
        
        /**
         * Unsets the "seq-align-set" element
         */
        void unsetSeqAlignSet();
        
        /**
         * Gets the "query-mask" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask getQueryMask();
        
        /**
         * True if has "query-mask" element
         */
        boolean isSetQueryMask();
        
        /**
         * Sets the "query-mask" element
         */
        void setQueryMask(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask queryMask);
        
        /**
         * Appends and returns a new empty "query-mask" element
         */
        gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask addNewQueryMask();
        
        /**
         * Unsets the "query-mask" element
         */
        void unsetQueryMask();
        
        /**
         * An XML bioseq(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Bioseq extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bioseq.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bioseqd355elemtype");
            
            /**
             * Gets the "Bioseq" element
             */
            gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq getBioseq();
            
            /**
             * Sets the "Bioseq" element
             */
            void setBioseq(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq bioseq);
            
            /**
             * Appends and returns a new empty "Bioseq" element
             */
            gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq addNewBioseq();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Bioseq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML boolean(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Boolean extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Boolean.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("booleane7b6elemtype");
            
            /**
             * Gets the "value" attribute
             */
            gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value.Enum getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value xgetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value.Enum value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value value);
            
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.Blast4ValueDocument$Blast4Value$Boolean$Value.
             */
            public interface Value extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Value.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("valuec60fattrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum TRUE = Enum.forString("true");
                static final Enum FALSE = Enum.forString("false");
                
                static final int INT_TRUE = Enum.INT_TRUE;
                static final int INT_FALSE = Enum.INT_FALSE;
                
                /**
                 * Enumeration value class for gov.nih.nlm.ncbi.www.Blast4ValueDocument$Blast4Value$Boolean$Value.
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
                    public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value newValue(java.lang.Object obj) {
                      return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value) type.newValue( obj ); }
                    
                    public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value newInstance() {
                      return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean.Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Boolean) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML cutoff(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Cutoff extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cutoff.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("cutoffb56belemtype");
            
            /**
             * Gets the "Blast4-cutoff" element
             */
            gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff getBlast4Cutoff();
            
            /**
             * Sets the "Blast4-cutoff" element
             */
            void setBlast4Cutoff(gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff blast4Cutoff);
            
            /**
             * Appends and returns a new empty "Blast4-cutoff" element
             */
            gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff addNewBlast4Cutoff();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Cutoff) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML matrix(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Matrix extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Matrix.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("matrix303felemtype");
            
            /**
             * Gets the "PssmWithParameters" element
             */
            gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters getPssmWithParameters();
            
            /**
             * Sets the "PssmWithParameters" element
             */
            void setPssmWithParameters(gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters pssmWithParameters);
            
            /**
             * Appends and returns a new empty "PssmWithParameters" element
             */
            gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters addNewPssmWithParameters();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.Matrix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq-align(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SeqAlign extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqAlign.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqalign4ce5elemtype");
            
            /**
             * Gets the "Seq-align" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign getSeqAlign();
            
            /**
             * Sets the "Seq-align" element
             */
            void setSeqAlign(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign seqAlign);
            
            /**
             * Appends and returns a new empty "Seq-align" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign addNewSeqAlign();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq-id(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SeqId extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqidc7c7elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq-loc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SeqLoc extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqLoc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqlocffe0elemtype");
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML strand-type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface StrandType extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StrandType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("strandtype10efelemtype");
            
            /**
             * Gets the "Blast4-strand-type" element
             */
            gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType getBlast4StrandType();
            
            /**
             * Sets the "Blast4-strand-type" element
             */
            void setBlast4StrandType(gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType blast4StrandType);
            
            /**
             * Appends and returns a new empty "Blast4-strand-type" element
             */
            gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType addNewBlast4StrandType();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML bioseq-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface BioseqList extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BioseqList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bioseqlista6e2elemtype");
            
            /**
             * Gets array of all "Bioseq" elements
             */
            gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq[] getBioseqArray();
            
            /**
             * Gets ith "Bioseq" element
             */
            gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq getBioseqArray(int i);
            
            /**
             * Returns number of "Bioseq" element
             */
            int sizeOfBioseqArray();
            
            /**
             * Sets array of all "Bioseq" element
             */
            void setBioseqArray(gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq[] bioseqArray);
            
            /**
             * Sets ith "Bioseq" element
             */
            void setBioseqArray(int i, gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq bioseq);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Bioseq" element
             */
            gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq insertNewBioseq(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Bioseq" element
             */
            gov.nih.nlm.ncbi.www.BioseqDocument.Bioseq addNewBioseq();
            
            /**
             * Removes the ith "Bioseq" element
             */
            void removeBioseq(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML cutoff-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface CutoffList extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CutoffList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("cutofflista28celemtype");
            
            /**
             * Gets array of all "Blast4-cutoff" elements
             */
            gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff[] getBlast4CutoffArray();
            
            /**
             * Gets ith "Blast4-cutoff" element
             */
            gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff getBlast4CutoffArray(int i);
            
            /**
             * Returns number of "Blast4-cutoff" element
             */
            int sizeOfBlast4CutoffArray();
            
            /**
             * Sets array of all "Blast4-cutoff" element
             */
            void setBlast4CutoffArray(gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff[] blast4CutoffArray);
            
            /**
             * Sets ith "Blast4-cutoff" element
             */
            void setBlast4CutoffArray(int i, gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff blast4Cutoff);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-cutoff" element
             */
            gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff insertNewBlast4Cutoff(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-cutoff" element
             */
            gov.nih.nlm.ncbi.www.Blast4CutoffDocument.Blast4Cutoff addNewBlast4Cutoff();
            
            /**
             * Removes the ith "Blast4-cutoff" element
             */
            void removeBlast4Cutoff(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.CutoffList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML matrix-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface MatrixList extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MatrixList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("matrixlistcc38elemtype");
            
            /**
             * Gets array of all "PssmWithParameters" elements
             */
            gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters[] getPssmWithParametersArray();
            
            /**
             * Gets ith "PssmWithParameters" element
             */
            gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters getPssmWithParametersArray(int i);
            
            /**
             * Returns number of "PssmWithParameters" element
             */
            int sizeOfPssmWithParametersArray();
            
            /**
             * Sets array of all "PssmWithParameters" element
             */
            void setPssmWithParametersArray(gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters[] pssmWithParametersArray);
            
            /**
             * Sets ith "PssmWithParameters" element
             */
            void setPssmWithParametersArray(int i, gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters pssmWithParameters);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "PssmWithParameters" element
             */
            gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters insertNewPssmWithParameters(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "PssmWithParameters" element
             */
            gov.nih.nlm.ncbi.www.PssmWithParametersDocument.PssmWithParameters addNewPssmWithParameters();
            
            /**
             * Removes the ith "PssmWithParameters" element
             */
            void removePssmWithParameters(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.MatrixList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq-align-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SeqAlignList extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqAlignList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqalignlista752elemtype");
            
            /**
             * Gets array of all "Seq-align" elements
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] getSeqAlignArray();
            
            /**
             * Gets ith "Seq-align" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign getSeqAlignArray(int i);
            
            /**
             * Returns number of "Seq-align" element
             */
            int sizeOfSeqAlignArray();
            
            /**
             * Sets array of all "Seq-align" element
             */
            void setSeqAlignArray(gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign[] seqAlignArray);
            
            /**
             * Sets ith "Seq-align" element
             */
            void setSeqAlignArray(int i, gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign seqAlign);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Seq-align" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign insertNewSeqAlign(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Seq-align" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignDocument.SeqAlign addNewSeqAlign();
            
            /**
             * Removes the ith "Seq-align" element
             */
            void removeSeqAlign(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq-id-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SeqIdList extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqIdList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqidlista9b0elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqIdList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq-loc-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SeqLocList extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqLocList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqloclist9937elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqLocList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML strand-type-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface StrandTypeList extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StrandTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("strandtypelistd988elemtype");
            
            /**
             * Gets array of all "Blast4-strand-type" elements
             */
            gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType[] getBlast4StrandTypeArray();
            
            /**
             * Gets ith "Blast4-strand-type" element
             */
            gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType getBlast4StrandTypeArray(int i);
            
            /**
             * Returns number of "Blast4-strand-type" element
             */
            int sizeOfBlast4StrandTypeArray();
            
            /**
             * Sets array of all "Blast4-strand-type" element
             */
            void setBlast4StrandTypeArray(gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType[] blast4StrandTypeArray);
            
            /**
             * Sets ith "Blast4-strand-type" element
             */
            void setBlast4StrandTypeArray(int i, gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType blast4StrandType);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-strand-type" element
             */
            gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType insertNewBlast4StrandType(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-strand-type" element
             */
            gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType addNewBlast4StrandType();
            
            /**
             * Removes the ith "Blast4-strand-type" element
             */
            void removeBlast4StrandType(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.StrandTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML bioseq-set(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface BioseqSet extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BioseqSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("bioseqsete0aaelemtype");
            
            /**
             * Gets the "Bioseq-set" element
             */
            gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet getBioseqSet();
            
            /**
             * Sets the "Bioseq-set" element
             */
            void setBioseqSet(gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet bioseqSet);
            
            /**
             * Appends and returns a new empty "Bioseq-set" element
             */
            gov.nih.nlm.ncbi.www.BioseqSetDocument.BioseqSet addNewBioseqSet();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.BioseqSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML seq-align-set(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface SeqAlignSet extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqAlignSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqalignset123aelemtype");
            
            /**
             * Gets the "Seq-align-set" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet getSeqAlignSet();
            
            /**
             * Sets the "Seq-align-set" element
             */
            void setSeqAlignSet(gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet seqAlignSet);
            
            /**
             * Appends and returns a new empty "Seq-align-set" element
             */
            gov.nih.nlm.ncbi.www.SeqAlignSetDocument.SeqAlignSet addNewSeqAlignSet();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.SeqAlignSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML query-mask(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface QueryMask extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryMask.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("querymask654felemtype");
            
            /**
             * Gets the "Blast4-mask" element
             */
            gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask getBlast4Mask();
            
            /**
             * Sets the "Blast4-mask" element
             */
            void setBlast4Mask(gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask blast4Mask);
            
            /**
             * Appends and returns a new empty "Blast4-mask" element
             */
            gov.nih.nlm.ncbi.www.Blast4MaskDocument.Blast4Mask addNewBlast4Mask();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask newInstance() {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value.QueryMask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value newInstance() {
              return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.Blast4ValueDocument.Blast4Value) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.Blast4ValueDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.Blast4ValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
