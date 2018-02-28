/*
 * An XML document type.
 * Localname: Textseq-id
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.TextseqIdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Textseq-id(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class TextseqIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TextseqIdDocument
{
    
    public TextseqIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTSEQID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Textseq-id");
    
    
    /**
     * Gets the "Textseq-id" element
     */
    public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId getTextseqId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
            target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Textseq-id" element
     */
    public void setTextseqId(gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId textseqId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
            target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().find_element_user(TEXTSEQID$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
            }
            target.set(textseqId);
        }
    }
    
    /**
     * Appends and returns a new empty "Textseq-id" element
     */
    public gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId addNewTextseqId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId target = null;
            target = (gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId)get_store().add_element_user(TEXTSEQID$0);
            return target;
        }
    }
    /**
     * An XML Textseq-id(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class TextseqIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.TextseqIdDocument.TextseqId
    {
        
        public TextseqIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName ACCESSION$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "accession");
        private static final javax.xml.namespace.QName RELEASE$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "release");
        private static final javax.xml.namespace.QName VERSION$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "version");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "name" element
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$0) != 0;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" element
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$0, 0);
            }
        }
        
        /**
         * Gets the "accession" element
         */
        public java.lang.String getAccession()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "accession" element
         */
        public org.apache.xmlbeans.XmlString xgetAccession()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCESSION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "accession" element
         */
        public boolean isSetAccession()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACCESSION$2) != 0;
            }
        }
        
        /**
         * Sets the "accession" element
         */
        public void setAccession(java.lang.String accession)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSION$2);
                }
                target.setStringValue(accession);
            }
        }
        
        /**
         * Sets (as xml) the "accession" element
         */
        public void xsetAccession(org.apache.xmlbeans.XmlString accession)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCESSION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCESSION$2);
                }
                target.set(accession);
            }
        }
        
        /**
         * Unsets the "accession" element
         */
        public void unsetAccession()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACCESSION$2, 0);
            }
        }
        
        /**
         * Gets the "release" element
         */
        public java.lang.String getRelease()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEASE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "release" element
         */
        public org.apache.xmlbeans.XmlString xgetRelease()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELEASE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "release" element
         */
        public boolean isSetRelease()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELEASE$4) != 0;
            }
        }
        
        /**
         * Sets the "release" element
         */
        public void setRelease(java.lang.String release)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEASE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELEASE$4);
                }
                target.setStringValue(release);
            }
        }
        
        /**
         * Sets (as xml) the "release" element
         */
        public void xsetRelease(org.apache.xmlbeans.XmlString release)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELEASE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELEASE$4);
                }
                target.set(release);
            }
        }
        
        /**
         * Unsets the "release" element
         */
        public void unsetRelease()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELEASE$4, 0);
            }
        }
        
        /**
         * Gets the "version" element
         */
        public java.math.BigInteger getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" element
         */
        public org.apache.xmlbeans.XmlInteger xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VERSION$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "version" element
         */
        public boolean isSetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VERSION$6) != 0;
            }
        }
        
        /**
         * Sets the "version" element
         */
        public void setVersion(java.math.BigInteger version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$6);
                }
                target.setBigIntegerValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" element
         */
        public void xsetVersion(org.apache.xmlbeans.XmlInteger version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VERSION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(VERSION$6);
                }
                target.set(version);
            }
        }
        
        /**
         * Unsets the "version" element
         */
        public void unsetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VERSION$6, 0);
            }
        }
    }
}
