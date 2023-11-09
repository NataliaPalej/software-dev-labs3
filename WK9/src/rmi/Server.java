package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	
	public static void main(String[] args) throws RemoteException {
		
		System.out.println("Server has started...");
		try {
			House h1 = new House("Lilly", "Bungalow");
			House h2 = new House("Paulina", "Detached");
			
			Registry r = LocateRegistry.createRegistry(1234);
			
			r.bind("lillyHouse", h1);
			r.bind("paulinaHouse", h2);
	
		} catch (Exception e) {
			System.out.println("Couldn't run the server. Error!");
		}
	}
}
