/*
 * An XML document type.
 * Localname: Seqdesc
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqdescDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Seqdesc(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class SeqdescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument
{
    
    public SeqdescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQDESC$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Seqdesc");
    
    
    /**
     * Gets the "Seqdesc" element
     */
    public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc getSeqdesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc target = null;
            target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc)get_store().find_element_user(SEQDESC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Seqdesc" element
     */
    public void setSeqdesc(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc seqdesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc target = null;
            target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc)get_store().find_element_user(SEQDESC$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc)get_store().add_element_user(SEQDESC$0);
            }
            target.set(seqdesc);
        }
    }
    
    /**
     * Appends and returns a new empty "Seqdesc" element
     */
    public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc addNewSeqdesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc target = null;
            target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc)get_store().add_element_user(SEQDESC$0);
            return target;
        }
    }
    /**
     * An XML Seqdesc(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class SeqdescImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc
    {
        
        public SeqdescImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MOLTYPE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mol-type");
        private static final javax.xml.namespace.QName MODIF$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "modif");
        private static final javax.xml.namespace.QName METHOD$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "method");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName TITLE$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "title");
        private static final javax.xml.namespace.QName ORG$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "org");
        private static final javax.xml.namespace.QName COMMENT$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "comment");
        private static final javax.xml.namespace.QName NUM$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "num");
        private static final javax.xml.namespace.QName MAPLOC$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "maploc");
        private static final javax.xml.namespace.QName PIR$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pir");
        private static final javax.xml.namespace.QName GENBANK$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "genbank");
        private static final javax.xml.namespace.QName PUB$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pub");
        private static final javax.xml.namespace.QName REGION$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "region");
        private static final javax.xml.namespace.QName USER$26 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "user");
        private static final javax.xml.namespace.QName SP$28 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "sp");
        private static final javax.xml.namespace.QName DBXREF$30 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "dbxref");
        private static final javax.xml.namespace.QName EMBL$32 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "embl");
        private static final javax.xml.namespace.QName CREATEDATE$34 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "create-date");
        private static final javax.xml.namespace.QName UPDATEDATE$36 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "update-date");
        private static final javax.xml.namespace.QName PRF$38 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "prf");
        private static final javax.xml.namespace.QName PDB$40 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pdb");
        private static final javax.xml.namespace.QName HET$42 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "het");
        private static final javax.xml.namespace.QName SOURCE$44 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "source");
        private static final javax.xml.namespace.QName MOLINFO$46 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "molinfo");
        private static final javax.xml.namespace.QName MODELEV$48 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "modelev");
        
        
        /**
         * Gets the "mol-type" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType getMolType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType)get_store().find_element_user(MOLTYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "mol-type" element
         */
        public boolean isSetMolType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MOLTYPE$0) != 0;
            }
        }
        
        /**
         * Sets the "mol-type" element
         */
        public void setMolType(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType molType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType)get_store().find_element_user(MOLTYPE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType)get_store().add_element_user(MOLTYPE$0);
                }
                target.set(molType);
            }
        }
        
        /**
         * Appends and returns a new empty "mol-type" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType addNewMolType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType)get_store().add_element_user(MOLTYPE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "mol-type" element
         */
        public void unsetMolType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MOLTYPE$0, 0);
            }
        }
        
        /**
         * Gets the "modif" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif getModif()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif)get_store().find_element_user(MODIF$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "modif" element
         */
        public boolean isSetModif()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MODIF$2) != 0;
            }
        }
        
        /**
         * Sets the "modif" element
         */
        public void setModif(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif modif)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif)get_store().find_element_user(MODIF$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif)get_store().add_element_user(MODIF$2);
                }
                target.set(modif);
            }
        }
        
        /**
         * Appends and returns a new empty "modif" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif addNewModif()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif)get_store().add_element_user(MODIF$2);
                return target;
            }
        }
        
        /**
         * Unsets the "modif" element
         */
        public void unsetModif()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MODIF$2, 0);
            }
        }
        
        /**
         * Gets the "method" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method getMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method)get_store().find_element_user(METHOD$4, 0);
                if (target == null)
                {
                    return null;
                }
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
                return get_store().count_elements(METHOD$4) != 0;
            }
        }
        
        /**
         * Sets the "method" element
         */
        public void setMethod(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method method)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method)get_store().find_element_user(METHOD$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method)get_store().add_element_user(METHOD$4);
                }
                target.set(method);
            }
        }
        
        /**
         * Appends and returns a new empty "method" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method addNewMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method)get_store().add_element_user(METHOD$4);
                return target;
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
                get_store().remove_element(METHOD$4, 0);
            }
        }
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
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
                return get_store().count_elements(NAME$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$6);
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
                get_store().remove_element(NAME$6, 0);
            }
        }
        
        /**
         * Gets the "title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$8, 0);
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
                return get_store().count_elements(TITLE$8) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$8);
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
                get_store().remove_element(TITLE$8, 0);
            }
        }
        
        /**
         * Gets the "org" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org getOrg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org)get_store().find_element_user(ORG$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "org" element
         */
        public boolean isSetOrg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORG$10) != 0;
            }
        }
        
        /**
         * Sets the "org" element
         */
        public void setOrg(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org org)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org)get_store().find_element_user(ORG$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org)get_store().add_element_user(ORG$10);
                }
                target.set(org);
            }
        }
        
        /**
         * Appends and returns a new empty "org" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org addNewOrg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org)get_store().add_element_user(ORG$10);
                return target;
            }
        }
        
        /**
         * Unsets the "org" element
         */
        public void unsetOrg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORG$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$12, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$12, 0);
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
                return get_store().count_elements(COMMENT$12) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENT$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENT$12);
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
                get_store().remove_element(COMMENT$12, 0);
            }
        }
        
        /**
         * Gets the "num" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num getNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num)get_store().find_element_user(NUM$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "num" element
         */
        public boolean isSetNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NUM$14) != 0;
            }
        }
        
        /**
         * Sets the "num" element
         */
        public void setNum(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num num)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num)get_store().find_element_user(NUM$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num)get_store().add_element_user(NUM$14);
                }
                target.set(num);
            }
        }
        
        /**
         * Appends and returns a new empty "num" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num addNewNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num)get_store().add_element_user(NUM$14);
                return target;
            }
        }
        
        /**
         * Unsets the "num" element
         */
        public void unsetNum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NUM$14, 0);
            }
        }
        
        /**
         * Gets the "maploc" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc getMaploc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc)get_store().find_element_user(MAPLOC$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "maploc" element
         */
        public boolean isSetMaploc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAPLOC$16) != 0;
            }
        }
        
        /**
         * Sets the "maploc" element
         */
        public void setMaploc(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc maploc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc)get_store().find_element_user(MAPLOC$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc)get_store().add_element_user(MAPLOC$16);
                }
                target.set(maploc);
            }
        }
        
        /**
         * Appends and returns a new empty "maploc" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc addNewMaploc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc)get_store().add_element_user(MAPLOC$16);
                return target;
            }
        }
        
        /**
         * Unsets the "maploc" element
         */
        public void unsetMaploc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAPLOC$16, 0);
            }
        }
        
        /**
         * Gets the "pir" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir getPir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir)get_store().find_element_user(PIR$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pir" element
         */
        public boolean isSetPir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PIR$18) != 0;
            }
        }
        
        /**
         * Sets the "pir" element
         */
        public void setPir(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir pir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir)get_store().find_element_user(PIR$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir)get_store().add_element_user(PIR$18);
                }
                target.set(pir);
            }
        }
        
        /**
         * Appends and returns a new empty "pir" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir addNewPir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir)get_store().add_element_user(PIR$18);
                return target;
            }
        }
        
        /**
         * Unsets the "pir" element
         */
        public void unsetPir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PIR$18, 0);
            }
        }
        
        /**
         * Gets the "genbank" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank getGenbank()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank)get_store().find_element_user(GENBANK$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "genbank" element
         */
        public boolean isSetGenbank()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENBANK$20) != 0;
            }
        }
        
        /**
         * Sets the "genbank" element
         */
        public void setGenbank(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank genbank)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank)get_store().find_element_user(GENBANK$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank)get_store().add_element_user(GENBANK$20);
                }
                target.set(genbank);
            }
        }
        
        /**
         * Appends and returns a new empty "genbank" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank addNewGenbank()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank)get_store().add_element_user(GENBANK$20);
                return target;
            }
        }
        
        /**
         * Unsets the "genbank" element
         */
        public void unsetGenbank()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENBANK$20, 0);
            }
        }
        
        /**
         * Gets the "pub" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub getPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub)get_store().find_element_user(PUB$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pub" element
         */
        public boolean isSetPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUB$22) != 0;
            }
        }
        
        /**
         * Sets the "pub" element
         */
        public void setPub(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub pub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub)get_store().find_element_user(PUB$22, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub)get_store().add_element_user(PUB$22);
                }
                target.set(pub);
            }
        }
        
        /**
         * Appends and returns a new empty "pub" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub addNewPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub)get_store().add_element_user(PUB$22);
                return target;
            }
        }
        
        /**
         * Unsets the "pub" element
         */
        public void unsetPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUB$22, 0);
            }
        }
        
        /**
         * Gets the "region" element
         */
        public java.lang.String getRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "region" element
         */
        public org.apache.xmlbeans.XmlString xgetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$24, 0);
                return target;
            }
        }
        
        /**
         * True if has "region" element
         */
        public boolean isSetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REGION$24) != 0;
            }
        }
        
        /**
         * Sets the "region" element
         */
        public void setRegion(java.lang.String region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGION$24);
                }
                target.setStringValue(region);
            }
        }
        
        /**
         * Sets (as xml) the "region" element
         */
        public void xsetRegion(org.apache.xmlbeans.XmlString region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGION$24);
                }
                target.set(region);
            }
        }
        
        /**
         * Unsets the "region" element
         */
        public void unsetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REGION$24, 0);
            }
        }
        
        /**
         * Gets the "user" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User getUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User)get_store().find_element_user(USER$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "user" element
         */
        public boolean isSetUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USER$26) != 0;
            }
        }
        
        /**
         * Sets the "user" element
         */
        public void setUser(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User user)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User)get_store().find_element_user(USER$26, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User)get_store().add_element_user(USER$26);
                }
                target.set(user);
            }
        }
        
        /**
         * Appends and returns a new empty "user" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User addNewUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User)get_store().add_element_user(USER$26);
                return target;
            }
        }
        
        /**
         * Unsets the "user" element
         */
        public void unsetUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USER$26, 0);
            }
        }
        
        /**
         * Gets the "sp" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp getSp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp)get_store().find_element_user(SP$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "sp" element
         */
        public boolean isSetSp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SP$28) != 0;
            }
        }
        
        /**
         * Sets the "sp" element
         */
        public void setSp(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp sp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp)get_store().find_element_user(SP$28, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp)get_store().add_element_user(SP$28);
                }
                target.set(sp);
            }
        }
        
        /**
         * Appends and returns a new empty "sp" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp addNewSp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp)get_store().add_element_user(SP$28);
                return target;
            }
        }
        
        /**
         * Unsets the "sp" element
         */
        public void unsetSp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SP$28, 0);
            }
        }
        
        /**
         * Gets the "dbxref" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref getDbxref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref)get_store().find_element_user(DBXREF$30, 0);
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
                return get_store().count_elements(DBXREF$30) != 0;
            }
        }
        
        /**
         * Sets the "dbxref" element
         */
        public void setDbxref(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref dbxref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref)get_store().find_element_user(DBXREF$30, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref)get_store().add_element_user(DBXREF$30);
                }
                target.set(dbxref);
            }
        }
        
        /**
         * Appends and returns a new empty "dbxref" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref addNewDbxref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref)get_store().add_element_user(DBXREF$30);
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
                get_store().remove_element(DBXREF$30, 0);
            }
        }
        
        /**
         * Gets the "embl" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl getEmbl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl)get_store().find_element_user(EMBL$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "embl" element
         */
        public boolean isSetEmbl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMBL$32) != 0;
            }
        }
        
        /**
         * Sets the "embl" element
         */
        public void setEmbl(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl embl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl)get_store().find_element_user(EMBL$32, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl)get_store().add_element_user(EMBL$32);
                }
                target.set(embl);
            }
        }
        
        /**
         * Appends and returns a new empty "embl" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl addNewEmbl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl)get_store().add_element_user(EMBL$32);
                return target;
            }
        }
        
        /**
         * Unsets the "embl" element
         */
        public void unsetEmbl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMBL$32, 0);
            }
        }
        
        /**
         * Gets the "create-date" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate getCreateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate)get_store().find_element_user(CREATEDATE$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "create-date" element
         */
        public boolean isSetCreateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATEDATE$34) != 0;
            }
        }
        
        /**
         * Sets the "create-date" element
         */
        public void setCreateDate(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate createDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate)get_store().find_element_user(CREATEDATE$34, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate)get_store().add_element_user(CREATEDATE$34);
                }
                target.set(createDate);
            }
        }
        
        /**
         * Appends and returns a new empty "create-date" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate addNewCreateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate)get_store().add_element_user(CREATEDATE$34);
                return target;
            }
        }
        
        /**
         * Unsets the "create-date" element
         */
        public void unsetCreateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATEDATE$34, 0);
            }
        }
        
        /**
         * Gets the "update-date" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate getUpdateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate)get_store().find_element_user(UPDATEDATE$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "update-date" element
         */
        public boolean isSetUpdateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UPDATEDATE$36) != 0;
            }
        }
        
        /**
         * Sets the "update-date" element
         */
        public void setUpdateDate(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate updateDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate)get_store().find_element_user(UPDATEDATE$36, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate)get_store().add_element_user(UPDATEDATE$36);
                }
                target.set(updateDate);
            }
        }
        
        /**
         * Appends and returns a new empty "update-date" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate addNewUpdateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate)get_store().add_element_user(UPDATEDATE$36);
                return target;
            }
        }
        
        /**
         * Unsets the "update-date" element
         */
        public void unsetUpdateDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UPDATEDATE$36, 0);
            }
        }
        
        /**
         * Gets the "prf" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf getPrf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf)get_store().find_element_user(PRF$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "prf" element
         */
        public boolean isSetPrf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRF$38) != 0;
            }
        }
        
        /**
         * Sets the "prf" element
         */
        public void setPrf(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf prf)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf)get_store().find_element_user(PRF$38, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf)get_store().add_element_user(PRF$38);
                }
                target.set(prf);
            }
        }
        
        /**
         * Appends and returns a new empty "prf" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf addNewPrf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf)get_store().add_element_user(PRF$38);
                return target;
            }
        }
        
        /**
         * Unsets the "prf" element
         */
        public void unsetPrf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRF$38, 0);
            }
        }
        
        /**
         * Gets the "pdb" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb getPdb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb)get_store().find_element_user(PDB$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pdb" element
         */
        public boolean isSetPdb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PDB$40) != 0;
            }
        }
        
        /**
         * Sets the "pdb" element
         */
        public void setPdb(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb pdb)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb)get_store().find_element_user(PDB$40, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb)get_store().add_element_user(PDB$40);
                }
                target.set(pdb);
            }
        }
        
        /**
         * Appends and returns a new empty "pdb" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb addNewPdb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb)get_store().add_element_user(PDB$40);
                return target;
            }
        }
        
        /**
         * Unsets the "pdb" element
         */
        public void unsetPdb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PDB$40, 0);
            }
        }
        
        /**
         * Gets the "het" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het getHet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het)get_store().find_element_user(HET$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "het" element
         */
        public boolean isSetHet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HET$42) != 0;
            }
        }
        
        /**
         * Sets the "het" element
         */
        public void setHet(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het het)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het)get_store().find_element_user(HET$42, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het)get_store().add_element_user(HET$42);
                }
                target.set(het);
            }
        }
        
        /**
         * Appends and returns a new empty "het" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het addNewHet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het)get_store().add_element_user(HET$42);
                return target;
            }
        }
        
        /**
         * Unsets the "het" element
         */
        public void unsetHet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HET$42, 0);
            }
        }
        
        /**
         * Gets the "source" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source)get_store().find_element_user(SOURCE$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "source" element
         */
        public boolean isSetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCE$44) != 0;
            }
        }
        
        /**
         * Sets the "source" element
         */
        public void setSource(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source)get_store().find_element_user(SOURCE$44, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source)get_store().add_element_user(SOURCE$44);
                }
                target.set(source);
            }
        }
        
        /**
         * Appends and returns a new empty "source" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source addNewSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source)get_store().add_element_user(SOURCE$44);
                return target;
            }
        }
        
        /**
         * Unsets the "source" element
         */
        public void unsetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCE$44, 0);
            }
        }
        
        /**
         * Gets the "molinfo" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo getMolinfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo)get_store().find_element_user(MOLINFO$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "molinfo" element
         */
        public boolean isSetMolinfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MOLINFO$46) != 0;
            }
        }
        
        /**
         * Sets the "molinfo" element
         */
        public void setMolinfo(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo molinfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo)get_store().find_element_user(MOLINFO$46, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo)get_store().add_element_user(MOLINFO$46);
                }
                target.set(molinfo);
            }
        }
        
        /**
         * Appends and returns a new empty "molinfo" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo addNewMolinfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo)get_store().add_element_user(MOLINFO$46);
                return target;
            }
        }
        
        /**
         * Unsets the "molinfo" element
         */
        public void unsetMolinfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MOLINFO$46, 0);
            }
        }
        
        /**
         * Gets the "modelev" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev getModelev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev)get_store().find_element_user(MODELEV$48, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "modelev" element
         */
        public boolean isSetModelev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MODELEV$48) != 0;
            }
        }
        
        /**
         * Sets the "modelev" element
         */
        public void setModelev(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev modelev)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev)get_store().find_element_user(MODELEV$48, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev)get_store().add_element_user(MODELEV$48);
                }
                target.set(modelev);
            }
        }
        
        /**
         * Appends and returns a new empty "modelev" element
         */
        public gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev addNewModelev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev target = null;
                target = (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev)get_store().add_element_user(MODELEV$48);
                return target;
            }
        }
        
        /**
         * Unsets the "modelev" element
         */
        public void unsetModelev()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MODELEV$48, 0);
            }
        }
        /**
         * An XML mol-type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MolTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType
        {
            
            public MolTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GIBBMOL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "GIBB-mol");
            
            
            /**
             * Gets the "GIBB-mol" element
             */
            public gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol getGIBBMol()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol target = null;
                    target = (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol)get_store().find_element_user(GIBBMOL$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "GIBB-mol" element
             */
            public void setGIBBMol(gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol gibbMol)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol target = null;
                    target = (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol)get_store().find_element_user(GIBBMOL$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol)get_store().add_element_user(GIBBMOL$0);
                    }
                    target.set(gibbMol);
                }
            }
            
            /**
             * Appends and returns a new empty "GIBB-mol" element
             */
            public gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol addNewGIBBMol()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol target = null;
                    target = (gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol)get_store().add_element_user(GIBBMOL$0);
                    return target;
                }
            }
        }
        /**
         * An XML modif(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ModifImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif
        {
            
            public ModifImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GIBBMOD$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "GIBB-mod");
            
            
            /**
             * Gets array of all "GIBB-mod" elements
             */
            public gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod[] getGIBBModArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(GIBBMOD$0, targetList);
                    gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod[] result = new gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "GIBB-mod" element
             */
            public gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod getGIBBModArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod target = null;
                    target = (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod)get_store().find_element_user(GIBBMOD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "GIBB-mod" element
             */
            public int sizeOfGIBBModArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(GIBBMOD$0);
                }
            }
            
            /**
             * Sets array of all "GIBB-mod" element
             */
            public void setGIBBModArray(gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod[] gibbModArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(gibbModArray, GIBBMOD$0);
                }
            }
            
            /**
             * Sets ith "GIBB-mod" element
             */
            public void setGIBBModArray(int i, gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod gibbMod)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod target = null;
                    target = (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod)get_store().find_element_user(GIBBMOD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(gibbMod);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "GIBB-mod" element
             */
            public gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod insertNewGIBBMod(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod target = null;
                    target = (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod)get_store().insert_element_user(GIBBMOD$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "GIBB-mod" element
             */
            public gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod addNewGIBBMod()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod target = null;
                    target = (gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod)get_store().add_element_user(GIBBMOD$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "GIBB-mod" element
             */
            public void removeGIBBMod(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(GIBBMOD$0, i);
                }
            }
        }
        /**
         * An XML method(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MethodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method
        {
            
            public MethodImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GIBBMETHOD$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "GIBB-method");
            
            
            /**
             * Gets the "GIBB-method" element
             */
            public gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod getGIBBMethod()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod target = null;
                    target = (gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod)get_store().find_element_user(GIBBMETHOD$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "GIBB-method" element
             */
            public void setGIBBMethod(gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod gibbMethod)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod target = null;
                    target = (gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod)get_store().find_element_user(GIBBMETHOD$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod)get_store().add_element_user(GIBBMETHOD$0);
                    }
                    target.set(gibbMethod);
                }
            }
            
            /**
             * Appends and returns a new empty "GIBB-method" element
             */
            public gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod addNewGIBBMethod()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod target = null;
                    target = (gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod)get_store().add_element_user(GIBBMETHOD$0);
                    return target;
                }
            }
        }
        /**
         * An XML org(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class OrgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org
        {
            
            public OrgImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ORGREF$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Org-ref");
            
            
            /**
             * Gets the "Org-ref" element
             */
            public gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef getOrgRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef)get_store().find_element_user(ORGREF$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Org-ref" element
             */
            public void setOrgRef(gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef orgRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef)get_store().find_element_user(ORGREF$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef)get_store().add_element_user(ORGREF$0);
                    }
                    target.set(orgRef);
                }
            }
            
            /**
             * Appends and returns a new empty "Org-ref" element
             */
            public gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef addNewOrgRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef)get_store().add_element_user(ORGREF$0);
                    return target;
                }
            }
        }
        /**
         * An XML num(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NumImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num
        {
            
            public NumImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NUMBERING$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Numbering");
            
            
            /**
             * Gets the "Numbering" element
             */
            public gov.nih.nlm.ncbi.www.NumberingDocument.Numbering getNumbering()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumberingDocument.Numbering target = null;
                    target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering)get_store().find_element_user(NUMBERING$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Numbering" element
             */
            public void setNumbering(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering numbering)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumberingDocument.Numbering target = null;
                    target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering)get_store().find_element_user(NUMBERING$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering)get_store().add_element_user(NUMBERING$0);
                    }
                    target.set(numbering);
                }
            }
            
            /**
             * Appends and returns a new empty "Numbering" element
             */
            public gov.nih.nlm.ncbi.www.NumberingDocument.Numbering addNewNumbering()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.NumberingDocument.Numbering target = null;
                    target = (gov.nih.nlm.ncbi.www.NumberingDocument.Numbering)get_store().add_element_user(NUMBERING$0);
                    return target;
                }
            }
        }
        /**
         * An XML maploc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MaplocImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc
        {
            
            public MaplocImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DBTAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
            
            
            /**
             * Gets the "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Dbtag" element
             */
            public void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    }
                    target.set(dbtag);
                }
            }
            
            /**
             * Appends and returns a new empty "Dbtag" element
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
        }
        /**
         * An XML pir(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PirImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir
        {
            
            public PirImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PIRBLOCK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PIR-block");
            
            
            /**
             * Gets the "PIR-block" element
             */
            public gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock getPIRBlock()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock)get_store().find_element_user(PIRBLOCK$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PIR-block" element
             */
            public void setPIRBlock(gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock pirBlock)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock)get_store().find_element_user(PIRBLOCK$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock)get_store().add_element_user(PIRBLOCK$0);
                    }
                    target.set(pirBlock);
                }
            }
            
            /**
             * Appends and returns a new empty "PIR-block" element
             */
            public gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock addNewPIRBlock()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock)get_store().add_element_user(PIRBLOCK$0);
                    return target;
                }
            }
        }
        /**
         * An XML genbank(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GenbankImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank
        {
            
            public GenbankImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GBBLOCK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "GB-block");
            
            
            /**
             * Gets the "GB-block" element
             */
            public gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock getGBBlock()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock)get_store().find_element_user(GBBLOCK$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "GB-block" element
             */
            public void setGBBlock(gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock gbBlock)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock)get_store().find_element_user(GBBLOCK$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock)get_store().add_element_user(GBBLOCK$0);
                    }
                    target.set(gbBlock);
                }
            }
            
            /**
             * Appends and returns a new empty "GB-block" element
             */
            public gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock addNewGBBlock()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock)get_store().add_element_user(GBBLOCK$0);
                    return target;
                }
            }
        }
        /**
         * An XML pub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PubImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub
        {
            
            public PubImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUBDESC$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Pubdesc");
            
            
            /**
             * Gets the "Pubdesc" element
             */
            public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc getPubdesc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc)get_store().find_element_user(PUBDESC$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Pubdesc" element
             */
            public void setPubdesc(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc pubdesc)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc)get_store().find_element_user(PUBDESC$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc)get_store().add_element_user(PUBDESC$0);
                    }
                    target.set(pubdesc);
                }
            }
            
            /**
             * Appends and returns a new empty "Pubdesc" element
             */
            public gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc addNewPubdesc()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc target = null;
                    target = (gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc)get_store().add_element_user(PUBDESC$0);
                    return target;
                }
            }
        }
        /**
         * An XML user(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class UserImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User
        {
            
            public UserImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName USEROBJECT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "User-object");
            
            
            /**
             * Gets the "User-object" element
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "User-object" element
             */
            public void setUserObject(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().find_element_user(USEROBJECT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().add_element_user(USEROBJECT$0);
                    }
                    target.set(userObject);
                }
            }
            
            /**
             * Appends and returns a new empty "User-object" element
             */
            public gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject addNewUserObject()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject target = null;
                    target = (gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject)get_store().add_element_user(USEROBJECT$0);
                    return target;
                }
            }
        }
        /**
         * An XML sp(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SpImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp
        {
            
            public SpImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SPBLOCK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "SP-block");
            
            
            /**
             * Gets the "SP-block" element
             */
            public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock getSPBlock()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock)get_store().find_element_user(SPBLOCK$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "SP-block" element
             */
            public void setSPBlock(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock spBlock)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock)get_store().find_element_user(SPBLOCK$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock)get_store().add_element_user(SPBLOCK$0);
                    }
                    target.set(spBlock);
                }
            }
            
            /**
             * Appends and returns a new empty "SP-block" element
             */
            public gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock addNewSPBlock()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock)get_store().add_element_user(SPBLOCK$0);
                    return target;
                }
            }
        }
        /**
         * An XML dbxref(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DbxrefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref
        {
            
            public DbxrefImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DBTAG$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Dbtag");
            
            
            /**
             * Gets the "Dbtag" element
             */
            public gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Dbtag" element
             */
            public void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag target = null;
                    target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().find_element_user(DBTAG$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag)get_store().add_element_user(DBTAG$0);
                    }
                    target.set(dbtag);
                }
            }
            
            /**
             * Appends and returns a new empty "Dbtag" element
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
        }
        /**
         * An XML embl(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class EmblImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl
        {
            
            public EmblImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EMBLBLOCK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "EMBL-block");
            
            
            /**
             * Gets the "EMBL-block" element
             */
            public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock getEMBLBlock()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock)get_store().find_element_user(EMBLBLOCK$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "EMBL-block" element
             */
            public void setEMBLBlock(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock emblBlock)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock)get_store().find_element_user(EMBLBLOCK$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock)get_store().add_element_user(EMBLBLOCK$0);
                    }
                    target.set(emblBlock);
                }
            }
            
            /**
             * Appends and returns a new empty "EMBL-block" element
             */
            public gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock addNewEMBLBlock()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock)get_store().add_element_user(EMBLBLOCK$0);
                    return target;
                }
            }
        }
        /**
         * An XML create-date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class CreateDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate
        {
            
            public CreateDateImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Date");
            
            
            /**
             * Gets the "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date getDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Date" element
             */
            public void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    }
                    target.set(date);
                }
            }
            
            /**
             * Appends and returns a new empty "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    return target;
                }
            }
        }
        /**
         * An XML update-date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class UpdateDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate
        {
            
            public UpdateDateImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Date");
            
            
            /**
             * Gets the "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date getDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Date" element
             */
            public void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().find_element_user(DATE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    }
                    target.set(date);
                }
            }
            
            /**
             * Appends and returns a new empty "Date" element
             */
            public gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.DateDocument.Date target = null;
                    target = (gov.nih.nlm.ncbi.www.DateDocument.Date)get_store().add_element_user(DATE$0);
                    return target;
                }
            }
        }
        /**
         * An XML prf(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PrfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf
        {
            
            public PrfImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PRFBLOCK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PRF-block");
            
            
            /**
             * Gets the "PRF-block" element
             */
            public gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock getPRFBlock()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock)get_store().find_element_user(PRFBLOCK$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PRF-block" element
             */
            public void setPRFBlock(gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock prfBlock)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock)get_store().find_element_user(PRFBLOCK$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock)get_store().add_element_user(PRFBLOCK$0);
                    }
                    target.set(prfBlock);
                }
            }
            
            /**
             * Appends and returns a new empty "PRF-block" element
             */
            public gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock addNewPRFBlock()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock)get_store().add_element_user(PRFBLOCK$0);
                    return target;
                }
            }
        }
        /**
         * An XML pdb(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class PdbImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb
        {
            
            public PdbImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PDBBLOCK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PDB-block");
            
            
            /**
             * Gets the "PDB-block" element
             */
            public gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock getPDBBlock()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock)get_store().find_element_user(PDBBLOCK$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "PDB-block" element
             */
            public void setPDBBlock(gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock pdbBlock)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock)get_store().find_element_user(PDBBLOCK$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock)get_store().add_element_user(PDBBLOCK$0);
                    }
                    target.set(pdbBlock);
                }
            }
            
            /**
             * Appends and returns a new empty "PDB-block" element
             */
            public gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock addNewPDBBlock()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock)get_store().add_element_user(PDBBLOCK$0);
                    return target;
                }
            }
        }
        /**
         * An XML het(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class HetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het
        {
            
            public HetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName HETEROGEN$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Heterogen");
            
            
            /**
             * Gets the "Heterogen" element
             */
            public java.lang.String getHeterogen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HETEROGEN$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Heterogen" element
             */
            public org.apache.xmlbeans.XmlString xgetHeterogen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HETEROGEN$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Heterogen" element
             */
            public void setHeterogen(java.lang.String heterogen)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HETEROGEN$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HETEROGEN$0);
                    }
                    target.setStringValue(heterogen);
                }
            }
            
            /**
             * Sets (as xml) the "Heterogen" element
             */
            public void xsetHeterogen(org.apache.xmlbeans.XmlString heterogen)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HETEROGEN$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HETEROGEN$0);
                    }
                    target.set(heterogen);
                }
            }
        }
        /**
         * An XML source(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class SourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source
        {
            
            public SourceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BIOSOURCE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "BioSource");
            
            
            /**
             * Gets the "BioSource" element
             */
            public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource getBioSource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource target = null;
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource)get_store().find_element_user(BIOSOURCE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "BioSource" element
             */
            public void setBioSource(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource bioSource)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource target = null;
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource)get_store().find_element_user(BIOSOURCE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource)get_store().add_element_user(BIOSOURCE$0);
                    }
                    target.set(bioSource);
                }
            }
            
            /**
             * Appends and returns a new empty "BioSource" element
             */
            public gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource addNewBioSource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource target = null;
                    target = (gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource)get_store().add_element_user(BIOSOURCE$0);
                    return target;
                }
            }
        }
        /**
         * An XML molinfo(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class MolinfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo
        {
            
            public MolinfoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MOLINFO$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "MolInfo");
            
            
            /**
             * Gets the "MolInfo" element
             */
            public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo getMolInfo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo target = null;
                    target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo)get_store().find_element_user(MOLINFO$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "MolInfo" element
             */
            public void setMolInfo(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo molInfo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo target = null;
                    target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo)get_store().find_element_user(MOLINFO$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo)get_store().add_element_user(MOLINFO$0);
                    }
                    target.set(molInfo);
                }
            }
            
            /**
             * Appends and returns a new empty "MolInfo" element
             */
            public gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo addNewMolInfo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo target = null;
                    target = (gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo)get_store().add_element_user(MOLINFO$0);
                    return target;
                }
            }
        }
        /**
         * An XML modelev(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ModelevImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev
        {
            
            public ModelevImpl(org.apache.xmlbeans.SchemaType sType)
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
        }
    }
}
