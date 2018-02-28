/*
 * An XML document type.
 * Localname: Seqdesc
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqdescDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Seqdesc(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqdescDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqdescDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqdesc9afcdoctype");
    
    /**
     * Gets the "Seqdesc" element
     */
    gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc getSeqdesc();
    
    /**
     * Sets the "Seqdesc" element
     */
    void setSeqdesc(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc seqdesc);
    
    /**
     * Appends and returns a new empty "Seqdesc" element
     */
    gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc addNewSeqdesc();
    
    /**
     * An XML Seqdesc(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Seqdesc extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Seqdesc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqdesc95b8elemtype");
        
        /**
         * Gets the "mol-type" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType getMolType();
        
        /**
         * True if has "mol-type" element
         */
        boolean isSetMolType();
        
        /**
         * Sets the "mol-type" element
         */
        void setMolType(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType molType);
        
        /**
         * Appends and returns a new empty "mol-type" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType addNewMolType();
        
        /**
         * Unsets the "mol-type" element
         */
        void unsetMolType();
        
        /**
         * Gets the "modif" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif getModif();
        
        /**
         * True if has "modif" element
         */
        boolean isSetModif();
        
        /**
         * Sets the "modif" element
         */
        void setModif(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif modif);
        
        /**
         * Appends and returns a new empty "modif" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif addNewModif();
        
        /**
         * Unsets the "modif" element
         */
        void unsetModif();
        
        /**
         * Gets the "method" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method getMethod();
        
        /**
         * True if has "method" element
         */
        boolean isSetMethod();
        
        /**
         * Sets the "method" element
         */
        void setMethod(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method method);
        
        /**
         * Appends and returns a new empty "method" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method addNewMethod();
        
        /**
         * Unsets the "method" element
         */
        void unsetMethod();
        
        /**
         * Gets the "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" element
         */
        boolean isSetName();
        
        /**
         * Sets the "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" element
         */
        void unsetName();
        
        /**
         * Gets the "title" element
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" element
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * True if has "title" element
         */
        boolean isSetTitle();
        
        /**
         * Sets the "title" element
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" element
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Unsets the "title" element
         */
        void unsetTitle();
        
        /**
         * Gets the "org" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org getOrg();
        
        /**
         * True if has "org" element
         */
        boolean isSetOrg();
        
        /**
         * Sets the "org" element
         */
        void setOrg(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org org);
        
        /**
         * Appends and returns a new empty "org" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org addNewOrg();
        
        /**
         * Unsets the "org" element
         */
        void unsetOrg();
        
        /**
         * Gets the "comment" element
         */
        java.lang.String getComment();
        
        /**
         * Gets (as xml) the "comment" element
         */
        org.apache.xmlbeans.XmlString xgetComment();
        
        /**
         * True if has "comment" element
         */
        boolean isSetComment();
        
        /**
         * Sets the "comment" element
         */
        void setComment(java.lang.String comment);
        
        /**
         * Sets (as xml) the "comment" element
         */
        void xsetComment(org.apache.xmlbeans.XmlString comment);
        
        /**
         * Unsets the "comment" element
         */
        void unsetComment();
        
        /**
         * Gets the "num" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num getNum();
        
        /**
         * True if has "num" element
         */
        boolean isSetNum();
        
        /**
         * Sets the "num" element
         */
        void setNum(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num num);
        
        /**
         * Appends and returns a new empty "num" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num addNewNum();
        
        /**
         * Unsets the "num" element
         */
        void unsetNum();
        
        /**
         * Gets the "maploc" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc getMaploc();
        
        /**
         * True if has "maploc" element
         */
        boolean isSetMaploc();
        
        /**
         * Sets the "maploc" element
         */
        void setMaploc(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc maploc);
        
        /**
         * Appends and returns a new empty "maploc" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc addNewMaploc();
        
        /**
         * Unsets the "maploc" element
         */
        void unsetMaploc();
        
        /**
         * Gets the "pir" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir getPir();
        
        /**
         * True if has "pir" element
         */
        boolean isSetPir();
        
        /**
         * Sets the "pir" element
         */
        void setPir(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir pir);
        
        /**
         * Appends and returns a new empty "pir" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir addNewPir();
        
        /**
         * Unsets the "pir" element
         */
        void unsetPir();
        
        /**
         * Gets the "genbank" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank getGenbank();
        
        /**
         * True if has "genbank" element
         */
        boolean isSetGenbank();
        
        /**
         * Sets the "genbank" element
         */
        void setGenbank(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank genbank);
        
        /**
         * Appends and returns a new empty "genbank" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank addNewGenbank();
        
        /**
         * Unsets the "genbank" element
         */
        void unsetGenbank();
        
        /**
         * Gets the "pub" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub getPub();
        
        /**
         * True if has "pub" element
         */
        boolean isSetPub();
        
        /**
         * Sets the "pub" element
         */
        void setPub(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub pub);
        
        /**
         * Appends and returns a new empty "pub" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub addNewPub();
        
        /**
         * Unsets the "pub" element
         */
        void unsetPub();
        
        /**
         * Gets the "region" element
         */
        java.lang.String getRegion();
        
        /**
         * Gets (as xml) the "region" element
         */
        org.apache.xmlbeans.XmlString xgetRegion();
        
        /**
         * True if has "region" element
         */
        boolean isSetRegion();
        
        /**
         * Sets the "region" element
         */
        void setRegion(java.lang.String region);
        
        /**
         * Sets (as xml) the "region" element
         */
        void xsetRegion(org.apache.xmlbeans.XmlString region);
        
        /**
         * Unsets the "region" element
         */
        void unsetRegion();
        
        /**
         * Gets the "user" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User getUser();
        
        /**
         * True if has "user" element
         */
        boolean isSetUser();
        
        /**
         * Sets the "user" element
         */
        void setUser(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User user);
        
        /**
         * Appends and returns a new empty "user" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User addNewUser();
        
        /**
         * Unsets the "user" element
         */
        void unsetUser();
        
        /**
         * Gets the "sp" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp getSp();
        
        /**
         * True if has "sp" element
         */
        boolean isSetSp();
        
        /**
         * Sets the "sp" element
         */
        void setSp(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp sp);
        
        /**
         * Appends and returns a new empty "sp" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp addNewSp();
        
        /**
         * Unsets the "sp" element
         */
        void unsetSp();
        
        /**
         * Gets the "dbxref" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref getDbxref();
        
        /**
         * True if has "dbxref" element
         */
        boolean isSetDbxref();
        
        /**
         * Sets the "dbxref" element
         */
        void setDbxref(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref dbxref);
        
        /**
         * Appends and returns a new empty "dbxref" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref addNewDbxref();
        
        /**
         * Unsets the "dbxref" element
         */
        void unsetDbxref();
        
        /**
         * Gets the "embl" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl getEmbl();
        
        /**
         * True if has "embl" element
         */
        boolean isSetEmbl();
        
        /**
         * Sets the "embl" element
         */
        void setEmbl(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl embl);
        
        /**
         * Appends and returns a new empty "embl" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl addNewEmbl();
        
        /**
         * Unsets the "embl" element
         */
        void unsetEmbl();
        
        /**
         * Gets the "create-date" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate getCreateDate();
        
        /**
         * True if has "create-date" element
         */
        boolean isSetCreateDate();
        
        /**
         * Sets the "create-date" element
         */
        void setCreateDate(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate createDate);
        
        /**
         * Appends and returns a new empty "create-date" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate addNewCreateDate();
        
        /**
         * Unsets the "create-date" element
         */
        void unsetCreateDate();
        
        /**
         * Gets the "update-date" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate getUpdateDate();
        
        /**
         * True if has "update-date" element
         */
        boolean isSetUpdateDate();
        
        /**
         * Sets the "update-date" element
         */
        void setUpdateDate(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate updateDate);
        
        /**
         * Appends and returns a new empty "update-date" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate addNewUpdateDate();
        
        /**
         * Unsets the "update-date" element
         */
        void unsetUpdateDate();
        
        /**
         * Gets the "prf" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf getPrf();
        
        /**
         * True if has "prf" element
         */
        boolean isSetPrf();
        
        /**
         * Sets the "prf" element
         */
        void setPrf(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf prf);
        
        /**
         * Appends and returns a new empty "prf" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf addNewPrf();
        
        /**
         * Unsets the "prf" element
         */
        void unsetPrf();
        
        /**
         * Gets the "pdb" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb getPdb();
        
        /**
         * True if has "pdb" element
         */
        boolean isSetPdb();
        
        /**
         * Sets the "pdb" element
         */
        void setPdb(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb pdb);
        
        /**
         * Appends and returns a new empty "pdb" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb addNewPdb();
        
        /**
         * Unsets the "pdb" element
         */
        void unsetPdb();
        
        /**
         * Gets the "het" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het getHet();
        
        /**
         * True if has "het" element
         */
        boolean isSetHet();
        
        /**
         * Sets the "het" element
         */
        void setHet(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het het);
        
        /**
         * Appends and returns a new empty "het" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het addNewHet();
        
        /**
         * Unsets the "het" element
         */
        void unsetHet();
        
        /**
         * Gets the "source" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source getSource();
        
        /**
         * True if has "source" element
         */
        boolean isSetSource();
        
        /**
         * Sets the "source" element
         */
        void setSource(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source source);
        
        /**
         * Appends and returns a new empty "source" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source addNewSource();
        
        /**
         * Unsets the "source" element
         */
        void unsetSource();
        
        /**
         * Gets the "molinfo" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo getMolinfo();
        
        /**
         * True if has "molinfo" element
         */
        boolean isSetMolinfo();
        
        /**
         * Sets the "molinfo" element
         */
        void setMolinfo(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo molinfo);
        
        /**
         * Appends and returns a new empty "molinfo" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo addNewMolinfo();
        
        /**
         * Unsets the "molinfo" element
         */
        void unsetMolinfo();
        
        /**
         * Gets the "modelev" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev getModelev();
        
        /**
         * True if has "modelev" element
         */
        boolean isSetModelev();
        
        /**
         * Sets the "modelev" element
         */
        void setModelev(gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev modelev);
        
        /**
         * Appends and returns a new empty "modelev" element
         */
        gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev addNewModelev();
        
        /**
         * Unsets the "modelev" element
         */
        void unsetModelev();
        
        /**
         * An XML mol-type(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface MolType extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MolType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("moltypeb071elemtype");
            
            /**
             * Gets the "GIBB-mol" element
             */
            gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol getGIBBMol();
            
            /**
             * Sets the "GIBB-mol" element
             */
            void setGIBBMol(gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol gibbMol);
            
            /**
             * Appends and returns a new empty "GIBB-mol" element
             */
            gov.nih.nlm.ncbi.www.GIBBMolDocument.GIBBMol addNewGIBBMol();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.MolType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML modif(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Modif extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Modif.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("modifc5c3elemtype");
            
            /**
             * Gets array of all "GIBB-mod" elements
             */
            gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod[] getGIBBModArray();
            
            /**
             * Gets ith "GIBB-mod" element
             */
            gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod getGIBBModArray(int i);
            
            /**
             * Returns number of "GIBB-mod" element
             */
            int sizeOfGIBBModArray();
            
            /**
             * Sets array of all "GIBB-mod" element
             */
            void setGIBBModArray(gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod[] gibbModArray);
            
            /**
             * Sets ith "GIBB-mod" element
             */
            void setGIBBModArray(int i, gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod gibbMod);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "GIBB-mod" element
             */
            gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod insertNewGIBBMod(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "GIBB-mod" element
             */
            gov.nih.nlm.ncbi.www.GIBBModDocument.GIBBMod addNewGIBBMod();
            
            /**
             * Removes the ith "GIBB-mod" element
             */
            void removeGIBBMod(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modif) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML method(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Method extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Method.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("methodcf35elemtype");
            
            /**
             * Gets the "GIBB-method" element
             */
            gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod getGIBBMethod();
            
            /**
             * Sets the "GIBB-method" element
             */
            void setGIBBMethod(gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod gibbMethod);
            
            /**
             * Appends and returns a new empty "GIBB-method" element
             */
            gov.nih.nlm.ncbi.www.GIBBMethodDocument.GIBBMethod addNewGIBBMethod();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Method) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML org(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Org extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Org.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("org7508elemtype");
            
            /**
             * Gets the "Org-ref" element
             */
            gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef getOrgRef();
            
            /**
             * Sets the "Org-ref" element
             */
            void setOrgRef(gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef orgRef);
            
            /**
             * Appends and returns a new empty "Org-ref" element
             */
            gov.nih.nlm.ncbi.www.OrgRefDocument.OrgRef addNewOrgRef();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Org) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML num(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Num extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Num.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("nume5aaelemtype");
            
            /**
             * Gets the "Numbering" element
             */
            gov.nih.nlm.ncbi.www.NumberingDocument.Numbering getNumbering();
            
            /**
             * Sets the "Numbering" element
             */
            void setNumbering(gov.nih.nlm.ncbi.www.NumberingDocument.Numbering numbering);
            
            /**
             * Appends and returns a new empty "Numbering" element
             */
            gov.nih.nlm.ncbi.www.NumberingDocument.Numbering addNewNumbering();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Num) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML maploc(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Maploc extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Maploc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("maploc7cb8elemtype");
            
            /**
             * Gets the "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag();
            
            /**
             * Sets the "Dbtag" element
             */
            void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag);
            
            /**
             * Appends and returns a new empty "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Maploc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pir(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pir extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pir.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pir59bdelemtype");
            
            /**
             * Gets the "PIR-block" element
             */
            gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock getPIRBlock();
            
            /**
             * Sets the "PIR-block" element
             */
            void setPIRBlock(gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock pirBlock);
            
            /**
             * Appends and returns a new empty "PIR-block" element
             */
            gov.nih.nlm.ncbi.www.PIRBlockDocument.PIRBlock addNewPIRBlock();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML genbank(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Genbank extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Genbank.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("genbankcfb0elemtype");
            
            /**
             * Gets the "GB-block" element
             */
            gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock getGBBlock();
            
            /**
             * Sets the "GB-block" element
             */
            void setGBBlock(gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock gbBlock);
            
            /**
             * Appends and returns a new empty "GB-block" element
             */
            gov.nih.nlm.ncbi.www.GBBlockDocument.GBBlock addNewGBBlock();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Genbank) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pub extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pub.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pub8321elemtype");
            
            /**
             * Gets the "Pubdesc" element
             */
            gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc getPubdesc();
            
            /**
             * Sets the "Pubdesc" element
             */
            void setPubdesc(gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc pubdesc);
            
            /**
             * Appends and returns a new empty "Pubdesc" element
             */
            gov.nih.nlm.ncbi.www.PubdescDocument.Pubdesc addNewPubdesc();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML user(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface User extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(User.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("user741felemtype");
            
            /**
             * Gets the "User-object" element
             */
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject getUserObject();
            
            /**
             * Sets the "User-object" element
             */
            void setUserObject(gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject userObject);
            
            /**
             * Appends and returns a new empty "User-object" element
             */
            gov.nih.nlm.ncbi.www.UserObjectDocument.UserObject addNewUserObject();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML sp(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Sp extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("spb0b1elemtype");
            
            /**
             * Gets the "SP-block" element
             */
            gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock getSPBlock();
            
            /**
             * Sets the "SP-block" element
             */
            void setSPBlock(gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock spBlock);
            
            /**
             * Appends and returns a new empty "SP-block" element
             */
            gov.nih.nlm.ncbi.www.SPBlockDocument.SPBlock addNewSPBlock();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Sp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dbxref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("dbxref90edelemtype");
            
            /**
             * Gets the "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag getDbtag();
            
            /**
             * Sets the "Dbtag" element
             */
            void setDbtag(gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag dbtag);
            
            /**
             * Appends and returns a new empty "Dbtag" element
             */
            gov.nih.nlm.ncbi.www.DbtagDocument.Dbtag addNewDbtag();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Dbxref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML embl(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Embl extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Embl.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("embl8d46elemtype");
            
            /**
             * Gets the "EMBL-block" element
             */
            gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock getEMBLBlock();
            
            /**
             * Sets the "EMBL-block" element
             */
            void setEMBLBlock(gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock emblBlock);
            
            /**
             * Appends and returns a new empty "EMBL-block" element
             */
            gov.nih.nlm.ncbi.www.EMBLBlockDocument.EMBLBlock addNewEMBLBlock();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Embl) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML create-date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface CreateDate extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("createdate8a03elemtype");
            
            /**
             * Gets the "Date" element
             */
            gov.nih.nlm.ncbi.www.DateDocument.Date getDate();
            
            /**
             * Sets the "Date" element
             */
            void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date);
            
            /**
             * Appends and returns a new empty "Date" element
             */
            gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.CreateDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML update-date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface UpdateDate extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("updatedateb856elemtype");
            
            /**
             * Gets the "Date" element
             */
            gov.nih.nlm.ncbi.www.DateDocument.Date getDate();
            
            /**
             * Sets the "Date" element
             */
            void setDate(gov.nih.nlm.ncbi.www.DateDocument.Date date);
            
            /**
             * Appends and returns a new empty "Date" element
             */
            gov.nih.nlm.ncbi.www.DateDocument.Date addNewDate();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.UpdateDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML prf(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Prf extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Prf.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("prff8c8elemtype");
            
            /**
             * Gets the "PRF-block" element
             */
            gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock getPRFBlock();
            
            /**
             * Sets the "PRF-block" element
             */
            void setPRFBlock(gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock prfBlock);
            
            /**
             * Appends and returns a new empty "PRF-block" element
             */
            gov.nih.nlm.ncbi.www.PRFBlockDocument.PRFBlock addNewPRFBlock();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Prf) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pdb(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pdb extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pdb.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pdb7b12elemtype");
            
            /**
             * Gets the "PDB-block" element
             */
            gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock getPDBBlock();
            
            /**
             * Sets the "PDB-block" element
             */
            void setPDBBlock(gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock pdbBlock);
            
            /**
             * Appends and returns a new empty "PDB-block" element
             */
            gov.nih.nlm.ncbi.www.PDBBlockDocument.PDBBlock addNewPDBBlock();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Pdb) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML het(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Het extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Het.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("het073belemtype");
            
            /**
             * Gets the "Heterogen" element
             */
            java.lang.String getHeterogen();
            
            /**
             * Gets (as xml) the "Heterogen" element
             */
            org.apache.xmlbeans.XmlString xgetHeterogen();
            
            /**
             * Sets the "Heterogen" element
             */
            void setHeterogen(java.lang.String heterogen);
            
            /**
             * Sets (as xml) the "Heterogen" element
             */
            void xsetHeterogen(org.apache.xmlbeans.XmlString heterogen);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Het) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML source(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Source extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("source4a6felemtype");
            
            /**
             * Gets the "BioSource" element
             */
            gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource getBioSource();
            
            /**
             * Sets the "BioSource" element
             */
            void setBioSource(gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource bioSource);
            
            /**
             * Appends and returns a new empty "BioSource" element
             */
            gov.nih.nlm.ncbi.www.BioSourceDocument.BioSource addNewBioSource();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML molinfo(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Molinfo extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Molinfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("molinfo50dcelemtype");
            
            /**
             * Gets the "MolInfo" element
             */
            gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo getMolInfo();
            
            /**
             * Sets the "MolInfo" element
             */
            void setMolInfo(gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo molInfo);
            
            /**
             * Appends and returns a new empty "MolInfo" element
             */
            gov.nih.nlm.ncbi.www.MolInfoDocument.MolInfo addNewMolInfo();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Molinfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML modelev(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Modelev extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Modelev.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("modelevafbeelemtype");
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc.Modelev) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqdescDocument.Seqdesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqdescDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqdescDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqdescDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
