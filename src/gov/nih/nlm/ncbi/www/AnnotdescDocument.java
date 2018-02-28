/*
 * An XML document type.
 * Localname: Annotdesc
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.AnnotdescDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Annotdesc(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface AnnotdescDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnnotdescDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("annotdesc0063doctype");
    
    /**
     * Gets the "Annotdesc" element
     */
    gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc getAnnotdesc();
    
    /**
     * Sets the "Annotdesc" element
     */
    void setAnnotdesc(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc annotdesc);
    
    /**
     * Appends and returns a new empty "Annotdesc" element
     */
    gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc addNewAnnotdesc();
    
    /**
     * An XML Annotdesc(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface Annotdesc extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Annotdesc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("annotdesc42c6elemtype");
        
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
         * Gets the "pub" element
         */
        gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub getPub();
        
        /**
         * True if has "pub" element
         */
        boolean isSetPub();
        
        /**
         * Sets the "pub" element
         */
        void setPub(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub pub);
        
        /**
         * Appends and returns a new empty "pub" element
         */
        gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub addNewPub();
        
        /**
         * Unsets the "pub" element
         */
        void unsetPub();
        
        /**
         * Gets the "user" element
         */
        gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User getUser();
        
        /**
         * True if has "user" element
         */
        boolean isSetUser();
        
        /**
         * Sets the "user" element
         */
        void setUser(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User user);
        
        /**
         * Appends and returns a new empty "user" element
         */
        gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User addNewUser();
        
        /**
         * Unsets the "user" element
         */
        void unsetUser();
        
        /**
         * Gets the "create-date" element
         */
        gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate getCreateDate();
        
        /**
         * True if has "create-date" element
         */
        boolean isSetCreateDate();
        
        /**
         * Sets the "create-date" element
         */
        void setCreateDate(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate createDate);
        
        /**
         * Appends and returns a new empty "create-date" element
         */
        gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate addNewCreateDate();
        
        /**
         * Unsets the "create-date" element
         */
        void unsetCreateDate();
        
        /**
         * Gets the "update-date" element
         */
        gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate getUpdateDate();
        
        /**
         * True if has "update-date" element
         */
        boolean isSetUpdateDate();
        
        /**
         * Sets the "update-date" element
         */
        void setUpdateDate(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate updateDate);
        
        /**
         * Appends and returns a new empty "update-date" element
         */
        gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate addNewUpdateDate();
        
        /**
         * Unsets the "update-date" element
         */
        void unsetUpdateDate();
        
        /**
         * Gets the "src" element
         */
        gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src getSrc();
        
        /**
         * True if has "src" element
         */
        boolean isSetSrc();
        
        /**
         * Sets the "src" element
         */
        void setSrc(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src src);
        
        /**
         * Appends and returns a new empty "src" element
         */
        gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src addNewSrc();
        
        /**
         * Unsets the "src" element
         */
        void unsetSrc();
        
        /**
         * Gets the "align" element
         */
        gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align getAlign();
        
        /**
         * True if has "align" element
         */
        boolean isSetAlign();
        
        /**
         * Sets the "align" element
         */
        void setAlign(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align align);
        
        /**
         * Appends and returns a new empty "align" element
         */
        gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align addNewAlign();
        
        /**
         * Unsets the "align" element
         */
        void unsetAlign();
        
        /**
         * Gets the "region" element
         */
        gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region getRegion();
        
        /**
         * True if has "region" element
         */
        boolean isSetRegion();
        
        /**
         * Sets the "region" element
         */
        void setRegion(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region region);
        
        /**
         * Appends and returns a new empty "region" element
         */
        gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region addNewRegion();
        
        /**
         * Unsets the "region" element
         */
        void unsetRegion();
        
        /**
         * An XML pub(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Pub extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pub.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("pub53afelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub newInstance() {
                  return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Pub) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(User.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("user95adelemtype");
            
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
                public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User newInstance() {
                  return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("createdate1991elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate newInstance() {
                  return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.CreateDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("updatedatee664elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate newInstance() {
                  return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.UpdateDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML src(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Src extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Src.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("src8916elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src newInstance() {
                  return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Src) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML align(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Align extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Align.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("align49b7elemtype");
            
            /**
             * Gets the "Align-def" element
             */
            gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef getAlignDef();
            
            /**
             * Sets the "Align-def" element
             */
            void setAlignDef(gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef alignDef);
            
            /**
             * Appends and returns a new empty "Align-def" element
             */
            gov.nih.nlm.ncbi.www.AlignDefDocument.AlignDef addNewAlignDef();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align newInstance() {
                  return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Align) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML region(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Region extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Region.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("regionf856elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region newInstance() {
                  return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc.Region) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc newInstance() {
              return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.AnnotdescDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.AnnotdescDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
