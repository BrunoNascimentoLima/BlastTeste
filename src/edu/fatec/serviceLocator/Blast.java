package edu.fatec.serviceLocator;


import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Blast extends Remote {

	 public String submitSearchRequestLite(String amostra) throws RemoteException; 
	 public double getSearchResultsRequest(String rid,String gi)throws RemoteException; 

}
