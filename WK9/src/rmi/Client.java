package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("Client has started...");
		
		//String url = "rmi://";
		
		try {
			Registry r = LocateRegistry.getRegistry("localhost", 1234);
			
			HouseInterface h1 = (HouseInterface)r.lookup("lillyHouse");
			System.out.println("Bungalow owner: " + h1.getOwner());
			
			HouseInterface h2 = (HouseInterface)r.lookup("paulinaHouse");
			System.out.println("Detached owner: " + h2.getOwner());
		} catch (Exception e) {
			System.out.println("Couldn't run the client. Error!");
		}
	}

}
