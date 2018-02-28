/*
 * An XML document type.
 * Localname: ModelEvidenceSupport
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one ModelEvidenceSupport(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class ModelEvidenceSupportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument
{
    
    public ModelEvidenceSupportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODELEVIDENCESUPPORT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ModelEvidenceSupport");
    
    
    /**
     * Gets the "ModelEvidenceSupport" element
     */
    public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport getModelEvidenceSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport target = null;
            target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport)get_store().find_element_user(MODELEVIDENCESUPPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ModelEvidenceSupport" element
     */
    public void setModelEvidenceSupport(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport modelEvidenceSupport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport target = null;
            target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport)get_store().find_element_user(MODELEVIDENCESUPPORT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport)get_store().add_element_user(MODELEVIDENCESUPPORT$0);
            }
            target.set(modelEvidenceSupport);
        }
    }
    
    /**
     * Appends and returns a new empty "ModelEvidenceSupport" element
     */
    public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport addNewModelEvidenceSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport target = null;
            target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport)get_store().add_element_user(MODELEVIDENCESUPPORT$0);
            return target;
        }
    }
    /**
     * An XML ModelEvidenceSupport(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class ModelEvidenceSupportImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport
    {
        
        public ModelEvidenceSupportImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName METHOD$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "method");
        private static final javax.xml.namespace.QName MRNA$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mrna");
        private static final javax.xml.namespace.QName EST$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "est");
        private static final javax.xml.namespace.QName PROTEIN$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "protein");
        private static final javax.xml.namespace.QName IDENTIFICATION$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "identification");
        private static final javax.xml.namespace.QName DBXREF$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "dbxref");
        private static final javax.xml.namespace.QName EXONCOUNT$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "exon-count");
        private static final javax.xml.namespace.QName EXONLENGTH$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "exon-length");
        private static final javax.xml.namespace.QName FULLLENGTH$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "full-length");
        private static final javax.xml.namespace.QName SUPPORTSALLEXONCOMBO$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "supports-all-exon-combo");
        
        
        /**
         * Gets the "method" element
         */
        public java.lang.String getMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METHOD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "method" element
         */
        public org.apache.xmlbeans.XmlString xgetMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METHOD$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "method" element
         */
        public boolean isSetMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(METHOD$0) != 0;
            }
        }
        
        /**
         * Sets the "method" element
         */
        public void setMethod(java.lang.String method)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METHOD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METHOD$0);
                }
                target.setStringValue(method);
            }
        }
        
        /**
         * Sets (as xml) the "method" element
         */
        public void xsetMethod(org.apache.xmlbeans.XmlString method)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METHOD$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METHOD$0);
                }
                target.set(method);
            }
        }
        
        /**
         * Unsets the "method" element
         */
        public void unsetMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(METHOD$0, 0);
            }
        }
        
        /**
         * Gets the "mrna" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna getMrna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna)get_store().find_element_user(MRNA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "mrna" element
         */
        public boolean isSetMrna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MRNA$2) != 0;
            }
        }
        
        /**
         * Sets the "mrna" element
         */
        public void setMrna(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna mrna)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna)get_store().find_element_user(MRNA$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna)get_store().add_element_user(MRNA$2);
                }
                target.set(mrna);
            }
        }
        
        /**
         * Appends and returns a new empty "mrna" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna addNewMrna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna)get_store().add_element_user(MRNA$2);
                return target;
            }
        }
        
        /**
         * Unsets the "mrna" element
         */
        public void unsetMrna()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MRNA$2, 0);
            }
        }
        
        /**
         * Gets the "est" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est getEst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est)get_store().find_element_user(EST$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "est" element
         */
        public boolean isSetEst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EST$4) != 0;
            }
        }
        
        /**
         * Sets the "est" element
         */
        public void setEst(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est est)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est)get_store().find_element_user(EST$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est)get_store().add_element_user(EST$4);
                }
                target.set(est);
            }
        }
        
        /**
         * Appends and returns a new empty "est" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est addNewEst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est)get_store().add_element_user(EST$4);
                return target;
            }
        }
        
        /**
         * Unsets the "est" element
         */
        public void unsetEst()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EST$4, 0);
            }
        }
        
        /**
         * Gets the "protein" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein getProtein()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein)get_store().find_element_user(PROTEIN$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "protein" element
         */
        public boolean isSetProtein()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROTEIN$6) != 0;
            }
        }
        
        /**
         * Sets the "protein" element
         */
        public void setProtein(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein protein)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein)get_store().find_element_user(PROTEIN$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein)get_store().add_element_user(PROTEIN$6);
                }
                target.set(protein);
            }
        }
        
        /**
         * Appends and returns a new empty "protein" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein addNewProtein()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein)get_store().add_element_user(PROTEIN$6);
                return target;
            }
        }
        
        /**
         * Unsets the "protein" element
         */
        public void unsetProtein()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROTEIN$6, 0);
            }
        }
        
        /**
         * Gets the "identification" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification getIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification)get_store().find_element_user(IDENTIFICATION$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "identification" element
         */
        public boolean isSetIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFICATION$8) != 0;
            }
        }
        
        /**
         * Sets the "identification" element
         */
        public void setIdentification(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification identification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification)get_store().find_element_user(IDENTIFICATION$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification)get_store().add_element_user(IDENTIFICATION$8);
                }
                target.set(identification);
            }
        }
        
        /**
         * Appends and returns a new empty "identification" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification addNewIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification)get_store().add_element_user(IDENTIFICATION$8);
                return target;
            }
        }
        
        /**
         * Unsets the "identification" element
         */
        public void unsetIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFICATION$8, 0);
            }
        }
        
        /**
         * Gets the "dbxref" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref getDbxref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref)get_store().find_element_user(DBXREF$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dbxref" element
         */
        public boolean isSetDbxref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DBXREF$10) != 0;
            }
        }
        
        /**
         * Sets the "dbxref" element
         */
        public void setDbxref(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref dbxref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref)get_store().find_element_user(DBXREF$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref)get_store().add_element_user(DBXREF$10);
                }
                target.set(dbxref);
            }
        }
        
        /**
         * Appends and returns a new empty "dbxref" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref addNewDbxref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref)get_store().add_element_user(DBXREF$10);
                return target;
            }
        }
        
        /**
         * Unsets the "dbxref" element
         */
        public void unsetDbxref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DBXREF$10, 0);
            }
        }
        
        /**
         * Gets the "exon-count" element
         */
        public java.math.BigInteger getExonCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXONCOUNT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "exon-count" element
         */
        public org.apache.xmlbeans.XmlInteger xgetExonCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EXONCOUNT$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "exon-count" element
         */
        public boolean isSetExonCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXONCOUNT$12) != 0;
            }
        }
        
        /**
         * Sets the "exon-count" element
         */
        public void setExonCount(java.math.BigInteger exonCount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXONCOUNT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXONCOUNT$12);
                }
                target.setBigIntegerValue(exonCount);
            }
        }
        
        /**
         * Sets (as xml) the "exon-count" element
         */
        public void xsetExonCount(org.apache.xmlbeans.XmlInteger exonCount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EXONCOUNT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(EXONCOUNT$12);
                }
                target.set(exonCount);
            }
        }
        
        /**
         * Unsets the "exon-count" element
         */
        public void unsetExonCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXONCOUNT$12, 0);
            }
        }
        
        /**
         * Gets the "exon-length" element
         */
        public java.math.BigInteger getExonLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXONLENGTH$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "exon-length" element
         */
        public org.apache.xmlbeans.XmlInteger xgetExonLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EXONLENGTH$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "exon-length" element
         */
        public boolean isSetExonLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXONLENGTH$14) != 0;
            }
        }
        
        /**
         * Sets the "exon-length" element
         */
        public void setExonLength(java.math.BigInteger exonLength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXONLENGTH$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXONLENGTH$14);
                }
                target.setBigIntegerValue(exonLength);
            }
        }
        
        /**
         * Sets (as xml) the "exon-length" element
         */
        public void xsetExonLength(org.apache.xmlbeans.XmlInteger exonLength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EXONLENGTH$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(EXONLENGTH$14);
                }
                target.set(exonLength);
            }
        }
        
        /**
         * Unsets the "exon-length" element
         */
        public void unsetExonLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXONLENGTH$14, 0);
            }
        }
        
        /**
         * Gets the "full-length" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength getFullLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength)get_store().find_element_user(FULLLENGTH$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "full-length" element
         */
        public boolean isSetFullLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FULLLENGTH$16) != 0;
            }
        }
        
        /**
         * Sets the "full-length" element
         */
        public void setFullLength(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength fullLength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength)get_store().find_element_user(FULLLENGTH$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength)get_store().add_element_user(FULLLENGTH$16);
                }
                target.set(fullLength);
            }
        }
        
        /**
         * Appends and returns a new empty "full-length" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength addNewFullLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength)get_store().add_element_user(FULLLENGTH$16);
                return target;
            }
        }
        
        /**
         * Unsets the "full-length" element
         */
        public void unsetFullLength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FULLLENGTH$16, 0);
            }
        }
        
        /**
         * Gets the "supports-all-exon-combo" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo getSupportsAllExonCombo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo)get_store().find_element_user(SUPPORTSALLEXONCOMBO$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "supports-all-exon-combo" element
         */
        public boolean isSetSupportsAllExonCombo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUPPORTSALLEXONCOMBO$18) != 0;
            }
        }
        
        /**
         * Sets the "supports-all-exon-combo" element
         */
        public void setSupportsAllExonCombo(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo supportsAllExonCombo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo)get_store().find_element_user(SUPPORTSALLEXONCOMBO$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo)get_store().add_element_user(SUPPORTSALLEXONCOMBO$18);
                }
                target.set(supportsAllExonCombo);
            }
        }
        
        /**
         * Appends and returns a new empty "supports-all-exon-combo" element
         */
        public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo addNewSupportsAllExonCombo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo target = null;
                target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo)get_store().add_element_user(SUPPORTSALLEXONCOMBO$18);
                return target;
            }
        }
        
        /**
         * Unsets the "supports-all-exon-combo" element
         */
        public void unsetSupportsAllExonCombo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUPPORTSALLEXONCOMBO$18, 0);
            }
        }
        /**
         * An XML mrna(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MrnaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Mrna
        {
            
            public MrnaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MODELEVIDENCEITEM$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ModelEvidenceItem");
            
            
            /**
             * Gets array of all "ModelEvidenceItem" elements
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] getModelEvidenceItemArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MODELEVIDENCEITEM$0, targetList);
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] result = new gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "ModelEvidenceItem" element
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem getModelEvidenceItemArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().find_element_user(MODELEVIDENCEITEM$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "ModelEvidenceItem" element
             */
            public int sizeOfModelEvidenceItemArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MODELEVIDENCEITEM$0);
                }
            }
            
            /**
             * Sets array of all "ModelEvidenceItem" element
             */
            public void setModelEvidenceItemArray(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] modelEvidenceItemArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(modelEvidenceItemArray, MODELEVIDENCEITEM$0);
                }
            }
            
            /**
             * Sets ith "ModelEvidenceItem" element
             */
            public void setModelEvidenceItemArray(int i, gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem modelEvidenceItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().find_element_user(MODELEVIDENCEITEM$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(modelEvidenceItem);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ModelEvidenceItem" element
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem insertNewModelEvidenceItem(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().insert_element_user(MODELEVIDENCEITEM$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ModelEvidenceItem" element
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem addNewModelEvidenceItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().add_element_user(MODELEVIDENCEITEM$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "ModelEvidenceItem" element
             */
            public void removeModelEvidenceItem(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MODELEVIDENCEITEM$0, i);
                }
            }
        }
        /**
         * An XML est(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class EstImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Est
        {
            
            public EstImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MODELEVIDENCEITEM$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ModelEvidenceItem");
            
            
            /**
             * Gets array of all "ModelEvidenceItem" elements
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] getModelEvidenceItemArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MODELEVIDENCEITEM$0, targetList);
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] result = new gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "ModelEvidenceItem" element
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem getModelEvidenceItemArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().find_element_user(MODELEVIDENCEITEM$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "ModelEvidenceItem" element
             */
            public int sizeOfModelEvidenceItemArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MODELEVIDENCEITEM$0);
                }
            }
            
            /**
             * Sets array of all "ModelEvidenceItem" element
             */
            public void setModelEvidenceItemArray(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] modelEvidenceItemArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(modelEvidenceItemArray, MODELEVIDENCEITEM$0);
                }
            }
            
            /**
             * Sets ith "ModelEvidenceItem" element
             */
            public void setModelEvidenceItemArray(int i, gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem modelEvidenceItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().find_element_user(MODELEVIDENCEITEM$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(modelEvidenceItem);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ModelEvidenceItem" element
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem insertNewModelEvidenceItem(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().insert_element_user(MODELEVIDENCEITEM$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ModelEvidenceItem" element
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem addNewModelEvidenceItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().add_element_user(MODELEVIDENCEITEM$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "ModelEvidenceItem" element
             */
            public void removeModelEvidenceItem(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MODELEVIDENCEITEM$0, i);
                }
            }
        }
        /**
         * An XML protein(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ProteinImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Protein
        {
            
            public ProteinImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MODELEVIDENCEITEM$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "ModelEvidenceItem");
            
            
            /**
             * Gets array of all "ModelEvidenceItem" elements
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] getModelEvidenceItemArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MODELEVIDENCEITEM$0, targetList);
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] result = new gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "ModelEvidenceItem" element
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem getModelEvidenceItemArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().find_element_user(MODELEVIDENCEITEM$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "ModelEvidenceItem" element
             */
            public int sizeOfModelEvidenceItemArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MODELEVIDENCEITEM$0);
                }
            }
            
            /**
             * Sets array of all "ModelEvidenceItem" element
             */
            public void setModelEvidenceItemArray(gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem[] modelEvidenceItemArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(modelEvidenceItemArray, MODELEVIDENCEITEM$0);
                }
            }
            
            /**
             * Sets ith "ModelEvidenceItem" element
             */
            public void setModelEvidenceItemArray(int i, gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem modelEvidenceItem)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().find_element_user(MODELEVIDENCEITEM$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(modelEvidenceItem);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ModelEvidenceItem" element
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem insertNewModelEvidenceItem(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().insert_element_user(MODELEVIDENCEITEM$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ModelEvidenceItem" element
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem addNewModelEvidenceItem()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceItemDocument.ModelEvidenceItem)get_store().add_element_user(MODELEVIDENCEITEM$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "ModelEvidenceItem" element
             */
            public void removeModelEvidenceItem(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MODELEVIDENCEITEM$0, i);
                }
            }
        }
        /**
         * An XML identification(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class IdentificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Identification
        {
            
            public IdentificationImpl(org.apache.xmlbeans.SchemaType sType)
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
         * An XML dbxref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DbxrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.Dbxref
        {
            
            public DbxrefImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DBTAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
            
            
            /**
             * Gets array of all "Dbtag" elements
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] getDbtagArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DBTAG$0, targetList);
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] result = new gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtagArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Dbtag" element
             */
            public int sizeOfDbtagArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DBTAG$0);
                }
            }
            
            /**
             * Sets array of all "Dbtag" element
             */
            public void setDbtagArray(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag[] dbtagArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(dbtagArray, DBTAG$0);
                }
            }
            
            /**
             * Sets ith "Dbtag" element
             */
            public void setDbtagArray(int i, gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(dbtag);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag insertNewDbtag(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().insert_element_user(DBTAG$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Dbtag" element
             */
            public void removeDbtag(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DBTAG$0, i);
                }
            }
        }
        /**
         * An XML full-length(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FullLengthImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength
        {
            
            public FullLengthImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VALUE$0);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value)get_default_attribute_value(VALUE$0);
                    }
                    return target;
                }
            }
            
            /**
             * True if has "value" attribute
             */
            public boolean isSetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALUE$0) != null;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            
            /**
             * Unsets the "value" attribute
             */
            public void unsetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALUE$0);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument$ModelEvidenceSupport$FullLength$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.FullLength.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML supports-all-exon-combo(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SupportsAllExonComboImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo
        {
            
            public SupportsAllExonComboImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value.Enum getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VALUE$0);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value)get_default_attribute_value(VALUE$0);
                    }
                    return target;
                }
            }
            
            /**
             * True if has "value" attribute
             */
            public boolean isSetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALUE$0) != null;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value.Enum value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                    }
                    target.setEnumValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value target = null;
                    target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value)get_store().find_attribute_user(VALUE$0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value)get_store().add_attribute_user(VALUE$0);
                    }
                    target.set(value);
                }
            }
            
            /**
             * Unsets the "value" attribute
             */
            public void unsetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALUE$0);
                }
            }
            /**
             * An XML value(@).
             *
             * This is an atomic type that is a restriction of gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument$ModelEvidenceSupport$SupportsAllExonCombo$Value.
             */
            public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nlm.ncbi.www.ModelEvidenceSupportDocument.ModelEvidenceSupport.SupportsAllExonCombo.Value
            {
                
                public ValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
    }
}
