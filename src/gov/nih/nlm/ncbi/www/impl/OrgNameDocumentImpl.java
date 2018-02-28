/*
 * An XML document type.
 * Localname: OrgName
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.OrgNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one OrgName(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class OrgNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.OrgNameDocument
{
    
    public OrgNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGNAME$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "OrgName");
    
    
    /**
     * Gets the "OrgName" element
     */
    public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName getOrgName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName target = null;
            target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName)get_store().find_element_user(ORGNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrgName" element
     */
    public void setOrgName(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName orgName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName target = null;
            target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName)get_store().find_element_user(ORGNAME$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName)get_store().add_element_user(ORGNAME$0);
            }
            target.set(orgName);
        }
    }
    
    /**
     * Appends and returns a new empty "OrgName" element
     */
    public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName addNewOrgName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName target = null;
            target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName)get_store().add_element_user(ORGNAME$0);
            return target;
        }
    }
    /**
     * An XML OrgName(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class OrgNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName
    {
        
        public OrgNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "name");
        private static final javax.xml.namespace.QName ATTRIB$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "attrib");
        private static final javax.xml.namespace.QName MOD$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mod");
        private static final javax.xml.namespace.QName LINEAGE$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "lineage");
        private static final javax.xml.namespace.QName GCODE$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "gcode");
        private static final javax.xml.namespace.QName MGCODE$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "mgcode");
        private static final javax.xml.namespace.QName DIV$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "div");
        private static final javax.xml.namespace.QName PGCODE$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "pgcode");
        
        
        /**
         * Gets the "name" element
         */
        public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name target = null;
                target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
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
        public void setName(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name target = null;
                target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Appends and returns a new empty "name" element
         */
        public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name target = null;
                target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name)get_store().add_element_user(NAME$0);
                return target;
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
         * Gets the "attrib" element
         */
        public java.lang.String getAttrib()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIB$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "attrib" element
         */
        public org.apache.xmlbeans.XmlString xgetAttrib()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIB$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "attrib" element
         */
        public boolean isSetAttrib()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTRIB$2) != 0;
            }
        }
        
        /**
         * Sets the "attrib" element
         */
        public void setAttrib(java.lang.String attrib)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIB$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIB$2);
                }
                target.setStringValue(attrib);
            }
        }
        
        /**
         * Sets (as xml) the "attrib" element
         */
        public void xsetAttrib(org.apache.xmlbeans.XmlString attrib)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIB$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIB$2);
                }
                target.set(attrib);
            }
        }
        
        /**
         * Unsets the "attrib" element
         */
        public void unsetAttrib()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTRIB$2, 0);
            }
        }
        
        /**
         * Gets the "mod" element
         */
        public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod getMod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod target = null;
                target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod)get_store().find_element_user(MOD$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "mod" element
         */
        public boolean isSetMod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MOD$4) != 0;
            }
        }
        
        /**
         * Sets the "mod" element
         */
        public void setMod(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod mod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod target = null;
                target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod)get_store().find_element_user(MOD$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod)get_store().add_element_user(MOD$4);
                }
                target.set(mod);
            }
        }
        
        /**
         * Appends and returns a new empty "mod" element
         */
        public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod addNewMod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod target = null;
                target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod)get_store().add_element_user(MOD$4);
                return target;
            }
        }
        
        /**
         * Unsets the "mod" element
         */
        public void unsetMod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MOD$4, 0);
            }
        }
        
        /**
         * Gets the "lineage" element
         */
        public java.lang.String getLineage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINEAGE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lineage" element
         */
        public org.apache.xmlbeans.XmlString xgetLineage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINEAGE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "lineage" element
         */
        public boolean isSetLineage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINEAGE$6) != 0;
            }
        }
        
        /**
         * Sets the "lineage" element
         */
        public void setLineage(java.lang.String lineage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINEAGE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINEAGE$6);
                }
                target.setStringValue(lineage);
            }
        }
        
        /**
         * Sets (as xml) the "lineage" element
         */
        public void xsetLineage(org.apache.xmlbeans.XmlString lineage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINEAGE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINEAGE$6);
                }
                target.set(lineage);
            }
        }
        
        /**
         * Unsets the "lineage" element
         */
        public void unsetLineage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINEAGE$6, 0);
            }
        }
        
        /**
         * Gets the "gcode" element
         */
        public java.math.BigInteger getGcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GCODE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "gcode" element
         */
        public org.apache.xmlbeans.XmlInteger xgetGcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GCODE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "gcode" element
         */
        public boolean isSetGcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GCODE$8) != 0;
            }
        }
        
        /**
         * Sets the "gcode" element
         */
        public void setGcode(java.math.BigInteger gcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GCODE$8);
                }
                target.setBigIntegerValue(gcode);
            }
        }
        
        /**
         * Sets (as xml) the "gcode" element
         */
        public void xsetGcode(org.apache.xmlbeans.XmlInteger gcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(GCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(GCODE$8);
                }
                target.set(gcode);
            }
        }
        
        /**
         * Unsets the "gcode" element
         */
        public void unsetGcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GCODE$8, 0);
            }
        }
        
        /**
         * Gets the "mgcode" element
         */
        public java.math.BigInteger getMgcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MGCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "mgcode" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMgcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MGCODE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "mgcode" element
         */
        public boolean isSetMgcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MGCODE$10) != 0;
            }
        }
        
        /**
         * Sets the "mgcode" element
         */
        public void setMgcode(java.math.BigInteger mgcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MGCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MGCODE$10);
                }
                target.setBigIntegerValue(mgcode);
            }
        }
        
        /**
         * Sets (as xml) the "mgcode" element
         */
        public void xsetMgcode(org.apache.xmlbeans.XmlInteger mgcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MGCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MGCODE$10);
                }
                target.set(mgcode);
            }
        }
        
        /**
         * Unsets the "mgcode" element
         */
        public void unsetMgcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MGCODE$10, 0);
            }
        }
        
        /**
         * Gets the "div" element
         */
        public java.lang.String getDiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIV$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "div" element
         */
        public org.apache.xmlbeans.XmlString xgetDiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIV$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "div" element
         */
        public boolean isSetDiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIV$12) != 0;
            }
        }
        
        /**
         * Sets the "div" element
         */
        public void setDiv(java.lang.String div)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIV$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIV$12);
                }
                target.setStringValue(div);
            }
        }
        
        /**
         * Sets (as xml) the "div" element
         */
        public void xsetDiv(org.apache.xmlbeans.XmlString div)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIV$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIV$12);
                }
                target.set(div);
            }
        }
        
        /**
         * Unsets the "div" element
         */
        public void unsetDiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIV$12, 0);
            }
        }
        
        /**
         * Gets the "pgcode" element
         */
        public java.math.BigInteger getPgcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PGCODE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "pgcode" element
         */
        public org.apache.xmlbeans.XmlInteger xgetPgcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PGCODE$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "pgcode" element
         */
        public boolean isSetPgcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PGCODE$14) != 0;
            }
        }
        
        /**
         * Sets the "pgcode" element
         */
        public void setPgcode(java.math.BigInteger pgcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PGCODE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PGCODE$14);
                }
                target.setBigIntegerValue(pgcode);
            }
        }
        
        /**
         * Sets (as xml) the "pgcode" element
         */
        public void xsetPgcode(org.apache.xmlbeans.XmlInteger pgcode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PGCODE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PGCODE$14);
                }
                target.set(pgcode);
            }
        }
        
        /**
         * Unsets the "pgcode" element
         */
        public void unsetPgcode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PGCODE$14, 0);
            }
        }
        /**
         * An XML name(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class NameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name
        {
            
            public NameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BINOMIAL$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "binomial");
            private static final javax.xml.namespace.QName VIRUS$2 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "virus");
            private static final javax.xml.namespace.QName HYBRID$4 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "hybrid");
            private static final javax.xml.namespace.QName NAMEDHYBRID$6 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "namedhybrid");
            private static final javax.xml.namespace.QName PARTIAL$8 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "partial");
            
            
            /**
             * Gets the "binomial" element
             */
            public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial getBinomial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial)get_store().find_element_user(BINOMIAL$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "binomial" element
             */
            public boolean isSetBinomial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BINOMIAL$0) != 0;
                }
            }
            
            /**
             * Sets the "binomial" element
             */
            public void setBinomial(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial binomial)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial)get_store().find_element_user(BINOMIAL$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial)get_store().add_element_user(BINOMIAL$0);
                    }
                    target.set(binomial);
                }
            }
            
            /**
             * Appends and returns a new empty "binomial" element
             */
            public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial addNewBinomial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial)get_store().add_element_user(BINOMIAL$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "binomial" element
             */
            public void unsetBinomial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BINOMIAL$0, 0);
                }
            }
            
            /**
             * Gets the "virus" element
             */
            public java.lang.String getVirus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIRUS$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "virus" element
             */
            public org.apache.xmlbeans.XmlString xgetVirus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIRUS$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "virus" element
             */
            public boolean isSetVirus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(VIRUS$2) != 0;
                }
            }
            
            /**
             * Sets the "virus" element
             */
            public void setVirus(java.lang.String virus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIRUS$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIRUS$2);
                    }
                    target.setStringValue(virus);
                }
            }
            
            /**
             * Sets (as xml) the "virus" element
             */
            public void xsetVirus(org.apache.xmlbeans.XmlString virus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VIRUS$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VIRUS$2);
                    }
                    target.set(virus);
                }
            }
            
            /**
             * Unsets the "virus" element
             */
            public void unsetVirus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(VIRUS$2, 0);
                }
            }
            
            /**
             * Gets the "hybrid" element
             */
            public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid getHybrid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid)get_store().find_element_user(HYBRID$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "hybrid" element
             */
            public boolean isSetHybrid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(HYBRID$4) != 0;
                }
            }
            
            /**
             * Sets the "hybrid" element
             */
            public void setHybrid(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid hybrid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid)get_store().find_element_user(HYBRID$4, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid)get_store().add_element_user(HYBRID$4);
                    }
                    target.set(hybrid);
                }
            }
            
            /**
             * Appends and returns a new empty "hybrid" element
             */
            public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid addNewHybrid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid)get_store().add_element_user(HYBRID$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "hybrid" element
             */
            public void unsetHybrid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(HYBRID$4, 0);
                }
            }
            
            /**
             * Gets the "namedhybrid" element
             */
            public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid getNamedhybrid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid)get_store().find_element_user(NAMEDHYBRID$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "namedhybrid" element
             */
            public boolean isSetNamedhybrid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NAMEDHYBRID$6) != 0;
                }
            }
            
            /**
             * Sets the "namedhybrid" element
             */
            public void setNamedhybrid(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid namedhybrid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid)get_store().find_element_user(NAMEDHYBRID$6, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid)get_store().add_element_user(NAMEDHYBRID$6);
                    }
                    target.set(namedhybrid);
                }
            }
            
            /**
             * Appends and returns a new empty "namedhybrid" element
             */
            public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid addNewNamedhybrid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid)get_store().add_element_user(NAMEDHYBRID$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "namedhybrid" element
             */
            public void unsetNamedhybrid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NAMEDHYBRID$6, 0);
                }
            }
            
            /**
             * Gets the "partial" element
             */
            public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial getPartial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial)get_store().find_element_user(PARTIAL$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "partial" element
             */
            public boolean isSetPartial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PARTIAL$8) != 0;
                }
            }
            
            /**
             * Sets the "partial" element
             */
            public void setPartial(gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial partial)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial)get_store().find_element_user(PARTIAL$8, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial)get_store().add_element_user(PARTIAL$8);
                    }
                    target.set(partial);
                }
            }
            
            /**
             * Appends and returns a new empty "partial" element
             */
            public gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial addNewPartial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial)get_store().add_element_user(PARTIAL$8);
                    return target;
                }
            }
            
            /**
             * Unsets the "partial" element
             */
            public void unsetPartial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PARTIAL$8, 0);
                }
            }
            /**
             * An XML binomial(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class BinomialImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Binomial
            {
                
                public BinomialImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName BINOMIALORGNAME$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "BinomialOrgName");
                
                
                /**
                 * Gets the "BinomialOrgName" element
                 */
                public gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName getBinomialOrgName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName target = null;
                      target = (gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName)get_store().find_element_user(BINOMIALORGNAME$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "BinomialOrgName" element
                 */
                public void setBinomialOrgName(gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName binomialOrgName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName target = null;
                      target = (gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName)get_store().find_element_user(BINOMIALORGNAME$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName)get_store().add_element_user(BINOMIALORGNAME$0);
                      }
                      target.set(binomialOrgName);
                    }
                }
                
                /**
                 * Appends and returns a new empty "BinomialOrgName" element
                 */
                public gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName addNewBinomialOrgName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName target = null;
                      target = (gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName)get_store().add_element_user(BINOMIALORGNAME$0);
                      return target;
                    }
                }
            }
            /**
             * An XML hybrid(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class HybridImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Hybrid
            {
                
                public HybridImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName MULTIORGNAME$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "MultiOrgName");
                
                
                /**
                 * Gets the "MultiOrgName" element
                 */
                public gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName getMultiOrgName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName target = null;
                      target = (gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName)get_store().find_element_user(MULTIORGNAME$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "MultiOrgName" element
                 */
                public void setMultiOrgName(gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName multiOrgName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName target = null;
                      target = (gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName)get_store().find_element_user(MULTIORGNAME$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName)get_store().add_element_user(MULTIORGNAME$0);
                      }
                      target.set(multiOrgName);
                    }
                }
                
                /**
                 * Appends and returns a new empty "MultiOrgName" element
                 */
                public gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName addNewMultiOrgName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName target = null;
                      target = (gov.nih.nlm.ncbi.www.MultiOrgNameDocument.MultiOrgName)get_store().add_element_user(MULTIORGNAME$0);
                      return target;
                    }
                }
            }
            /**
             * An XML namedhybrid(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class NamedhybridImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Namedhybrid
            {
                
                public NamedhybridImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName BINOMIALORGNAME$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "BinomialOrgName");
                
                
                /**
                 * Gets the "BinomialOrgName" element
                 */
                public gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName getBinomialOrgName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName target = null;
                      target = (gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName)get_store().find_element_user(BINOMIALORGNAME$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "BinomialOrgName" element
                 */
                public void setBinomialOrgName(gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName binomialOrgName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName target = null;
                      target = (gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName)get_store().find_element_user(BINOMIALORGNAME$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName)get_store().add_element_user(BINOMIALORGNAME$0);
                      }
                      target.set(binomialOrgName);
                    }
                }
                
                /**
                 * Appends and returns a new empty "BinomialOrgName" element
                 */
                public gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName addNewBinomialOrgName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName target = null;
                      target = (gov.nih.nlm.ncbi.www.BinomialOrgNameDocument.BinomialOrgName)get_store().add_element_user(BINOMIALORGNAME$0);
                      return target;
                    }
                }
            }
            /**
             * An XML partial(@http://www.ncbi.nlm.nih.gov).
             *
             * This is a complex type.
             */
            public static class PartialImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Name.Partial
            {
                
                public PartialImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PARTIALORGNAME$0 = 
                    new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "PartialOrgName");
                
                
                /**
                 * Gets the "PartialOrgName" element
                 */
                public gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName getPartialOrgName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName target = null;
                      target = (gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName)get_store().find_element_user(PARTIALORGNAME$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "PartialOrgName" element
                 */
                public void setPartialOrgName(gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName partialOrgName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName target = null;
                      target = (gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName)get_store().find_element_user(PARTIALORGNAME$0, 0);
                      if (target == null)
                      {
                        target = (gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName)get_store().add_element_user(PARTIALORGNAME$0);
                      }
                      target.set(partialOrgName);
                    }
                }
                
                /**
                 * Appends and returns a new empty "PartialOrgName" element
                 */
                public gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName addNewPartialOrgName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName target = null;
                      target = (gov.nih.nlm.ncbi.www.PartialOrgNameDocument.PartialOrgName)get_store().add_element_user(PARTIALORGNAME$0);
                      return target;
                    }
                }
            }
        }
        /**
         * An XML mod(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ModImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.OrgNameDocument.OrgName.Mod
        {
            
            public ModImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ORGMOD$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "OrgMod");
            
            
            /**
             * Gets array of all "OrgMod" elements
             */
            public gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod[] getOrgModArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ORGMOD$0, targetList);
                    gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod[] result = new gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "OrgMod" element
             */
            public gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod getOrgModArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod)get_store().find_element_user(ORGMOD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "OrgMod" element
             */
            public int sizeOfOrgModArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ORGMOD$0);
                }
            }
            
            /**
             * Sets array of all "OrgMod" element
             */
            public void setOrgModArray(gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod[] orgModArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(orgModArray, ORGMOD$0);
                }
            }
            
            /**
             * Sets ith "OrgMod" element
             */
            public void setOrgModArray(int i, gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod orgMod)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod)get_store().find_element_user(ORGMOD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(orgMod);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "OrgMod" element
             */
            public gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod insertNewOrgMod(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod)get_store().insert_element_user(ORGMOD$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "OrgMod" element
             */
            public gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod addNewOrgMod()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod target = null;
                    target = (gov.nih.nlm.ncbi.www.OrgModDocument.OrgMod)get_store().add_element_user(ORGMOD$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "OrgMod" element
             */
            public void removeOrgMod(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ORGMOD$0, i);
                }
            }
        }
    }
}
