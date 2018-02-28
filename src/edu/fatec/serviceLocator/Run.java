package edu.fatec.serviceLocator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Run {

	/**
	 * @param args
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws RemoteException, MalformedURLException {
       Blast blast = new BlastImpl();
       LocateRegistry.createRegistry(1990);
	    Naming.rebind("//localhost:1990/cataga",blast);

	}

}
