
/**
 * BlastWebServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package gov.nih.nlm.ncbi.www;

    /**
     *  BlastWebServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class BlastWebServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public BlastWebServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public BlastWebServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for submitSearchLite method
            * override this method for handling normal response from submitSearchLite operation
            */
           public void receiveResultsubmitSearchLite(
                    gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from submitSearchLite operation
           */
            public void receiveErrorsubmitSearchLite(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSupportedMatrices method
            * override this method for handling normal response from getSupportedMatrices operation
            */
           public void receiveResultgetSupportedMatrices(
                    gov.nih.nlm.ncbi.www.Blast4GetMatricesReplyDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSupportedMatrices operation
           */
            public void receiveErrorgetSupportedMatrices(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSearchResults method
            * override this method for handling normal response from getSearchResults operation
            */
           public void receiveResultgetSearchResults(
                    gov.nih.nlm.ncbi.www.Blast4GetSearchResultsReplyDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSearchResults operation
           */
            public void receiveErrorgetSearchResults(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSupportedOptions method
            * override this method for handling normal response from getSupportedOptions operation
            */
           public void receiveResultgetSupportedOptions(
                    gov.nih.nlm.ncbi.www.Blast4GetParametersReplyDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSupportedOptions operation
           */
            public void receiveErrorgetSupportedOptions(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSequences method
            * override this method for handling normal response from getSequences operation
            */
           public void receiveResultgetSequences(
                    gov.nih.nlm.ncbi.www.Blast4GetSequencesReplyDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSequences operation
           */
            public void receiveErrorgetSequences(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for submitSearch method
            * override this method for handling normal response from submitSearch operation
            */
           public void receiveResultsubmitSearch(
                    gov.nih.nlm.ncbi.www.Blast4QueueSearchReplyDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from submitSearch operation
           */
            public void receiveErrorsubmitSearch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSearchStrategy method
            * override this method for handling normal response from getSearchStrategy operation
            */
           public void receiveResultgetSearchStrategy(
                    gov.nih.nlm.ncbi.www.Blast4GetSearchStrategyReplyDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSearchStrategy operation
           */
            public void receiveErrorgetSearchStrategy(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkSearchStatus method
            * override this method for handling normal response from checkSearchStatus operation
            */
           public void receiveResultcheckSearchStatus(
                    gov.nih.nlm.ncbi.www.Blast4GetSearchStatusReplyDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkSearchStatus operation
           */
            public void receiveErrorcheckSearchStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSupportedPrograms method
            * override this method for handling normal response from getSupportedPrograms operation
            */
           public void receiveResultgetSupportedPrograms(
                    gov.nih.nlm.ncbi.www.Blast4GetProgramsReplyDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSupportedPrograms operation
           */
            public void receiveErrorgetSupportedPrograms(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSupportedTasks method
            * override this method for handling normal response from getSupportedTasks operation
            */
           public void receiveResultgetSupportedTasks(
                    gov.nih.nlm.ncbi.www.Blast4GetParamsetsReplyDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSupportedTasks operation
           */
            public void receiveErrorgetSupportedTasks(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDatabases method
            * override this method for handling normal response from getDatabases operation
            */
           public void receiveResultgetDatabases(
                    gov.nih.nlm.ncbi.www.Blast4GetDatabasesReplyDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDatabases operation
           */
            public void receiveErrorgetDatabases(java.lang.Exception e) {
            }
                


    }
    