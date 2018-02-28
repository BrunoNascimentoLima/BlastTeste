/*
 * An XML document type.
 * Localname: Cit-pat
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CitPatDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www;


/**
 * A document containing one Cit-pat(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public interface CitPatDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CitPatDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("citpate0b0doctype");
    
    /**
     * Gets the "Cit-pat" element
     */
    gov.nih.nlm.ncbi.www.CitPatDocument.CitPat getCitPat();
    
    /**
     * Sets the "Cit-pat" element
     */
    void setCitPat(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat citPat);
    
    /**
     * Appends and returns a new empty "Cit-pat" element
     */
    gov.nih.nlm.ncbi.www.CitPatDocument.CitPat addNewCitPat();
    
    /**
     * An XML Cit-pat(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public interface CitPat extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CitPat.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("citpat9020elemtype");
        
        /**
         * Gets the "title" element
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" element
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * Sets the "title" element
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" element
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Gets the "authors" element
         */
        gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors getAuthors();
        
        /**
         * Sets the "authors" element
         */
        void setAuthors(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors authors);
        
        /**
         * Appends and returns a new empty "authors" element
         */
        gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors addNewAuthors();
        
        /**
         * Gets the "country" element
         */
        java.lang.String getCountry();
        
        /**
         * Gets (as xml) the "country" element
         */
        org.apache.xmlbeans.XmlString xgetCountry();
        
        /**
         * Sets the "country" element
         */
        void setCountry(java.lang.String country);
        
        /**
         * Sets (as xml) the "country" element
         */
        void xsetCountry(org.apache.xmlbeans.XmlString country);
        
        /**
         * Gets the "doc-type" element
         */
        java.lang.String getDocType();
        
        /**
         * Gets (as xml) the "doc-type" element
         */
        org.apache.xmlbeans.XmlString xgetDocType();
        
        /**
         * Sets the "doc-type" element
         */
        void setDocType(java.lang.String docType);
        
        /**
         * Sets (as xml) the "doc-type" element
         */
        void xsetDocType(org.apache.xmlbeans.XmlString docType);
        
        /**
         * Gets the "number" element
         */
        java.lang.String getNumber();
        
        /**
         * Gets (as xml) the "number" element
         */
        org.apache.xmlbeans.XmlString xgetNumber();
        
        /**
         * True if has "number" element
         */
        boolean isSetNumber();
        
        /**
         * Sets the "number" element
         */
        void setNumber(java.lang.String number);
        
        /**
         * Sets (as xml) the "number" element
         */
        void xsetNumber(org.apache.xmlbeans.XmlString number);
        
        /**
         * Unsets the "number" element
         */
        void unsetNumber();
        
        /**
         * Gets the "date-issue" element
         */
        gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue getDateIssue();
        
        /**
         * True if has "date-issue" element
         */
        boolean isSetDateIssue();
        
        /**
         * Sets the "date-issue" element
         */
        void setDateIssue(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue dateIssue);
        
        /**
         * Appends and returns a new empty "date-issue" element
         */
        gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue addNewDateIssue();
        
        /**
         * Unsets the "date-issue" element
         */
        void unsetDateIssue();
        
        /**
         * Gets array of all "class" elements
         */
        java.lang.String[] getClass1Array();
        
        /**
         * Gets ith "class" element
         */
        java.lang.String getClass1Array(int i);
        
        /**
         * Gets (as xml) array of all "class" elements
         */
        org.apache.xmlbeans.XmlString[] xgetClass1Array();
        
        /**
         * Gets (as xml) ith "class" element
         */
        org.apache.xmlbeans.XmlString xgetClass1Array(int i);
        
        /**
         * Returns number of "class" element
         */
        int sizeOfClass1Array();
        
        /**
         * Sets array of all "class" element
         */
        void setClass1Array(java.lang.String[] class1Array);
        
        /**
         * Sets ith "class" element
         */
        void setClass1Array(int i, java.lang.String class1);
        
        /**
         * Sets (as xml) array of all "class" element
         */
        void xsetClass1Array(org.apache.xmlbeans.XmlString[] class1Array);
        
        /**
         * Sets (as xml) ith "class" element
         */
        void xsetClass1Array(int i, org.apache.xmlbeans.XmlString class1);
        
        /**
         * Inserts the value as the ith "class" element
         */
        void insertClass1(int i, java.lang.String class1);
        
        /**
         * Appends the value as the last "class" element
         */
        void addClass1(java.lang.String class1);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "class" element
         */
        org.apache.xmlbeans.XmlString insertNewClass1(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "class" element
         */
        org.apache.xmlbeans.XmlString addNewClass1();
        
        /**
         * Removes the ith "class" element
         */
        void removeClass1(int i);
        
        /**
         * Gets the "app-number" element
         */
        java.lang.String getAppNumber();
        
        /**
         * Gets (as xml) the "app-number" element
         */
        org.apache.xmlbeans.XmlString xgetAppNumber();
        
        /**
         * True if has "app-number" element
         */
        boolean isSetAppNumber();
        
        /**
         * Sets the "app-number" element
         */
        void setAppNumber(java.lang.String appNumber);
        
        /**
         * Sets (as xml) the "app-number" element
         */
        void xsetAppNumber(org.apache.xmlbeans.XmlString appNumber);
        
        /**
         * Unsets the "app-number" element
         */
        void unsetAppNumber();
        
        /**
         * Gets the "app-date" element
         */
        gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate getAppDate();
        
        /**
         * True if has "app-date" element
         */
        boolean isSetAppDate();
        
        /**
         * Sets the "app-date" element
         */
        void setAppDate(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate appDate);
        
        /**
         * Appends and returns a new empty "app-date" element
         */
        gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate addNewAppDate();
        
        /**
         * Unsets the "app-date" element
         */
        void unsetAppDate();
        
        /**
         * Gets the "applicants" element
         */
        gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants getApplicants();
        
        /**
         * True if has "applicants" element
         */
        boolean isSetApplicants();
        
        /**
         * Sets the "applicants" element
         */
        void setApplicants(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants applicants);
        
        /**
         * Appends and returns a new empty "applicants" element
         */
        gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants addNewApplicants();
        
        /**
         * Unsets the "applicants" element
         */
        void unsetApplicants();
        
        /**
         * Gets the "assignees" element
         */
        gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees getAssignees();
        
        /**
         * True if has "assignees" element
         */
        boolean isSetAssignees();
        
        /**
         * Sets the "assignees" element
         */
        void setAssignees(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees assignees);
        
        /**
         * Appends and returns a new empty "assignees" element
         */
        gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees addNewAssignees();
        
        /**
         * Unsets the "assignees" element
         */
        void unsetAssignees();
        
        /**
         * Gets the "priority" element
         */
        gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority getPriority();
        
        /**
         * True if has "priority" element
         */
        boolean isSetPriority();
        
        /**
         * Sets the "priority" element
         */
        void setPriority(gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority priority);
        
        /**
         * Appends and returns a new empty "priority" element
         */
        gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority addNewPriority();
        
        /**
         * Unsets the "priority" element
         */
        void unsetPriority();
        
        /**
         * Gets the "abstract" element
         */
        java.lang.String getAbstract();
        
        /**
         * Gets (as xml) the "abstract" element
         */
        org.apache.xmlbeans.XmlString xgetAbstract();
        
        /**
         * True if has "abstract" element
         */
        boolean isSetAbstract();
        
        /**
         * Sets the "abstract" element
         */
        void setAbstract(java.lang.String xabstract);
        
        /**
         * Sets (as xml) the "abstract" element
         */
        void xsetAbstract(org.apache.xmlbeans.XmlString xabstract);
        
        /**
         * Unsets the "abstract" element
         */
        void unsetAbstract();
        
        /**
         * An XML authors(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Authors extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Authors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("authors84d4elemtype");
            
            /**
             * Gets the "Auth-list" element
             */
            gov.nih.nlm.ncbi.www.AuthListDocument.AuthList getAuthList();
            
            /**
             * Sets the "Auth-list" element
             */
            void setAuthList(gov.nih.nlm.ncbi.www.AuthListDocument.AuthList authList);
            
            /**
             * Appends and returns a new empty "Auth-list" element
             */
            gov.nih.nlm.ncbi.www.AuthListDocument.AuthList addNewAuthList();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Authors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML date-issue(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface DateIssue extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DateIssue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("dateissuea8b6elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.DateIssue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML app-date(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface AppDate extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AppDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("appdate4096elemtype");
            
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
                public static gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.AppDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML applicants(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Applicants extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Applicants.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("applicantsce6delemtype");
            
            /**
             * Gets the "Auth-list" element
             */
            gov.nih.nlm.ncbi.www.AuthListDocument.AuthList getAuthList();
            
            /**
             * Sets the "Auth-list" element
             */
            void setAuthList(gov.nih.nlm.ncbi.www.AuthListDocument.AuthList authList);
            
            /**
             * Appends and returns a new empty "Auth-list" element
             */
            gov.nih.nlm.ncbi.www.AuthListDocument.AuthList addNewAuthList();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Applicants) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML assignees(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Assignees extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Assignees.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("assigneesbf10elemtype");
            
            /**
             * Gets the "Auth-list" element
             */
            gov.nih.nlm.ncbi.www.AuthListDocument.AuthList getAuthList();
            
            /**
             * Sets the "Auth-list" element
             */
            void setAuthList(gov.nih.nlm.ncbi.www.AuthListDocument.AuthList authList);
            
            /**
             * Appends and returns a new empty "Auth-list" element
             */
            gov.nih.nlm.ncbi.www.AuthListDocument.AuthList addNewAuthList();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Assignees) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML priority(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public interface Priority extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Priority.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s74A68D9904DCF749AED49DB11323D727").resolveHandle("priority7a60elemtype");
            
            /**
             * Gets array of all "Patent-priority" elements
             */
            gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority[] getPatentPriorityArray();
            
            /**
             * Gets ith "Patent-priority" element
             */
            gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority getPatentPriorityArray(int i);
            
            /**
             * Returns number of "Patent-priority" element
             */
            int sizeOfPatentPriorityArray();
            
            /**
             * Sets array of all "Patent-priority" element
             */
            void setPatentPriorityArray(gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority[] patentPriorityArray);
            
            /**
             * Sets ith "Patent-priority" element
             */
            void setPatentPriorityArray(int i, gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority patentPriority);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Patent-priority" element
             */
            gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority insertNewPatentPriority(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Patent-priority" element
             */
            gov.nih.nlm.ncbi.www.PatentPriorityDocument.PatentPriority addNewPatentPriority();
            
            /**
             * Removes the ith "Patent-priority" element
             */
            void removePatentPriority(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority newInstance() {
                  return (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat.Priority) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nlm.ncbi.www.CitPatDocument.CitPat newInstance() {
              return (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nlm.ncbi.www.CitPatDocument.CitPat newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nlm.ncbi.www.CitPatDocument.CitPat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nlm.ncbi.www.CitPatDocument newInstance() {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitPatDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nih.nlm.ncbi.www.CitPatDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nlm.ncbi.www.CitPatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
