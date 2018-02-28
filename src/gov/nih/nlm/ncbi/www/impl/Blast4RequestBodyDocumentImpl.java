/*
 * An XML document type.
 * Localname: Blast4-request-body
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-request-body(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4RequestBodyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument
{
    
    public Blast4RequestBodyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4REQUESTBODY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-request-body");
    
    
    /**
     * Gets the "Blast4-request-body" element
     */
    public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody getBlast4RequestBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody)get_store().find_element_user(BLAST4REQUESTBODY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-request-body" element
     */
    public void setBlast4RequestBody(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody blast4RequestBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody)get_store().find_element_user(BLAST4REQUESTBODY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody)get_store().add_element_user(BLAST4REQUESTBODY$0);
            }
            target.set(blast4RequestBody);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-request-body" element
     */
    public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody addNewBlast4RequestBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody)get_store().add_element_user(BLAST4REQUESTBODY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-request-body(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4RequestBodyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody
    {
        
        public Blast4RequestBodyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FINISHPARAMS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "finish-params");
        private static final javax.xml.namespace.QName GETDATABASES$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "get-databases");
        private static final javax.xml.namespace.QName GETMATRICES$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "get-matrices");
        private static final javax.xml.namespace.QName GETPARAMETERS$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "get-parameters");
        private static final javax.xml.namespace.QName GETPARAMSETS$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "get-paramsets");
        private static final javax.xml.namespace.QName GETPROGRAMS$10 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "get-programs");
        private static final javax.xml.namespace.QName GETSEARCHRESULTS$12 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "get-search-results");
        private static final javax.xml.namespace.QName GETSEQUENCES$14 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "get-sequences");
        private static final javax.xml.namespace.QName QUEUESEARCH$16 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "queue-search");
        private static final javax.xml.namespace.QName GETREQUESTINFO$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "get-request-info");
        private static final javax.xml.namespace.QName GETSEQUENCEPARTS$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "get-sequence-parts");
        private static final javax.xml.namespace.QName GETWINDOWMASKEDTAXIDS$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "get-windowmasked-taxids");
        
        
        /**
         * Gets the "finish-params" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams getFinishParams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams)get_store().find_element_user(FINISHPARAMS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "finish-params" element
         */
        public boolean isSetFinishParams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FINISHPARAMS$0) != 0;
            }
        }
        
        /**
         * Sets the "finish-params" element
         */
        public void setFinishParams(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams finishParams)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams)get_store().find_element_user(FINISHPARAMS$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams)get_store().add_element_user(FINISHPARAMS$0);
                }
                target.set(finishParams);
            }
        }
        
        /**
         * Appends and returns a new empty "finish-params" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams addNewFinishParams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams)get_store().add_element_user(FINISHPARAMS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "finish-params" element
         */
        public void unsetFinishParams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FINISHPARAMS$0, 0);
            }
        }
        
        /**
         * Gets the "get-databases" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases getGetDatabases()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases)get_store().find_element_user(GETDATABASES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "get-databases" element
         */
        public boolean isSetGetDatabases()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETDATABASES$2) != 0;
            }
        }
        
        /**
         * Sets the "get-databases" element
         */
        public void setGetDatabases(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases getDatabases)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases)get_store().find_element_user(GETDATABASES$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases)get_store().add_element_user(GETDATABASES$2);
                }
                target.set(getDatabases);
            }
        }
        
        /**
         * Appends and returns a new empty "get-databases" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases addNewGetDatabases()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases)get_store().add_element_user(GETDATABASES$2);
                return target;
            }
        }
        
        /**
         * Unsets the "get-databases" element
         */
        public void unsetGetDatabases()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETDATABASES$2, 0);
            }
        }
        
        /**
         * Gets the "get-matrices" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices getGetMatrices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices)get_store().find_element_user(GETMATRICES$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "get-matrices" element
         */
        public boolean isSetGetMatrices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETMATRICES$4) != 0;
            }
        }
        
        /**
         * Sets the "get-matrices" element
         */
        public void setGetMatrices(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices getMatrices)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices)get_store().find_element_user(GETMATRICES$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices)get_store().add_element_user(GETMATRICES$4);
                }
                target.set(getMatrices);
            }
        }
        
        /**
         * Appends and returns a new empty "get-matrices" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices addNewGetMatrices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices)get_store().add_element_user(GETMATRICES$4);
                return target;
            }
        }
        
        /**
         * Unsets the "get-matrices" element
         */
        public void unsetGetMatrices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETMATRICES$4, 0);
            }
        }
        
        /**
         * Gets the "get-parameters" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters getGetParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters)get_store().find_element_user(GETPARAMETERS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "get-parameters" element
         */
        public boolean isSetGetParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETPARAMETERS$6) != 0;
            }
        }
        
        /**
         * Sets the "get-parameters" element
         */
        public void setGetParameters(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters getParameters)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters)get_store().find_element_user(GETPARAMETERS$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters)get_store().add_element_user(GETPARAMETERS$6);
                }
                target.set(getParameters);
            }
        }
        
        /**
         * Appends and returns a new empty "get-parameters" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters addNewGetParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters)get_store().add_element_user(GETPARAMETERS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "get-parameters" element
         */
        public void unsetGetParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETPARAMETERS$6, 0);
            }
        }
        
        /**
         * Gets the "get-paramsets" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets getGetParamsets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets)get_store().find_element_user(GETPARAMSETS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "get-paramsets" element
         */
        public boolean isSetGetParamsets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETPARAMSETS$8) != 0;
            }
        }
        
        /**
         * Sets the "get-paramsets" element
         */
        public void setGetParamsets(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets getParamsets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets)get_store().find_element_user(GETPARAMSETS$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets)get_store().add_element_user(GETPARAMSETS$8);
                }
                target.set(getParamsets);
            }
        }
        
        /**
         * Appends and returns a new empty "get-paramsets" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets addNewGetParamsets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets)get_store().add_element_user(GETPARAMSETS$8);
                return target;
            }
        }
        
        /**
         * Unsets the "get-paramsets" element
         */
        public void unsetGetParamsets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETPARAMSETS$8, 0);
            }
        }
        
        /**
         * Gets the "get-programs" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms getGetPrograms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms)get_store().find_element_user(GETPROGRAMS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "get-programs" element
         */
        public boolean isSetGetPrograms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETPROGRAMS$10) != 0;
            }
        }
        
        /**
         * Sets the "get-programs" element
         */
        public void setGetPrograms(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms getPrograms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms)get_store().find_element_user(GETPROGRAMS$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms)get_store().add_element_user(GETPROGRAMS$10);
                }
                target.set(getPrograms);
            }
        }
        
        /**
         * Appends and returns a new empty "get-programs" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms addNewGetPrograms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms)get_store().add_element_user(GETPROGRAMS$10);
                return target;
            }
        }
        
        /**
         * Unsets the "get-programs" element
         */
        public void unsetGetPrograms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETPROGRAMS$10, 0);
            }
        }
        
        /**
         * Gets the "get-search-results" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults getGetSearchResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults)get_store().find_element_user(GETSEARCHRESULTS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "get-search-results" element
         */
        public boolean isSetGetSearchResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETSEARCHRESULTS$12) != 0;
            }
        }
        
        /**
         * Sets the "get-search-results" element
         */
        public void setGetSearchResults(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults getSearchResults)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults)get_store().find_element_user(GETSEARCHRESULTS$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults)get_store().add_element_user(GETSEARCHRESULTS$12);
                }
                target.set(getSearchResults);
            }
        }
        
        /**
         * Appends and returns a new empty "get-search-results" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults addNewGetSearchResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults)get_store().add_element_user(GETSEARCHRESULTS$12);
                return target;
            }
        }
        
        /**
         * Unsets the "get-search-results" element
         */
        public void unsetGetSearchResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETSEARCHRESULTS$12, 0);
            }
        }
        
        /**
         * Gets the "get-sequences" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences getGetSequences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences)get_store().find_element_user(GETSEQUENCES$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "get-sequences" element
         */
        public boolean isSetGetSequences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETSEQUENCES$14) != 0;
            }
        }
        
        /**
         * Sets the "get-sequences" element
         */
        public void setGetSequences(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences getSequences)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences)get_store().find_element_user(GETSEQUENCES$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences)get_store().add_element_user(GETSEQUENCES$14);
                }
                target.set(getSequences);
            }
        }
        
        /**
         * Appends and returns a new empty "get-sequences" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences addNewGetSequences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences)get_store().add_element_user(GETSEQUENCES$14);
                return target;
            }
        }
        
        /**
         * Unsets the "get-sequences" element
         */
        public void unsetGetSequences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETSEQUENCES$14, 0);
            }
        }
        
        /**
         * Gets the "queue-search" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch getQueueSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch)get_store().find_element_user(QUEUESEARCH$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "queue-search" element
         */
        public boolean isSetQueueSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUEUESEARCH$16) != 0;
            }
        }
        
        /**
         * Sets the "queue-search" element
         */
        public void setQueueSearch(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch queueSearch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch)get_store().find_element_user(QUEUESEARCH$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch)get_store().add_element_user(QUEUESEARCH$16);
                }
                target.set(queueSearch);
            }
        }
        
        /**
         * Appends and returns a new empty "queue-search" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch addNewQueueSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch)get_store().add_element_user(QUEUESEARCH$16);
                return target;
            }
        }
        
        /**
         * Unsets the "queue-search" element
         */
        public void unsetQueueSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUEUESEARCH$16, 0);
            }
        }
        
        /**
         * Gets the "get-request-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo getGetRequestInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo)get_store().find_element_user(GETREQUESTINFO$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "get-request-info" element
         */
        public boolean isSetGetRequestInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETREQUESTINFO$18) != 0;
            }
        }
        
        /**
         * Sets the "get-request-info" element
         */
        public void setGetRequestInfo(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo getRequestInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo)get_store().find_element_user(GETREQUESTINFO$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo)get_store().add_element_user(GETREQUESTINFO$18);
                }
                target.set(getRequestInfo);
            }
        }
        
        /**
         * Appends and returns a new empty "get-request-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo addNewGetRequestInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo)get_store().add_element_user(GETREQUESTINFO$18);
                return target;
            }
        }
        
        /**
         * Unsets the "get-request-info" element
         */
        public void unsetGetRequestInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETREQUESTINFO$18, 0);
            }
        }
        
        /**
         * Gets the "get-sequence-parts" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts getGetSequenceParts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts)get_store().find_element_user(GETSEQUENCEPARTS$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "get-sequence-parts" element
         */
        public boolean isSetGetSequenceParts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETSEQUENCEPARTS$20) != 0;
            }
        }
        
        /**
         * Sets the "get-sequence-parts" element
         */
        public void setGetSequenceParts(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts getSequenceParts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts)get_store().find_element_user(GETSEQUENCEPARTS$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts)get_store().add_element_user(GETSEQUENCEPARTS$20);
                }
                target.set(getSequenceParts);
            }
        }
        
        /**
         * Appends and returns a new empty "get-sequence-parts" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts addNewGetSequenceParts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts)get_store().add_element_user(GETSEQUENCEPARTS$20);
                return target;
            }
        }
        
        /**
         * Unsets the "get-sequence-parts" element
         */
        public void unsetGetSequenceParts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETSEQUENCEPARTS$20, 0);
            }
        }
        
        /**
         * Gets the "get-windowmasked-taxids" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids getGetWindowmaskedTaxids()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids)get_store().find_element_user(GETWINDOWMASKEDTAXIDS$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "get-windowmasked-taxids" element
         */
        public boolean isSetGetWindowmaskedTaxids()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETWINDOWMASKEDTAXIDS$22) != 0;
            }
        }
        
        /**
         * Sets the "get-windowmasked-taxids" element
         */
        public void setGetWindowmaskedTaxids(gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids getWindowmaskedTaxids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids)get_store().find_element_user(GETWINDOWMASKEDTAXIDS$22, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids)get_store().add_element_user(GETWINDOWMASKEDTAXIDS$22);
                }
                target.set(getWindowmaskedTaxids);
            }
        }
        
        /**
         * Appends and returns a new empty "get-windowmasked-taxids" element
         */
        public gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids addNewGetWindowmaskedTaxids()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids)get_store().add_element_user(GETWINDOWMASKEDTAXIDS$22);
                return target;
            }
        }
        
        /**
         * Unsets the "get-windowmasked-taxids" element
         */
        public void unsetGetWindowmaskedTaxids()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETWINDOWMASKEDTAXIDS$22, 0);
            }
        }
        /**
         * An XML finish-params(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FinishParamsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.FinishParams
        {
            
            public FinishParamsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4FINISHPARAMSREQUEST$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-finish-params-request");
            
            
            /**
             * Gets the "Blast4-finish-params-request" element
             */
            public gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest getBlast4FinishParamsRequest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest)get_store().find_element_user(BLAST4FINISHPARAMSREQUEST$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-finish-params-request" element
             */
            public void setBlast4FinishParamsRequest(gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest blast4FinishParamsRequest)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest)get_store().find_element_user(BLAST4FINISHPARAMSREQUEST$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest)get_store().add_element_user(BLAST4FINISHPARAMSREQUEST$0);
                    }
                    target.set(blast4FinishParamsRequest);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-finish-params-request" element
             */
            public gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest addNewBlast4FinishParamsRequest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsRequestDocument.Blast4FinishParamsRequest)get_store().add_element_user(BLAST4FINISHPARAMSREQUEST$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-databases(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetDatabasesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetDatabases
        {
            
            public GetDatabasesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML get-matrices(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetMatricesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetMatrices
        {
            
            public GetMatricesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML get-parameters(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParameters
        {
            
            public GetParametersImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML get-paramsets(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetParamsetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetParamsets
        {
            
            public GetParamsetsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML get-programs(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetProgramsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetPrograms
        {
            
            public GetProgramsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
        /**
         * An XML get-search-results(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetSearchResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSearchResults
        {
            
            public GetSearchResultsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETSEARCHRESULTSREQUEST$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-search-results-request");
            
            
            /**
             * Gets the "Blast4-get-search-results-request" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest getBlast4GetSearchResultsRequest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest)get_store().find_element_user(BLAST4GETSEARCHRESULTSREQUEST$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-search-results-request" element
             */
            public void setBlast4GetSearchResultsRequest(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest blast4GetSearchResultsRequest)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest)get_store().find_element_user(BLAST4GETSEARCHRESULTSREQUEST$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest)get_store().add_element_user(BLAST4GETSEARCHRESULTSREQUEST$0);
                    }
                    target.set(blast4GetSearchResultsRequest);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-get-search-results-request" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest addNewBlast4GetSearchResultsRequest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsRequestDocument.Blast4GetSearchResultsRequest)get_store().add_element_user(BLAST4GETSEARCHRESULTSREQUEST$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-sequences(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetSequencesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequences
        {
            
            public GetSequencesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETSEQUENCESREQUEST$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-sequences-request");
            
            
            /**
             * Gets the "Blast4-get-sequences-request" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest getBlast4GetSequencesRequest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest)get_store().find_element_user(BLAST4GETSEQUENCESREQUEST$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-sequences-request" element
             */
            public void setBlast4GetSequencesRequest(gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest blast4GetSequencesRequest)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest)get_store().find_element_user(BLAST4GETSEQUENCESREQUEST$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest)get_store().add_element_user(BLAST4GETSEQUENCESREQUEST$0);
                    }
                    target.set(blast4GetSequencesRequest);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-get-sequences-request" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest addNewBlast4GetSequencesRequest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesRequestDocument.Blast4GetSequencesRequest)get_store().add_element_user(BLAST4GETSEQUENCESREQUEST$0);
                    return target;
                }
            }
        }
        /**
         * An XML queue-search(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class QueueSearchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.QueueSearch
        {
            
            public QueueSearchImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4QUEUESEARCHREQUEST$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-queue-search-request");
            
            
            /**
             * Gets the "Blast4-queue-search-request" element
             */
            public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest getBlast4QueueSearchRequest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest)get_store().find_element_user(BLAST4QUEUESEARCHREQUEST$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-queue-search-request" element
             */
            public void setBlast4QueueSearchRequest(gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest blast4QueueSearchRequest)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest)get_store().find_element_user(BLAST4QUEUESEARCHREQUEST$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest)get_store().add_element_user(BLAST4QUEUESEARCHREQUEST$0);
                    }
                    target.set(blast4QueueSearchRequest);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-queue-search-request" element
             */
            public gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest addNewBlast4QueueSearchRequest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchRequestDocument.Blast4QueueSearchRequest)get_store().add_element_user(BLAST4QUEUESEARCHREQUEST$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-request-info(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetRequestInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetRequestInfo
        {
            
            public GetRequestInfoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETREQUESTINFOREQUEST$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-request-info-request");
            
            
            /**
             * Gets the "Blast4-get-request-info-request" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest getBlast4GetRequestInfoRequest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest)get_store().find_element_user(BLAST4GETREQUESTINFOREQUEST$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-request-info-request" element
             */
            public void setBlast4GetRequestInfoRequest(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest blast4GetRequestInfoRequest)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest)get_store().find_element_user(BLAST4GETREQUESTINFOREQUEST$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest)get_store().add_element_user(BLAST4GETREQUESTINFOREQUEST$0);
                    }
                    target.set(blast4GetRequestInfoRequest);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-get-request-info-request" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest addNewBlast4GetRequestInfoRequest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoRequestDocument.Blast4GetRequestInfoRequest)get_store().add_element_user(BLAST4GETREQUESTINFOREQUEST$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-sequence-parts(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetSequencePartsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetSequenceParts
        {
            
            public GetSequencePartsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETSEQPARTSREQUEST$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-seq-parts-request");
            
            
            /**
             * Gets the "Blast4-get-seq-parts-request" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest getBlast4GetSeqPartsRequest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest)get_store().find_element_user(BLAST4GETSEQPARTSREQUEST$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-seq-parts-request" element
             */
            public void setBlast4GetSeqPartsRequest(gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest blast4GetSeqPartsRequest)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest)get_store().find_element_user(BLAST4GETSEQPARTSREQUEST$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest)get_store().add_element_user(BLAST4GETSEQPARTSREQUEST$0);
                    }
                    target.set(blast4GetSeqPartsRequest);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-get-seq-parts-request" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest addNewBlast4GetSeqPartsRequest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsRequestDocument.Blast4GetSeqPartsRequest)get_store().add_element_user(BLAST4GETSEQPARTSREQUEST$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-windowmasked-taxids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetWindowmaskedTaxidsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4RequestBodyDocument.Blast4RequestBody.GetWindowmaskedTaxids
        {
            
            public GetWindowmaskedTaxidsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
