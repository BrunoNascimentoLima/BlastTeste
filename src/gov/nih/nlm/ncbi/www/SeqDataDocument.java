/*
 * An XML document type.
 * Localname: Seq-data
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.SeqDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Seq-data(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface SeqDataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqDataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqdatac336doctype");
    
    /**
     * Gets the "Seq-data" element
     */
    gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData getSeqData();
    
    /**
     * Sets the "Seq-data" element
     */
    void setSeqData(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData seqData);
    
    /**
     * Appends and returns a new empty "Seq-data" element
     */
    gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData addNewSeqData();
    
    /**
     * An XML Seq-data(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface SeqData extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeqData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("seqdata67a2elemtype");
        
        /**
         * Gets the "iupacna" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna getIupacna();
        
        /**
         * True if has "iupacna" element
         */
        boolean isSetIupacna();
        
        /**
         * Sets the "iupacna" element
         */
        void setIupacna(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna iupacna);
        
        /**
         * Appends and returns a new empty "iupacna" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna addNewIupacna();
        
        /**
         * Unsets the "iupacna" element
         */
        void unsetIupacna();
        
        /**
         * Gets the "iupacaa" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa getIupacaa();
        
        /**
         * True if has "iupacaa" element
         */
        boolean isSetIupacaa();
        
        /**
         * Sets the "iupacaa" element
         */
        void setIupacaa(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa iupacaa);
        
        /**
         * Appends and returns a new empty "iupacaa" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa addNewIupacaa();
        
        /**
         * Unsets the "iupacaa" element
         */
        void unsetIupacaa();
        
        /**
         * Gets the "ncbi2na" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na getNcbi2Na();
        
        /**
         * True if has "ncbi2na" element
         */
        boolean isSetNcbi2Na();
        
        /**
         * Sets the "ncbi2na" element
         */
        void setNcbi2Na(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na ncbi2Na);
        
        /**
         * Appends and returns a new empty "ncbi2na" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na addNewNcbi2Na();
        
        /**
         * Unsets the "ncbi2na" element
         */
        void unsetNcbi2Na();
        
        /**
         * Gets the "ncbi4na" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na getNcbi4Na();
        
        /**
         * True if has "ncbi4na" element
         */
        boolean isSetNcbi4Na();
        
        /**
         * Sets the "ncbi4na" element
         */
        void setNcbi4Na(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na ncbi4Na);
        
        /**
         * Appends and returns a new empty "ncbi4na" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na addNewNcbi4Na();
        
        /**
         * Unsets the "ncbi4na" element
         */
        void unsetNcbi4Na();
        
        /**
         * Gets the "ncbi8na" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na getNcbi8Na();
        
        /**
         * True if has "ncbi8na" element
         */
        boolean isSetNcbi8Na();
        
        /**
         * Sets the "ncbi8na" element
         */
        void setNcbi8Na(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na ncbi8Na);
        
        /**
         * Appends and returns a new empty "ncbi8na" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na addNewNcbi8Na();
        
        /**
         * Unsets the "ncbi8na" element
         */
        void unsetNcbi8Na();
        
        /**
         * Gets the "ncbipna" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna getNcbipna();
        
        /**
         * True if has "ncbipna" element
         */
        boolean isSetNcbipna();
        
        /**
         * Sets the "ncbipna" element
         */
        void setNcbipna(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna ncbipna);
        
        /**
         * Appends and returns a new empty "ncbipna" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna addNewNcbipna();
        
        /**
         * Unsets the "ncbipna" element
         */
        void unsetNcbipna();
        
        /**
         * Gets the "ncbi8aa" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa getNcbi8Aa();
        
        /**
         * True if has "ncbi8aa" element
         */
        boolean isSetNcbi8Aa();
        
        /**
         * Sets the "ncbi8aa" element
         */
        void setNcbi8Aa(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa ncbi8Aa);
        
        /**
         * Appends and returns a new empty "ncbi8aa" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa addNewNcbi8Aa();
        
        /**
         * Unsets the "ncbi8aa" element
         */
        void unsetNcbi8Aa();
        
        /**
         * Gets the "ncbieaa" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa getNcbieaa();
        
        /**
         * True if has "ncbieaa" element
         */
        boolean isSetNcbieaa();
        
        /**
         * Sets the "ncbieaa" element
         */
        void setNcbieaa(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa ncbieaa);
        
        /**
         * Appends and returns a new empty "ncbieaa" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa addNewNcbieaa();
        
        /**
         * Unsets the "ncbieaa" element
         */
        void unsetNcbieaa();
        
        /**
         * Gets the "ncbipaa" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa getNcbipaa();
        
        /**
         * True if has "ncbipaa" element
         */
        boolean isSetNcbipaa();
        
        /**
         * Sets the "ncbipaa" element
         */
        void setNcbipaa(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa ncbipaa);
        
        /**
         * Appends and returns a new empty "ncbipaa" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa addNewNcbipaa();
        
        /**
         * Unsets the "ncbipaa" element
         */
        void unsetNcbipaa();
        
        /**
         * Gets the "ncbistdaa" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa getNcbistdaa();
        
        /**
         * True if has "ncbistdaa" element
         */
        boolean isSetNcbistdaa();
        
        /**
         * Sets the "ncbistdaa" element
         */
        void setNcbistdaa(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa ncbistdaa);
        
        /**
         * Appends and returns a new empty "ncbistdaa" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa addNewNcbistdaa();
        
        /**
         * Unsets the "ncbistdaa" element
         */
        void unsetNcbistdaa();
        
        /**
         * Gets the "gap" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap getGap();
        
        /**
         * True if has "gap" element
         */
        boolean isSetGap();
        
        /**
         * Sets the "gap" element
         */
        void setGap(gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap gap);
        
        /**
         * Appends and returns a new empty "gap" element
         */
        gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap addNewGap();
        
        /**
         * Unsets the "gap" element
         */
        void unsetGap();
        
        /**
         * An XML iupacna(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Iupacna extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Iupacna.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("iupacnaa8e7elemtype");
            
            /**
             * Gets the "IUPACna" element
             */
            java.lang.String getIUPACna();
            
            /**
             * Gets (as xml) the "IUPACna" element
             */
            org.apache.xmlbeans.XmlString xgetIUPACna();
            
            /**
             * Sets the "IUPACna" element
             */
            void setIUPACna(java.lang.String iupaCna);
            
            /**
             * Sets (as xml) the "IUPACna" element
             */
            void xsetIUPACna(org.apache.xmlbeans.XmlString iupaCna);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacna) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML iupacaa(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Iupacaa extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Iupacaa.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("iupacaad214elemtype");
            
            /**
             * Gets the "IUPACaa" element
             */
            java.lang.String getIUPACaa();
            
            /**
             * Gets (as xml) the "IUPACaa" element
             */
            org.apache.xmlbeans.XmlString xgetIUPACaa();
            
            /**
             * Sets the "IUPACaa" element
             */
            void setIUPACaa(java.lang.String iupaCaa);
            
            /**
             * Sets (as xml) the "IUPACaa" element
             */
            void xsetIUPACaa(org.apache.xmlbeans.XmlString iupaCaa);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Iupacaa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ncbi2na(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ncbi2Na extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ncbi2Na.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ncbi2na53f7elemtype");
            
            /**
             * Gets the "NCBI2na" element
             */
            byte[] getNCBI2Na();
            
            /**
             * Gets (as xml) the "NCBI2na" element
             */
            org.apache.xmlbeans.XmlHexBinary xgetNCBI2Na();
            
            /**
             * Sets the "NCBI2na" element
             */
            void setNCBI2Na(byte[] ncbi2Na);
            
            /**
             * Sets (as xml) the "NCBI2na" element
             */
            void xsetNCBI2Na(org.apache.xmlbeans.XmlHexBinary ncbi2Na);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi2Na) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ncbi4na(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ncbi4Na extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ncbi4Na.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ncbi4nab6f9elemtype");
            
            /**
             * Gets the "NCBI4na" element
             */
            byte[] getNCBI4Na();
            
            /**
             * Gets (as xml) the "NCBI4na" element
             */
            org.apache.xmlbeans.XmlHexBinary xgetNCBI4Na();
            
            /**
             * Sets the "NCBI4na" element
             */
            void setNCBI4Na(byte[] ncbi4Na);
            
            /**
             * Sets (as xml) the "NCBI4na" element
             */
            void xsetNCBI4Na(org.apache.xmlbeans.XmlHexBinary ncbi4Na);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi4Na) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ncbi8na(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ncbi8Na extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ncbi8Na.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ncbi8na7cfdelemtype");
            
            /**
             * Gets the "NCBI8na" element
             */
            byte[] getNCBI8Na();
            
            /**
             * Gets (as xml) the "NCBI8na" element
             */
            org.apache.xmlbeans.XmlHexBinary xgetNCBI8Na();
            
            /**
             * Sets the "NCBI8na" element
             */
            void setNCBI8Na(byte[] ncbi8Na);
            
            /**
             * Sets (as xml) the "NCBI8na" element
             */
            void xsetNCBI8Na(org.apache.xmlbeans.XmlHexBinary ncbi8Na);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Na) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ncbipna(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ncbipna extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ncbipna.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ncbipna5135elemtype");
            
            /**
             * Gets the "NCBIpna" element
             */
            byte[] getNCBIpna();
            
            /**
             * Gets (as xml) the "NCBIpna" element
             */
            org.apache.xmlbeans.XmlHexBinary xgetNCBIpna();
            
            /**
             * Sets the "NCBIpna" element
             */
            void setNCBIpna(byte[] ncbIpna);
            
            /**
             * Sets (as xml) the "NCBIpna" element
             */
            void xsetNCBIpna(org.apache.xmlbeans.XmlHexBinary ncbIpna);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipna) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ncbi8aa(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ncbi8Aa extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ncbi8Aa.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ncbi8aaa62aelemtype");
            
            /**
             * Gets the "NCBI8aa" element
             */
            byte[] getNCBI8Aa();
            
            /**
             * Gets (as xml) the "NCBI8aa" element
             */
            org.apache.xmlbeans.XmlHexBinary xgetNCBI8Aa();
            
            /**
             * Sets the "NCBI8aa" element
             */
            void setNCBI8Aa(byte[] ncbi8Aa);
            
            /**
             * Sets (as xml) the "NCBI8aa" element
             */
            void xsetNCBI8Aa(org.apache.xmlbeans.XmlHexBinary ncbi8Aa);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbi8Aa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ncbieaa(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ncbieaa extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ncbieaa.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ncbieaad9d7elemtype");
            
            /**
             * Gets the "NCBIeaa" element
             */
            java.lang.String getNCBIeaa();
            
            /**
             * Gets (as xml) the "NCBIeaa" element
             */
            org.apache.xmlbeans.XmlString xgetNCBIeaa();
            
            /**
             * Sets the "NCBIeaa" element
             */
            void setNCBIeaa(java.lang.String ncbIeaa);
            
            /**
             * Sets (as xml) the "NCBIeaa" element
             */
            void xsetNCBIeaa(org.apache.xmlbeans.XmlString ncbIeaa);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbieaa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ncbipaa(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ncbipaa extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ncbipaa.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ncbipaa7a62elemtype");
            
            /**
             * Gets the "NCBIpaa" element
             */
            byte[] getNCBIpaa();
            
            /**
             * Gets (as xml) the "NCBIpaa" element
             */
            org.apache.xmlbeans.XmlHexBinary xgetNCBIpaa();
            
            /**
             * Sets the "NCBIpaa" element
             */
            void setNCBIpaa(byte[] ncbIpaa);
            
            /**
             * Sets (as xml) the "NCBIpaa" element
             */
            void xsetNCBIpaa(org.apache.xmlbeans.XmlHexBinary ncbIpaa);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbipaa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ncbistdaa(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Ncbistdaa extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ncbistdaa.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("ncbistdaab995elemtype");
            
            /**
             * Gets the "NCBIstdaa" element
             */
            byte[] getNCBIstdaa();
            
            /**
             * Gets (as xml) the "NCBIstdaa" element
             */
            org.apache.xmlbeans.XmlHexBinary xgetNCBIstdaa();
            
            /**
             * Sets the "NCBIstdaa" element
             */
            void setNCBIstdaa(byte[] ncbIstdaa);
            
            /**
             * Sets (as xml) the "NCBIstdaa" element
             */
            void xsetNCBIstdaa(org.apache.xmlbeans.XmlHexBinary ncbIstdaa);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Ncbistdaa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML gap(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Gap extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Gap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("gapf264elemtype");
            
            /**
             * Gets the "Seq-gap" element
             */
            gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap getSeqGap();
            
            /**
             * Sets the "Seq-gap" element
             */
            void setSeqGap(gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap seqGap);
            
            /**
             * Appends and returns a new empty "Seq-gap" element
             */
            gov.nih.nlm.ncbi.www.SeqGapDocument.SeqGap addNewSeqGap();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap newInstance() {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData.Gap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData newInstance() {
              return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.SeqDataDocument.SeqData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.SeqDataDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqDataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.SeqDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.SeqDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
