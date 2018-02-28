/*
 * An XML document type.
 * Localname: Blast4-reply-body
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-reply-body(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4ReplyBodyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument
{
    
    public Blast4ReplyBodyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4REPLYBODY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-reply-body");
    
    
    /**
     * Gets the "Blast4-reply-body" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody getBlast4ReplyBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody)get_store().find_element_user(BLAST4REPLYBODY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-reply-body" element
     */
    public void setBlast4ReplyBody(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody blast4ReplyBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody)get_store().find_element_user(BLAST4REPLYBODY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody)get_store().add_element_user(BLAST4REPLYBODY$0);
            }
            target.set(blast4ReplyBody);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-reply-body" element
     */
    public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody addNewBlast4ReplyBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody)get_store().add_element_user(BLAST4REPLYBODY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-reply-body(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4ReplyBodyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody
    {
        
        public Blast4ReplyBodyImpl(org.apache.xmlbeans.SchemaType sType)
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
        private static final javax.xml.namespace.QName GETQUERIES$18 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "get-queries");
        private static final javax.xml.namespace.QName GETREQUESTINFO$20 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "get-request-info");
        private static final javax.xml.namespace.QName GETSEQUENCEPARTS$22 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "get-sequence-parts");
        private static final javax.xml.namespace.QName GETWINDOWMASKEDTAXIDS$24 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "get-windowmasked-taxids");
        
        
        /**
         * Gets the "finish-params" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams getFinishParams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams)get_store().find_element_user(FINISHPARAMS$0, 0);
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
        public void setFinishParams(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams finishParams)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams)get_store().find_element_user(FINISHPARAMS$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams)get_store().add_element_user(FINISHPARAMS$0);
                }
                target.set(finishParams);
            }
        }
        
        /**
         * Appends and returns a new empty "finish-params" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams addNewFinishParams()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams)get_store().add_element_user(FINISHPARAMS$0);
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
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases getGetDatabases()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases)get_store().find_element_user(GETDATABASES$2, 0);
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
        public void setGetDatabases(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases getDatabases)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases)get_store().find_element_user(GETDATABASES$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases)get_store().add_element_user(GETDATABASES$2);
                }
                target.set(getDatabases);
            }
        }
        
        /**
         * Appends and returns a new empty "get-databases" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases addNewGetDatabases()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases)get_store().add_element_user(GETDATABASES$2);
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
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices getGetMatrices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices)get_store().find_element_user(GETMATRICES$4, 0);
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
        public void setGetMatrices(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices getMatrices)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices)get_store().find_element_user(GETMATRICES$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices)get_store().add_element_user(GETMATRICES$4);
                }
                target.set(getMatrices);
            }
        }
        
        /**
         * Appends and returns a new empty "get-matrices" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices addNewGetMatrices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices)get_store().add_element_user(GETMATRICES$4);
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
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters getGetParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters)get_store().find_element_user(GETPARAMETERS$6, 0);
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
        public void setGetParameters(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters getParameters)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters)get_store().find_element_user(GETPARAMETERS$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters)get_store().add_element_user(GETPARAMETERS$6);
                }
                target.set(getParameters);
            }
        }
        
        /**
         * Appends and returns a new empty "get-parameters" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters addNewGetParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters)get_store().add_element_user(GETPARAMETERS$6);
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
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets getGetParamsets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets)get_store().find_element_user(GETPARAMSETS$8, 0);
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
        public void setGetParamsets(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets getParamsets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets)get_store().find_element_user(GETPARAMSETS$8, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets)get_store().add_element_user(GETPARAMSETS$8);
                }
                target.set(getParamsets);
            }
        }
        
        /**
         * Appends and returns a new empty "get-paramsets" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets addNewGetParamsets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets)get_store().add_element_user(GETPARAMSETS$8);
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
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms getGetPrograms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms)get_store().find_element_user(GETPROGRAMS$10, 0);
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
        public void setGetPrograms(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms getPrograms)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms)get_store().find_element_user(GETPROGRAMS$10, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms)get_store().add_element_user(GETPROGRAMS$10);
                }
                target.set(getPrograms);
            }
        }
        
        /**
         * Appends and returns a new empty "get-programs" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms addNewGetPrograms()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms)get_store().add_element_user(GETPROGRAMS$10);
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
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults getGetSearchResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults)get_store().find_element_user(GETSEARCHRESULTS$12, 0);
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
        public void setGetSearchResults(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults getSearchResults)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults)get_store().find_element_user(GETSEARCHRESULTS$12, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults)get_store().add_element_user(GETSEARCHRESULTS$12);
                }
                target.set(getSearchResults);
            }
        }
        
        /**
         * Appends and returns a new empty "get-search-results" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults addNewGetSearchResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults)get_store().add_element_user(GETSEARCHRESULTS$12);
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
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences getGetSequences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences)get_store().find_element_user(GETSEQUENCES$14, 0);
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
        public void setGetSequences(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences getSequences)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences)get_store().find_element_user(GETSEQUENCES$14, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences)get_store().add_element_user(GETSEQUENCES$14);
                }
                target.set(getSequences);
            }
        }
        
        /**
         * Appends and returns a new empty "get-sequences" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences addNewGetSequences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences)get_store().add_element_user(GETSEQUENCES$14);
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
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch getQueueSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch)get_store().find_element_user(QUEUESEARCH$16, 0);
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
        public void setQueueSearch(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch queueSearch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch)get_store().find_element_user(QUEUESEARCH$16, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch)get_store().add_element_user(QUEUESEARCH$16);
                }
                target.set(queueSearch);
            }
        }
        
        /**
         * Appends and returns a new empty "queue-search" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch addNewQueueSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch)get_store().add_element_user(QUEUESEARCH$16);
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
         * Gets the "get-queries" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries getGetQueries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries)get_store().find_element_user(GETQUERIES$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "get-queries" element
         */
        public boolean isSetGetQueries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GETQUERIES$18) != 0;
            }
        }
        
        /**
         * Sets the "get-queries" element
         */
        public void setGetQueries(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries getQueries)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries)get_store().find_element_user(GETQUERIES$18, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries)get_store().add_element_user(GETQUERIES$18);
                }
                target.set(getQueries);
            }
        }
        
        /**
         * Appends and returns a new empty "get-queries" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries addNewGetQueries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries)get_store().add_element_user(GETQUERIES$18);
                return target;
            }
        }
        
        /**
         * Unsets the "get-queries" element
         */
        public void unsetGetQueries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GETQUERIES$18, 0);
            }
        }
        
        /**
         * Gets the "get-request-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo getGetRequestInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo)get_store().find_element_user(GETREQUESTINFO$20, 0);
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
                return get_store().count_elements(GETREQUESTINFO$20) != 0;
            }
        }
        
        /**
         * Sets the "get-request-info" element
         */
        public void setGetRequestInfo(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo getRequestInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo)get_store().find_element_user(GETREQUESTINFO$20, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo)get_store().add_element_user(GETREQUESTINFO$20);
                }
                target.set(getRequestInfo);
            }
        }
        
        /**
         * Appends and returns a new empty "get-request-info" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo addNewGetRequestInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo)get_store().add_element_user(GETREQUESTINFO$20);
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
                get_store().remove_element(GETREQUESTINFO$20, 0);
            }
        }
        
        /**
         * Gets the "get-sequence-parts" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts getGetSequenceParts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts)get_store().find_element_user(GETSEQUENCEPARTS$22, 0);
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
                return get_store().count_elements(GETSEQUENCEPARTS$22) != 0;
            }
        }
        
        /**
         * Sets the "get-sequence-parts" element
         */
        public void setGetSequenceParts(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts getSequenceParts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts)get_store().find_element_user(GETSEQUENCEPARTS$22, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts)get_store().add_element_user(GETSEQUENCEPARTS$22);
                }
                target.set(getSequenceParts);
            }
        }
        
        /**
         * Appends and returns a new empty "get-sequence-parts" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts addNewGetSequenceParts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts)get_store().add_element_user(GETSEQUENCEPARTS$22);
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
                get_store().remove_element(GETSEQUENCEPARTS$22, 0);
            }
        }
        
        /**
         * Gets the "get-windowmasked-taxids" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids getGetWindowmaskedTaxids()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids)get_store().find_element_user(GETWINDOWMASKEDTAXIDS$24, 0);
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
                return get_store().count_elements(GETWINDOWMASKEDTAXIDS$24) != 0;
            }
        }
        
        /**
         * Sets the "get-windowmasked-taxids" element
         */
        public void setGetWindowmaskedTaxids(gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids getWindowmaskedTaxids)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids)get_store().find_element_user(GETWINDOWMASKEDTAXIDS$24, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids)get_store().add_element_user(GETWINDOWMASKEDTAXIDS$24);
                }
                target.set(getWindowmaskedTaxids);
            }
        }
        
        /**
         * Appends and returns a new empty "get-windowmasked-taxids" element
         */
        public gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids addNewGetWindowmaskedTaxids()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids)get_store().add_element_user(GETWINDOWMASKEDTAXIDS$24);
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
                get_store().remove_element(GETWINDOWMASKEDTAXIDS$24, 0);
            }
        }
        /**
         * An XML finish-params(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class FinishParamsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.FinishParams
        {
            
            public FinishParamsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4FINISHPARAMSREPLY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-finish-params-reply");
            
            
            /**
             * Gets the "Blast4-finish-params-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply getBlast4FinishParamsReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply)get_store().find_element_user(BLAST4FINISHPARAMSREPLY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-finish-params-reply" element
             */
            public void setBlast4FinishParamsReply(gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply blast4FinishParamsReply)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply)get_store().find_element_user(BLAST4FINISHPARAMSREPLY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply)get_store().add_element_user(BLAST4FINISHPARAMSREPLY$0);
                    }
                    target.set(blast4FinishParamsReply);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-finish-params-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply addNewBlast4FinishParamsReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4FinishParamsReplyDocument.Blast4FinishParamsReply)get_store().add_element_user(BLAST4FINISHPARAMSREPLY$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-databases(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetDatabasesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetDatabases
        {
            
            public GetDatabasesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETDATABASESREPLY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-databases-reply");
            
            
            /**
             * Gets the "Blast4-get-databases-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply getBlast4GetDatabasesReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply)get_store().find_element_user(BLAST4GETDATABASESREPLY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-databases-reply" element
             */
            public void setBlast4GetDatabasesReply(gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply blast4GetDatabasesReply)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply)get_store().find_element_user(BLAST4GETDATABASESREPLY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply)get_store().add_element_user(BLAST4GETDATABASESREPLY$0);
                    }
                    target.set(blast4GetDatabasesReply);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-get-databases-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply addNewBlast4GetDatabasesReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument.Blast4GetDatabasesReply)get_store().add_element_user(BLAST4GETDATABASESREPLY$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-matrices(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetMatricesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetMatrices
        {
            
            public GetMatricesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETMATRICESREPLY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-matrices-reply");
            
            
            /**
             * Gets the "Blast4-get-matrices-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply getBlast4GetMatricesReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply)get_store().find_element_user(BLAST4GETMATRICESREPLY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-matrices-reply" element
             */
            public void setBlast4GetMatricesReply(gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply blast4GetMatricesReply)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply)get_store().find_element_user(BLAST4GETMATRICESREPLY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply)get_store().add_element_user(BLAST4GETMATRICESREPLY$0);
                    }
                    target.set(blast4GetMatricesReply);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-get-matrices-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply addNewBlast4GetMatricesReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument.Blast4GetMatricesReply)get_store().add_element_user(BLAST4GETMATRICESREPLY$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-parameters(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParameters
        {
            
            public GetParametersImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETPARAMETERSREPLY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-parameters-reply");
            
            
            /**
             * Gets the "Blast4-get-parameters-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply getBlast4GetParametersReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply)get_store().find_element_user(BLAST4GETPARAMETERSREPLY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-parameters-reply" element
             */
            public void setBlast4GetParametersReply(gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply blast4GetParametersReply)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply)get_store().find_element_user(BLAST4GETPARAMETERSREPLY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply)get_store().add_element_user(BLAST4GETPARAMETERSREPLY$0);
                    }
                    target.set(blast4GetParametersReply);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-get-parameters-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply addNewBlast4GetParametersReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument.Blast4GetParametersReply)get_store().add_element_user(BLAST4GETPARAMETERSREPLY$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-paramsets(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetParamsetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetParamsets
        {
            
            public GetParamsetsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETPARAMSETSREPLY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-paramsets-reply");
            
            
            /**
             * Gets the "Blast4-get-paramsets-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply getBlast4GetParamsetsReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply)get_store().find_element_user(BLAST4GETPARAMSETSREPLY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-paramsets-reply" element
             */
            public void setBlast4GetParamsetsReply(gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply blast4GetParamsetsReply)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply)get_store().find_element_user(BLAST4GETPARAMSETSREPLY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply)get_store().add_element_user(BLAST4GETPARAMSETSREPLY$0);
                    }
                    target.set(blast4GetParamsetsReply);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-get-paramsets-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply addNewBlast4GetParamsetsReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument.Blast4GetParamsetsReply)get_store().add_element_user(BLAST4GETPARAMSETSREPLY$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-programs(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetProgramsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetPrograms
        {
            
            public GetProgramsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETPROGRAMSREPLY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-programs-reply");
            
            
            /**
             * Gets the "Blast4-get-programs-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply getBlast4GetProgramsReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply)get_store().find_element_user(BLAST4GETPROGRAMSREPLY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-programs-reply" element
             */
            public void setBlast4GetProgramsReply(gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply blast4GetProgramsReply)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply)get_store().find_element_user(BLAST4GETPROGRAMSREPLY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply)get_store().add_element_user(BLAST4GETPROGRAMSREPLY$0);
                    }
                    target.set(blast4GetProgramsReply);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-get-programs-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply addNewBlast4GetProgramsReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument.Blast4GetProgramsReply)get_store().add_element_user(BLAST4GETPROGRAMSREPLY$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-search-results(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetSearchResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSearchResults
        {
            
            public GetSearchResultsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETSEARCHRESULTSREPLY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-search-results-reply");
            
            
            /**
             * Gets the "Blast4-get-search-results-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply getBlast4GetSearchResultsReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply)get_store().find_element_user(BLAST4GETSEARCHRESULTSREPLY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-search-results-reply" element
             */
            public void setBlast4GetSearchResultsReply(gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply blast4GetSearchResultsReply)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply)get_store().find_element_user(BLAST4GETSEARCHRESULTSREPLY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply)get_store().add_element_user(BLAST4GETSEARCHRESULTSREPLY$0);
                    }
                    target.set(blast4GetSearchResultsReply);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-get-search-results-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply addNewBlast4GetSearchResultsReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument.Blast4GetSearchResultsReply)get_store().add_element_user(BLAST4GETSEARCHRESULTSREPLY$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-sequences(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetSequencesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequences
        {
            
            public GetSequencesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETSEQUENCESREPLY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-sequences-reply");
            
            
            /**
             * Gets the "Blast4-get-sequences-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply getBlast4GetSequencesReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply)get_store().find_element_user(BLAST4GETSEQUENCESREPLY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-sequences-reply" element
             */
            public void setBlast4GetSequencesReply(gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply blast4GetSequencesReply)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply)get_store().find_element_user(BLAST4GETSEQUENCESREPLY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply)get_store().add_element_user(BLAST4GETSEQUENCESREPLY$0);
                    }
                    target.set(blast4GetSequencesReply);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-get-sequences-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply addNewBlast4GetSequencesReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument.Blast4GetSequencesReply)get_store().add_element_user(BLAST4GETSEQUENCESREPLY$0);
                    return target;
                }
            }
        }
        /**
         * An XML queue-search(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class QueueSearchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.QueueSearch
        {
            
            public QueueSearchImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4QUEUESEARCHREPLY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-queue-search-reply");
            
            
            /**
             * Gets the "Blast4-queue-search-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply getBlast4QueueSearchReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply)get_store().find_element_user(BLAST4QUEUESEARCHREPLY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-queue-search-reply" element
             */
            public void setBlast4QueueSearchReply(gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply blast4QueueSearchReply)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply)get_store().find_element_user(BLAST4QUEUESEARCHREPLY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply)get_store().add_element_user(BLAST4QUEUESEARCHREPLY$0);
                    }
                    target.set(blast4QueueSearchReply);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-queue-search-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply addNewBlast4QueueSearchReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument.Blast4QueueSearchReply)get_store().add_element_user(BLAST4QUEUESEARCHREPLY$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-queries(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetQueriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetQueries
        {
            
            public GetQueriesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETQUERIESREPLY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-queries-reply");
            
            
            /**
             * Gets the "Blast4-get-queries-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply getBlast4GetQueriesReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply)get_store().find_element_user(BLAST4GETQUERIESREPLY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-queries-reply" element
             */
            public void setBlast4GetQueriesReply(gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply blast4GetQueriesReply)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply)get_store().find_element_user(BLAST4GETQUERIESREPLY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply)get_store().add_element_user(BLAST4GETQUERIESREPLY$0);
                    }
                    target.set(blast4GetQueriesReply);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-get-queries-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply addNewBlast4GetQueriesReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetQueriesReplyDocument.Blast4GetQueriesReply)get_store().add_element_user(BLAST4GETQUERIESREPLY$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-request-info(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetRequestInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetRequestInfo
        {
            
            public GetRequestInfoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETREQUESTINFOREPLY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-request-info-reply");
            
            
            /**
             * Gets the "Blast4-get-request-info-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply getBlast4GetRequestInfoReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply)get_store().find_element_user(BLAST4GETREQUESTINFOREPLY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-request-info-reply" element
             */
            public void setBlast4GetRequestInfoReply(gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply blast4GetRequestInfoReply)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply)get_store().find_element_user(BLAST4GETREQUESTINFOREPLY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply)get_store().add_element_user(BLAST4GETREQUESTINFOREPLY$0);
                    }
                    target.set(blast4GetRequestInfoReply);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-get-request-info-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply addNewBlast4GetRequestInfoReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetRequestInfoReplyDocument.Blast4GetRequestInfoReply)get_store().add_element_user(BLAST4GETREQUESTINFOREPLY$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-sequence-parts(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetSequencePartsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetSequenceParts
        {
            
            public GetSequencePartsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETSEQPARTSREPLY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-seq-parts-reply");
            
            
            /**
             * Gets the "Blast4-get-seq-parts-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply getBlast4GetSeqPartsReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply)get_store().find_element_user(BLAST4GETSEQPARTSREPLY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-seq-parts-reply" element
             */
            public void setBlast4GetSeqPartsReply(gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply blast4GetSeqPartsReply)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply)get_store().find_element_user(BLAST4GETSEQPARTSREPLY$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply)get_store().add_element_user(BLAST4GETSEQPARTSREPLY$0);
                    }
                    target.set(blast4GetSeqPartsReply);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-get-seq-parts-reply" element
             */
            public gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply addNewBlast4GetSeqPartsReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4GetSeqPartsReplyDocument.Blast4GetSeqPartsReply)get_store().add_element_user(BLAST4GETSEQPARTSREPLY$0);
                    return target;
                }
            }
        }
        /**
         * An XML get-windowmasked-taxids(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class GetWindowmaskedTaxidsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4ReplyBodyDocument.Blast4ReplyBody.GetWindowmaskedTaxids
        {
            
            public GetWindowmaskedTaxidsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4GETWINDOWMASKEDTAXIDSREPLY$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-get-windowmasked-taxids-reply");
            
            
            /**
             * Gets the "Blast4-get-windowmasked-taxids-reply" element
             */
            public java.math.BigInteger getBlast4GetWindowmaskedTaxidsReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLAST4GETWINDOWMASKEDTAXIDSREPLY$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "Blast4-get-windowmasked-taxids-reply" element
             */
            public org.apache.xmlbeans.XmlInteger xgetBlast4GetWindowmaskedTaxidsReply()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BLAST4GETWINDOWMASKEDTAXIDSREPLY$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-get-windowmasked-taxids-reply" element
             */
            public void setBlast4GetWindowmaskedTaxidsReply(java.math.BigInteger blast4GetWindowmaskedTaxidsReply)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLAST4GETWINDOWMASKEDTAXIDSREPLY$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLAST4GETWINDOWMASKEDTAXIDSREPLY$0);
                    }
                    target.setBigIntegerValue(blast4GetWindowmaskedTaxidsReply);
                }
            }
            
            /**
             * Sets (as xml) the "Blast4-get-windowmasked-taxids-reply" element
             */
            public void xsetBlast4GetWindowmaskedTaxidsReply(org.apache.xmlbeans.XmlInteger blast4GetWindowmaskedTaxidsReply)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BLAST4GETWINDOWMASKEDTAXIDSREPLY$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BLAST4GETWINDOWMASKEDTAXIDSREPLY$0);
                    }
                    target.set(blast4GetWindowmaskedTaxidsReply);
                }
            }
        }
    }
}
